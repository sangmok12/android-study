package com.example.a7_9;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.buttonid).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ImageView img = (ImageView) findViewById(R.id.imageid);
                img.setColorFilter(Color.BLUE);
            }
        });
    }
}
