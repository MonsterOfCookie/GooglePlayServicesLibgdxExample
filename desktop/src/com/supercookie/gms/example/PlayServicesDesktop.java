package com.supercookie.gms.example;

import com.badlogic.gdx.Gdx;

public class PlayServicesDesktop implements PlayServices {

    @Override
    public void unlockAchievementOne() {
        Gdx.app.log("PLAY_DESKTOP", "Achievement One Unlocked");
    }

    @Override
    public void showAchievementsScreen() {
        Gdx.app.log("PLAY_DESKTOP", "Achievement Screen requested");
    }
}
