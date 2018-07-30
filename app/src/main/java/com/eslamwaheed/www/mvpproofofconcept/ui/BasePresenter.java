package com.eslamwaheed.www.mvpproofofconcept.ui;

import com.eslamwaheed.www.mvpproofofconcept.data.DataManager;

public class BasePresenter<V extends MVPView> implements MVPPresenter<V> {

    private DataManager mDataManager;
    private V mMVPView;

    public BasePresenter(DataManager mDataManager) {
        this.mDataManager = mDataManager;
    }

    @Override
    public void onAttach(V mvpView) {
        this.mMVPView = mvpView;
    }

    public V getMVPView() {
        return mMVPView;
    }

    public DataManager getDataManager() {
        return mDataManager;
    }

}
