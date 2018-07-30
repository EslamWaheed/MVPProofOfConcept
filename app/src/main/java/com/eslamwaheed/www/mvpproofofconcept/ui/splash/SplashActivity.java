package com.eslamwaheed.www.mvpproofofconcept.ui.splash;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.eslamwaheed.www.mvpproofofconcept.MVPApp;
import com.eslamwaheed.www.mvpproofofconcept.R;
import com.eslamwaheed.www.mvpproofofconcept.data.DataManager;

public class SplashActivity extends AppCompatActivity implements SplashMVPView {

    private SplashPresenter mSplashPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        DataManager dataManager = ((MVPApp) getApplication()).getDataManager();

        mSplashPresenter = new SplashPresenter(dataManager);

        mSplashPresenter.onAttach(this);

        mSplashPresenter.decideNextActivity();
    }

    @Override
    public void openMainActivity() {

    }

    @Override
    public void openLoginActivity() {

    }
}
