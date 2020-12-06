package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class evenements extends AppCompatActivity {
    public Button enicarrobots;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.evenements);

        /**** enicarrobots 5.0 to the next view od enicarrobots****/
        enicarrobots = (Button) findViewById(R.id.robotsevent);
        enicarrobots.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(evenements.this,enicarrobots.class);
                startActivity(intent);
            }
        });


    }




}
