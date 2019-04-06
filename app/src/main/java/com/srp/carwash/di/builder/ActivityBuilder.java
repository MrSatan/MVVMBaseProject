/*
 *  Copyright (C) 2017 MINDORKS NEXTGEN PRIVATE LIMITED
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      https://mindorks.com/license/apache-v2
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License
 */

package com.srp.carwash.di.builder;


import com.srp.carwash.ui.login.LoginActivity;
import com.srp.carwash.ui.login.LoginActivityModule;
import com.srp.carwash.ui.login.selectcar.SelectCarProvider;
import com.srp.carwash.ui.main.MainActivity;
import com.srp.carwash.ui.main.MainActivityModule;
import com.srp.carwash.ui.splash.SplashActivity;
import com.srp.carwash.ui.splash.SplashActivityModule;


import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by amitshekhar on 14/09/17.
 */
@Module
public abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = SplashActivityModule.class)
    abstract SplashActivity bindSplashActivity();

    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainActivity bindMainActivity();

    @ContributesAndroidInjector(modules = {LoginActivityModule.class, SelectCarProvider.class})
    abstract LoginActivity bindLoginActivity();


}
