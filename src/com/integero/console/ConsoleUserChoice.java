package com.integero.console;

import com.integero.common.*;
import com.integero.interfaces.IUserChoice;

//  choice of coorditates & action
public class ConsoleUserChoice implements IUserChoice {
    @Override
    public USA getUserChoice() {
        int i = 0;
        int j = 0;
        boolean flag = false;

        int nTimes = 3;
        while (nTimes > 0) {
//  i,j - coordinates, flag=true - mark cell, otherwise - open
            i = GaI.iUserRequest.getIntAnswerFromGamer("i:", 0, GaP.sizeOfField - 1);
            j = GaI.iUserRequest.getIntAnswerFromGamer("j:", 0, GaP.sizeOfField - 1);
            flag = GaI.iUserRequest.getIntAnswerFromGamer("0 - open | 1 - mark:", 0, 1) != 0;
            Cell cc = FieldOfGame.field[i][j];

//  cell isn't open & isn't mark. can do anything
            if (!cc.isOpen() && !cc.isMarked()) break;

//  cell is closed & marked. can only unmark.
            if (cc.isMarked() && flag) break;

            GaI.iUserRequest.setMessageToGamer("Already OPEN or You try open MARKED CELL");
            nTimes--;
        }
        if (nTimes > 0) return new USA(i, j, flag);
//  choice for stupid
        throw new Error("!!!!!!!!!!!!!!!    YOU ARE VERY tied    !!!!!!!!!!!%n%n");
    }
}
