package com.supercookie.gms.example;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.Games;

public class PlayServicesAndroid implements PlayServices {

    private final AndroidLauncher androidLauncher;
    private final GoogleApiClient googleApiClient;


    public PlayServicesAndroid(AndroidLauncher androidLauncher, GoogleApiClient googleApiClient) {
        this.androidLauncher = androidLauncher;
        this.googleApiClient = googleApiClient;
    }


    @Override
    public void unlockAchievementOne() {
        unlock(R.string.achievement_1);
    }

    private void unlock(int resId) {
        if (googleApiClient.isConnected()) {
            Games.Achievements.unlock(googleApiClient, androidLauncher.getString(resId));
        }
    }

    @Override
    public void showAchievementsScreen() {
        if (isLoggedIn()) {
            androidLauncher.startActivityForResult(Games.Achievements.getAchievementsIntent(googleApiClient), 8700);
        } else {
            signIn();
        }
    }

    private boolean isLoggedIn() {
        return googleApiClient.isConnected() || googleApiClient.isConnecting();
    }

    private void signIn() {
        androidLauncher.signInClicked();
    }
}
