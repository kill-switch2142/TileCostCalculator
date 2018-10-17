package com.lenovo_k6.tilecostcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Activity3 extends AppCompatActivity {

    ImageButton imageButton6,imageButton,imageButton2,imageButton3,imageButton4,imageButton5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        imageButton6 = (ImageButton) findViewById(R.id.imageButton6);
        imageButton = (ImageButton) findViewById(R.id.imageButton);
        imageButton2 = (ImageButton) findViewById(R.id.imageButton2);
        imageButton3 = (ImageButton) findViewById(R.id.imageButton3);
        imageButton4 = (ImageButton) findViewById(R.id.imageButton4);
        imageButton5 = (ImageButton) findViewById(R.id.imageButton5);

        imageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int num= getIntent().getIntExtra("NUMKEY",0);
                int g= getIntent().getIntExtra("GCDID",0);
                openActivity4(num,25,g);
            }
        });

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int num= getIntent().getIntExtra("NUMKEY",0);
                int g= getIntent().getIntExtra("GCDID",0);
                openActivity4(num,30,g);
            }
        });

        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int num= getIntent().getIntExtra("NUMKEY",0);
                int g= getIntent().getIntExtra("GCDID",0);
                openActivity4(num,35,g);
            }
        });

        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int num= getIntent().getIntExtra("NUMKEY",0);
                int g= getIntent().getIntExtra("GCDID",0);
                openActivity4(num,40,g);
            }
        });

        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int num= getIntent().getIntExtra("NUMKEY",0);
                int g= getIntent().getIntExtra("GCDID",0);
                openActivity4(num,45,g);
            }
        });

        imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int num= getIntent().getIntExtra("NUMKEY",0);
                int g= getIntent().getIntExtra("GCDID",0);
                openActivity4(num,50,g);
            }
        });
    }

    public void openActivity4(int num,int num2,int g){
        Intent intent = new Intent(this, Activity4.class);
        intent.putExtra("NUMKEY", num);
        intent.putExtra("COSTID", num2);
        intent.putExtra("GCDID", g);
        startActivity(intent);
    }
}
