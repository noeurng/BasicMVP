package com.noeurng.myapplication.base;

import com.noeurng.myapplication.data.DataManager;

public class BasePresenter<V extends MvpView> implements MvpPresenter<V> {

    V mMvpView;

    DataManager dataManager;

    public BasePresenter(DataManager dataManager) {
        this.dataManager = dataManager;
    }

    @Override
    public void onAttached(V mvpView) {
        mMvpView = mvpView;
    }

    public DataManager getDataManager() {
        return dataManager;
    }

    public V getMvpView() {
        return mMvpView;
    }

}
