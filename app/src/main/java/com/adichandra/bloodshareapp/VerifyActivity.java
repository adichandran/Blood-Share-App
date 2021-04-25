package com.adichandra.bloodshareapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class VerifyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);
        getSupportActionBar().hide();

    }

    public void OnClickHome(View view){
        Intent intent = new Intent(this,HomeActivity.class);
        startActivity(intent);
    }


}