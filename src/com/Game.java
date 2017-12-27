package com;

import com.common.*;

class Game {
    static void run() {
//      set mines to field
        GaM.setMineToField();

        while (GaP.notOpenCellsWithoutBombs > 0) {
            GaI.iViewField.view();
//  getUserChoice retun the action (i,j,flag) for cell, witch can be done
            GaI.iUserChoice.getUserChoice();
//            USA action = GaI.iUserChoice.getUserChoice();

            Cell cc = FieldOfGame.field[USA.i][USA.j];
            if (USA.flag)
//              mark or remark cell
                cc.reverseMark();
            else if (!cc.hasBomb())
//              cell isn't open & hasn't bomb - can be opened
                GaM.openEmptyCell(USA.i, USA.j);
            else {
//              opening cell with mine
                cc.setOpen();
                if (GaP.blast) {
//                  index of blastImage
                    cc.setnOfBombsNear(14);
                    break;
                }
            }
        }
        if (GaP.notOpenCellsWithoutBombs > 0) {
//          EXPLOSION
            GaI.iUserRequest.setMessageToGamer("\n++++  Condolences   +++++ , you blew up   +++++\n");
        } else {
//          SUCCESS
            GaI.iUserRequest.setMessageToGamer("\n!!!!!   Congratulations    !!!!!    GOOD   JOB   !!!!!\n");
        }
        GaI.iViewField.view();

        if (GaI.iUserRequest.getIntAnswerFromGamer("\nOnes more?? 0 - yes: ", 0, 9) == 0) {
//      close current Platform before opening new game
//            if (GaP.gameInterface == 1) Platform.exit();

//          restart game
            PreGame.nextStep();
        } else {
            GaI.iUserRequest.setMessageToGamer("\n=====    Bye-bye!!!   To see you!!!    ======\n");
        }
    }
}
