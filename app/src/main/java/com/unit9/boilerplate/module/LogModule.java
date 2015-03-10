package com.unit9.boilerplate.module;

import com.unit9.boilerplate.App;
import com.unit9.boilerplate.activity.MainActivity;
import com.unit9.boilerplate.activity.TestActivity;
import com.unit9.boilerplate.util.Log;

import junit.framework.Test;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by christian on 10/03/15.
 */

@Module(
        injects = {TestActivity.class})
public class LogModule {

    @Provides
    @Singleton
    Log providePrint() {
        return new Log();
    }

}
