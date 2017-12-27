package com.integero.common;

//  I think nearly all is clear
public class Cell {
    private boolean isMarked;
    private boolean isOpen;
    private boolean hasBomb;
    //  for future - my be possible blast some mines before death use only here
    private boolean isBlast;
    //  number of bombs near cell
    private int nOfBombsNear = 0;

    //  for future
    boolean isBlast() {
        return isBlast;
    }

    //  for future
    public void setBlast() {
        isBlast = true;
    }

    int getNBombsAround() {
        return nOfBombsNear;
    }

    //  for initial fieldOfGame mining
    void anotherBombNearby() {
        this.nOfBombsNear++;
    }

    //  only for UNseccess finish -> for final view
    public void setnOfBombsNear(int nomOfBlastImage) {
        this.nOfBombsNear = nomOfBlastImage;
    }

    public boolean hasBomb() {
        return hasBomb;
    }

    //  for initial fieldOfGame mining
    void setHasBomb() {
        this.hasBomb = true;
    }

    public boolean isOpen() {
        return isOpen;
    }

    //  at current time after opening cell with mine should the explosion
    public void setOpen() {
        if (hasBomb) {
            GaP.blast = true;
            isBlast = true;
        }
        isOpen = true;
    }

    public boolean isMarked() {
        return isMarked;
    }

    public void reverseMark() {
        this.isMarked = !this.isMarked;
    }

}
