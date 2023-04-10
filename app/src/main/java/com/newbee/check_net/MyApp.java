package com.newbee.check_net;

import android.app.Application;
import android.content.Context;

public class MyApp extends Application {

    private static Context context;

    public static Context getContext() {
        return context;
    }





    @Override
    public void onCreate() {
//        if (LeakCanary.isInAnalyzerProcess(this)) {
//            // This process is dedicated to LeakCanary for heap analysis.
//            // You should not init your app in this process.
//            return;
//        }
//        LeakCanary.install(this);
        super.onCreate();
        // 程序创建的时候执行
        context=getApplicationContext();

    }
}
