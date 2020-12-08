package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class walkerrobotcompetition extends AppCompatActivity {
    private Button detailWalker;
    private Button back;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.walkerrobotcompetition);
        detailWalker = (Button) findViewById(R.id.detailsw);
        detailWalker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentwalker =new Intent(walkerrobotcompetition.this , detailswalkerrobotcompetition.class);
                startActivity(intentwalker);
            }
        });

        back = (Button) findViewById(R.id.backwalker);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentback =new Intent(walkerrobotcompetition.this , compitition.class);
                startActivity(intentback);
            }
        });}
}
