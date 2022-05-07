import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        exer3();

    }

    public static void exer1() {
        Scanner ler = new Scanner(System.in);

        System.out.println("insira uma frase:");
        String frase = ler.nextLine();
        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {

            if (frase.charAt(i) == ' '){
                contador++;
            }
        }
        System.out.println("A quantidade de espaços é: " + contador);


    }

    public static void exer2(){

        Scanner ler = new Scanner(System.in);
        System.out.println("informe o número de linhas da matriz: ");
        int lin = ler.nextInt();
        System.out.println("Informe o número de colunas da matriz: ");
        int col = ler.nextInt();
        String[][] matriz = new String[lin][col];

        for(int i = 0; i < lin ; i++){
            for(int j = 0; j < col ; j++){

                matriz[i][j] = "#";

            }
        }
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){

                System.out.print(matriz[i][j]);

            }
            System.out.print("\n");
        }

    }
    public static void exer2Simple(){
        Scanner ler = new Scanner(System.in);
        System.out.println("informe o número de linhas da matriz: ");
        int lin = ler.nextInt();
        System.out.println("Informe o número de colunas da matriz: ");
        int col = ler.nextInt();
        String[][] matriz = new String[lin][col];

        for(int i = 0; i < lin ; i++){
            for(int j = 0; j < col ; j++){

                System.out.print("#");

            }
            System.out.println("");
        }
    }


    public static void exer3(){
        Scanner ler = new Scanner (System.in);
        int num, soma = 0;
        for(int i = 0; i < 5; i++){
            System.out.println("Informe um número inteiro: ");
            num = ler.nextInt();
            soma += num;
        }
        System.out.println("A soma dos números informados é: " +soma);
    }
    
    public static void batalhanaval(){
        Scanner ler = new Scanner(System.in);


    }


}