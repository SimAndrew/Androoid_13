package com.example.andre.myapplication;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView cat1, dog1;
    private MediaPlayer catSound, dogSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cat1 = (ImageView)findViewById(R.id.cat);
        dog1 = (ImageView)findViewById(R.id.dog);

        catSound = MediaPlayer.create(this, R.raw.cat);
        dogSound = MediaPlayer.create(this, R.raw.dog);

        imageClick ();
    }

    public void imageClick () {
        cat1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        soundPlay (catSound);
                    }
                }
        );

        dog1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        soundPlay (dogSound);
                    }
                }
        );
    }
    public void soundPlay (MediaPlayer sound) {
        sound.start();
    }
}
