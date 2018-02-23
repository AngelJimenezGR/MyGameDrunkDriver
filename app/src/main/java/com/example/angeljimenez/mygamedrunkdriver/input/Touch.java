package com.example.angeljimenez.mygamedrunkdriver.input;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by Angel Jimenez on 20/02/2018.
 */

public class Touch implements View.OnTouchListener {

    boolean isMoving, isMovingRight, isMovingUp, isTouched;
    float scaleX, scaleY;
    int touchX, touchY;

    public Touch(Context context, View view, float scaleX, float scaleY) {
        this.scaleX = scaleX;
        this.scaleY = scaleY;
    }

    public int getTouchX() {
        return this.touchX;
    }

    public int getTouchY() {
        return this.touchY;
    }

    public boolean isMoving() {
        return this.isMoving;
    }

    public boolean isMovingLeft() {
        return !this.isMovingRight;
    }

    public boolean isMovingRight() {
        return this.isMovingRight;
    }

    public boolean isTouchDown() {
        return this.isTouched;
    }

    public boolean isMovingUp() {
        return this.isMovingUp;
    }

    public boolean isMovingDown() {
        return !this.isMovingUp;
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        this.isMoving = false;



        return false;
    }


}
