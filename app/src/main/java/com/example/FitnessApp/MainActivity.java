package com.example.FitnessApp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    Button Existing, Design, Stats;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //setting the buttons
        Design = (Button) findViewById(R.id.Design);
        Existing = (Button) findViewById(R.id.Existing);
        Stats=(Button) findViewById(R.id.stats);
        //perform setonClickListner event on first button
        Design.setOnClickListener(onClickListener);
        Existing.setOnClickListener(onClickListener);
        Stats.setOnClickListener(onClickListener);
    }
        private OnClickListener onClickListener = new OnClickListener()
        {
            @Override
            public void onClick(View v) {
                switch(v.getId()) {
                    //Start design.class
                    case R.id.Design:
                    Intent myintent = new Intent(MainActivity.this, design.class);
                    startActivity(myintent);
                    break;
                    case R.id.Existing:
                        Intent myintent2 = new Intent(MainActivity.this, existing.class);
                        startActivity(myintent2);
                        break;
                    case R.id.stats:
                        Intent myintent3 = new Intent(MainActivity.this, stats.class);
                        startActivity(myintent3);
                        break;
                }
            }

        };

    }

