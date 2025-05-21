package com.example.a4_7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onButtonClick(View view) {
        EditText edit = (EditText) findViewById(R.id.edit);
        String str = edit.getText().toString();
        Toast.makeText(MainActivity.this, str, Toast.LENGTH_SHORT).show();
    }
}
