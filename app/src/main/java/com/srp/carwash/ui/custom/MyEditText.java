package com.srp.carwash.ui.custom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.inputmethod.InputMethodManager;

public class MyEditText extends androidx.appcompat.widget.AppCompatEditText {

    private final String NAME_SPACE = "http://schemas.android.com/apk/res/android";

    private Context context;
    private int maxLength;

    public MyEditText(Context context) {
        super(context);
    }

    public MyEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        this.maxLength = attrs.getAttributeIntValue(NAME_SPACE,"maxLength",-1);
    }

    public MyEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onTextChanged(CharSequence text, int start, int lengthBefore, int lengthAfter) {
        super.onTextChanged(text, start, lengthBefore, lengthAfter);
        if (text.length() > 0 && text.length() == maxLength){
            InputMethodManager imm = (InputMethodManager) context.getSystemService(context.INPUT_METHOD_SERVICE);
            if (imm != null)
                imm.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0);
        }
    }
}
