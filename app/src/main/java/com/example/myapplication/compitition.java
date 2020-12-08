package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class compitition extends AppCompatActivity {
   private Button sumo;
   private Button walker;
   private Button wheeled;
   private Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.compitition);

        sumo = (Button) findViewById(R.id.sumocomp);
        sumo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 =new Intent(compitition.this , sumorobotcompetition.class);
                startActivity(intent1);
            }
        });
        walker = (Button) findViewById(R.id.walkercomp);
        walker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 =new Intent(compitition.this , walkerrobotcompetition.class);
                startActivity(intent2);
            }
        });
        wheeled = (Button) findViewById(R.id.wheeledcomp);
        wheeled.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 =new Intent(compitition.this , wheeledrobotcompetition.class);
                startActivity(intent3);
            }
        });
        back = (Button) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 =new Intent(compitition.this , enicarrobots.class);
                startActivity(intent4);
            }
        });
    }
}