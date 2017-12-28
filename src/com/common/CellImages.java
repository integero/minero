package com.common;

//    W,w - blast & nonblast mines - outputafter explosion
//    @ - opened & nonblast mine
//    X - notopen cell, F - marked cell
//    N - amount of mines near
//    : - opened
public class CellImages {
    public static String[][] cIm = {
//  images for Console Game
//             0                                                                     10     11     12     13     14
            {" : ", " 1 ", " 2 ", " 3 ", " 4 ", " 5 ", " 6 ", " 7 ", " 8 ", " 9 ", " X ", " F ", " @ ", " w ", " W "},
//  links to images for GUI Game
            {
                    "com/resource/open.jpg",
                    "com/resource/1.jpg",
                    "com/resource/2.jpg",
                    "com/resource/3.jpg",
                    "com/resource/4.jpg",
                    "com/resource/5.jpg",
                    "com/resource/6.jpg",
                    "com/resource/7.jpg",
                    "com/resource/8.jpg",
                    "com/resource/9.jpg",
                    "com/resource/notOpen.jpg",
                    "com/resource/flag.jpg",
                    "com/resource/smallMine.jpg",
                    "com/resource/bigMine.jpg",
                    "com/resource/exploited.jpg"}
    };
}
