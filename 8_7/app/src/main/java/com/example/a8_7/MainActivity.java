package com.example.a8_7;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    SoundPool mPool;
    int mDing;
    AudioManager mAm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPool = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
        mDing = mPool.load(this, R.raw.bgm, 1);
        mAm = (AudioManager)getSystemService(AUDIO_SERVICE);
        findViewById(R.id.beep1).setOnClickListener(mClickListener);
        findViewById(R.id.beep2).setOnClickListener(mClickListener);
    }
    Button.OnClickListener mClickListener = new Button.OnClickListener(){
        public void onClick(View v){
            MediaPlayer player;
            switch(v.getId()){
                case R.id.beep1:
                    mPool.play(mDing, 1, 1, 0, 0, 1);
                    break;
                case R.id.beep2:
                    mAm.playSoundEffect(AudioManager.FX_KEYPRESS_STANDARD);
                    break;
            }
        }
    };
}