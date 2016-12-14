package com.example.aarya.fieldofficersurveilance.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.aarya.fieldofficersurveilance.R;
import com.example.aarya.fieldofficersurveilance.model.LoginResponse;
import com.example.aarya.fieldofficersurveilance.model.Util;
import com.example.aarya.fieldofficersurveilance.rest.ApiClient;
import com.example.aarya.fieldofficersurveilance.rest.ApiInterface;
import com.example.aarya.fieldofficersurveilance.service.FusedService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    TextView tv_userName,tv_password;
    EditText edt_userName,edt_password;
    Button btn_submit;
    public Editable saveUid;
    public Editable savePwd;
    ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TelephonyManager mngr = (TelephonyManager)getSystemService(Context.TELEPHONY_SERVICE);
        Util.setIMEI(mngr.getDeviceId().toString());

       Intent i=new Intent(MainActivity.this,FusedService.class);
        startService(i);

        tv_userName = (TextView) findViewById(R.id.tv1_user_name);
        tv_password = (TextView) findViewById(R.id.tv2_password);
        edt_userName = (EditText) findViewById(R.id.edt1_user_name);
        edt_password = (EditText) findViewById(R.id.edt2_password);
        btn_submit = (Button) findViewById(R.id.btn_submit);

        String str_userName = edt_userName.getText().toString();
        Toast.makeText(MainActivity.this,"username:"+str_userName,Toast.LENGTH_LONG).show();

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*String saveUname = edt_userName.getText().toString();
                String savePwd = edt_password.getText().toString();*/
                saveUid = (edt_userName.getText());
                savePwd = (edt_password.getText());
                SendUsernamePassword();

                Toast.makeText(MainActivity.this,"name:"+ saveUid,Toast.LENGTH_LONG).show();
            }
        });
    }

    public void SendUsernamePassword() {
        Call<List<LoginResponse>> call = apiService.sendLoginCredential(saveUid,savePwd,Util.getIMEI());
        call.enqueue(new Callback<List<LoginResponse>>() {
            @Override
            public void onResponse(Call<List<LoginResponse>> call, Response<List<LoginResponse>> response) {

            }

            @Override
            public void onFailure(Call<List<LoginResponse>> call, Throwable t) {
            }
        });
        /*ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);

        Call<List<LoginResponse>> call = apiService.sendLoginCredential(savePwd,saveUname,Util.getIMEI());
        call.enqueue(new Callback<List<LoginResponse>>() {
            @Override
            public void onResponse(Call<List<LoginResponse>> call, Response<List<LoginResponse>> response) {
               *//* List<LoginResponse> loginResponse = response.body();
                (loginResponse.get(0).getId());*//*
            }

            @Override
            public void onFailure(Call<List<LoginResponse>> call, Throwable t) {
                Log.e("anu", "Call failed: " + t.getMessage());
            }
        });*/
    }
}
