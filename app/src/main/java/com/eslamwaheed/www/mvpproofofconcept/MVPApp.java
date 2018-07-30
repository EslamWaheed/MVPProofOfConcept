package com.eslamwaheed.www.mvpproofofconcept;

import android.app.Application;

import com.eslamwaheed.www.mvpproofofconcept.data.DataManager;
import com.eslamwaheed.www.mvpproofofconcept.data.SharedPrefsHelper;

public class MVPApp extends Application {

    private DataManager mDataManager;

    @Override
    public void onCreate() {
        super.onCreate();

        SharedPrefsHelper sharedPrefsHelper = new SharedPrefsHelper(getApplicationContext());

        mDataManager = new DataManager(sharedPrefsHelper);
    }

    public DataManager getDataManager() {
        return mDataManager;
    }
}
