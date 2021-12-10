/*
Run game
*/

import java.util.Scanner;

public class Game {
    static int boardRows = 3;
    static int boardCols = 3;
    static String[][] board = {
        {"*", "*", "*"},
        {"*", "*", "*"},
        {"*", "*", "*"}
    };

    public static void main(String[] args) {
        String[] players = {};
        Scanner name = new Scanner(System.in);

        System.out.println("Select Player 1: ");
        String player1 = name.next();
        System.out.println("Select Player 2: ");
        String player2 = name.next();

        players[0] = player1;
        players[1] = player2;

        int player = 1;
        int i = 0;
        int space = 0;

        do {
            Scanner input = new Scanner(System.in);

            player = (player % 2 == 1) ? 1 : 2;

            String mark = (player == 1) ? "X" : "O";

            System.out.println((player == 1) ? player1 : player2 + " enter your space: ");
            space = input.nextInt();

            //place piece
            if(space > 0 || space < 10) {
                if(space >= 7) {
                    board[2][space - 7] = mark;
                }
                else if(space >= 4) {
                    board[1][space - 4] = mark;
                }
                else {
                    board[0][space-1] = mark;
                }
            }
            else {
                System.out.println("Invalid move!");
            }

            i = checkWin();
            player++;

        } while(i == -1);

        if(i == 1) {
            System.out.println((player-- % 2 == 1) ? player1 : player2 + " wins!");
            //add win to winner
                //add to winner queue
            //add loss to loser
                //add to loser queue
        }
        else {
            System.out.println("Draw!");
        }

    }

    public static int checkWin() {
        for(int row = 0; row < boardRows; row++) {
            for(int col = 0; col < boardCols; col++) {
                //check rows for win
                if((board[row][0] == board[row][1] && board[row][1] == board[row][2]) && (board[row][0] == "X" || board[row][0] == "O")) {
                    return 1;
                }
                //check cols
                else if((board[0][col] == board[1][col] && board[1][col] == board[2][col]) && (board[0][col] == "X" || board[0][col] == "O")) {
                    return 1;
                }
                //check diagonal left to right
                else if((board[0][0] == board[1][1] && board[1][1] == board[2][2]) && (board[0][0] == "X" || board[0][0] == "O")) {
                    return 1;
                }
                //check diagonal right to left
                else if((board[0][2] == board[1][1] && board[1][1] == board[2][0]) && (board[2][0] == "X" || board[2][0] == "O")) {
                    return 1;
                }
                //check for draw
                else if (board[0][0] != "*" && board[0][1] != "*" & board[0][2] != "*"
                 & board[1][0] != "*" & board[1][1] != "*" & board[1][2] != "*"
                 & board[2][0] != "*" & board[2][1] != "*" & board[2][2] != "*") {
                    return 0;
                }
            }
        }
        return -1;
    }

    
}
