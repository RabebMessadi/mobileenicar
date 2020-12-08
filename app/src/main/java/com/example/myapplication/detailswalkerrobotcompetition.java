package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class detailswalkerrobotcompetition extends AppCompatActivity {
    private Button back;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.walkerrobotcompetition);
        back = (Button) findViewById(R.id.backdetailwalker);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentback =new Intent(detailswalkerrobotcompetition.this , walkerrobotcompetition.class);
                startActivity(intentback);
            }
        });}
}

