package com.unit9.boilerplate.network.Login;


import com.unit9.boilerplate.App;
import com.unit9.boilerplate.activity.MainActivity;
import com.unit9.boilerplate.network.HttpManager;

import javax.inject.Inject;

import dagger.Module;



public class LoginNetwork {
    private final HttpManager mHttpManager;


    public LoginNetwork(HttpManager mHttpManager) {
        this.mHttpManager = mHttpManager;
    }

    public String doLogin(String username, String password) {
           return mHttpManager.doGet("http://www.google.com");
    }
}
