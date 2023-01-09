package com.bridgelabz.snakeandladdergame;

public class SnakeAndLadderSimulator {
    static int dice = 0;
    static int playerOption = 0;
    public static void main(String[] args) {
        System.out.println("welcome to Snake and Ladder simulator");
        dice = ((int) (Math.random()*10)%6)+1;
        System.out.println("dice value " + dice);
        playerOption = ((int) (Math.random()*10)%3);
        System.out.println("player get option " + playerOption);
        int playerPosition = 0;
        switch (playerOption){
            case 0 :
                System.out.println("player stay at same position");
                break;
            case 1 :
                playerPosition = playerPosition + dice;
                break;
            case 2 :
                playerPosition = playerPosition - dice;
                break;


        }
        System.out.println("player is on " + playerPosition);
    }
}
