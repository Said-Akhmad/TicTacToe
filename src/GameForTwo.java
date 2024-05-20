import java.util.Scanner;
public class GameForTwo {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Добро пожаловать в игру крестики нолики!!!");
        System.out.println("Введите число от 1 до 9, чтобы сделать ход: ");
        System.out.println();

        char[][] field = {{'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'}};


        int count = 0;

        while (true) {

            printField(field);
            if (count % 2 == 0) {

                System.out.println("Ход первого игрока: x");
                int num = 0;
                num = scanner.nextInt();

                switch (num) {
                    case 1:
                        field[0][0] = 'x';
                        break;
                    case 2:
                        field[0][1] = 'x';
                        break;
                    case 3:
                        field[0][2] = 'x';
                        break;
                    case 4:
                        field[1][0] = 'x';
                        break;
                    case 5:
                        field[1][1] = 'x';
                        break;
                    case 6:
                        field[1][2] = 'x';
                        break;
                    case 7:
                        field[2][0] = 'x';
                        break;
                    case 8:
                        field[2][1] = 'x';
                        break;
                    case 9:
                        field[2][2] = 'x';
                        break;
                }
            } else {

                System.out.println("Ход второго игрока: 0");

                int num1 = 0;
                num1 = scanner.nextInt();


                switch (num1) {
                    case 1:
                        field[0][0] = '0';
                        break;
                    case 2:
                        field[0][1] = '0';
                        break;
                    case 3:
                        field[0][2] = '0';
                        break;
                    case 4:
                        field[1][0] = '0';
                        break;
                    case 5:
                        field[1][1] = '0';
                        break;
                    case 6:
                        field[1][2] = '0';
                        break;
                    case 7:
                        field[2][0] = '0';
                        break;
                    case 8:
                        field[2][1] = '0';
                        break;
                    case 9:
                        field[2][2] = '0';
                        break;
                }
            }


            for (int i = 0; i < field.length; i++) {


                if (field[i][0] == field[i][1] && field[i][1] == field[i][2] || // сравнение по горизонтали
                        field[0][i] == field[1][i] && field[1][i] == field[2][i] || // сравнение по вертикали
                        field[i][0] == field[i][1] && field[i][0] == field[i][2] || // сравнение по
                        field[2][0] == field[1][1] && field[2][0] == field[0][2]) { // диагонали

                    if (count % 2 == 0) {
                        System.out.println("Победил игрок 'x'!");
                    } else {
                        System.out.println("Победил игрок '0'!");
                    }
                    printField(field);
                    return;
                }
            }
            count++;
            if (count >= field.length * field[0].length) {
                System.out.println("Ничья!");
                printField(field);
                break;
            }
        }
    }


    public static void printField(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (j != 2)
                    System.out.print(field[i][j] + "|");
                else System.out.print(field[i][j]);
            }
            System.out.println();
        }
    }
}

