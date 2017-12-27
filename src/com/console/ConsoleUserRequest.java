package com.console;


import com.interfaces.IUserRequest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//  Ask user by String & Int with question to him(her)
public class ConsoleUserRequest implements IUserRequest {

    @Override
//  ask - message for Gamer, left & right - bounds for answer
    public int getIntAnswerFromGamer(String ask, int left, int right) {
        int tmp = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int nTimes = 3;
        while (nTimes > 0) {
            try {
                System.out.print(ask);
                String ins = br.readLine();
                tmp = (ins.length() == 0) ? 0 : Integer.parseInt(ins);
                if (left <= tmp && tmp <= right) break;
                throw new IOException();
            } catch (Exception e) {
                System.out.println("Error! Input must be care!!! Repeat");
            }
            nTimes--;
        }
        if (nTimes > 0) return tmp;
//  if number of attempts is grate then 3
        throw new Error("!!!!!!!!!!!!!!   GAME  OVER   !!!!!!!!!!!" + "\n\n");
    }

    @Override
    public void setMessageToGamer(String message) {
        System.out.println(message);
    }
}

