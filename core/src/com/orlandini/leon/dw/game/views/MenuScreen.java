package com.orlandini.leon.dw.game.views;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.orlandini.leon.dw.game.DoctorWhoGame;

/**
 *
 * @author Nicolas Orlandini
 * @version 2017.0.1
 *
 * Date de création : 25/10/2017
 * Dernière modification : 25/10/2017
 */

public class MenuScreen implements Screen {

    private DoctorWhoGame parent; // a field to store our orchestrator
    private Stage stage;

    public MenuScreen(){

    }

    // our constructor with a Box2DTutorial argument
    public MenuScreen(DoctorWhoGame doctorWhoGame){
        parent = doctorWhoGame;     // setting the argument to our field.

        stage = new Stage(new ScreenViewport());
        Gdx.input.setInputProcessor(stage);
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
