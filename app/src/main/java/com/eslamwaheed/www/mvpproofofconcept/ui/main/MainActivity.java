package com.eslamwaheed.www.mvpproofofconcept.ui.main;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.eslamwaheed.www.mvpproofofconcept.MVPApp;
import com.eslamwaheed.www.mvpproofofconcept.R;
import com.eslamwaheed.www.mvpproofofconcept.data.DataManager;
import com.eslamwaheed.www.mvpproofofconcept.ui.splash.SplashActivity;

public class MainActivity extends AppCompatActivity implements MainMVPView {

    private TextView tv_email;
    private Button bt_logout;

    private MainPresenter mMainPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DataManager dataManager = ((MVPApp) getApplication()).getDataManager();
        mMainPresenter = new MainPresenter(dataManager);
        mMainPresenter.onAttach(this);

        tv_email = findViewById(R.id.tv_email);
        bt_logout = findViewById(R.id.bt_logout);

        tv_email.setText(mMainPresenter.getEmail());

        bt_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMainPresenter.setUserLoggedOut();
            }
        });

    }

    @Override
    public void openSplashActivity() {
        Intent intent = new Intent(this, SplashActivity.class);
        startActivity(intent);
        finish();
    }
}
