package com.srp.carwash.ui.login.selectcar;

import androidx.lifecycle.MutableLiveData;

import com.srp.carwash.data.DataManager;
import com.srp.carwash.ui.base.BaseViewModel;
import com.srp.carwash.utils.rx.SchedulerProvider;

public class SelectCarViewModel extends BaseViewModel<SelectCarNavigator> {
    private MutableLiveData<String[]> carModelLiveData;


    public SelectCarViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        super(dataManager, schedulerProvider);
        carModelLiveData =new MutableLiveData<String[]>();
        fetchCarModelData();
    }

    public void fetchCarModelData(){
        String[] data=new String[] { "Belgium", "France", "United Kingdom" };
        carModelLiveData.setValue(data);
    }

    public MutableLiveData<String[]> getCarModelLiveData() {
        return carModelLiveData;
    }



}
