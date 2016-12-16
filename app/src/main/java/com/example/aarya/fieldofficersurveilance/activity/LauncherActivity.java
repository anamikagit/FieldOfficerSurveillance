package com.example.aarya.fieldofficersurveilance.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.aarya.fieldofficersurveilance.R;

import java.util.Observable;
import java.util.concurrent.TimeUnit;

public class LauncherActivity extends AppCompatActivity {
    public static final String TAG ="LauncherActivity" ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
    }
}
