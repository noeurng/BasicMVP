package com.noeurng.myapplication.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.noeurng.myapplication.App;
import com.noeurng.myapplication.R;
import com.noeurng.myapplication.base.BaseActivity;
import com.noeurng.myapplication.data.DataManager;
import com.noeurng.myapplication.main.MainActivity;
import com.noeurng.myapplication.utils.CommonUtils;

public class LoginActivity extends BaseActivity implements LoginMvpView {

    LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        DataManager dataManager = ((App) getApplication()).getDataManager();

        loginPresenter = new LoginPresenter(dataManager);

        loginPresenter.onAttached(this);

        final EditText editTextEmail = findViewById(R.id.editTextEmail);
        final EditText editTextPassword = findViewById(R.id.editTextPassword);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = editTextEmail.getText().toString();
                String password = editTextPassword.getText().toString();

                if (!CommonUtils.isEmailValid(email)) {
                    Toast.makeText(LoginActivity.this, "Enter correct Email", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (password == null || password.isEmpty()) {
                    Toast.makeText(LoginActivity.this, "Enter password", Toast.LENGTH_SHORT).show();
                    return;
                }

                loginPresenter.startLogin(email);
            }
        });

    }

    @Override
    public void openMainActivity() {
        startActivity(MainActivity.getStartIntent(this));
        finish();
    }

    public static Intent getStartIntent(Context context) {
        return new Intent(context, LoginActivity.class);
    }
}
