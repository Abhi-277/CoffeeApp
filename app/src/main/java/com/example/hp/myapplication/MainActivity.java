package com.example.hp.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    int pointA=0;
    int pointB=0;
    int priceA=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void inc_A(View view)
    {
        pointA=pointA+1;
        displayA(pointA);
    }
    public void inc_B(View view)
    {
        if (pointA==0)
        {
            displayA(pointA);
        }
        else
        pointA=pointA-1;
        displayA(pointA);
    }

    public void inc_c(View view)
    {
        pointB=pointB+1;
        displayB(pointB);
    }
    public void inc_d(View view)
    {
        if (pointB==0)
        {
            displayB(pointB);
        }
        else
            pointB=pointB-1;
        displayB(pointB);
    }
    public void submitOrder(View view) {
        displayA(pointA);
        displayAPrice(pointA * 50+pointB*80);
    }
    private void displayAPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.prA);
        priceTextView.setText(NumberFormat.getCurrencyInstance(new Locale("en","in")).format(number));
    }

    private void displayA(int number)
    {

        TextView quantityTextView = (TextView) findViewById(R.id.teamA);
        quantityTextView.setText("" + number);
    }

    private void displayB(int number)
    {

        TextView quantityTextView = (TextView) findViewById(R.id.teamB);
        quantityTextView.setText("" + number);
    }
    public void fifth(View view) {
        Intent i3= new Intent(this, Main2Activity.class);
        startActivity(i3);
    }

    }


