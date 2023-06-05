package org.exemple.tic-tac-toe;

import java.util.Scanner;

public class TicTacToe {
    
   public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        char[][] ticTacToe = new char[3][3];

        System.out.println("Player 1 = X");
        System.out.println("Player 2 = O");

        boolean won = false;
        int move = 1;
        char symbol;
        int row = 0, column = 0;


        while (!won) {

            if (move % 2 == 1) {
                System.out.println("Player 1's turn. Choose row and column (1-3).");
                symbol = 'X';
            } else {
                System.out.println("Player 2's turn. Choose row and column (1-3).");
                symbol = 'O';
            }

            boolean validRow = false;
            while (!validRow) {
                System.out.println("Enter the row (1, 2, or 3)");
                row = scan.nextInt();
                if (row >= 1 && row <= 3) {
                    validRow = true;
                } else {
                    System.out.println("Invalid input, please try again");
                }
            }

            boolean validColumn = false;
            while (!validColumn) {
                System.out.println("Enter the column (1, 2, or 3)");
                column = scan.nextInt();
                if (column >= 1 && column <= 3) {
                    validColumn = true;
                } else {
                    System.out.println("Invalid input, please try again");
                }
            }

            row--;
            column--;
            if (ticTacToe[row][column] == 'X' || ticTacToe[row][column] == 'O') {
                System.out.println("Position already taken, please try again");
            } else {
                ticTacToe[row][column] = symbol;
                move++;
            }

            for (int i = 0; i < ticTacToe.length; i++) {
                for (int j = 0; j < ticTacToe[i].length; j++) {
                    System.out.print(ticTacToe[i][j] + " | ");
                }
                System.out.println();
            }

            if ((ticTacToe[0][0] == 'X' && ticTacToe[0][1] == 'X' && ticTacToe[0][2] == 'X') ||
                    (ticTacToe[1][0] == 'X' && ticTacToe[1][1] == 'X' && ticTacToe[1][2] == 'X') ||
                    (ticTacToe[2][0] == 'X' && ticTacToe[2][1] == 'X' && ticTacToe[2][2] == 'X') ||
                    (ticTacToe[0][0] == 'X' && ticTacToe[1][0] == 'X' && ticTacToe[2][0] == 'X') ||
                    (ticTacToe[0][1] == 'X' && ticTacToe[1][1] == 'X' && ticTacToe[2][1] == 'X') ||
                    (ticTacToe[0][2] == 'X' && ticTacToe[1][2] == 'X' && ticTacToe[2][2] == 'X') ||
                    (ticTacToe[0][0] == 'X' && ticTacToe[1][1] == 'X' && ticTacToe[2][2] == 'X') ||
                    (ticTacToe[0][2] == 'X' && ticTacToe[1][1] == 'X' && ticTacToe[2][0] == 'X')) {
                won = true;
                System.out.println("Congratulations, Player 1 wins!");

            } else if ((ticTacToe[0][0] == 'O' && ticTacToe[0][1] == 'O' && ticTacToe[0][2] == 'O') ||
                    (ticTacToe[1][0] == 'O' && ticTacToe[1][1] == 'O' && ticTacToe[1][2] == 'O') ||
                    (ticTacToe[2][0] == 'O' && ticTacToe[2][1] == 'O' && ticTacToe[2][2] == 'O') ||
                    (ticTacToe[0][0] == 'O' && ticTacToe[1][0] == 'O' && ticTacToe[2][0] == 'O') ||
                    (ticTacToe[0][1] == 'O' && ticTacToe[1][1] == 'O' && ticTacToe[2][1] == 'O') ||
                    (ticTacToe[0][2] == 'O' && ticTacToe[1][2] == 'O' && ticTacToe[2][2] == 'O') ||
                    (ticTacToe[0][0] == 'O' && ticTacToe[1][1] == 'O' && ticTacToe[2][2] == 'O') ||
                    (ticTacToe[0][2] == 'O' && ticTacToe[1][1] == 'O' && ticTacToe[2][0] == 'O')) {
                won = true;
                System.out.println("Congratulations, Player 2 wins!");

            } else if (move > 9) {
                won = true;
                System.out.println("No one wins this game.");
            }
        }

    }
}
