package com.sourceit.java.basic.Popazovdk.HT3;

public class Player {
    public String playerName = "Undefined";
    private int stepsMaded = 0;
    private int scores = 0;

    public Player(String newName) {

        playerName = newName;


    }

    public void increaceStep() {
        stepsMaded++;

    }

    public String getPlayerName() {
        return playerName;
    }

}
