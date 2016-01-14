package com.supercookie.gms.example;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class DesktopLauncher {

    public static void main(String[] arg) {
        LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
        cfg.title = "GMS Desktop";
        cfg.width = 1280;
        cfg.height = 780;

        GmsGame.playServices = new PlayServicesDesktop();
        GmsGame gmsGame = new GmsGame();
        new LwjglApplication(gmsGame, cfg);
    }
}
