package com.srp.carwash.ui.login.selectcar;

import com.srp.carwash.data.DataManager;
import com.srp.carwash.utils.rx.SchedulerProvider;

import dagger.Module;
import dagger.Provides;

@Module
public class SelectCarModule {
    @Provides
    SelectCarViewModel provideSelectCarViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        return new SelectCarViewModel(dataManager, schedulerProvider);
    }
}
