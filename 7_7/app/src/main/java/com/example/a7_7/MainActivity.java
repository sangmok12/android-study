package com.example.a7_7;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.buttonid).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView txt = (TextView) findViewById(R.id.textid);
                txt.setTextSize(40);
            }
        });
    }
}