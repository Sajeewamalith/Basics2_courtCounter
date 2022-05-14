package com.example.basics2_courtcounter;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int quantity = 0;
    int quantity_b = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         *  change actionBar colour
         */
        // Define ActionBar object
        ActionBar actionBar;
        actionBar = getSupportActionBar();
        // Define ColorDrawable object and parse color
        // using parseColor method
        // with color hash code as its parameter
        ColorDrawable colorDrawable
                = new ColorDrawable(Color.parseColor("#FF6700"));
        // Set BackgroundDrawable
        actionBar.setBackgroundDrawable(colorDrawable);


    }

    /**
     * Team A
     */
    private void displayA(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.a_quantity_text_view);
        quantityTextView.setText("" + number);
    }

    public void point3(View view) {
        quantity= quantity+3;
        displayA(quantity);
    }
    public void point2(View view) {
        quantity= quantity+2;
        displayA(quantity);
    }
    public void point1(View view) {
        quantity= quantity+1;
        displayA(quantity);
    }

    /**
     * Team B
     */
    private void displayB(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.b_quantity_text_view);
        quantityTextView.setText("" + number);
    }

    public void point3B(View view) {
        quantity_b= quantity_b+3;
        displayB(quantity_b);
    }
    public void point2B(View view) {
        quantity_b= quantity_b+2;
        displayB(quantity_b);
    }
    public void point1B(View view) {
        quantity_b= quantity_b+1;
        displayB(quantity_b);
    }
    /**
     * Reset
     */
    public void reset(View view) {
        quantity_b= quantity_b-quantity_b;
        displayB(quantity_b);

        quantity= quantity-quantity;
        displayA(quantity);
    }
}