package com.example.aarya.fieldofficersurveilance.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.aarya.fieldofficersurveilance.R;
import com.example.aarya.fieldofficersurveilance.service.FusedService;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent i=new Intent(MainActivity.this,FusedService.class);
        startService(i);
    }
}
