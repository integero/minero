package com;

import com.common.FieldOfGame;
import com.common.GaI;
import com.common.GaP;
import com.console.ConsoleUserChoice;
import com.console.ConsoleUserRequest;
import com.console.ConsoleView;
import com.gui.*;

import static javafx.application.Application.launch;

//  game preparing for different interfaces
public class PreGame {
    //  two steps start Game - args - from method main, GameInterface = 0 - consoleGame, = 1 - guiGame
    void startGame(String[] args, int gameInterface) {
        if (gameInterface < 0 || gameInterface > 1) {
            throw new Error("!!!!!!!!!!!!!!   WRONG INTERFACE CHOICE   !!!!!!!!!!!" + "\n\n");
        }
//  save chosen interface
        GaP.gameInterface = gameInterface;
//  selection of realization of interfaces
        if (gameInterface == 0) {
            GaI.iViewField = new ConsoleView();
            GaI.iUserRequest = new ConsoleUserRequest();
            GaI.iUserChoice = new ConsoleUserChoice();
        } else {
            GaI.iViewField = new GuiView();
            GaI.iUserRequest = new GuiUserRequest();
            GaI.iUserChoice = new GuiUserChoice();
        }
        if (gameInterface == 0)
//  console interface, continue initializations
            nextStep();
        else
//  GUI interface, make entry point & after return to nextStep
            launch(GuiLaunch.class);
    }

    //  second start step
    public static void nextStep() {
//  parameters Input & calculate after startGame above
        GaP.sizeOfField = GaI.iUserRequest.getIntAnswerFromGamer("input field size:", GaP.minFieldSize, GaP.maxFieldSize);
//  set amount of bombs less then half of amount of cells
        int maxAmountOfBombs = GaP.sizeOfField * GaP.sizeOfField / 2;
        GaP.amountOfMines = GaI.iUserRequest.getIntAnswerFromGamer("input amount of bombs: ", GaP.minBombs, maxAmountOfBombs);
        GaP.notOpenCellsWithoutBombs = GaP.sizeOfField * GaP.sizeOfField - GaP.amountOfMines;
        GaP.blast = false;
//  gameField initialisation
        new FieldOfGame(GaP.sizeOfField, GaP.amountOfMines);
//  jump to initialisation of elements for GUI interface if it was chosen
        if (GaP.gameInterface == 1) new GuiO();
//  game start
        Game.run();
    }
}
