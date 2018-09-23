package com.example.daniahumaidan.fissionyeastcellcycle2;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ImageView iva= (ImageView) findViewById(R.id.iva);
        ImageView ivb= (ImageView) findViewById(R.id.ivb);
        ImageView ivc= (ImageView) findViewById(R.id.ivc);
        ImageView ivd= (ImageView) findViewById(R.id.ivd);
        ImageView ive= (ImageView) findViewById(R.id.ive);
        ImageView ivf= (ImageView) findViewById(R.id.ivf);
        ImageView ivaa= (ImageView) findViewById(R.id.ivaa);
        TextView tvg1= (TextView) findViewById(R.id.tvg1);
        TextView tvs= (TextView) findViewById(R.id.tvs);
        TextView tvg2= (TextView) findViewById(R.id.tvg2);
        TextView tvm= (TextView) findViewById(R.id.tvm);
        ImageView ivarr1= (ImageView) findViewById(R.id.ivarr1);
        ImageView ivarr2= (ImageView) findViewById(R.id.ivarr2);
        ImageView ivarr3= (ImageView) findViewById(R.id.ivarr3);
        ImageView ivarr4= (ImageView) findViewById(R.id.ivarr4);
        ImageView ivarr5= (ImageView) findViewById(R.id.ivarr5);
        ImageView ivarr6= (ImageView) findViewById(R.id.ivarr6);
        //iva.setVisibility(View.INVISIBLE);
        ivb.setVisibility(View.INVISIBLE);
        ivc.setVisibility(View.INVISIBLE);
        ivd.setVisibility(View.INVISIBLE);
        ive.setVisibility(View.INVISIBLE);
        ivf.setVisibility(View.INVISIBLE);
        ivaa.setVisibility(View.INVISIBLE);
        tvs.setVisibility(View.INVISIBLE);
        tvg2.setVisibility(View.INVISIBLE);
        tvm.setVisibility(View.INVISIBLE);
        ivarr1.setVisibility(View.INVISIBLE);
        ivarr2.setVisibility(View.INVISIBLE);
        ivarr3.setVisibility(View.INVISIBLE);
        ivarr4.setVisibility(View.INVISIBLE);
        ivarr5.setVisibility(View.INVISIBLE);
        ivarr6.setVisibility(View.INVISIBLE);
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                changeImg1();
            }
        }, 1000);

    }
    public void intro(View view) {
        Intent intent = new Intent(this, Introduction.class);
        startActivity(intent);
    }

    public void changeImg1() {
        ImageView ivb= (ImageView) findViewById(R.id.ivb);
        ImageView ivarr1= (ImageView) findViewById(R.id.ivarr1);
        TextView tvs= (TextView) findViewById(R.id.tvs);
        ivb.setVisibility(View.VISIBLE);
        ivarr1.setVisibility(View.VISIBLE);
        tvs.setVisibility(View.VISIBLE);
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                changeImg2();
            }
        }, 1000);
    }

    public void changeImg2() {
        ImageView ivc= (ImageView) findViewById(R.id.ivc);
        TextView tvg2= (TextView) findViewById(R.id.tvg2);
        ImageView ivarr2= (ImageView) findViewById(R.id.ivarr2);
        ivarr2.setVisibility(View.VISIBLE);
        ivc.setVisibility(View.VISIBLE);
        tvg2.setVisibility(View.VISIBLE);
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                changeImg3();
            }
        }, 1000);
    }
    public void changeImg3() {
        TextView tvm= (TextView) findViewById(R.id.tvm);
        ImageView ivd= (ImageView) findViewById(R.id.ivd);
        ImageView ivarr3= (ImageView) findViewById(R.id.ivarr3);
        ivarr3.setVisibility(View.VISIBLE);
        tvm.setVisibility(View.VISIBLE);
        ivd.setVisibility(View.VISIBLE);
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                changeImg4();
            }
        }, 1000);
    }
    public void changeImg4() {
        ImageView ive= (ImageView) findViewById(R.id.ive);
        ive.setVisibility(View.VISIBLE);
        ImageView ivarr4= (ImageView) findViewById(R.id.ivarr4);
        ivarr4.setVisibility(View.VISIBLE);
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                changeImg5();
            }
        }, 1000);
    }
    public void changeImg5() {
        ImageView ivf= (ImageView) findViewById(R.id.ivf);
        ivf.setVisibility(View.VISIBLE);
        ImageView ivarr5= (ImageView) findViewById(R.id.ivarr5);
        ivarr5.setVisibility(View.VISIBLE);
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                changeImg6();
            }
        }, 1000);
    }
    public void changeImg6() {
        ImageView ivaa= (ImageView) findViewById(R.id.ivaa);
        ivaa.setVisibility(View.VISIBLE);
        ImageView ivarr6= (ImageView) findViewById(R.id.ivarr6);
        ivarr6.setVisibility(View.VISIBLE);
    }

}
