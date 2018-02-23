package com.example.angeljimenez.mygamedrunkdriver;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.angeljimenez.mygamedrunkdriver.currentgame.Background;
import com.example.angeljimenez.mygamedrunkdriver.currentgame.Car;
import com.example.angeljimenez.mygamedrunkdriver.generic.GenericGameActivity;

public class MainActivity extends GenericGameActivity {

    private Car coche;

    @Override
    public void paint() {
        super.paint();
    }


    @Override
    public void start() {
        addGameObject(new Background());
        coche = new Car();
        addGameObject(coche);

    }

    @Override
    public void update() {
        super.update();
    }
}
