package com.noeurng.myapplication.data;

public class DataManager {

    private SharedPrefsHelper sharedPrefsHelper;

    public DataManager(SharedPrefsHelper sharedPrefsHelper) {
        this.sharedPrefsHelper = sharedPrefsHelper;
    }

    public void clear() {
        sharedPrefsHelper.clear();
    }

    public void saveEmail(String email) {
        sharedPrefsHelper.saveEmail(email);
    }

    public String getEmail() {
        return sharedPrefsHelper.getEmail();
    }

    public void setLoginMode() {
        sharedPrefsHelper.setLoginMode(true);
    }

    public boolean getLoginMode() {
        return sharedPrefsHelper.getLoginMode();
    }
}
