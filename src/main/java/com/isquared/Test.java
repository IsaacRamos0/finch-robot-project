package com.isquared;

import com.birdbrain.Finch;

public class FinchMoveTurn {
    public static void main(String[] args) {
        Finch bird = new Finch();

bird.setMove("F", 35, 100);
bird.setMove("B", 35, 100);
bird.setMove("F", 35, 100);
bird.setMove("B", 35, 100);
bird.setTurn("R", 90, 50);
bird.setMove("F", 35, 100);
bird.setMove("B", 35, 100);
bird.setMove("F", 35, 100);
bird.setMove("B", 35, 100); 

bird.setBeak(100, 0, 0);
bird.pause(3);
bird.setBeak(0, 0, 0);


    
        bird.disconnect();
    }
}
