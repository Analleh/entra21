import java.util.Scanner;

public class Velha {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] tabuleiro = {
                { _ , _ , _},

        }
        System.out.println("_ _ _");
        System.out.println("_ _ _");
        System.out.println("_ _ _");
        int [][] posicao = new int[3][3];

            for (int i = 0; i < 9; i++){
                for (int j = 0; j < 9; j++) {
                    System.out.println("Informe uma posição:");
                    int ler = in.nextInt();
                    posicao [i][j] = 'X';
                    switch (ler) {
                        case 1:
                            i = 0;
                            j = 0;
                            System.out.println(posicao[i][j]);
                            break;
                        case 2:
                            i = 0;
                            j = 1;
                            System.out.println(posicao[i][j]);
                            break;
                        case 3:
                            i = 0;
                            j = 2;
                            System.out.println(posicao[i][j]);
                            break;
                        case 4:
                            i = 1;
                            j = 0;
                            System.out.println(posicao[i][j]);
                            break;
                        case 5:
                            i = 1;
                            j = 1;
                            System.out.println(posicao[i][j]);
                            break;
                        case 6:
                            i = 1;
                            j = 2;
                            System.out.println(posicao[i][j]);
                            break;
                        case 7:
                            i = 2;
                            j = 0;
                            System.out.println(posicao[i][j]);
                            break;
                        case 8:
                            i = 2;
                            j = 1;
                            System.out.println(posicao[i][j]);
                            break;
                        case 9:
                            i = 2;
                            j = 2;
                            System.out.println(posicao[i][j]);
                            break;

                    }


                }

            }

        }
    }

