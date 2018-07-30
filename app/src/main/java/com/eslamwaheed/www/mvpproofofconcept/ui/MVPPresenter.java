package com.eslamwaheed.www.mvpproofofconcept.ui;

public interface MVPPresenter<V extends MVPView> {

    void onAttach(V mvpView);
}
