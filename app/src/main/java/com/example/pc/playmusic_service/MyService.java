package com.example.pc.playmusic_service;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Toast;

public class MyService extends Service {
    MediaPlayer play;
    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        play = MediaPlayer.create(getApplicationContext(), R.raw.muzik);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        play.start();
        Toast.makeText(getApplicationContext(), "Đang nghe nhạc",Toast.LENGTH_LONG).show();

        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        play.release();
        Toast.makeText(getApplicationContext(),"Dừng nhạc",Toast.LENGTH_LONG).show();
        super.onDestroy();
    }
}
