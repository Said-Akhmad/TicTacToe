
import java.util.Scanner;

public class TicTacToeConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] ticTacToe = new char[][]{
                {'1', '|', '2', '|', '3'},
                {'4', '|', '5', '|', '6'},
                {'7', '|', '8', '|', '9'}
        };
        print(ticTacToe);
        int max = 2;
        int turn  = rnd(max);
        int moveCount = 0;

        while (isGameOver(ticTacToe,moveCount)){

            if (turn == 0){
                System.out.println("O turn:");
            }
            else {
                System.out.println("X turn:");
            }

            int operation = scanner.nextInt();

            switch (operation){

                case 1:
                    if (turn == 1 && ticTacToe[0][0] == '1') {
                        ticTacToe[0][0] = 'x';
                    turn = 0;
                    moveCount++;
                    }
                    else if (ticTacToe [0][0] == '1'){
                        ticTacToe[0][0] = 'o';
                        turn = 1;
                        moveCount++;
                    }
                    else {
                        System.out.println("You can't do this move");
                    }
                    print(ticTacToe);
                    break;

                case 2:
                    if (turn == 1 && ticTacToe [0][2] == '2') {
                        ticTacToe[0][2] = 'x';
                        turn = 0;
                        moveCount++;
                    }
                    else if (ticTacToe [0][2] == '2'){
                        ticTacToe[0][2] = 'o';
                        turn = 1;
                        moveCount++;
                    }
                    else {
                        System.out.println("You can't do this move");
                    }
                    print(ticTacToe);
                    break;

                case 3:
                    if (turn == 1 && ticTacToe [0][4] == '3') {
                    ticTacToe[0][4] = 'x';
                    turn = 0;
                    moveCount++;
                }
                else if (ticTacToe [0][4] == '3'){
                    ticTacToe[0][4] = 'o';
                    turn = 1;
                        moveCount++;
                }
                 else {
                    System.out.println("You can't do this move");
                }
                    print(ticTacToe);
                    break;

                case 4:
                    if (turn == 1 && ticTacToe [1][0] == '4') {
                        ticTacToe[1][0] = 'x';
                        turn = 0;
                        moveCount++;
                    }
                    else if (ticTacToe [1][0] == '4'){
                        ticTacToe[1][0] = 'o';
                        turn = 1;
                        moveCount++;
                    }
                    else {
                        System.out.println("You can't do this move");
                    }
                    print(ticTacToe);
                    break;
                case 5:
                    if (turn == 1 && ticTacToe [1][2] == '5') {
                        ticTacToe[1][2] = 'x';
                        turn = 0;
                        moveCount++;
                    }
                    else if (ticTacToe [1][2] == '5'){
                        ticTacToe[1][2] = 'o';
                        turn = 1;
                        moveCount++;
                    }
                    else {
                        System.out.println("You can't do this move");
                    }
                    print(ticTacToe);
                    break;

                case 6:
                    if (turn == 1 && ticTacToe [1][4] == '6') {
                        ticTacToe[1][4] = 'x';
                        turn = 0;
                        moveCount++;
                    }
                    else if (ticTacToe [1][4] == '6'){
                        ticTacToe[1][4] = 'o';
                        turn = 1;
                        moveCount++;
                    }
                    else {
                        System.out.println("You can't do this move");
                    }
                    print(ticTacToe);
                    break;
                case 7:
                    if (turn == 1 && ticTacToe [2][0] == '7') {
                        ticTacToe[2][0] = 'x';
                        turn = 0;
                        moveCount++;
                    }
                    else if (ticTacToe [2][0] == '7'){
                        ticTacToe[2][0] = 'o';
                        turn = 1;
                        moveCount++;
                    }
                    else {
                        System.out.println("You can't do this move");
                    }
                    print(ticTacToe);
                    break;
                case 8:
                    if (turn == 1 && ticTacToe [2][2] == '8') {
                        ticTacToe[2][2] = 'x';
                        turn = 0;
                        moveCount++;
                    }
                    else if (ticTacToe [2][2] == '8'){
                        ticTacToe[2][2] = 'o';
                        turn = 1;
                        moveCount++;
                    }
                    else {
                        System.out.println("You can't do this move");
                    }
                    print(ticTacToe);
                    break;

                case 9:
                    if (turn == 1 && ticTacToe [2][4] == '9') {
                        ticTacToe[2][4] = 'x';
                        turn = 0;
                        moveCount++;
                    }
                    else if (ticTacToe [2][4] == '9'){
                        ticTacToe[2][4] = 'o';
                        turn = 1;
                        moveCount++;
                    }
                    else {
                        System.out.println("You can't do this move");
                    }
                    print(ticTacToe);
                    break;
            }

        }

    }



    public static boolean isGameOver(char [][] ticTacToe, int moveCount){
        boolean gameover = true;

        if (ticTacToe[0][0] == 'x' && ticTacToe[0][2] == 'x' && ticTacToe[0][4] == 'x'){
            gameover = false;
            System.out.println("X Wins!");
        }
        if (ticTacToe[1][0] == 'x' && ticTacToe[1][2] == 'x' && ticTacToe[1][4] == 'x'){
            gameover = false;
            System.out.println("X Wins!");
        }
        if (ticTacToe[2][0] == 'x' && ticTacToe[2][2] == 'x' && ticTacToe[2][4] == 'x'){
            gameover = false;
            System.out.println("X Wins!");
        }


        if (ticTacToe[0][0] == 'x' && ticTacToe[1][0] == 'x' && ticTacToe[2][0] == 'x'){
            gameover = false;
            System.out.println("X Wins!");
        }
        if (ticTacToe[0][2] == 'x' && ticTacToe[1][2] == 'x' && ticTacToe[2][2] == 'x'){
            gameover = false;
            System.out.println("X Wins!");
        }
        if (ticTacToe[0][4] == 'x' && ticTacToe[1][4] == 'x' && ticTacToe[2][4] == 'x'){
            gameover = false;
            System.out.println("X Wins!");
        }


        if (ticTacToe[0][0] == 'x' && ticTacToe[1][2] == 'x' && ticTacToe[2][4] == 'x'){
            gameover = false;
            System.out.println("X Wins!");
        }
        if (ticTacToe[0][4] == 'x' && ticTacToe[1][2] == 'x' && ticTacToe[2][0] == 'x'){
            gameover = false;
            System.out.println("X Wins!");
        }


        if (ticTacToe[0][0] == 'o' && ticTacToe[0][2] == 'o' && ticTacToe[0][4] == 'o'){
            gameover = false;
            System.out.println("O Wins!");
        }
        if (ticTacToe[1][0] == 'o' && ticTacToe[1][2] == 'o' && ticTacToe[1][4] == 'o'){
            gameover = false;
            System.out.println("O Wins!");
        }
        if (ticTacToe[2][0] == 'o' && ticTacToe[2][2] == 'o' && ticTacToe[2][4] == 'o'){
            gameover = false;
            System.out.println("O Wins!");
        }


        if (ticTacToe[0][0] == 'o' && ticTacToe[1][0] == 'o' && ticTacToe[2][0] == 'o'){
            gameover = false;
            System.out.println("O Wins!");
        }
        if (ticTacToe[0][2] == 'o' && ticTacToe[1][2] == 'o' && ticTacToe[2][2] == 'o'){
            gameover = false;
            System.out.println("O Wins!");
        }
        if (ticTacToe[0][4] == 'o' && ticTacToe[1][4] == 'o' && ticTacToe[2][4] == 'o'){
            gameover = false;
            System.out.println("O Wins!");
        }


        if (ticTacToe[0][0] == 'o' && ticTacToe[1][2] == 'o' && ticTacToe[2][4] == 'o'){
            gameover = false;
            System.out.println("O Wins!");
        }
        if (ticTacToe[0][4] == 'o' && ticTacToe[1][2] == 'o' && ticTacToe[2][0] == 'o'){
            gameover = false;
            System.out.println("O Wins!");
        }


        if (moveCount == 9){
            gameover = false;
            System.out.println("Nobody wins!");
        }





        return gameover;
    }

    public static void print(char [][] gameBoard) {

        for (char[] row : gameBoard) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
    public static int rnd (int turn) {
        return (int) (Math.random() * ++turn);
    }

}

