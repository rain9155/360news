package com.example.a360news;

import android.app.Application;
import android.content.Context;

/**
 * Created by asus on 2018/4/24.
 */

public class MyApplication extends Application {

    private static Context context;

    @Override
    public void onCreate() {
        context = getApplicationContext();
    }

    public static Context getContext(){
        return context;
    }
}
