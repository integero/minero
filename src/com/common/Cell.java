package com.common;

//  I think nearly all is clear
public class Cell {
    private boolean isMarked;
    private boolean isOpen;
    private boolean hasMine;
    //  for future - my be possible blast some mines before death use only here
    private boolean isBlast;
    //  number of mines near cell. determined at the beginning of the game.
    //  determine the image of an open cell
    private int nOfMinesNear = 0;

    //  for future
    boolean isBlast() {
        return isBlast;
    }

    //  for future
    public void setBlast() {
        isBlast = true;
    }

    int getNMinesAround() {
        return nOfMinesNear;
    }

    //  for initial fieldOfGame mining
    void anotherMineNearby() {
        this.nOfMinesNear++;
    }

    //  only for UNseccess finish -> for final view
    public void setnOfMinesNear(int nomOfBlastImage) {
        this.nOfMinesNear = nomOfBlastImage;
    }

    public boolean hasMine() {
        return hasMine;
    }

    //  for initial fieldOfGame mining
    void setHasMine() {
        this.hasMine = true;
    }

    public boolean isOpen() {
        return isOpen;
    }

    //  at current time after opening cell with mine should the explosion
    public void setOpen() {
        if (hasMine) {
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
