package com.integero.gui;

import com.integero.common.Cell;
import com.integero.common.FieldOfGame;
import com.integero.common.USA;
import com.integero.interfaces.IUserChoice;
import javafx.scene.Node;
import javafx.scene.input.MouseButton;

public class GuiUserChoice implements IUserChoice {
    private int i;
    private int j;
    private boolean flag;

    @Override
    public USA getUserChoice() {
//  for window close detection
        i = -1;
        j = -1;
//  let listen GuiO.canvas
        while (true) {
            addTranslateListener(GuiO.canvas);
            GuiO.stage.showAndWait();
            if (i < 0 && j < 0) {
                System.exit(0);
            }

            Cell cc = FieldOfGame.field[i][j];
//  cell isn't open & isn't mark. can do anything
            if (!cc.isOpen() && !cc.isMarked()) break;

//  cell is closed & marked. can only unmark.
            if (cc.isMarked() && flag) break;
        }
        return new USA(i, j, flag);
    }

    private void addTranslateListener(final Node node) {
        node.setOnMousePressed(event -> {
            j = (int) event.getX() / 30;
            i = (int) event.getY() / 30;
            flag = event.getButton() == MouseButton.SECONDARY;
            GuiO.stage.hide();
        });

    }
}
