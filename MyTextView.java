package com.example.custom_view.eventdispatch;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.TextView;

/**
 * 爱生活，爱代码
 * 创建于：2018/11/13 14:30
 * 作 者：T 啊嘎嘎嘎嘎嘎
 * 微信：704003376
 */
public class MyTextView extends TextView {
    public MyTextView(Context context) {
        super(context);
    }

    public MyTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.e("asdhds", "View-----dispatchTouchEvent---super");
        return super.dispatchTouchEvent(event);
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e("asdhds", "View-----onTouchEvent---super");
        return super.onTouchEvent(event);
    }
}
