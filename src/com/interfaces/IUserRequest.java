package com.interfaces;

public interface IUserRequest {
    //  query for int from range [lBoumd, rBound] & print (warning=true) or not bounds warning
    int getIntAnswerFromGamer(String ask,int lBound,int rBound, boolean warning);

    //  message toGamer
    void setMessageToGamer(String message);
}
