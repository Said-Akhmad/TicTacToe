
import java.util.Arrays;
import java.util.Scanner;
public class GameWithABot {





    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean[] bool = new boolean[50];

        Arrays.fill(bool, true);

        System.out.println("Добро пожаловать в игру крестики нолики!!!");
        System.out.println("Введите число от 1 до 9, чтобы сделать ход: ");
        System.out.println();


        char[][] field = {{'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'}};



        int count = 0;


        while (true) {

            if (count % 2 == 0) {

                System.out.println("Ход первого игрока: x");
                printField(field);
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
                printField(field);

                if ((field[0][0] == 'x' && field[0][1] == 'x') && bool[0]) {
                    field[0][2] = '0';
                    bool[0] = false;
                    System.out.println("1");
                } else if ((field[1][0] == 'x' && field[1][1] == 'x') && bool[1]) {
                    field[1][2] = '0';
                    bool[1] = false;
                    System.out.println("2");

                } else if ((field[2][0] == 'x' && field[2][1] == 'x') && bool[2]) {
                    field[2][2] = '0';
                    bool[2] = false;
                    System.out.println("3");
                } else if ((field[0][2] == 'x' && field[0][1] == 'x') && bool[3]) {
                    field[0][0] = '0';
                    bool[3] = false;
                    System.out.println("4");

                } else if ((field[1][2] == 'x' && field[1][1] == 'x') && bool[4]) {
                    field[1][0] = '0';
                    bool[4] = false;
                    System.out.println("5");

                } else if ((field[2][2] == 'x' && field[2][1] == 'x') && bool[5]) {
                    field[2][0] = '0';
                    bool[5] = false;
                    System.out.println("6");

                } else if ((field[0][0] == 'x' && field[0][2] == 'x') && bool[6]) {
                    field[0][1] = '0';
                    bool[6] = false;
                    System.out.println("7");


                } else if ((field[1][0] == 'x' && field[1][2] == 'x') && bool[7]) {
                    field[1][1] = '0';
                    System.out.println("8");
                    bool[7] = false;

                } else if ((field[2][0] == 'x' && field[2][2] == 'x') && bool[8]) {
                    field[2][1] = '0';
                    bool[8] = false;
                    System.out.println("9");

                }
//Вертикаль
                else if ((field[0][0] == 'x' && field[1][0] == 'x') && bool[9]) {
                    field[2][0] = '0';
                    bool[9] = false;
                    System.out.println("10");
                } else if ((field[0][1] == 'x' && field[1][1] == 'x') && bool[10]) {
                    field[2][1] = '0';
                    bool[10] = false;
                    System.out.println("11");

                } else if ((field[0][2] == 'x' && field[1][2] == 'x') && bool[11]) {
                    field[2][2] = '0';
                    bool[11] = false;
                    System.out.println("12");
                } else if ((field[2][0] == 'x' && field[1][0] == 'x') && bool[12]) {
                    field[0][0] = '0';
                    bool[12] = false;
                    System.out.println("13");

                } else if ((field[2][1] == 'x' && field[1][1] == 'x') && bool[13]) {
                    field[0][1] = '0';
                    bool[13] = false;
                    System.out.println("14");

                } else if ((field[2][2] == 'x' && field[2][1] == 'x') && bool[14]) {
                    field[0][2] = '0';
                    bool[14] = false;
                    System.out.println("15");

                } else if ((field[0][0] == 'x' && field[2][0] == 'x') && bool[15]) {
                    field[1][0] = '0';
                    bool[15] = false;
                    System.out.println("16");

                } else if ((field[0][1] == 'x' && field[2][1] == 'x') && bool[16]) {
                    field[1][1] = '0';
                    bool[16] = false;
                    System.out.println("17");

                } else if ((field[0][2] == 'x' && field[2][2] == 'x') && bool[17]) {
                    field[1][2] = '0';
                    bool[17] = false;
                    System.out.println("18");

                } else if ((field[0][0] == 'x' && field[1][1] == 'x') && bool[18]) {
                    field[2][2] = '0';
                    bool[18] = false;
                    System.out.println("19");

                } else if ((field[2][2] == 'x' && field[1][1] == 'x') && bool[19]) {
                    field[0][0] = '0';
                    bool[19] = false;
                    System.out.println("20");

                } else if ((field[0][0] == 'x' && field[2][2] == 'x') && bool[20]) {
                    field[1][1] = '0';
                    bool[20] = false;
                    System.out.println("21");

                } else if ((field[0][2] == 'x' && field[1][1] == 'x') && bool[21]) {
                    field[2][0] = '0';
                    bool[21] = false;
                    System.out.println("22");

                } else if ((field[2][0] == 'x' && field[1][1] == 'x') && bool[22]) {
                    field[0][2] = '0';
                    bool[22] = false;

                    System.out.println("23");
                } else if ((field[0][2] == 'x' && field[2][0] == 'x') && bool[23]) {
                    field[1][1] = '0';
                    bool[23] = false;
                    System.out.println("24");

                }else {
                    for (int i = 0; i < field.length; i++) {
                        bool[24] = true;
                        for (int j = 0; j < field[0].length; j++) {
                            if (field[i][j] != 'x' && field[i][j] != '0') {
                                if(i==0&&j==0){
                                    bool[3] = false;
                                } else if (i==0&&j==1) {
                                    bool[6] = false;
                                    bool[13] = false;
                                }else if (i==0&&j==2) {
                                    bool[0] = false;
                                    bool[14] = false;
                                    bool[22] = false;
                                }else if (i==1&&j==0) {
                                    bool[4] = false;
                                    bool[15] = false;
                                }else if (i==1&&j==1) {
                                    bool[7] = false;
                                    bool[16] = false;
                                    bool[23] = false;
                                }else if (i==1&&j==2) {
                                    bool[1] = false;
                                    bool[17] = false;
                                }else if (i==2&&j==0) {
                                    bool[9] = false;
                                    bool[21] = false;
                                    bool[5] = false;
                                }else if (i==2&&j==1) {
                                    bool[10] = false;;
                                    bool[8] = false;;
                                }else if (i==2&&j==2) {
                                    bool[18] = false;
                                    bool[2] = false;
                                    bool[11] = false;
                                }
                                field[i][j] = '0';
                                bool[24] = false;
                                break;
                            }
                        }
                        if (!bool[24]) {
                            break;
                        }
                    }
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
                System.out.println("Ничия!");
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

