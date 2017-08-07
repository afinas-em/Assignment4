package com.wordpress.affdroid.framelayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    LinearLayout l1, l2;
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        l1 = (LinearLayout) findViewById(R.id.layout1);
        l2 = (LinearLayout) findViewById(R.id.layout2);

        b1 = (Button)findViewById(R.id.login);
        b2 = (Button)findViewById(R.id.signup);

        l2.setVisibility(View.GONE);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        if(v==b1){
            l1.setVisibility(View.VISIBLE);
            l2.setVisibility(View.GONE);
        }
        if(v==b2){
            l1.setVisibility(View.GONE);
            l2.setVisibility(View.VISIBLE);
        }

    }
}
