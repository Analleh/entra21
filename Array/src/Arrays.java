import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        exer6();

    }

    public static void exer1() {
        Scanner ler = new Scanner(System.in);

        System.out.println("insira uma frase: ");
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

    public static void exer4() {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe um número");
        int num = in.nextInt();
        int fator = 1;
        if (num == 0) {
            fator = 0;
        }
        else {
            for (int i = num; i > 0; i--) {
                fator *= i;
            }

        }

        System.out.println("O fatorial de " + num + " é " + fator);
    }
    public static void exer5(){

        Scanner in = new Scanner(System.in);
        for (int i = 3 ; i > 0 ; i --){

            System.out.println("Informe a senha de acesso: ");
            int senha = in.nextInt();
            if(senha == 91352){
                System.out.println("Senha correta! Acesso permitido");
                break;
            }
            else{
                System.out.println("Senha incorreta! ");
                System.out.println("Você tem " + (i - 1) +" tentativas");
                if (i == 1){
                    System.out.println("Acesso bloqueado!!!");
                }
            }
        }
    }
    public static void exer6(){
        Scanner in = new Scanner(System.in);

        System.out.println("Informe um número");
        int num = in.nextInt();
        int soma = 0;
        for (int i =1; i <= num ;i ++){
            soma += i;
        }
        System.out.println("A soma de 1 até " + num + " é: " + soma);
    }




    
    public static void batalhanaval(){
        Scanner ler = new Scanner(System.in);


    }


}