package com.example.quickstart;

import android.app.Application;
//import android.util.Log;
import io.realm.Realm;
import io.realm.RealmConfiguration;

import com.estimote.coresdk.common.config.EstimoteSDK;

//
// Running into any issues? Drop us an email to: contact@estimote.com
//

public class MyApplication extends Application {

    @Override
    public void onCreate() {

        super.onCreate();
        EstimoteSDK.initialize(getApplicationContext(), "quickstart-axi", "d04b82ac7e9d087c8d920478f8a13f7a");
        Realm.init(this);

        // uncomment to enable debug-level logging
        // it's usually only a good idea when troubleshooting issues with the Estimote SDK
//        EstimoteSDK.enableDebugLogging(true);
    }
    public static Realm getRealmInstance(){
        RealmConfiguration config = new RealmConfiguration.Builder()
                .deleteRealmIfMigrationNeeded()
                .build();

        return Realm.getInstance(config);
    }
}
