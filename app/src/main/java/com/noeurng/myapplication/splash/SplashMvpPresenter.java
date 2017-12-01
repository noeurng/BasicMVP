package com.noeurng.myapplication.splash;

import com.noeurng.myapplication.base.MvpPresenter;

public interface SplashMvpPresenter<V extends SplashMvpView> extends MvpPresenter<V> {

    void decideNextActivity();

}
