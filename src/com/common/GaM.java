package com.common;

//  logic-methods for Game
public class GaM {
    //  field mining at game start - not by bitcoin
    public static void setMineToField() {
        int currAmount = 0;
        while (currAmount < GaP.amountOfMines) {
            int i = (int) (Math.random() * GaP.sizeOfField);
            int j = (int) (Math.random() * GaP.sizeOfField);
            if (!FieldOfGame.field[i][j].hasMine()) {
                currAmount++;
                FieldOfGame.field[i][j].setHasMine();
//  calculation of neighbouring mines
                for (int k = i - 1; k < i + 2; k++) {
                    for (int l = j - 1; l < j + 2; l++) {
                        if (GaM.ijIsInField(k, l))
                            FieldOfGame.field[k][l].anotherMineNearby();
                    }
                }
            }
        }
        for (int i = 0; i < GaP.sizeOfField; i++) {
            for (int j = 0; j < GaP.sizeOfField; j++) {
//  set index of image for notBlasted mine to nOfMinesNear
                if (FieldOfGame.field[i][j].hasMine())
                    FieldOfGame.field[i][j].setnOfMinesNear(13);
            }
        }

    }

    //  cells openning - recursive
    public static void openEmptyCell(int i, int j) {
        Cell cell = FieldOfGame.field[i][j];
        if (cell.isOpen() || cell.hasMine()) return;
        cell.setOpen();
        GaP.notOpenCellsWithoutMines--;
        if (cell.getNMinesAround() > 0) return;
        for (int in = i - 1; in < i + 2; in++) {
            for (int jn = j - 1; jn < j + 2; jn++) {
                if (ijIsInField(in, jn))
                    openEmptyCell(in, jn);
            }
        }
    }


    //  ? is (i,j) in gamefield, true if IN
    private static boolean ijIsInField(int i, int j) {
        return (0 <= i && i < GaP.sizeOfField && 0 <= j && j < GaP.sizeOfField);
    }

    //  determining order of image for current cell parameters
    public static int getOrderOfImage(Cell cc) {
//  nearly all determine at startGame
        int ans = cc.getNMinesAround();
        if (!(GaP.blast || GaP.notOpenCellsWithoutMines == 0))
            if (cc.isMarked()) ans = 11;
            else if (!cc.isOpen()) ans = 10;
        return ans;
    }
}
