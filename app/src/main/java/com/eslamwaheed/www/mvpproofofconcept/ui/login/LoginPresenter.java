package com.eslamwaheed.www.mvpproofofconcept.ui.login;

import com.eslamwaheed.www.mvpproofofconcept.data.DataManager;
import com.eslamwaheed.www.mvpproofofconcept.ui.mvpbase.BasePresenter;

public class LoginPresenter<V extends LoginMVPView> extends BasePresenter<V> implements LoginMVPPresenter<V> {

    public LoginPresenter(DataManager dataManager) {
        super(dataManager);
    }

    @Override
    public void startLogin(String email) {
        getDataManager().saveEmail(email);
        getDataManager().setLoggedIn();
        getMVPView().openMainActivity();
    }
}
