package com.supercookie.gms.example;

import com.badlogic.gdx.Gdx;

public interface PlayServices {

    void unlockAchievementOne();

    void showAchievementsScreen();

    class PlayServicesAdapter implements PlayServices {
        @Override
        public void unlockAchievementOne() {
            Gdx.app.log("PLAY_ADAPTER", "Achievement One Unlocked");
        }

        @Override
        public void showAchievementsScreen() {
            Gdx.app.log("PLAY_ADAPTER", "Achievement Screen requested");
        }
    }

}
