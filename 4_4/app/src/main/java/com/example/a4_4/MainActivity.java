package com.example.a4_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onButtonClick(View view) {
        TextView text1 = (TextView) findViewById(R.id.text1);
        switch(view.getId()) {
            case R.id.button1:
                text1.setText("hello");
                break;
            case R.id.button2:
                text1.setText("world");
                break;
        }
    }
}