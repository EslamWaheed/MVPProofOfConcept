package com.eslamwaheed.www.mvpproofofconcept.data;

public class DataManager {

    private SharedPrefsHelper mSharedPrefsHelper;

    public DataManager(SharedPrefsHelper SharedPrefsHelper) {
        mSharedPrefsHelper = SharedPrefsHelper;
    }

    public void clear() {
        mSharedPrefsHelper.clear();
    }

    public void saveEmail(String email) {
        mSharedPrefsHelper.putEmail(email);
    }

    public String getEmail() {
        return mSharedPrefsHelper.getEmail();
    }

    public void setLoggedIn() {
        mSharedPrefsHelper.setLoggedInMode(true);
    }

    public Boolean getLoggedInMode() {
        return mSharedPrefsHelper.getLoggedInMode();
    }
}
