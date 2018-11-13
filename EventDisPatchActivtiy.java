package com.example.custom_view.eventdispatch;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;

import com.example.custom_view.R;

/**
 * 爱生活，爱代码
 * 创建于：2018/11/13 14:26
 * 作 者：T
 * 微信：704003376
 */
public class EventDisPatchActivtiy extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.e("asdhds", "Activtiy---dispatchTouchEvent---super");
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e("asdhds", "Activtiy---onTouchEvent----super");
        return super.onTouchEvent(event);
    }
}
