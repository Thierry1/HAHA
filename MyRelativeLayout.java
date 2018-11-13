package com.example.custom_view.eventdispatch;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

/**
 * 爱生活，爱代码
 * 创建于：2018/11/13 14:28
 * 作 者：T
 * 微信：704003376
 */
public class MyRelativeLayout extends RelativeLayout {

    public MyRelativeLayout(Context context) {
        super(context);
    }

    public MyRelativeLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyRelativeLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.e("asdhds",  "ViewGoup-----dispatchTouchEvent---super");
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.e("asdhds",  "ViewGoup-----onInterceptTouchEvent---super");
        return false;
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e("asdhds",  "ViewGoup-----onTouchEvent---super");
        return super.onTouchEvent(event);
    }
}
