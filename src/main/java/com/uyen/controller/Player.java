package com.uyen.controller;

public class Player {
    private int numberOfTurn;
    int count = 0;
    private int randomNumber;

    public int getRandomNumber() {
        return randomNumber;
    }

    public void setRandomNumber(int randomNumber) {
        this.randomNumber = randomNumber;
    }

    Player(){

        this.randomNumber = (int) (Math.random()*1000)+1;
    }
    public int getNumberOfTurn() {
        return numberOfTurn;
    }

    public void setNumberOfTurn(int numberOfTurn) {
        this.numberOfTurn = numberOfTurn;
    }
}
