package com.integero.gui;

import com.integero.interfaces.IUserRequest;
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;

import java.io.IOException;

//  asking & receiving answers from gamer
public class GuiUserRequest implements IUserRequest {

    @Override
    public int getIntAnswerFromGamer(String ask, int lBound, int rBound) {
        TextInputDialog ti = new TextInputDialog(lBound + "");
        ti.setHeaderText(null);
        ti.setContentText(ask);
        ti.setTitle("answer must be in [" + lBound + " : " + rBound + "]");
        int tmp = 0;

        int nTimes = 3;
        while (nTimes > 0) {
            try {
                ti.showAndWait();
                String ins = ti.getResult();
                if (ins == null)    //  button CANCEL was pressed
                    tmp = 1;
                else
                    tmp = (ins.length() == 0) ? 0 : Integer.parseInt(ins);
                if (lBound <= tmp && tmp <= rBound) break;
                throw new IOException();
            } catch (Exception e) {
                setMessageToGamer("Error! Input must be care!!! Repeat");
                ti.getEditor().setText(lBound + "");
            }
            nTimes--;
        }
        if (nTimes > 0) return tmp;
//  if number of attempts is grate then 3
        setMessageToGamer("!!!!!!!!!!!!!!   GAME  OVER   !!!!!!!!!!!");
        System.exit(0);
        return 0;
    }

    @Override
    public void setMessageToGamer(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information Dialog");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

}
