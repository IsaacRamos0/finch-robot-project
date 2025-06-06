package com.isquared;

import com.birdbrain.Finch;

public class WaltzFinch extends Finch {
    public void dance() {
        playNote(60,1);
        setBeak(0, 100, 0);
        shake();
        playNote(62,2);
        setBeak(0, 0, 100);
        setTurn("R", 90, 50);
        shake();
        playNote(64,2); 
        setBeak(100, 0, 0);
        setTurn("R", 90, 50);
        shake();
        playNote(62,0.5); 
        setBeak(0, 0, 100);
        setTurn("R", 90, 50);
        shake();
        setTurn("R", 90, 50);
        setBeak(0, 100, 0);
        setTail("all",0,100,0);
        stopAll();
        pause(3);
    }

    public void shake() {
        setMove("F", 35, 100);
        setMove("B", 35, 100);
        setMove("F", 35, 100);
        setMove("B", 35, 100);
    }
}
