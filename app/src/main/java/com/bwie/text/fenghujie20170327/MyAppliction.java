package com.bwie.text.fenghujie20170327;

import android.app.Application;

import com.baidu.mapapi.SDKInitializer;

/**
 * Created by dell on 2017/3/27.
 */

public class MyAppliction extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        SDKInitializer.initialize(getApplicationContext());
    }
}
