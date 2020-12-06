package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class enicarrobots extends AppCompatActivity {
 public Button butcomp;
 public Button butback;
     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enicarrobots);
        butcomp = (Button) findViewById(R.id.butcompitition);
        butcomp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(enicarrobots.this , compitition.class);
                startActivity(intent);
            }
        });
        butback = (Button) findViewById(R.id.back);
        butback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentback =new Intent(enicarrobots.this , evenements.class);
                startActivity(intentback);
            }
        });

        /*** Rest Planning  view ***/


    }
}