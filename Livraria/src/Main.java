import Classes.estante.Estante;
import Classes.itens.DVD;
import Classes.itens.Item;
import Classes.itens.Livro;

import java.util.Scanner;

public class Main {

    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        Estante e = new Estante(5);
        boolean loop = true;





    }

    public static void adicionarItem(Estante e) {
        if(e.estanteCheia()){
            System.out.println("Sua estante está cheia! Não é possivel adicionar mais um item");
        }
        else{
            Item i = null;
            int escolha = -1;
            while (escolha < 0 || escolha > 1){
                System.out.println("Informe o item que deseja adicionar (0 - Livro / 1 - DVD");
                escolha = in.nextInt();
                if (escolha < 0 || escolha > 1){
                    System.err.println("selecione uma opção válida");
                }
            }
            in.nextLine();
            if(escolha == 0){
                i = new Livro();
            }
            else {
                i = new DVD();
            }
            System.out.println("Informe o título:");
            i.setTitulo(in.nextLine());
            System.out.println("Informe o gênero:");
            i.setGenero(in.nextLine());
            System.out.println("Informe o valor: R$");
            i.setValor(in.nextDouble());
            in.nextLine();

            if (i instanceof Livro){
                Livro l = ((Livro) i);
                System.out.println("Informe o autor: ");
                l.setAutor(in.nextLine());
                System.out.println("Informe a quantidade de páginas: ");
                l.setQtdePaginas(in.nextInt());
                System.out.println("Informe o ano de publicação: ");
                l.setAnoPublicacao(in.nextInt());
                System.out.println("Informe a edição: ");
                l.setEdicao(in.nextInt());
                in.nextLine();
            }

            else{
                DVD dvd = ((DVD)i);
                System.out.println("Informe o diretor: ");
                dvd.setDiretor(in.nextLine());
                System.out.println("Informe o gênero: ");
                dvd.setGenero(in.nextLine());
                System.out.println("Informe o tempo de duração:");
                dvd.setDuracao(in.nextDouble());
                in.nextLine();
            }
            if(!e.adicionarItem(i)){
                System.err.println("Não foi possível adicionar o item na estante!");
            }
            else {
                System.out.println("Item adicionado com sucesso");
            }
        }


    }
    public static void buscarItem(){

    }

    public static void removerItem(){

    }
    public static void mostrarItens(){

    }
}


