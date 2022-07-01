import Classes.avaliacao.Avalicao;
import Classes.estante.Estante;
import Classes.itens.DVD;
import Classes.itens.Item;
import Classes.itens.Livro;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static Scanner in = new Scanner(System.in);
    public static Estante e = new Estante(5);

    public static void main(String[] args) {

    }

    public static void adicionarItem(Estante e) {
        if (e.estanteCheia()) {
            System.out.println("Sua estante está cheia! Não é possivel adicionar mais um item");
        } else {
            Item i = null;
            int escolha = -1;
            while (escolha < 0 || escolha > 1) {
                System.out.println("Informe o item que deseja adicionar (0 - Livro / 1 - DVD");
                escolha = in.nextInt();
                if (escolha < 0 || escolha > 1) {
                    System.err.println("selecione uma opção válida");
                }
            }
            in.nextLine();
            if (escolha == 0) {
                i = new Livro();
            } else {
                i = new DVD();
            }
            System.out.println("Informe o título:");
            i.setTitulo(in.nextLine());
            System.out.println("Informe o gênero:");
            i.setGenero(in.nextLine());
            System.out.println("Informe o valor: R$");
            i.setValor(in.nextDouble());
            in.nextLine();

            if (i instanceof Livro) {
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
            } else {
                DVD dvd = ((DVD) i);
                System.out.println("Informe o diretor: ");
                dvd.setDiretor(in.nextLine());
                System.out.println("Informe o gênero: ");
                dvd.setGenero(in.nextLine());
                System.out.println("Informe o tempo de duração:");
                dvd.setDuracao(in.nextDouble());
                in.nextLine();
            }
            if (!e.adicionarItem(i)) {
                System.err.println("Não foi possível adicionar o item na estante!");
            } else {
                System.out.println("Item adicionado com sucesso");
            }
        }
    }


    public static void buscarItem() {

        System.out.print("Informe o título da obra: ");
        String titulo = in.nextLine();
        int contador = 1;
        for (Item i : e.getItem()) {
            if (i != null && i.getTitulo().toLowerCase().contains(titulo.toLowerCase())) {
                System.out.println("------------------------");
                System.out.println("Posição na estante: " + contador);
                System.out.println("Título: " + i.getTitulo());
                System.out.println("Gênero: " + i.getGenero());
                System.out.println("Valor: R$" + i.getValor());
                if (i instanceof DVD) {
                    System.out.print("Ano de lançamento: ");
                    System.out.println(((DVD) i).getAnoLancamento());
                    System.out.print("Diretor: ");
                    System.out.println(((DVD) i).getDiretor());
                    System.out.print("Duração: ");
                    System.out.println(((DVD) i).getDuracao());
                } else if (i instanceof Livro) {
                    System.out.print("Autor: ");
                    System.out.println(((Livro) i).getAutor());
                    System.out.print("Ano de publicação: ");
                    System.out.println(((Livro) i).getAnoPublicacao());
                    System.out.print("Quantidade de Páginas: ");
                    System.out.println(((Livro) i).getQtdePaginas());
                    System.out.print("Edição: ");
                    System.out.println(((Livro) i).getEdicao());
                }
                System.out.println("------------------------");
                System.out.println("(1) Avaliar '" + i.getTitulo() + "'");
                System.out.println("(2) Ver as avaliações de '" + i.getTitulo() + "'");
                System.out.println("(3) Voltar ao menu");
                System.out.print("Escolha: ");
                int escolha = in.nextInt();
                in.nextLine();
                if (escolha == 1) {
                    i.avaliar();
                    break;
                } else if (escolha == 2) {
                    i.getAvaliacoes();
                    break;
                } else {
                    break;
                }
            }
            contador++;
        }
        if (contador == 5) {
            System.out.println("Item não encontrado!");
        }

    }
    public static void mostarAvaliacoes(Item i) {
        for (Avalicao a : i.getAvaliacoes()) {
            if (a != null) {
                System.out.println("Autor: "+a.getNome());
                System.out.println("avaliação: "+a.getRating());
                System.out.println("Comentário: ");
                System.out.println(a.getFeedback());
                System.out.println("--------------------");
            }
        }
        System.out.println("Classificação final: "+i.getTotalRating());
    }

    public static void removerItem() {
        if (e.quantidadeItens() == 0) {
            System.err.println("Não é possível remover itens de uma estante vazia!");
        } else {
            int posicao = -1;
            while(posicao < 0 || posicao > e.getCapMaxima()) {
                System.out.print("Informe a posição do item para remover: ");
                posicao = in.nextInt();
                if (posicao < 0 || posicao > e.getCapMaxima()) {
                    System.err.println("Selecione uma opção válida!");
                }
            }
            in.nextLine();
            Item i = e.removerItem(posicao);
            if (i != null) {
                System.out.println("Item "+i.getTitulo()+" removido!");
            }
        }
    }

    public static void mostrarItens(Estante e) {
        if (e.quantidadeItens() == 0) {
            System.out.println("Estante vazia!");
        } else {
            for (int i = 0; i < e.getCapMaxima(); i++) {
                Item item = e.getItens()[i];
                if (item != null) {
                    System.out.println("[" + i + "] " + item.getTitulo() + " (" + item.getGenero() + ")");
                }
            }
        }
    }


}


