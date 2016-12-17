package com.example.aarya.fieldofficersurveilance.activity;

import android.app.ActivityManager;
import android.os.Process;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.aarya.fieldofficersurveilance.R;

import java.util.Iterator;
import java.util.List;

public class LoggedInFO extends AppCompatActivity {
    Button btn_stopService;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logged_in_fo);
        btn_stopService = (Button) findViewById(R.id.btn_stpService);


        ActivityManager am = (ActivityManager) getSystemService(ACTIVITY_SERVICE);
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = am.getRunningAppProcesses();

        Iterator<ActivityManager.RunningAppProcessInfo> iter = runningAppProcesses.iterator();

        while(iter.hasNext()){
            final ActivityManager.RunningAppProcessInfo next = iter.next();

            String pricessName = getPackageName() + ":FusedService";


            if(next.processName.equals(pricessName)){
                btn_stopService.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Process.killProcess(next.pid);
                    }
                });
                break;
            }
            Log.e("service","service stopped");
        }
    }
}
