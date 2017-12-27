package com;

public class Main {

    public static void main(String[] args) {
//        select interface & have enjoi
//        int gameInterface=0;  //  game in console
        int gameInterface=1;    //  GUI game
        PreGame st = new PreGame();
        if (args.length == 0)
            st.startGame(args, gameInterface);
        else{
            try {
                int i = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.println("%n!!!!!!!!     ARGUMENT FOR MAIN METOD MUST BE DIGIT    !!!!!!!%n");
            }
        }
    }
}