package com.noeurng.myapplication.base;

public interface MvpPresenter<V extends MvpView> {

    void onAttached(V mvpView);

}
