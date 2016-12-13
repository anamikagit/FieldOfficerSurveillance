package com.example.aarya.fieldofficersurveilance.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.aarya.fieldofficersurveilance.R;
import com.example.aarya.fieldofficersurveilance.service.FusedService;

public class MainActivity extends AppCompatActivity {
    TextView tv_userName,tv_password;
    EditText edt_userName,edt_password;
    Button btn_submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent i=new Intent(MainActivity.this,FusedService.class);
        startService(i);

        tv_userName = (TextView) findViewById(R.id.tv1_user_name);
        tv_password = (TextView) findViewById(R.id.tv2_password);
        edt_userName = (EditText) findViewById(R.id.edt1_user_name);
        edt_password = (EditText) findViewById(R.id.edt2_password);
        btn_submit = (Button) findViewById(R.id.btn_submit);
    }
}
