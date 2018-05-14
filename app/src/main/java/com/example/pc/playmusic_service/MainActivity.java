package com.example.pc.playmusic_service;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnBroad, btnService, btnNoti;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnBroad = findViewById(R.id.btnBroad);
        btnService = findViewById(R.id.btnService);
        btnNoti = findViewById(R.id.btnNoti);

        btnBroad.setOnClickListener(this);
        btnService.setOnClickListener(this);
        btnNoti.setOnClickListener(this);
    }



    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnBroad:
                Intent i = new Intent(this,BroadcastReceiverActivity.class);
                startActivity(i);
                break;
            case R.id.btnService:
                Intent i1 = new Intent(this,ServiceActivity.class);
                startActivity(i1);
                break;
            case R.id.btnNoti:
                Intent i2 = new Intent(this,NotificationActivity.class);
                startActivity(i2);
                break;
        }
    }
}
