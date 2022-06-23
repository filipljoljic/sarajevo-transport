package com.example.sarajevo_transportation_hci;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class Login extends AppCompatActivity implements View.OnClickListener {
    Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_user);

        // connecting buttons with the
        // layout using findViewById()
        btn1 = findViewById(R.id.loginUser);
        btn2 = findViewById(R.id.forgotPassword);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
    }

        @Override
        public void onClick (View v){

            switch (v.getId()) {

                // cases applied over different buttons
                case R.id.loginUser:
                    Intent intent = new Intent(this, HomePageSarajevoTransport.class);
                    startActivity(intent);

                    // Toast message appears when button pressed
                    Toast.makeText(this, "Login in...", Toast.LENGTH_SHORT).show();
                    break;

                case R.id.forgotPassword:
                    Intent intent2 = new Intent(this, ForgotPassword.class);
                    startActivity(intent2);

                    Toast.makeText(this, "Forgot password", Toast.LENGTH_SHORT).show();
                    break;

            }
        }
    }
