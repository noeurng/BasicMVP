package com.noeurng.myapplication.main;

import com.noeurng.myapplication.base.MvpPresenter;

public interface MainMvpPresenter<V extends MainMvpView> extends MvpPresenter<V> {

    String getEmail();

    void startLogOut();

}
