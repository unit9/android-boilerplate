package com.unit9.boilerplate.activity;

import android.os.Bundle;
import android.view.View;

import com.unit9.boilerplate.R;
import com.unit9.boilerplate.module.LogModule;
import com.unit9.boilerplate.module.MainModule;
import com.unit9.boilerplate.util.Log;

import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;


public class TestActivity extends BaseActivity {
    @Inject
    Log log;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TAG = "Test Activity";

        log.print("test","test activity");


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
        modules = Arrays.<Object>asList(new LogModule());
        return modules;
    }

    @Override
    protected void log(String text) {
        log.print(TAG,text);
    }
}
