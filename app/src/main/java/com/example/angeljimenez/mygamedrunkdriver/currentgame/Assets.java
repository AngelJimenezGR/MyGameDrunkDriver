package com.example.angeljimenez.mygamedrunkdriver.currentgame;

import com.example.angeljimenez.mygamedrunkdriver.media.Graphics;
import com.example.angeljimenez.mygamedrunkdriver.media.Image;

/**
 * Created by Angel Jimenez on 20/02/2018.
 */

public class Assets {
    public static Image fondo, coche, policia;

    public static void load(Graphics g) {
        Assets.fondo = g.newImage("drunkdriver.jpg");
        Assets.policia = g.newImage("police.jpg");
        Assets.fondo = g.newImage("cityBackground.jpg");
    }
}
