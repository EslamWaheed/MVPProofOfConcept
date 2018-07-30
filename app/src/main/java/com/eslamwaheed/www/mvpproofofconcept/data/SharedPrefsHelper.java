package com.eslamwaheed.www.mvpproofofconcept.data;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPrefsHelper {

    private static final String PREFS = "PREFS";
    private static final String EMAIL = "EMAIL";
    private static final String LoggedInMode = "LoggedInMode";

    SharedPreferences mSharedPreferences;

    public SharedPrefsHelper(Context context) {
        mSharedPreferences = context.getSharedPreferences(PREFS, Context.MODE_PRIVATE);
    }

    public void clear() {
        mSharedPreferences.edit().clear().apply();
    }

    public void putEmail(String email) {
        mSharedPreferences.edit().putString(EMAIL, email).apply();
    }

    public String getEmail() {
        return mSharedPreferences.getString(EMAIL, null);
    }

    public void setLoggedInMode(boolean loggedInMode) {
        mSharedPreferences.edit().putBoolean(LoggedInMode, loggedInMode).apply();
    }

    public boolean getLoggedInMode() {
        return mSharedPreferences.getBoolean(LoggedInMode, false);
    }
}
