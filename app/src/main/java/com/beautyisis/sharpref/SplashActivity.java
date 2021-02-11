package com.beautyisis.sharpref;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed((Runnable) () ->
                {
                    if(SharPrefManager.isLoggedIn()) {
                        startActivity(new Intent(this, MainActivity.class));
                    }
                    else{
                        startActivity(new Intent(this, LoginActivity.class));
                    }
                    finish();
                },
                2000
        );
    }
}