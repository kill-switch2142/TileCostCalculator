package com.lenovo_k6.tilecostcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static java.lang.System.exit;

public class Activity4 extends AppCompatActivity {
    private Button button,button2;
    private TextView textView16,textView14,textView18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        textView14 = (TextView) findViewById(R.id.textView14);
        textView16 = (TextView) findViewById(R.id.textView16);
        textView18 = (TextView) findViewById(R.id.textView18);
        button=(Button) findViewById(R.id.button);
        button2=(Button) findViewById(R.id.button2);

        int num= getIntent().getIntExtra("NUMKEY",0);
        int num2= getIntent().getIntExtra("COSTID",0);
        int g= getIntent().getIntExtra("GCDID",0);

        textView14.setText(String.valueOf(num2*g*g));
        textView16.setText(String.valueOf(num));
        textView18.setText(String.valueOf(num*num2*g*g));

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                exit(0);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openActivity2();
            }
        });
    }


    public void openActivity2(){
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }

}
