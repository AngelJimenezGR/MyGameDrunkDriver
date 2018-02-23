package com.example.angeljimenez.mygamedrunkdriver.media;

import android.graphics.Bitmap;

/**
 * Created by Angel Jimenez on 20/02/2018.
 */

public class Image {

    public Bitmap bitmap;
    public Bitmap.Config format;

    public Image(Bitmap bitmap) {
        this(bitmap, Bitmap.Config.RGB_565);
    }

    public Image(Bitmap bitmap, Bitmap.Config format) {
        this.bitmap = bitmap;
        this.format = format;
    }

    public void dispose() {
        bitmap.recycle();
    }

    public Bitmap getBitmap() {
        return bitmap;
    }
}
