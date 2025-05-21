package com.example.a4_12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onButtonClick(View view) {
        Switch switch1 = (Switch) findViewById(R.id.switch1);
        TextView text1 = (TextView) findViewById(R.id.textResult);
        switch(view.getId()) {
            case R.id.button1:
                if(switch1.isChecked()) {
                    text1.setText("Switch On");
                } else {
                    text1.setText("Switch Off");
                }
                break;
        }
    }
}