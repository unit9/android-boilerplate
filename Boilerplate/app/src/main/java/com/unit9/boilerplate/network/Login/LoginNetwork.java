package com.unit9.boilerplate.network.Login;


import com.unit9.boilerplate.App;
import com.unit9.boilerplate.activity.MainActivity;
import com.unit9.boilerplate.network.HttpManager;

import javax.inject.Inject;

import dagger.Module;

@Module(
        injects = { HttpManager.class }
)

public class LoginNetwork {
    @Inject
    HttpManager mHttpManager;

    public void doLogin(String username, String password) {

    }
}
