package com.orlandini.leon.dw.game.views;

import com.badlogic.gdx.Screen;
import com.orlandini.leon.dw.game.DoctorWhoGame;

/**
 *
 * @author Nicolas Orlandini
 * @version 2017.0.1
 *
 * Date de création : 25/10/2017
 * Dernière modification : 25/10/2017
 */

public class LoadingScreen implements Screen {

    private DoctorWhoGame parent; // a field to store our orchestrator

    public LoadingScreen(){

    }

    // our constructor with a Box2DTutorial argument
    public LoadingScreen(DoctorWhoGame doctorWhoGame){
        parent = doctorWhoGame;     // setting the argument to our field.
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        parent.changeScreen(DoctorWhoGame.MENU);
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
