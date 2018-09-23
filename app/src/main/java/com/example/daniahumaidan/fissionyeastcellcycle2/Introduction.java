package com.example.daniahumaidan.fissionyeastcellcycle2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Introduction extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction);
    }
    public void temporal(View view) {
        Intent intent = new Intent(this, TemporalEvolution.class);
        startActivity(intent);
        //finish();
    }
    public void temporal_extended(View view) {
        Intent intent = new Intent(this, extended_temporal.class);
        startActivity(intent);
        //finish();
    }
}
