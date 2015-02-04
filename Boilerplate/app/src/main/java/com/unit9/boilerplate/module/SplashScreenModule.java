package com.unit9.boilerplate.module;


import com.unit9.boilerplate.App;
import com.unit9.boilerplate.activity.MainActivity;
import com.unit9.boilerplate.activity.SplashScreenActivity;
import com.unit9.boilerplate.network.HttpManager;
import com.unit9.boilerplate.util.Log;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(
        injects = {HttpManager.class, SplashScreenActivity.class,  App.class }
)
public class SplashScreenModule {
    @Provides
    @Singleton
    Log providePrint() {
        return new Log();
    }


    @Provides
    @Singleton
    HttpManager provideHttpManager() {
        return new HttpManager();
    }
}
