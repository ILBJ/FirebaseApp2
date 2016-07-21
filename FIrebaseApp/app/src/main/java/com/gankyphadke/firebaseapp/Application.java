package com.gankyphadke.firebaseapp;

import com.facebook.FacebookSdk;

public class Application extends android.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();
        FacebookSdk.sdkInitialize(getApplicationContext());
    }

}
