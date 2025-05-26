package com.example.a8_2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TestView tv = new TestView(this);
        setContentView(tv);
    }
}
class TestView extends View {
    public TestView(Context context) {
        super(context);
    }
    public void onDraw(Canvas canvas) {
        canvas.drawColor(Color.LTGRAY);
        Paint Pnt = new Paint();
        Pnt.setStrokeWidth(30f);
        // 빨간색 사각형
        Pnt.setColor(Color.RED);
        canvas.drawRect(10, 10, 200, 400, Pnt);
        // 파란색 반투명한 원
        Pnt.setColor(0x800000ff);
        canvas.drawCircle(350, 550, 250, Pnt);
        // 검은색 점
        Pnt.setColor(Color.BLACK);
        canvas.drawPoint(30, 30, Pnt);
        // 검은색 선
        canvas.drawLine(700, 700, 900, 900, Pnt);
        // 초록색 문자열
        Pnt.setTextSize(100);
        Pnt.setColor(Color.GREEN);
        canvas.drawText("Canvas Text Finish", 100, 1000, Pnt);
    }
}
