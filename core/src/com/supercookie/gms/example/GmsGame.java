package com.supercookie.gms.example;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

public class GmsGame extends Game {

    public static final int WORLD_WIDTH = 800, WORLD_HEIGHT = 480;

    private SpriteBatch batch;
    private Texture splash;
    private Viewport viewport;

    public static PlayServices playServices = new PlayServices.PlayServicesAdapter();

    @Override
    public void create() {
        batch = new SpriteBatch();
        splash = new Texture("splash.png");
        viewport = new StretchViewport(WORLD_WIDTH, WORLD_HEIGHT);

        Gdx.input.setInputProcessor(new InputAdapter() {
            @Override
            public boolean touchUp(int screenX, int screenY, int pointer, int button) {
                Vector2 coords = new Vector2(screenX, screenY);
                coords = viewport.unproject(coords);
                if (coords.x < WORLD_WIDTH / 2f) {
                    playServices.unlockAchievementOne();
                } else {
                    playServices.showAchievementsScreen();
                }

                return true;
            }
        });

    }

    @Override
    public void resize(int width, int height) {
        viewport.update(width, height, true);
        batch.setProjectionMatrix(viewport.getCamera().combined);
    }

    @Override
    public void render() {
        batch.begin();
        batch.draw(splash, 0, 0);
        batch.end();
    }
}
