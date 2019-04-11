package com.strustru.strutube;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final VideoView miVideo = findViewById(R.id.myvideo);
        String videoPath = "android.resource://" + getPackageName() + "/"+ R.raw.sichi;
        Uri uri = Uri.parse(videoPath);
        miVideo.setVideoURI(uri);
        MediaController media = new MediaController(this);
        media.setAnchorView(miVideo);
        miVideo.setMediaController(new MediaController(this));

        final Button pause  = findViewById(R.id.button6);
        pause.setOnClickListener(new View.OnClickListener() {
            public int counter;
            @Override
            public void onClick(View v) {
                counter += 1;
                if (counter%2==0)
                {
                    miVideo.pause();
                }
                else
                {
                    miVideo.start();
                }

            }
        });

        Log.d("MainAct", "onCreate()");
    }

    public  void onClick()
    {

    }
    @Override
    protected void onPause()
    {
        super.onPause();
        Log.d("MainAct", "onPause()");

    }
    @Override
    protected void onResume()
    {
        super.onResume();
        Log.d("MainAct", "onResume()");
    }
    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Log.d("MainAct", "onDestroy()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MainAct", "onStop()");
    }

    protected  void onStart()
    {
        super.onStart();
        Log.d("MainAct", "onStart()");
    }
    protected  void onRestart()
    {
        super.onRestart();
        Log.d("MainAct", "onStart()");
    }
}
