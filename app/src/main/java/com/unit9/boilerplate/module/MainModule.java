package com.unit9.boilerplate.module;


import com.unit9.boilerplate.App;

import com.unit9.boilerplate.activity.MainActivity;
import com.unit9.boilerplate.network.HttpManager;
import com.unit9.boilerplate.network.Login.LoginNetwork;
import com.unit9.boilerplate.util.Log;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(
        injects = { MainActivity.class, LoginNetwork.class,App.class }
)
public class MainModule {
    @Provides
    @Singleton
    Log providePrint() {
        return new Log();
    }

    @Provides @Singleton
    LoginNetwork provideLoginNetwork() {
        return new LoginNetwork();
    }
}
