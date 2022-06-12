import java.util.Random;
import java.util.Scanner;

public class Aula1605 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        exer04();

    }
    public static void exer01(){
        System.out.println("Informe um número:");
        String numero = String.valueOf(in.nextInt());
        String inverso = "";
        for (int i = numero.length() - 1; i >= 0; i--){
            inverso = inverso + String.valueOf(numero.charAt(i));
            // pode utilizar System.out.print (numero.charAt(i)); e retirar a variável inverso, mas não é recomendado
        }
        System.out.println(inverso);
    }
    public static void exer02(){
        int maior = 0;
        int menor = 0;
        int parada = -1;
        boolean primeiro = true;
        while (parada != 0) { // while (true)
            System.out.print("Informe um número ou 0 (zero) para sair: ");
            parada = in.nextInt();

            /* if (parada == 0){
               break;

               }
             */

            if (primeiro){
                menor = parada;
                maior = parada;
                primeiro = false;
            }
            else {
                if (parada > maior && parada != 0){
                    maior = parada;
                    // comparar o 0 no if aumenta o processamento
                }
                if (parada < menor && parada != 0){
                    menor = parada;
                }

            }

        }
        System.out.println("Menor valor informado: " + menor);
        System.out.println("Maior valor informado: " + maior);
    }

    public static void exer03(){
        Random r = new Random();
        int randomico = r.nextInt(101);
        int chutes = 0;
        while (true){
            System.out.println("Informe um número: ");
            int valorInformado = in.nextInt();
            chutes ++;
            if (valorInformado == randomico){
                System.out.println("ACERTOU MIZERAVI!");
                break;
            }
            else if (valorInformado > randomico){
                System.out.println("Chutou muito alto, tente de novo!");
            }
            else {
                System.out.println("chutou muito baixo, tente de novo!");
            }
        }
        System.out.println("Você tentou " + chutes + " vezes ");
    }

    public static void exer04(){
        System.out.println("");
        for(int i = 0; i < 4 ; i++){
            for (int j = 0 ; j < 10; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println(" ");

        for (int i = 0; i < 5; i++){
            for (int j = 0; j < i + 1; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");

        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5 ; j++){
                if (i + j < 4){
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 9 ; j++){
                if (i + j < 4 || j - i > 4){
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
        System.out.println();

        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 9 ; j++){
                if (i + j < 4 || j - i > 4){
                    System.out.print(" ");
                }
                else {
                    System.out.print( i + 1);
                }
            }
            System.out.println("");
        }
        System.out.println("");

        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 9 ; j++){

                if (i + j < 4 || j - i > 4) {
                    System.out.print(" ");
                }
                else if (j > 4 ){
                    System.out.print(Math.abs(j -3));
                }
                else {
                    System.out.print(Math.abs((j - 5)));
                }
            }
            System.out.println("");
        }



    }
}
