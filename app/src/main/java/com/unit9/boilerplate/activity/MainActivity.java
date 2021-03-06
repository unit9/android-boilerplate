package com.unit9.boilerplate.activity;

import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;

import com.unit9.boilerplate.R;
import com.unit9.boilerplate.module.LogModule;
import com.unit9.boilerplate.module.MainModule;
import com.unit9.boilerplate.network.HttpManager;
import com.unit9.boilerplate.network.Login.LoginNetwork;
import com.unit9.boilerplate.util.Log;

import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;


public class MainActivity extends BaseActivity {
    @Inject
   Log log;

    @Inject
    LoginNetwork login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TAG = "Main Activity";

        StrictMode.ThreadPolicy policy =
                new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        log.print("http",login.doLogin("user","password"));

    }

    @Override
    protected void initDesign() {
        setContentView(R.layout.activity_main);
    }


    @Override
    public void onClick(View view) {

    }


    /** DAGGER Setup */
    @Override
    protected List<Object> getModules() {
        modules = Arrays.<Object>asList(new MainModule());
        return modules;
    }

    @Override
    protected void log(String text) {
        //log.print(TAG,text);
    }
}
