package com.isquared;

import com.birdbrain.Finch;

public class FinchMoveTurn {
    public static void main(String[] args) {
        Finch bird = new Finch();

bird.playNote(60,1);
 bird.setBeak(0, 0, 100);
 bird.setMove("F", 35, 100);
 bird.setMove("B", 35, 100);
 bird.setMove("F", 35, 100);
 bird.setMove("B", 35, 100);
 bird.playNote(62,0.5);
 bird.setBeak(0, 100, 0);
 bird.setTurn("R", 90, 50);
 bird.setMove("F", 35, 100);
 bird.setMove("B", 35, 100);
 bird.setMove("F", 35, 100);
 bird.setMove("B", 35, 100);
 bird.playNote(64,2); 
 bird.setBeak(100, 0, 0);
 bird.setTurn("R", 90, 50);
 bird.setMove("F", 35, 100);
 bird.setMove("B", 35, 100);
 bird.setMove("F", 35, 100);
 bird.setMove("B", 35, 100); 
  bird.playNote(62,0.5); 
 bird.setBeak(0, 0, 100);
 bird.setTurn("R", 90, 50);
 bird.setMove("F", 35, 100);
 bird.setMove("B", 35, 100);
 bird.setMove("F", 35, 100);
 bird.setMove("B", 35, 100); 
 bird.setTurn("R", 90, 50);


 bird.setBeak(0, 100, 0);
 bird.pause(3);

// bird.playNote(60,1);
// bird.pause(1);
// bird.playNote(62,0.5);
// bird.pause(0.5);
// bird.playNote(64,2)
// ;
// bird.pause(2);


        bird.disconnect();
    }
}
