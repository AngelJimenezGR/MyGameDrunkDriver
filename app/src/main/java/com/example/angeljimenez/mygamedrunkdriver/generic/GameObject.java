package com.example.angeljimenez.mygamedrunkdriver.generic;

import android.graphics.Rect;

import com.example.angeljimenez.mygamedrunkdriver.input.Touch;
import com.example.angeljimenez.mygamedrunkdriver.media.Graphics;
import com.example.angeljimenez.mygamedrunkdriver.media.Image;

/**
 * Created by Angel Jimenez on 20/02/2018.
 */

public abstract class GameObject {

    private static Graphics g;
    private static Touch touchHandler;

    private boolean visible = true;
    private Image image;
    private int x = 0, y = 0;
    private int speedX = 0, speedY = 0;

    public GameObject(Image image) {
        this.setImage(image);
    }

    public int getBottom() {
        return getY() + getHeight();
    }

    public static Graphics getGraphics() {
        return g;
    }

    public int getHeight() {
        return this.image.getBitmap().getHeight();
    }

    public Image getImage() {
        return this.image;
    }

    public int getLeft() {
        return getX();
    }

    public Rect getRectangle() {
        return new Rect(getLeft(), getTop(), getRight(), getBottom());
    }

    public int getRight() {
        return getX() + getWidth();
    }

    public int getSpeedX() {
        return speedX;
    }

    public int getSpeedY() {
        return speedY;
    }

    public int getTop() {
        return getY();
    }

    public static Touch getTouchHandler() {
        return touchHandler;
    }

    public int getWidth() {
        return this.image.getBitmap().getWidth();
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public boolean intersects(int x, int y) {
        return getRectangle().intersects(x - 5, y - 5, x + 5, y + 5);
    }

    public boolean instersects(GameObject gameObject) {
        return getRectangle().intersect(gameObject.getRectangle());
    }

    public boolean isTouched() {
        boolean result = false;
        if(getTouchHandler().isTouchDown()) {
            if (intersects(getTouchHandler().getTouchX(), getTouchHandler().getTouchY())){
                result = true;
            }
        }
        return result;
    }

    public boolean isVisible() {
        return visible;
    }

    public void paint() {
        if(visible){
            GameObject.getGraphics().drawImage(this.image, this.getX(), this.getY());
        }
    }

    public static void setGraphics(Graphics g) {
        GameObject.g = g;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public void setSpeedX(int speedX) {
        this.speedX = speedX;
    }

    public void setSpeedY(int speedY) {
        this.speedY = speedY;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public static void setTouchHandler(Touch touchHandler) {
        GameObject.touchHandler = touchHandler;
    }

    public abstract void update();
}
