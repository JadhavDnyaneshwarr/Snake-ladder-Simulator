package com.bridgelabz.snakeandladdergame;

public class SnakeAndLadderSimulator {
    static int playerPosition = 0;
    public static void main(String[] args) {
        System.out.println("welcome to Snake and Ladder simulator");
        playerPosition = ((int) (Math.random()*10)%6)+1;
        System.out.println(playerPosition);
    }
}
