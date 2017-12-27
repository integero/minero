package com.common;

public class FieldOfGame {
    public static Cell[][] field;

    //  Initialization of the empty gameField (square)
    public FieldOfGame(int sizeOfField, int amountOfBombs) {
        field = new Cell[sizeOfField][sizeOfField];
        for (int j = 0; j < sizeOfField; j++)
            for (int i = 0; i < sizeOfField; i++)
                field[i][j] = new Cell();
    }
}
