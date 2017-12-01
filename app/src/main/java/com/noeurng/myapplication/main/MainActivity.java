package com.noeurng.myapplication.main;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.noeurng.myapplication.App;
import com.noeurng.myapplication.R;
import com.noeurng.myapplication.base.BaseActivity;
import com.noeurng.myapplication.data.DataManager;
import com.noeurng.myapplication.splash.SplashActivity;

public class MainActivity extends BaseActivity implements MainMvpView {

    MainPresenter mainPresenter;

    public static Intent getStartIntent(Context context) {
        return new Intent(context, MainActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DataManager dataManager = ((App) getApplication()).getDataManager();

        mainPresenter = new MainPresenter(dataManager);

        mainPresenter.onAttached(this);

        TextView textViewShow = findViewById(R.id.textViewShow);
        textViewShow.setText(mainPresenter.getEmail());

        Button buttonLogOut = findViewById(R.id.buttonLogout);
        buttonLogOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainPresenter.startLogOut();
            }
        });
    }

    @Override
    public void openSplashActivity() {
        startActivity(SplashActivity.getStartIntent(this));
        finish();
    }
}
