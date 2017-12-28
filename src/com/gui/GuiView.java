package com.gui;

import com.common.FieldOfGame;
import com.common.GaM;
import com.common.GaP;
import com.interfaces.IViewField;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;

public class GuiView implements IViewField {
    @Override
//  (re)painting gameField
    public void view() {
        GuiObj.gc.setFill(Color.BLACK);
        for (int i = 0; i < GaP.sizeOfField; i++)
            for (int j = 0; j < GaP.sizeOfField; j++) {
                Image im = GuiObj.pictForCells[GaM.getOrderOfImage(FieldOfGame.field[i][j])];
                GuiObj.gc.drawImage(im, 5 + 30 * j, 5 + 30 * i, 25, 25);
            }
        if (GaP.blast || GaP.notOpenCellsWithoutMines == 0)
            GuiObj.stage.showAndWait();
    }
}
