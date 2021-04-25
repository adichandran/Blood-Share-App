package com.adichandra.bloodshareapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class AlmostThereActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almost_there);
        getSupportActionBar().hide();
    }
}