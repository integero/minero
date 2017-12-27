package com.integero.gui;

import com.integero.common.FieldOfGame;
import com.integero.common.GaM;
import com.integero.common.GaP;
import com.integero.interfaces.IViewField;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;

public class GuiView implements IViewField {
    @Override
//  (re)painting gameField
    public void view() {
        GuiO.gc.setFill(Color.BLACK);
        for (int i = 0; i < GaP.sizeOfField; i++)
            for (int j = 0; j < GaP.sizeOfField; j++) {
                Image im = GuiO.pictForCells[GaM.getOrderOfImage(FieldOfGame.field[i][j])];
                GuiO.gc.drawImage(im, 5 + 30 * j, 5 + 30 * i, 25, 25);
            }
        if (GaP.blast || GaP.notOpenCellsWithoutBombs == 0)
            GuiO.stage.showAndWait();
    }
}
