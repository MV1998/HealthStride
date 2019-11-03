package com.mohit.varma.healthstride;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.mohit.varma.healthstride.healthtopics.BloodPressure;
import com.mohit.varma.healthstride.healthtopics.Depression;
import com.mohit.varma.healthstride.healthtopics.FoodSafety;
import com.mohit.varma.healthstride.healthtopics.Injuries;
import com.mohit.varma.healthstride.healthtopics.SleepDifficulties;
import com.mohit.varma.healthstride.healthtopics.Stress;


public class MainActivity extends AppCompatActivity {

    private TextView blood_pressure,stress,sleep_difficulties,food_safety,depression,injuries;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        blood_pressure = (TextView) findViewById(R.id.bloodpressure);
        stress = (TextView) findViewById(R.id.stress);
        sleep_difficulties = (TextView) findViewById(R.id.sleepdifficulties);
        food_safety = (TextView) findViewById(R.id.foodsafety);
        depression = (TextView) findViewById(R.id.depression);
        injuries = (TextView) findViewById(R.id.injuries);

        blood_pressure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(MainActivity.this, BloodPressure.class);
                startActivity(intent);
            }
        });

        stress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(MainActivity.this, Stress.class);
                startActivity(intent);
            }
        });
        sleep_difficulties.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(MainActivity.this, SleepDifficulties.class);
                startActivity(intent);
            }
        });
        food_safety.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(MainActivity.this, FoodSafety.class);
                startActivity(intent);
            }
        });
        depression.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(MainActivity.this, Depression.class);
                startActivity(intent);
            }
        });
        injuries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(MainActivity.this, Injuries.class);
                startActivity(intent);
            }
        });

    }

}
