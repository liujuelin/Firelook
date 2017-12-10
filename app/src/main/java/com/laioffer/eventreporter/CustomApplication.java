package com.laioffer.eventreporter;

import android.app.Application;
import android.content.res.Configuration;
import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessaging;

/**
 * Created by Lau on 12/9/17.
 */

public class CustomApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        String token = FirebaseInstanceId.getInstance().getToken();
        FirebaseMessaging.getInstance().subscribeToTopic("android");
        Log.v("Trying", "Trying");
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }

}
