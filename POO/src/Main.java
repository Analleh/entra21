import classes.lanches.*;

import java.util.Scanner;



public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
      montarLanche();
    }
    private static void montarLanche(){
        System.out.println("- MENU: Escolha uma opção - ");
        System.out.println("(1) - X-Salada");
        System.out.println("(2) - X-Burguer");
        System.out.println("(3) - Misto Quente");
        System.out.println("(4) - Hot Dog");
        System.out.println("(5) - Mini Pizza");
        System.out.println("(6) - Pizza");
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
            case 6:
                lanche = new Pizza();
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
                ((XBurguer) lanche).setAberto(aberto.equalsIgnoreCase("S"));
            }
        }
        else {
            System.out.println("Escolha o sabor da pizza:");

            System.out.println("(1) - 4 Queijos");
            System.out.println("(2) - Calabresa");
            System.out.println("(3) - Frango c/ catupiry");
            System.out.println("(4) - Marguerida");
            System.out.println("(5) - Portuguesa");

            int sabor = in.nextInt();
            in.nextLine();
            MiniPizza minePizza = ((MiniPizza) lanche);
            switch (sabor){
                case 1:
                    minePizza.adicionarSaborEIngredientes("4 queijos");
                    break;
                case 2:
                    minePizza.adicionarSaborEIngredientes("calabresa");
                    break;
                case 3:
                    minePizza.adicionarSaborEIngredientes("frango c/ catupiry");
                    break;
                case 4:
                    minePizza.adicionarSaborEIngredientes("marguerita");
                    break;
                case 5:
                    minePizza.adicionarSaborEIngredientes("portuguesa");
                    break;
                default:
                    System.err.println("Escolha um valor válido");


            }
            if (lanche instanceof Pizza){
                System.out.println("Informe o tamanho da pizza: ");
                System.out.println("XS - Broto");
                System.out.println("SM - Pequena");
                System.out.println("MD - Média");
                System.out.println("LG - Grande");
                System.out.println("XL - Família");
                ((Pizza)lanche).setTamanho(in.nextLine().toUpperCase());
            }



            System.out.print("Borda Recheada? (S/N)");
            String bordaRecheada = in.nextLine();

            minePizza.setBordaRecheada(bordaRecheada.equalsIgnoreCase("S"));
            if(minePizza.isBordaRecheada()) {
                System.out.println("Qual o sabor da borda?");
                minePizza.setSaborBorda(in.nextLine());
            }

        }


        System.out.print("Informe o valor do(a) "+lanche.getTipo()+ ": R$");
        lanche.setValor(in.nextDouble());

    }

}

// construtor: variável do objeto -> public XBurguer. Java possui um construtor padrão quando o mesmo não é informado
// classe abstrata não pode ser instanciada, define um comportamento genérico para as clases derivadas
// classe derivada complementam o comportamento abstrado das classes, possuem um comportamento específico e podem ser instanciado
