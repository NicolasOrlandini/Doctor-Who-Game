package com.orlandini.leon.dw.game;

import com.badlogic.gdx.Game;
import com.orlandini.leon.dw.game.views.EndScreen;
import com.orlandini.leon.dw.game.views.LoadingScreen;
import com.orlandini.leon.dw.game.views.MainScreen;
import com.orlandini.leon.dw.game.views.MenuScreen;
import com.orlandini.leon.dw.game.views.PreferencesScreen;

/**
 *
 * @author Nicolas Orlandini
 * @version 2017.0.1
 *
 * Date de création : 25/10/2017
 * Dernière modification : 25/10/2017
 */

public class DoctorWhoGame extends Game {

    private LoadingScreen loadingScreen;
    private PreferencesScreen preferencesScreen;
    private MenuScreen menuScreen;
    private MainScreen mainScreen;
    private EndScreen endScreen;

    public final static int MENU = 0;
    public final static int PREFERENCES = 1;
    public final static int APPLICATION = 2;
    public final static int ENDGAME = 3;
    @Override
    public void create() {
        loadingScreen = new LoadingScreen(this);
        setScreen(loadingScreen);
    }

    public void changeScreen(int screen){
        switch(screen){
            case MENU:
                if(menuScreen == null) menuScreen = new MenuScreen(this); // added (this)
                this.setScreen(menuScreen);
                break;
            case PREFERENCES:
                if(preferencesScreen == null) preferencesScreen = new PreferencesScreen(this); // added (this)
                this.setScreen(preferencesScreen);
                break;
            case APPLICATION:
                if(mainScreen == null) mainScreen = new MainScreen(this); //added (this)
                this.setScreen(mainScreen);
                break;
            case ENDGAME:
                if(endScreen == null) endScreen = new EndScreen(this);  // added (this)
                this.setScreen(endScreen);
                break;
        }
    }
}
