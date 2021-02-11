package com.beautyisis.sharpref;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {


    private EditText edtEmail, edtPassword;
    private ProgressBar loading;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtEmail = findViewById(R.id.edt_email);
        edtPassword = findViewById(R.id.edt_pass);
        loading = findViewById(R.id.loading);



        findViewById(R.id.button).setOnClickListener((View.OnClickListener) v -> {
            loading.setVisibility(View.VISIBLE);
            String email = edtEmail.getText().toString();
            String pass = edtPassword.getText().toString();

            new Handler().postDelayed((Runnable) () ->
                    {
                        if(email.equals("admin") && pass.equals("admin")) {
                            SharPrefManager.setEmail(email);
                            SharPrefManager.setLoggedIn(true);
                            startActivity(new Intent(this, MainActivity.class));
                            finish();
                        }
                        else{
                            loading.setVisibility(View.GONE);
                            Toast.makeText(this, "Username dan password : admin", Toast.LENGTH_SHORT).show();
                        }
                    },
                    2000
            );
        });
    }
}