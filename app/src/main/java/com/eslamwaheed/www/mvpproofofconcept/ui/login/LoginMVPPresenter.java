package com.eslamwaheed.www.mvpproofofconcept.ui.login;

import com.eslamwaheed.www.mvpproofofconcept.ui.mvpbase.MVPPresenter;

public interface LoginMVPPresenter<V extends LoginMVPView> extends MVPPresenter<V> {

    void startLogin(String email);
}
