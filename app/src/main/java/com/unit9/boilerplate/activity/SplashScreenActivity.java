package com.unit9.boilerplate.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.unit9.boilerplate.R;
import com.unit9.boilerplate.module.SplashScreenModule;
import com.unit9.boilerplate.network.HttpManager;
import com.unit9.boilerplate.util.Log;

import java.util.Arrays;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import javax.inject.Inject;


public class SplashScreenActivity extends BaseActivity  {
    @Inject
    Log log;

    @Inject
    HttpManager httpManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TAG = "Splash Screen Activity";

        TimerTask t = new TimerTask() {
            @Override
            public void run() {
                Intent i = new Intent(SplashScreenActivity.this, MainActivity.class);
                finish();
                startActivity(i);
            }
        };

        Timer tm = new Timer();
        tm.schedule(t, 1000);
        log.print("aa","aa");

    }



    @Override
    protected void initDesign() {
        setContentView(R.layout.activity_splashscreen);
    }

    @Override
    public void onClick(View view) {

    }

    @Override
    protected List<Object> getModules() {
        modules = Arrays.<Object>asList(new SplashScreenModule());
        return modules;
    }

    @Override
    protected void log(String text) {
        log.print(TAG,text);
    }
}
