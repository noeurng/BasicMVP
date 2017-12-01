package com.noeurng.myapplication;

import android.app.Application;

import com.noeurng.myapplication.data.DataManager;
import com.noeurng.myapplication.data.SharedPrefsHelper;

public class App extends Application {

    DataManager dataManager;

    @Override
    public void onCreate() {
        super.onCreate();

        SharedPrefsHelper sharedPrefsHelper = new SharedPrefsHelper(getApplicationContext());

        dataManager = new DataManager(sharedPrefsHelper);
    }

    public DataManager getDataManager() {
        return dataManager;
    }
}
