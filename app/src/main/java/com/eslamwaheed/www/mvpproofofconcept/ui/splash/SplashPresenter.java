package com.eslamwaheed.www.mvpproofofconcept.ui.splash;

import com.eslamwaheed.www.mvpproofofconcept.data.DataManager;
import com.eslamwaheed.www.mvpproofofconcept.ui.mvpbase.BasePresenter;

public class SplashPresenter<V extends SplashMVPView> extends BasePresenter<V> implements SplashMVPPresenter<V> {

    public SplashPresenter(DataManager dataManager) {
        super(dataManager);
    }

    @Override
    public void decideNextActivity() {
        if (getDataManager().getLoggedInMode()) {
            getMVPView().openMainActivity();
        } else {
            getMVPView().openLoginActivity();
        }
    }
}
