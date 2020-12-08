package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class wheeledrobotcompetition extends AppCompatActivity {
    private Button detailWheeled;
    private Button back;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wheeledrobotcompitition);

        detailWheeled = (Button) findViewById(R.id.detailswe);
        detailWheeled.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intentsumo =new Intent(wheeledrobotcompetition.this , detailswheeledrobotscompitition.class);
            startActivity(intentsumo);
        }
    });

    back = (Button) findViewById(R.id.backwheeled);
        back.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intentback =new Intent(wheeledrobotcompetition.this , compitition.class);
            startActivity(intentback);
        }
    });
}
}
