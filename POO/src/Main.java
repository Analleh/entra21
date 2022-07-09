import classes.cliente.Cliente;
import classes.lanches.*;

import java.util.InputMismatchException;
import java.util.Scanner;



public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        Cliente cl = new Cliente();
        System.out.println("Insira o nome do cliente: ");
        cl.setNome(in.nextLine()); // passar como parâmetro o nextline, pois método não recebe atribuição

        while (true){
            cl.getPedido().adicionarLanche(montarLanche());
            System.out.println("Deseja mais um lanche? (S/N)");
            if(in.nextLine().equalsIgnoreCase("N")){
                break;
            }
        }
        System.out.println("......................................");
        System.out.println("Cliente: "  + cl.getNome());
        cl.getPedido().imprimirComanda();
    }
    private static Lanche montarLanche(){
        Lanche lanche = null;
        boolean loop = true;
        while (loop) {
            ELanche opcao = (ELanche) montarLanche(lanche);
            int escolha = 0;
            try{
                escolha = in.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Escolha um lanche válido!");
            }
            finally {
                in.nextLine();
            }


            switch (escolha) {
                case 1 -> lanche = new XSalada();
                case 2 -> lanche = new XBurguer();
                case 3 -> lanche = new MistoQuente();
                case 4 -> lanche = new HotDog();
                case 5 -> lanche = new MiniPizza();
                case 6 -> lanche = new Pizza();
                default -> System.out.println("Escolha uma opção válida!");
            }

        }

        lanche.montarDetalhesLanche(in);
        System.out.print("Informe o valor do(a) "+lanche.getTipo()+": R$");
        lanche.setValor(in.nextDouble());
        in.nextLine();
        return lanche;

    }


}

// construtor: variável do objeto -> public XBurguer. Java possui um construtor padrão quando o mesmo não é informado
// classe abstrata não pode ser instanciada, define um comportamento genérico para as clases derivadas
// classe derivada complementam o comportamento abstrado das classes, possuem um comportamento específico e podem ser instanciado
