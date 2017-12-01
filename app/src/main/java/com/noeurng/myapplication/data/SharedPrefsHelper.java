package com.noeurng.myapplication.data;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPrefsHelper {

    private static final String SHARED_PREF = "SHARED_PREFS";
    private static final String EMAIL = "EMAIL";
    private static final String LOGIN_MODE = "LOGIN_MODE";

    private SharedPreferences sharedPreferences;

    public SharedPrefsHelper(Context context) {
        sharedPreferences = context.getSharedPreferences(SHARED_PREF, Context.MODE_PRIVATE);
    }

    public void clear() {
        sharedPreferences.edit().clear().apply();
    }

    public void saveEmail(String email) {
        sharedPreferences.edit().putString(EMAIL, email).apply();
    }

    public String getEmail() {
        return sharedPreferences.getString(EMAIL, null);
    }

    public void setLoginMode(boolean loginMode) {
        sharedPreferences.edit().putBoolean(LOGIN_MODE, loginMode).apply();
    }

    public boolean getLoginMode() {
        return sharedPreferences.getBoolean(LOGIN_MODE, false);
    }
}
