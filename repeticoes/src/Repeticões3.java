import java.util.Scanner;

public class Repeticões3 {

    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);

        System.out.println("Qual tabuada você deseja saber?");
        int valor =  ler.nextByte();
        while (valor != 0) {

            for (int i = 0; i <= 10; i++) {
                System.out.println(i + "x" + valor + " = " + i * valor);
            }
            System.out.println("Qual tabuada você deseja saber?\nOu digite 0 (zero) para encerrar.");
            valor = ler.nextByte();

        }
        System.out.println("Código encerrado!");
    }
}
