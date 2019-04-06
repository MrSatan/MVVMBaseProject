package com.srp.carwash.ui.main;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.srp.carwash.BR;
import com.srp.carwash.R;
import com.srp.carwash.databinding.ActivityMainBinding;
import com.srp.carwash.ui.base.BaseActivity;
import javax.inject.Inject;

public class MainActivity extends BaseActivity<ActivityMainBinding, MainViewModel> implements MainNavigator {

    @Inject
    public MainViewModel mainViewModel;

    public static Intent newIntent(Context context) {
        return new Intent(context, MainActivity.class);
    }

    @Override
    public int getBindingVariable() {
        return BR.viewModel;
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public MainViewModel getViewModel() {
        return mainViewModel;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainViewModel.setNavigator(this);

    }
}
