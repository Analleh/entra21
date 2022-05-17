import java.util.Random;
import java.util.Scanner;

public class PPT {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner in = new Scanner(System.in);
        int pontuaçãoJ1 = 0;
        int pontuaçãoJ2 = 0;

        while (pontuaçãoJ1 < 10 && pontuaçãoJ2 < 10) {

            // usuário
            int escolhaUsuario = -1;
            while (!escolhaValida(escolhaUsuario)){
                System.out.println("Escolha (0) - Pedra, (1) -  Papel ou (2) - Tesoura");
                escolhaUsuario = in.nextInt();
                if(!escolhaValida(escolhaUsuario)){
                    System.out.println("Escolha inválida");

                }
            }
            String escolhausuarioString = escolhaString (escolhaUsuario);

            // computador
            int escolhaComputador = r.nextInt(3);
            String escolhaComputadorString = escolhaString (escolhaComputador);
            System.out.println("(Jogador) " +escolhausuarioString+ " X " +escolhaComputadorString + " (Computador)");
            int vencedor = checarVencedor (escolhaUsuario , escolhaComputador);
             switch (vencedor){
                 case 0:
                     System.out.println("empate");
                     break;
                 case 1:
                     System.out.println("Usuário ganhou");
                     pontuaçãoJ1++;
                     break;
                 case 3:
                     System.out.println("Computador ganhou");
                     pontuaçãoJ2++;
                     break;
             }



        }
    }
    public static boolean escolhaValida(int escolha){
        return  escolha > -1 && escolha< 3;
        //return escolha == 0 || escolha == 1 || escolha ==2;
    }
    public static String escolhaString(int escolha){
        switch (escolha){
            case 0:
                return "Pedra";
            case 1:
                return "Papel";
            case 2:
                return "Papel";
            default:
                return "Escolha errada";
        }
    }
    public static int checarVencedor(int escolha1, int escolha2){

        // 0 empate
        // 1 escolha1 vence
        // 2 escolha2 vence

        if (escolha1 == escolha2 ){
            return 0;
        } else if (
                (escolha1 == 0 && escolha2 == 1) ||
                (escolha1 == 1 && escolha2 == 2) ||
                (escolha1 == 2 && escolha2 == 0)
                ) {
            return  2;
        }
        else if (
                (escolha2 == 0 && escolha1 == 1) ||
                (escolha2 == 1 && escolha1 == 2) ||
                (escolha2 == 2 && escolha1 == 0)
        ) {
            return 1;
        }
        else {
            return 0;
        }

    }
}
//   int valor = soma(1,3);
//   System.out.println(soma(2,8));
//public static int soma(int valor1, int valor2){
//    return valor1+valor2;
//}
