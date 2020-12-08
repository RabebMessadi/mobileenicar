package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class detailssumorobotcompetition extends AppCompatActivity {
    private Button back;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailssumorobotscompetition);
        back = (Button) findViewById(R.id.backdetailsumo);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentback =new Intent(detailssumorobotcompetition.this , sumorobotcompetition.class);
                startActivity(intentback);
            }
        });
    }
}
