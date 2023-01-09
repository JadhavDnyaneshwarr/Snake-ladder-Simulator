package com.bridgelabz.snakeandladdergame;

public class SnakeAndLadderSimulator {
    static int dice = 0;
    static int playerOption = 0;
    public static void main(String[] args) {
        System.out.println("welcome to Snake and Ladder simulator");
        int player1_Position = 0;
        int d1 = 0;
        int player2_Position = 0;
        int d2 = 0;
        int play = 0;

        while (player1_Position != 100 || player2_Position != 100) {
            if (play == 0) {
                System.out.println("player-1");
                dice = ((int) (Math.random() * 10) % 6) + 1;
                playerOption = ((int) (Math.random() * 10) % 3);

                System.out.println("dice value " + dice);
                System.out.println("player get option " + playerOption);

                switch (playerOption) {
                    case 0:
                        System.out.println("player stay at same position");
                        play=1;
                        break;
                    case 1:
                        player1_Position = player1_Position + dice;
                        play=0;
                        break;
                    case 2:
                        play=1;
                        if (player1_Position == 0) {
                            break;
                        } else {
                            player1_Position = player1_Position - dice;
                            if (player1_Position < 0) {
                                player1_Position = 0;
                                break;
                            } else {
                                break;
                            }
                        }
                }
                System.out.println("player-1 is on " + player1_Position);
                d1++;
                System.out.println(" ");

            }
            else if (player1_Position == 100){
                System.out.println("player 1 is win the game");
                System.out.println("player is on " + player1_Position);
                System.out.println("the dice rolls " + d2 + " times  for player-1 to win the game.");
                break;
            }
            else if (play==1){
                System.out.println("player-2");
                dice = ((int) (Math.random() * 10) % 6) + 1;
                playerOption = ((int) (Math.random() * 10) % 3);

                System.out.println("dice value " + dice);
                System.out.println("player get option " + playerOption);

                switch (playerOption) {
                    case 0:
                        System.out.println("player stay at same position");
                        play=0;
                        break;
                    case 1:
                        player2_Position = player2_Position + dice;
                        play=1;
                        break;
                    case 2:
                        play=0;
                        if (player2_Position == 0) {
                            break;
                        } else {
                            player2_Position = player2_Position - dice;
                            if (player2_Position < 0) {
                                player2_Position = 0;
                                break;
                            } else {
                                break;
                            }
                        }
                }
                System.out.println("player-2 is on " + player2_Position);
                d2++;
                System.out.println(" ");

            }
            else if (player2_Position == 100){
                System.out.println("player 2 is win the game");
                System.out.println("player is on " + player2_Position);
                System.out.println("the dice rolls " + d2 + " times for player-2 to win the game.");
                break;
            }
        }
    }
}
