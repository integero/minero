package com.gui;

import com.common.CellImages;
import com.common.GaP;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

//  components for graphic interface
public class GuiO {
    static Group root;
    static Scene scene;
    static Canvas canvas;
    static Stage stage;
    static GraphicsContext gc;
    //  graphic images for different cell type
    static Image[] pictForCells;

    public GuiO() {
        root = new Group();
        scene = new Scene(root, GaP.sizeOfField * 30 + 5, GaP.sizeOfField * 30 + 5, Color.BLACK);
        canvas = new Canvas(GaP.sizeOfField * 30 + 5, GaP.sizeOfField * 30 + 5);
        stage = new Stage();
        stage.setScene(scene);
        root.getChildren().add(canvas);
        gc = canvas.getGraphicsContext2D();
//  images for different cell type
        pictForCells = new Image[15];
        for (int i = 0; i < 15; i++)
            pictForCells[i] = new Image(CellImages.cIm[1][i]);
    }
}
