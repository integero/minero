package com.gui;

import com.PreGame;
import javafx.application.Application;
import javafx.stage.Stage;

//  GUI entry point
public class GuiLaunch extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        PreGame.nextStep();
    }
}
