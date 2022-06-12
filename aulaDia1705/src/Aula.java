import java.util.Locale;
import java.util.Scanner;

public class Aula {

    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        exer10();

    }
    public static void exer01(){
        System.out.println("Digite algo: ");
        String algo = in.nextLine();
        System.out.println("Length: " + algo.length());
        System.out.println("Empty: " + algo.isEmpty());
        System.out.println("Uppercase: " + algo.toUpperCase());
        System.out.println("Lowercase: " + algo.toLowerCase());
    }
    public static void exer02(){
        System.out.println("Digite algo: ");
        String algo1 = in.nextLine();
        System.out.println("Digite algo (de novo): ");
        String algo2 = in.nextLine();

        if (algo1.equals(algo2)){
            System.out.println("São exatamente iguais!");
        }
        else if (algo1.equalsIgnoreCase(algo2)) {
            System.out.println("São iguais idenpendente do case!");
        }
        else{
            System.out.println("São diferentes!");
        }
    }

    public static void exer03(){

        System.out.println("Digite algo: ");
        String algo1 = in.nextLine();
        System.out.println("Digite algo (de novo): ");
        String algo2 = in.nextLine();
        if (algo1.contains(algo2)){
            System.out.println(algo2 + " faz parte de " + algo1);

        }
        else if(algo2.contains(algo1)) {
            System.out.println(algo1 + " faz parte de " + algo2);
        }
        else{
            System.out.println("Nenhuma string faz parte da outra");
        }

    }
    public static void exer04(){

        System.out.println("Digite algo: ");
        String algo1 = in.nextLine();
        System.out.println("Digite algo (de novo): ");
        String algo2 = in.nextLine();
        if (algo1.startsWith(algo2)){
            System.out.println(algo2 + " é prefixo de " + algo1);
        }
        else if (algo2.startsWith(algo1)){
            System.out.println(algo1 + " é prefixo de " + algo2);
        }
        else {
            System.out.println("As strings não são prefixos uma da outra");
        }
    }
    public static void exer05(){
        System.out.println("Digite algo: ");
        String algo1 = in.nextLine();
        System.out.println("Digite algo (de novo): ");
        String algo2 = in.nextLine();
        if (algo1.endsWith(algo2)){
            System.out.println(algo2 + " é sufixo de " + algo1);
        }
        else if (algo2.endsWith(algo1)){
            System.out.println(algo1 + " é sufixo de " + algo2);
        }
        else {
            System.out.println("As strings não são sufixos uma da outra");
        }
    }

    public static void exer06(){
        System.out.println("Digite algo: ");
        String algo1 = in.nextLine();
        System.out.println("Digite algo (de novo): ");
        String algo2 = in.nextLine();
        int pos = algo1.indexOf(algo2);
        System.out.println("A posição de " + algo2 + " em " + algo1 + " é " + pos);
    }

    public static void exer07(){
        String cyphered = "lala#lwve#-rwgra22lalang!#<3";
        String decyphered = cyphered.replace("w","o");
        decyphered = decyphered.replace("#", " ");
        decyphered = decyphered.replace("2", "m");
        decyphered = decyphered.replace("lala", "i");
        decyphered = decyphered.replace("-", "p");
        System.out.println(decyphered);
    }

    public static void exer08(){
        System.out.println("Determine quantos números serão informados: ");
        int nuns = in.nextInt();
        int[] numeros = new int [nuns];
        for(int i = 0; i < nuns; i++){
            System.out.println("informe um número: ");
            numeros[i] = in.nextInt();

            }
        int somaPar = 0, somaImpar = 0;
        for (int valor : numeros){
            if(valor % 2 == 0){
                somaPar += valor;
            }
            else{
                somaImpar += valor;
            }

        }
        System.out.println("A soma dos números pares informados é: " + somaPar);
        System.out.println("A soma dos números ímpares informados é: " + somaImpar);
    }
    public static void exer09(){
        System.out.println("Informe a quantidade de palavras a serem informadas: ");
        int qtd = in.nextInt();
        String[] palavras = new String[qtd];
        in.nextLine();
        for (int i = 0; i < qtd; i++){
            System.out.println("Informe uma palavra: ");
            palavras[i] = in.nextLine();
        }
        System.out.println("Informe um número maior do que 0 (zero): ");
        int num = in.nextInt();

        for(int i = 0; i < qtd; i++){
            if(palavras[i].length() < num){
                palavras[i] = null;
            }
        }
        for(String palavra : palavras){
            if (palavra != null){
                System.out.println(palavra);
            }
        }
    }

    public static void exer10() {

        System.out.println("Informe a quantidade de números da primeira lista: ");
        int qtd1 = in.nextInt();
        int[] list1 = new int[qtd1];
        for (int i = 0; i < qtd1; i++) {
            System.out.println("Informe um número para a primeira lista: ");
            list1[i] = in.nextInt();
        }

        System.out.println("Informe a quantidade de números da segunda lista: ");
        int qtd2 = in.nextInt();
        int[] list2 = new int[qtd2];
        for (int i = 0; i < qtd2; i++) {
            System.out.println("Informe um número para a segunda lista: ");
            list2[i] = in.nextInt();
        }

        for (int valor1 : list1){
            boolean achou = false;
            for(int valor2 : list2){
                if(valor1 == valor2){
                    achou = true;
                    break;
                }
            }
            if(!achou){
                System.out.println(valor1);
            }

        }

    }
}
