package com.noeurng.myapplication.login;

import com.noeurng.myapplication.base.BasePresenter;
import com.noeurng.myapplication.data.DataManager;

public class LoginPresenter<V extends LoginMvpView> extends BasePresenter<V> implements LoginMvpPresenter<V> {

    public LoginPresenter(DataManager dataManager) {
        super(dataManager);
    }

    @Override
    public void startLogin(String email) {
        getDataManager().saveEmail(email);
        getDataManager().setLoginMode();
        getMvpView().openMainActivity();
    }
}
