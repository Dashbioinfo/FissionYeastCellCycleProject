package com.example.daniahumaidan.fissionyeastcellcycle2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.Toast;

import java.util.ArrayList;

public class EditActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
    }
    public void donegoback(View view) {
        Switch Atf1Switch = (Switch) findViewById(R.id.switchAtf1);
        Switch Sep1Switch = (Switch) findViewById(R.id.switchSep1);
        Switch Fkh2Switch = (Switch) findViewById(R.id.switchFkh2);
        int [] array={retVal(Sep1Switch.isChecked()),retVal(Fkh2Switch.isChecked()),retVal(Atf1Switch.isChecked())};
 //       Toast.makeText(getApplicationContext(),text,Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, extended_temporal.class);
        intent.putExtra("choices", array);
        startActivity(intent);
        finish();
    }

    public int retVal(boolean b){
        int val;
        if (b==true){
            val=1;
            return val;
        }
        else{
            val=0;
            return val;}
    }

}
