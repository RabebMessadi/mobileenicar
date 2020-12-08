package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class detailswheeledrobotscompitition extends AppCompatActivity {
    private Button back;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailswheeledrobotscompitition);
        back = (Button) findViewById(R.id.backdetailwheeled);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentback =new Intent(detailswheeledrobotscompitition.this , wheeledrobotcompetition.class);
                startActivity(intentback);
            }
        });}
}

