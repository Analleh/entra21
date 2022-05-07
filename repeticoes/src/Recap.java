import org.w3c.dom.ls.LSOutput;

import java.util.Locale;
import java.util.Scanner;

public class Recap {
    public static void main(String[] args) {
        finalFantasy2();

    }
    public static void finalfantasy(){

        Scanner ler = new Scanner(System.in);
        boolean isHealer = true;
        while(isHealer){

            System.out.println("Informe a abreviação da clsse Healer:");
            String clazz = ler.next();
            switch (clazz){
                case "WHM":
                    System.out.println("White mage");
                case "SAG":
                    System.out.println("Sage");
                case "SCH":
                    System.out.println("Schollar");
                case "ARC":
                    System.out.println("Arcanist");
                default:
                    System.out.println("NÃO É HEALER!!!");
                    isHealer = false;
                    break;
            }
        }
    }

    public static void finalFantasy2(){
        Scanner ler = new Scanner(System.in);
        boolean isHealer = true;
        System.out.println("Informe a abreviação da clsse Healer:");
        String nome = ler.next();

        if (nome.length()==3){

            switch (nome.toUpperCase()){

                case "PLD", "WAR", "DKN", "GNB":
                    System.out.println("Is tank");
                    break;

                case "WHM", "SCH", "AST", "SAG":
                    System.out.println("Is Header");
                    break;

                case "MNR", "DRG", "NJA", "SMR", "RPR", "BRD", "MCH", "DNC", "BLM", "SMN", "RDM", "BEM":
                    System.out.println("Is DPS");
                    break;

                default:
                    System.out.println("Não é uma classe válida!!!");
                    isHealer = false;
                    break;
            }
        }
        else {

            System.out.println("Abreviação informada INCORRETA!!!");
        }
    }

    public static void text() {
        int var = 10; // inteiros
        char var2 = 'a'; // Caracter único
        String var3 = "ABCDEFGHI JKL"; // texto
        boolean var4 = true;
        double var5 = 5.6; // variavel quebrada

        // Saídas - mensagenas ao usuário
        System.out.println();
        System.out.printf("%d, %.2f");
        System.out.print("");

        //String
        var3 = "Did you know about the aclaimed MMO FFXIVV?";
        System.out.println(var3.length()); // length() retorna a quantidade total de caracteres no texto
        System.out.println(var3.charAt(0)); // charAt() retorna o caractere na posição x do testo;
        System.out.println(var3.equals("Texte")); // equals() realiza comparação entre Strings
        System.out.println(var3.toLowerCase()); // toLowerCase() converte todos os caracteres da string para minúsculo
        System.out.println(var3.toUpperCase()); // toUpperCase() converte todos os caracteres da strong para Maiúsculo
        System.out.println(var3.contains("FFXIV")); // contains() checa se o texto informado contém a string do parâmetro
        System.out.println(var3.strip()); // strip() remove espaçoes do final e do começo do texto
        String [] splitted = var3.split(""); // split() irá quebrar o texto no delimitador informado e retornar uma lista
        for (String word : splitted){
            System.out.println(word);
        }
        System.out.println(var3.substring(5,8));

    }
    public static void recap (){

        Scanner ler = new Scanner(System.in);
        int[] numeros = {0,1,2,3,4,5,6,7,8,9}; //iciando uma lista com valores
        int[] numeros2 = new int[10]; //iniciando lista vazia 
        System.out.println(numeros[6]); // recuperando um valor da lista
        numeros2[4] = ler.nextInt(); // inserindo um valor no array
        System.out.println(numeros.length); // pegando a quantidade de itens
        for (int i = 0; i < numeros.length; i++);{

            int i;
            System.out.println(numeros[i]);
            
        }
        int[][]numeros3 = {{0,1,2,3,4},{5,6,7}};// iniciando uma matrizcom valores
        int[][]numeros4 = new int[2][5]; // iniciando matriz sem valores
        System.out.println(numeros3[0][2]); // recuperando um valor de uma matriz
        numeros4[1] = new int[]{7,8,9,0}; //inserindo uma lista em uma linha da matriz
        numeros4[0][0] = 9; // inserindo dados em uma posição de matriz

        System.out.println(numeros3.length); // numero de linhas da matriz
        System.out.println(numeros3[0].length); // quantifafr de itens na linhas de matrix
        
        for(int i = 0; i < numeros3.length; i++){
            for(int j = 0; j < numeros3[i].length; j++){

                System.out.println(numeros3[i][j]);
                
            }
            
        }
    }
   
    
    }






