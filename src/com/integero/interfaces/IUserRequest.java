package com.integero.interfaces;

public interface IUserRequest {
    //  query for int from range [lBoumd, rBound
    int getIntAnswerFromGamer(String ask,int lBound,int rBound);

    //  message toGamer
    void setMessageToGamer(String message);
}
