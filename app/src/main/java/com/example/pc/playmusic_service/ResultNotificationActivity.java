package com.example.pc.playmusic_service;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class ResultNotificationActivity extends AppCompatActivity {
    TextView txtContent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_notification);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

        txtContent = (TextView) findViewById(R.id.txtContent);

        Intent intent = getIntent();
        String msg = intent.getStringExtra("content");
        txtContent.setText(msg);
    }
}
