package com.integero;

public class Main {

    public static void main(String[] args) {
//  In the future is it necessary put args[0] instead of 0 & run Minero with one arg
        PreGame st = new PreGame();
        if (args.length == 0)
            st.startGame(args, 1);
        else{
            try {
                int i = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.println("%n!!!!!!!!     ARGUMENT FOR MAIN METOD MUST BE DIGIT    !!!!!!!%n");
            }
        }
    }
}