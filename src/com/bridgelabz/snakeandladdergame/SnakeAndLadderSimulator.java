package com.bridgelabz.snakeandladdergame;

public class SnakeAndLadderSimulator {
    static int dice = 0;
    static int playerOption = 0;
    public static void main(String[] args) {
        System.out.println("welcome to Snake and Ladder simulator");
        int playerPosition = 0;
        int d = 0;

        while (playerPosition != 100) {

            dice = ((int) (Math.random()*10)%6)+1;
            playerOption = ((int) (Math.random()*10)%3);

            System.out.println("dice value " + dice);
            System.out.println("player get option " + playerOption);

            switch (playerOption) {
                case 0:
                    System.out.println("player stay at same position");
                    break;
                case 1:
                    playerPosition = playerPosition + dice;
                    break;
                case 2:
                    if (playerPosition == 0){
                        break;
                    }else {
                        playerPosition = playerPosition - dice;
                        if (playerPosition<0){
                            playerPosition = 0;
                            break;
                        }else{
                            break;
                        }
                    }
            }
            System.out.println(playerPosition);
            d++;
            System.out.println(" ");
        }
        System.out.println("player is on " + playerPosition);
        System.out.println("the " + d + " times dice roll to win the game.");
    }
}
