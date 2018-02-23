package com.example.angeljimenez.mygamedrunkdriver.currentgame;

import com.example.angeljimenez.mygamedrunkdriver.generic.GameBackground;

/**
 * Created by Angel Jimenez on 20/02/2018.
 */

public class Background extends GameBackground {

    public Background() {
        super(Assets.fondo);
        this.setMovement(Movement.MOVING);
    }
}
