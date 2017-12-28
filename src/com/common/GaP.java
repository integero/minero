package com.common;

//  common parameters
public class GaP {
    //  choosed interface   now:  0 - console, 1 - GUI -javaFX
    public static int gameInterface;
    //  size of gameField (square
    public static int sizeOfField;
    //  amount of mines in gameField
    public static int amountOfMines;
    //  amount of cells without mines at current time
    public static int notOpenCellsWithoutMines;
    //  was (true) or not explosion
    public static boolean blast;
    public static int minFieldSize = 7;
    public static int maxFieldSize = 30;
    //  min amount of bombs
    public static int minMines = 3;
}
