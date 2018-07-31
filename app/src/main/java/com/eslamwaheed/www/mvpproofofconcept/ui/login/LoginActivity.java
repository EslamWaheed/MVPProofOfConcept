package com.eslamwaheed.www.mvpproofofconcept.ui.login;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.eslamwaheed.www.mvpproofofconcept.MVPApp;
import com.eslamwaheed.www.mvpproofofconcept.R;
import com.eslamwaheed.www.mvpproofofconcept.data.DataManager;
import com.eslamwaheed.www.mvpproofofconcept.utils.CommonUtils;

public class LoginActivity extends AppCompatActivity implements LoginMVPView {

    private LoginPresenter mLoginPresenter;

    private EditText et_email;
    private EditText et_password;
    private Button bt_login;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        DataManager dataManager = ((MVPApp) getApplication()).getDataManager();
        mLoginPresenter = new LoginPresenter(dataManager);

        mLoginPresenter.onAttach(this);

        et_email = findViewById(R.id.et_email);
        et_password = findViewById(R.id.et_password);
        bt_login = findViewById(R.id.bt_login);

        bt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onLoginButtonClicked();
            }
        });
    }

    @Override
    public void openMainActivity() {

    }

    @Override
    public void onLoginButtonClicked() {
        String email = et_email.getText().toString();
        String password = et_password.getText().toString();

        if (!CommonUtils.isEmailValid(email)) {
            Toast.makeText(this, "Enter correct Email", Toast.LENGTH_LONG).show();
            return;
        }

        if (password == null || password.isEmpty()) {
            Toast.makeText(this, "Enter Password", Toast.LENGTH_LONG).show();
            return;
        }

        mLoginPresenter.startLogin(email);
    }
}
