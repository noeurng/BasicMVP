package com.noeurng.myapplication.login;

import com.noeurng.myapplication.base.MvpPresenter;

public interface LoginMvpPresenter<V extends LoginMvpView> extends MvpPresenter<V> {

    void startLogin(String email);

}
