import java.util.Scanner;

public class Atividade2 {

    public static void main(String[] args) {
        exer6();

    }
    public static void exer1() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe a largura do polígono:");
        double lar = ler.nextDouble();
        System.out.println("Informe o comprimento do polígono:");
        double comp = ler.nextDouble();

        if (lar == comp) {
            System.out.println("O polígono informado é um quadrado.");
        } else {
            System.out.println("O polígono informado é um retângulo");
        }
    }
    public static void exer2(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe um número inteiro:");
        int num1 = ler.nextInt();
        System.out.println("Informe um segundo número inteiro:");
        int num2 = ler.nextInt();

        if (num1>num2){
            System.out.println("O número " + num1 + " é maior");

        } else if (num2 > num1) {
            System.out.println("O número " + num2 + " é maior");

        }
        else{
            System.out.println("Os números são iguais ");
        }

    }
    public static void exer3(){
        double disc;
        double valor;
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe a quantidade de peças compradas:");
        int qtd = ler.nextInt();
        qtd = qtd * 100;

        if (qtd > 1000){
            disc = (qtd * 10)/100;
            valor = qtd - disc;
            System.out.printf("O valor final da compra é: R$%.2f" , valor);


        }
        else {
            System.out.println("O valor final da compra é: R$" + qtd);
        }


    }

    public static void exer4(){
        double porc;
        Scanner ler = new Scanner(System.in);
        System.out.println("informe seu salário atual:");
        double sal = ler.nextDouble();
        System.out.println("informe seu tempo de serviço:");
        int anos = ler.nextInt();

        if (anos > 5){

            porc = (sal * 5)/100;

            System.out.printf("Você receberá uma bonificação de: R$%.2f\n" , porc);
            System.out.printf("Novo salário: R$%.2f", sal + porc);

        }
        else if (anos <= 5){

            System.out.printf("O salário final é: R$%.2f" , sal);
        }

    }

    public static void exer5(){

        Scanner ler = new Scanner(System.in);
        System.out.println("Informe a nota do aluno: ");
        double nota = ler.nextDouble();

        if (nota < 25){
            System.out.println("F");
        }
        else if ((nota >= 25)&&(nota < 45)) {
            System.out.println("E");
        }
        else if ((nota >= 45)&&(nota < 50)){
            System.out.println("D");
        }
        else if ((nota >= 50)&&(nota< 60)) {
            System.out.println("C");
        }
        else if ((nota >= 60)&&(nota < 80)){
            System.out.println("B");
        } else if ((nota >= 80)&&(nota <= 100)) {
            System.out.println("A");
        }
        else {
            System.out.println("Nota incorreta");
        }
    }
    public static void exer6(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe a idade da primeira pessoa:");
        int id1 = ler.nextInt();
        System.out.println("Informe a idade da segunda pessoa:");
        int id2 = ler.nextInt();
        System.out.println("Informe a idade da terceira pessoa:");
        int id3 = ler.nextInt();

        if ((id1 > id2)&&(id1 > id3)){
            System.out.println("A primeira pessoa é a mais velha: " +id1+ " anos");
        }
        else if ((id2 > id1)&&(id2 > id3)){
            System.out.println("A segunda pessoa é a mais velha: " +id2+ "anos");
        }
        else if ((id3 > id1)&&(id3> id2)){
            System.out.println("A terceira pessoa é a mais velha: " +id3+ "anos");
        }
        else if ((id1 < id2)&&(id1 < id3)){
            System.out.println("A primeira pessoa é a mais nova: " +id1+ "anos");
        }
        else if ((id2 < id1)&&(id2 < id3)) {
            System.out.println("A segunda pessoa é a mais nova: " + id1 + "anos");
        }
        else  if ((id3 < id1)&&(id3 < id2)) {
            System.out.println("A terceira pessoa é a mais nova: " + id1 + "anos");
        }
        else {
            System.out.println("As idades são iguais:");
        }
    }


}
