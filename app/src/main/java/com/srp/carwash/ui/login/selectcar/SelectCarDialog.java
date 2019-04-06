package com.srp.carwash.ui.login.selectcar;

import androidx.databinding.DataBindingUtil;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.Toast;

import com.srp.carwash.R;
import com.srp.carwash.databinding.SelectcarDialogBinding;
import com.srp.carwash.ui.base.BaseDialog;

import javax.inject.Inject;

import dagger.android.support.AndroidSupportInjection;

public class SelectCarDialog extends BaseDialog implements SelectCarNavigator {

    private static final String TAG = SelectCarDialog.class.getSimpleName();

    @Inject
    SelectCarViewModel mSelectCarViewModel;
    private SelectcarDialogBinding binding;
    private String[] carData;
    private String carModel;
    NumberPicker picker;
    Button button_cancel;
    Button botton_confirm;

    public static SelectCarDialog newInstance() {
        SelectCarDialog fragment = new SelectCarDialog();
        Bundle bundle = new Bundle();
        fragment.setArguments(bundle);

        return fragment;

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.selectcar_dialog, container, false);
        View view = binding.getRoot();

        button_cancel=binding.btnCancelDialogCar;
        picker=binding.carpicker;
        botton_confirm=binding.btnConfirmDialogCar;

        AndroidSupportInjection.inject(this);

        binding.setViewModel(mSelectCarViewModel);

        mSelectCarViewModel.setNavigator(this);



        mSelectCarViewModel.getCarModelLiveData().observe(this,(data)->{
            carData=data;
            picker.setMinValue(0);
            picker.setMaxValue(carData.length-1);
            picker.setDisplayedValues(carData);
        });



        button_cancel.setOnClickListener((v)->this.dismissDialog(TAG));


        botton_confirm.setOnClickListener((v)->{
            getSelectedCarModel();
        });


        return view;
    }

    public void getSelectedCarModel(){
        mSelectCarViewModel.getCarModelLiveData().observe(this,(data)->{
            assert data != null;
            carModel=data[picker.getValue()];
            Toast.makeText(getActivity(), carModel, Toast.LENGTH_SHORT).show();

        });
    }




    public void show(FragmentManager fragmentManager) {

        super.show(fragmentManager, TAG);
    }


}
