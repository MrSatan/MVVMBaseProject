package com.srp.carwash.ui.login.selectcar;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class SelectCarProvider {

    @ContributesAndroidInjector(modules = SelectCarModule.class)
    abstract SelectCarDialog provideSelectCarDialogFactory();
}
