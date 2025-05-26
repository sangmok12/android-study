package com.example.a8_5;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
    Toast mToast = null;
    int count;
    String str;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.shortmsg).setOnClickListener(mClickListener);
        findViewById(R.id.longmsg).setOnClickListener(mClickListener);
    }
    Button.OnClickListener mClickListener = new Button.OnClickListener() {
        public void onClick(View v)
        {
            switch(v.getId())
            {
                case R.id.shortmsg:
                    Toast.makeText(MainActivity.this, "Short Time Message",
                            Toast.LENGTH_SHORT).show();
                    break;
                case R.id.longmsg:
                    Toast.makeText(MainActivity.this, "Long Time Message",
                            Toast.LENGTH_LONG).show();
                    break;
            }
        }
    };
}
