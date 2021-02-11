package com.beautyisis.sharpref;

import android.app.Application;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        SharPrefManager.init(this);
    }
}
