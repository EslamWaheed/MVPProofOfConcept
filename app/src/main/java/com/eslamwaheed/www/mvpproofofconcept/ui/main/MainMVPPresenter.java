package com.eslamwaheed.www.mvpproofofconcept.ui.main;

import com.eslamwaheed.www.mvpproofofconcept.ui.mvpbase.MVPPresenter;

public interface MainMVPPresenter<V extends MainMVPView> extends MVPPresenter<V> {

    String getEmail();

    void setUserLoggedOut();
}
