package com.example.angeljimenez.mygamedrunkdriver.currentgame;

import com.example.angeljimenez.mygamedrunkdriver.generic.GameObject;
import com.example.angeljimenez.mygamedrunkdriver.media.Animation;

/**
 * Created by Angel Jimenez on 20/02/2018.
 */

public class Car extends GameObject {

    private static final int MAXSALTO = 15;

    private Animation animation;
    private Long tiempo;
    private boolean saltando = false;
    private int salto = 0;

    public Car() {
        super(Assets.coche);
        this.setX(10);

        animation = new Animation();

    }

    @Override
    public void update() {

        setSpeedX(10);

    }
}
