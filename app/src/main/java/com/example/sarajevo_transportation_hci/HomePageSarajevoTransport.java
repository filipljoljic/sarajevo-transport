package com.example.sarajevo_transportation_hci;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.TintableBackgroundView;

public class HomePageSarajevoTransport extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);


        button = (Button) findViewById(R.id.burgerBarMeni);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity3();
            }
        });
    }
    public void openNewActivity3(){
        Intent intent = new Intent(this, BurgerBarMeni.class);
        startActivity(intent);
    }

}

