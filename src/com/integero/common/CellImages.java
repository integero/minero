package com.integero.common;

//    W,w - blast & nonblast bombs - outputafter explosion
//    @ - opened & nonblast bomb
//    X - notopen cell, F - marked cell
//    N - amount of bombs near
//    : - opened
public class CellImages {
    public static String[][] cIm = {
//  images for Console Game
//             0                                                                     10     11     12     13     14
            {" : ", " 1 ", " 2 ", " 3 ", " 4 ", " 5 ", " 6 ", " 7 ", " 8 ", " 9 ", " X ", " F ", " @ ", " w ", " W "},
//  links to images for GUI Game
            {
                    "com/integero/resource/open.jpg",
                    "com/integero/resource/1.jpg",
                    "com/integero/resource/2.jpg",
                    "com/integero/resource/3.jpg",
                    "com/integero/resource/4.jpg",
                    "com/integero/resource/5.jpg",
                    "com/integero/resource/6.jpg",
                    "com/integero/resource/7.jpg",
                    "com/integero/resource/8.jpg",
                    "com/integero/resource/9.jpg",
                    "com/integero/resource/notOpen.jpg",
                    "com/integero/resource/flag.jpg",
                    "com/integero/resource/smallBomb.jpg",
                    "com/integero/resource/bigBomb.jpg",
                    "com/integero/resource/exploited.jpg"}
    };
}
