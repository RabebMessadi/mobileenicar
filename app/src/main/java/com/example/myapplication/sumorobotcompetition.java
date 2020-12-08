package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class sumorobotcompetition extends AppCompatActivity {
    private Button detailSumo;
    private Button back;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sumorobotcompetition);
        detailSumo = (Button) findViewById(R.id.detailss);
        detailSumo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentsumo =new Intent(sumorobotcompetition.this , detailssumorobotcompetition.class);
                startActivity(intentsumo);
            }
        });

        back = (Button) findViewById(R.id.backs);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentback =new Intent(sumorobotcompetition.this , compitition.class);
                startActivity(intentback);
            }
        });
    }
}
