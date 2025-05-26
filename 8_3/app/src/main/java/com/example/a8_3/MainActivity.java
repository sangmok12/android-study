package com.example.a8_3;

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
        canvas.drawRGB(212, 244, 250);
        Paint Pnt = new Paint();
        // 캡 모양 테스트
        Pnt.setColor(Color.RED);
        Pnt.setStrokeWidth(30);
        Pnt.setStrokeCap(Paint.Cap.ROUND);
        canvas.drawLine(50, 100, 700, 100, Pnt);
        Pnt.setStrokeCap(Paint.Cap.SQUARE);
        canvas.drawLine(50, 200, 700, 200, Pnt);
        // 만나는 지점의 모양 테스트
        Pnt.setColor(Color.CYAN);
        Pnt.setStrokeWidth(15);
        Pnt.setStyle(Paint.Style.STROKE);
        Pnt.setStrokeJoin(Paint.Join.MITER);
        canvas.drawRect(50, 300, 150, 400, Pnt);
        Pnt.setStrokeJoin(Paint.Join.BEVEL);
        canvas.drawRect(180, 300, 280, 400, Pnt);
        Pnt.setStrokeJoin(Paint.Join.ROUND);
        canvas.drawRect(310, 300, 410, 400, Pnt);
        // 원 스타일 테스트
        Pnt.setColor(Color.GREEN);
        Pnt.setStrokeWidth(10);
        Pnt.setAntiAlias(true);
        // 채우기
        Pnt.setStyle(Paint.Style.FILL);
        canvas.drawCircle(100, 550, 50, Pnt);
        // 외곽선 그리기
        Pnt.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(230, 550, 50, Pnt);
        // 외곽선 및 채우기
        Pnt.setStyle(Paint.Style.FILL_AND_STROKE);
        canvas.drawCircle(360, 550, 50, Pnt);
        // 노란색으로 원을 채우고
        Pnt.setColor(Color.YELLOW);
        Pnt.setStyle(Paint.Style.FILL);
        canvas.drawCircle(100, 700, 50, Pnt);
        // 초록색으로 원의 외곽선 그리기
        Pnt.setColor(Color.GREEN);
        Pnt.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(100, 700, 50, Pnt);
        // 초록색으로 원을 채우고
        Pnt.setColor(Color.GREEN);
        Pnt.setStyle(Paint.Style.FILL);
        canvas.drawCircle(230, 700, 50, Pnt);
        // 노란색으로 원의 외곽선 그리기
        Pnt.setColor(Color.YELLOW);
        Pnt.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(230, 700, 50, Pnt);
    }
}
