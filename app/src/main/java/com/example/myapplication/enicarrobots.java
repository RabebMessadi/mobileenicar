package com.example.myapplication;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;

public class enicarrobots extends AppCompatActivity {
    public Button butcomp;
    public Button butback;
    public Button butplanning;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enicarrobots);
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

        /*** Planning  view ***/
        butplanning = (Button) findViewById(R.id.butplanning);
        butplanning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentplanning = new Intent(enicarrobots.this ,planning.class);
                startActivity(intentplanning);
            }
        });


    }
}