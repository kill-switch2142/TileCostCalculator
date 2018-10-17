package com.lenovo_k6.tilecostcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Activity2 extends AppCompatActivity {

    int l,b,area;
    private EditText length;
    private EditText breadth;
    //private TextView outp;
    private Button calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        length=(EditText) findViewById(R.id.length);
        breadth=(EditText) findViewById(R.id.breadth);
        //outp=(TextView) findViewById(R.id.outp);
        calculate=(Button) findViewById(R.id.calculate);



        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                l=Integer.valueOf(length.getText().toString());
                b=Integer.valueOf(breadth.getText().toString());

                int num=nTiles(l,b);

                int g=gcd(l,b);
                if(g == 1) {
                    g = 2;
                    }
                else if(g>=5){
                    g = 4;
                }
                    //outp.setText(String.valueOf(num));

                //Intent i = new Intent(this, Activity4.class);
                //i.putExtra("NUMKEY", num);
                //startActivity(i);

                openActivity3(num,g);
            }
        });



    }

    int gcd(int n1, int n2) {
        int g = 1;
        for(int i = 1; i <= n1 && i <= n2; ++i)
        {
            if(n1 % i==0 && n2 % i==0)
                g = i;
        }
        return g;
    }

    int nTiles(int lengthf, int breadthf)
    {
        int areaf = lengthf * breadthf;
        int g = gcd(lengthf, breadthf);
        int n, areat;
        if(g == 1) {
            areat = 2*2;
            n = areaf/areat;
        }
        else if(g<5) {
            areat = g*g;
            n = areaf/areat;
        }
        else {
            areat = 4*4;
            n = areaf/areat;
        }


        int no = n + ((10/100)*n);
        return no;
    }

    public void openActivity3(int num,int g){
        Intent intent = new Intent(this, Activity3.class);

        intent.putExtra("NUMKEY", num);
        intent.putExtra("GCDID",g);
        startActivity(intent);
    }


}
