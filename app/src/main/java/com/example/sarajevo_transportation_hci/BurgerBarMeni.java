package com.example.sarajevo_transportation_hci;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class BurgerBarMeni extends AppCompatActivity implements View.OnClickListener {

    Button btn1, btn2, btn3, btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.burger_bar_meni);



        // connecting buttons with the
        // layout using findViewById()
        btn1 = findViewById(R.id.shedule_button);
        btn2 = findViewById(R.id.news_button);
        btn3 = findViewById(R.id.about_us_button);
        btn4 = findViewById(R.id.payment_button);


        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);

    }

    @Override
    public void onClick (View v){

        switch (v.getId()) {

            case R.id.shedule_button:
                Intent intent2 = new Intent(this, Schedule.class);
                startActivity(intent2);

                Toast.makeText(this, "SCHEDULE", Toast.LENGTH_SHORT).show();
                break;

            case R.id.news_button:
                Intent intent3 = new Intent(this, News.class);
                startActivity(intent3);

                Toast.makeText(this, "NEWS", Toast.LENGTH_SHORT).show();
                break;

            case R.id.about_us_button:
                Intent intent4 = new Intent(this, AboutUs.class);
                startActivity(intent4);

                Toast.makeText(this, "ABOUT US", Toast.LENGTH_SHORT).show();
                break;

            case R.id.payment_button:
                Intent intent5 = new Intent(this, Payment.class);
                startActivity(intent5);

                Toast.makeText(this, "PAYMENT", Toast.LENGTH_SHORT).show();
                break;

        }
    }
}