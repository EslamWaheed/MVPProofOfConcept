package com.eslamwaheed.www.mvpproofofconcept.ui.splash;

import com.eslamwaheed.www.mvpproofofconcept.ui.mvpbase.MVPPresenter;

public interface SplashMVPPresenter<V extends SplashMVPView> extends MVPPresenter<V> {

    void decideNextActivity();
}
