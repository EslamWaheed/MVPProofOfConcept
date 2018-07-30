package com.eslamwaheed.www.mvpproofofconcept.ui.mvpbase;

public interface MVPPresenter<V extends MVPView> {

    void onAttach(V mvpView);
}
