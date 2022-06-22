import Classes.Carro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main2 {
    public void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, ArrayList<Carro>> carro = new HashMap<>();

        boolean executa = true;
        while (executa){
            System.out.println("Menu:");
            System.out.println("1 - Mostrar lista de carros");
            System.out.println("2 - Adicionar carro");
            System.out.println("3 - Vender carro");
            System.out.println("0 - Sair");
            int escolha = in.nextInt();
            in.nextLine();

            switch (escolha){
                case 0 :
                    executa = false;
                    break;

                case 1 :
                if (carro.isEmpty()){
                    System.out.println("Não há carros para mostrar");
                }
                else {

                }

                    break;

                case 2 :
                    Carro c = new Carro();

                    System.out.println("Informe o modelo do carro");
                    carro.get("marca").add(c);

                    break;



                case 3 :

                    break;

                default:

            }
        }
    }
}
