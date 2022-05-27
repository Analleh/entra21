import classes.*;
import classes.XBurguer;

import java.util.Locale;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println("- MENU: Escolha uma opção - ");
        System.out.println("(1) - X-Salada");
        System.out.println("(2) - X-Burguer");
        System.out.println("(3) - Misto Quente");
        System.out.println("(4) - Hot Dog");
        System.out.println("(5) - Mini Pizza: Calabresa");
        int escolha = in.nextInt();
        in.nextLine();
        Lanche lanche = null;

        switch (escolha) {
            case 1:
                lanche = new XSalada();
                break;

            case 2:
                lanche = new XBurguer();
                break;

            case 3:
                lanche = new MistoQuente();
                break;

            case 4:
                lanche = new HotDog();
                break;

            case 5:
                lanche = new MiniPizza();
                break;

            default:
                System.err.println("Escolha uma opção válida!");
        }

        if (lanche instanceof Sanduiche) {
            //adicionais
            System.out.println("Deseja adicionais? (S/N)");
            String adiconais = in.nextLine();
            if(adiconais.equalsIgnoreCase("S")){
                // adicionar os adicionais
                for (int i = 0; i < 10; i++){
                    // pedir o add
                    System.out.println("Informe o adicional: ");
                    ((Sanduiche) lanche).adicionarAdicional(in.nextLine());
                    System.out.println("Deseja adicionar mais adicionais? (S/N)");
                    String parada = in.nextLine();
                    if(parada.equalsIgnoreCase("N")){
                        break;
                    }
                }
            }
            if (lanche instanceof XBurguer) {
                System.out.print("Lanche aberto? (S/N)");
                String aberto = in.nextLine();
                ((XBurguer) lanche).aberto = aberto.equalsIgnoreCase("S");
            }
        }
        else {
            System.out.print("Borda Recheada? (S/N)");
            String borda = in.nextLine();
            MiniPizza minePizza = ((MiniPizza) lanche);
            minePizza.borda = borda.equalsIgnoreCase("S");
            if(minePizza.borda) {
                System.out.println("Qual o sabor da borda?");
                minePizza.sabor = in.nextLine();
            }

        }


        System.out.print("Informe o valor do(a) "+lanche.tipo+ ": R$");
        lanche.valor = in.nextDouble();
        lanche.montarComanda();

    }

}

// construtor: variável do objeto -> public XBurguer. Java possui um construtor padrão quando o mesmo não é informado
// classe abstrata não pode ser instanciada, define um comportamento genérico para as clases derivadas
// classe derivada complementam o comportamento abstrado das classes, possuem um comportamento específico e podem ser instanciado
