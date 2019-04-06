package com.srp.carwash.ui.main;

import com.srp.carwash.data.DataManager;
import com.srp.carwash.ui.splash.SplashViewModel;
import com.srp.carwash.utils.rx.SchedulerProvider;
import dagger.Module;
import dagger.Provides;

@Module
public class MainActivityModule {
    @Provides
    MainViewModel provideMainViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        return new MainViewModel(dataManager, schedulerProvider);
    }
}
