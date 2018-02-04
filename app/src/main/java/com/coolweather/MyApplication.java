package com.coolweather;

import android.app.Application;
import android.content.Context;

import org.litepal.LitePal;

/**
 * Created by 张佳欣 on 2018/2/3.
 */

public class MyApplication extends Application {

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        LitePal.initialize(context);
    }

    public static Context getContext(){
        return context;
    }
}
