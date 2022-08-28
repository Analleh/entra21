import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
//        Character c = 'c';
//        Integer i = 10;
//        i = null;
//        ArrayList arr = new ArrayList<>();
        ex3();

    }
    public static void ex1(){
        //Pedir para o usuário informar n números inteiros até ele digitar 0.
        //Quando ele digitar 0, mostrar a lista dos números digitados por ele
        ArrayList <Integer>inteiros = new ArrayList<>();
        while (true){
            System.out.print("Informe um valor inteiro ou dogite 0 (zero) para encerrar:");
            int escolha = in.nextInt();
            inteiros.add(escolha);
            if (escolha == 0){
                break;
            }
        }
        System.out.print("Valores informados:");
        System.out.println(inteiros);
//        for(int i = 0; i <inteiros.size(); i++){
//            if(i > 0 && i < inteiros.size()){
//                System.out.print(" , ");


        }
        public static void ex2(){
        //Pedir para o usuário informar valores inteiros até que seja informado 0.
        //Quando for informado 0, mostrar os valores que o usuário digitou
        //mostrar a soma dos números pares e dos números impares informados
        //mostrar a média de todos os valores informados


            ArrayList<Integer> inteiros = new ArrayList<>();
            int somaPar = 0, somaImpar =0;
            double somaTotal = 0;

            int num;
            while (true){
            System.out.println("Informe um valor ou digite 0 (zero) para encerrar");
            num = in.nextInt();
            if (num % 2 == 0){
                somaPar += num;
            }
            else {
                somaImpar += num;
            }
            somaTotal += num;
            inteiros.add(num);

            if (num == 0){
                break;
            }


        }
            System.out.println("Valores Informados: " + inteiros);
            System.out.println("A soma dos números par é:" + somaPar);
            System.out.println("A soma dos números ímpares é:" + somaImpar);
            System.out.println("A média do números informados é: " + (somaTotal/inteiros.size()));



        }

        public static void ex3(){
        /* ler o input do usuário (String) até que seja informado Sair
           pedir pro usuário um vlaor inteiro > 0
           remover da lista as palavras que tenha a quantidade de caracteres menor que o número informado
           mostrar a lista de palavras
        */
            ArrayList<String> palavras = new ArrayList<>();
            while (true){
                System.out.println("Informe uma palavra ou sair para encerrar o código: ");
                String palavra = in.nextLine();
                if (palavra.equalsIgnoreCase("SAIR")){
                    break;
                }
                palavras.add (palavra);

            }
            System.out.println("Informe um número inteiro maior que zero");
            int num = in.nextInt();


            for (int i = 0 ; i < palavras.size(); i++){
               if (palavras.get(i).length() < num){
                   palavras.remove(i);
                   i--;

               }

            }
            System.out.println("As palvras informadas com " +num+ " letras ou mais são: " + palavras);

        }

    }
      /* classe raper: uma classe utilitária para usar tipos primitivos como se fossem objetos
    int -> Integer
    double -> Double
    char -> Character
    boolean -> Boolean

      ArrayList arr = new ArrayList();
      arr.add(new ArrayList<>());
      arr.add(new ArrayList<>());

    */