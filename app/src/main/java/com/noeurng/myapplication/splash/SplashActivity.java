package com.noeurng.myapplication.splash;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.noeurng.myapplication.App;
import com.noeurng.myapplication.R;
import com.noeurng.myapplication.base.BaseActivity;
import com.noeurng.myapplication.data.DataManager;
import com.noeurng.myapplication.login.LoginActivity;
import com.noeurng.myapplication.main.MainActivity;

public class SplashActivity extends BaseActivity implements SplashMvpView{

    SplashPresenter splashPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        DataManager dataManager = ((App) getApplication()).getDataManager();

        splashPresenter = new SplashPresenter(dataManager);

        splashPresenter.onAttached(this);

        splashPresenter.decideNextActivity();
    }

    @Override
    public void openMainActivity() {
        startActivity(MainActivity.getStartIntent(this));
        finish();
    }

    @Override
    public void openLoginActivity() {
        startActivity(LoginActivity.getStartIntent(this));
        finish();
    }

    public static Intent getStartIntent(Context context) {
        return new Intent(context, SplashActivity.class);
    }
}
