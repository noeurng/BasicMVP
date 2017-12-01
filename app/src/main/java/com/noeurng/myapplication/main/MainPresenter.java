package com.noeurng.myapplication.main;

import com.noeurng.myapplication.base.BasePresenter;
import com.noeurng.myapplication.data.DataManager;

public class MainPresenter<V extends MainMvpView> extends BasePresenter<V> implements MainMvpPresenter<V> {

    public MainPresenter(DataManager dataManager) {
        super(dataManager);
    }

    @Override
    public String getEmail() {
        return getDataManager().getEmail();
    }

    @Override
    public void startLogOut() {
        getDataManager().clear();
        getMvpView().openSplashActivity();
    }
}
