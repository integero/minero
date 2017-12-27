package com.console;


import com.common.*;
import com.interfaces.IViewField;

//  outputting the FieldOfGame to the console
public class ConsoleView implements IViewField {

    @Override
    public void view() {
        int size = GaP.sizeOfField;
        infoLine("   ", "  i%n");
        for (int j = 0; j < size; j++) {
            String s = " ";
            for (int i = 0; i < size; i++) {
                Cell cc = FieldOfGame.field[i][j];
                s += CellImages.cIm[0][GaM.getOrderOfImage(cc)];
            }
            System.out.printf("%3d%s%2d%n", j, s, j);
        }
        infoLine("  j", "%n");
    }

    // information line for simple choice of i-coordinate
    private void infoLine(String left, String right) {
        System.out.print(left);
        for (int i = 0; i < GaP.sizeOfField; i++)
            System.out.printf("%3d", i);
        System.out.printf(right);
    }
}
