package com.eslamwaheed.www.mvpproofofconcept.ui.main;

import com.eslamwaheed.www.mvpproofofconcept.data.DataManager;
import com.eslamwaheed.www.mvpproofofconcept.ui.mvpbase.BasePresenter;

public class MainPresenter<V extends MainMVPView> extends BasePresenter<V> implements MainMVPPresenter<V> {

    public MainPresenter(DataManager DataManager) {
        super(DataManager);
    }

    @Override
    public String getEmail() {
        return getDataManager().getEmail();
    }

    @Override
    public void setUserLoggedOut() {
        getDataManager().clear();
        getMVPView().openSplashActivity();
    }
}
