package com.integero.common;

//  User Step Action request - (i,j) cell coordinates, flag = true - (un)mark cell, = fale - open CELL
public class USA {
    public static int i;
    public static int j;
    public static boolean flag;

    public USA(int ic, int jc, boolean flagc) {
        i = ic;
        j = jc;
        flag = flagc;
    }
}
