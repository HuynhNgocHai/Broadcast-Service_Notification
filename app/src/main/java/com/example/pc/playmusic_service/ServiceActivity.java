package com.example.pc.playmusic_service;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ServiceActivity extends AppCompatActivity {
    Button btnStart, btnStop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);
        btnStart = (Button) findViewById(R.id.btnstart);
        btnStop = (Button) findViewById(R.id.btnstop);
        btnStart.setOnClickListener(Start_Click);
        btnStop.setOnClickListener(Stop_Click);
    }

    View.OnClickListener Start_Click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent play = new Intent(ServiceActivity.this, MyService.class);
            startService(play);

        }
    };
    View.OnClickListener Stop_Click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent play = new Intent(ServiceActivity.this, MyService.class);
            stopService(play);
        }
    };
}
