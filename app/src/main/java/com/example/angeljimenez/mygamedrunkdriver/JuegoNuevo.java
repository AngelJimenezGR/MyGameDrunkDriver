package com.example.angeljimenez.mygamedrunkdriver;

import com.example.angeljimenez.mygamedrunkdriver.currentgame.Background;
import com.example.angeljimenez.mygamedrunkdriver.currentgame.Car;
import com.example.angeljimenez.mygamedrunkdriver.currentgame.Police;
import com.example.angeljimenez.mygamedrunkdriver.generic.GenericGameActivity;

/**
 * Created by Angel Jimenez on 20/02/2018.
 */

public class JuegoNuevo extends GenericGameActivity {

    private Police b1;
    private Car car;

    @Override
    public void start() {
        addGameObject(new Background());
        b1 = new Police();
        addGameObject(b1);

        car = new Car();
        car.setSpeedX(10);
        addGameObject(car);

    }
}
