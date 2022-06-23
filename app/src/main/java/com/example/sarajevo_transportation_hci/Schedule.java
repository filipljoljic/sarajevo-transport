package com.example.sarajevo_transportation_hci;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Schedule extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.schedule);


        button = (Button) findViewById(R.id.transportNearMe);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity2();
            }
        });
    }
    public void openNewActivity2(){
        Intent intent = new Intent(this, TransportNearMe.class);
        startActivity(intent);
    }

}
