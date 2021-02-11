package com.beautyisis.sharpref;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtEmail = findViewById(R.id.txt_email);

        txtEmail.setText("Hello "+SharPrefManager.getEmail());

        findViewById(R.id.btn_logout).setOnClickListener(v -> {
            SharPrefManager.setLoggedIn(false);
            startActivity(new Intent(MainActivity.this, LoginActivity.class));
            finish();
        });
    }
}