import Classes.Loja;
import Classes.estante.EMenu;
import Classes.estante.EMenuItem;
import Classes.estante.Estante;
import Classes.estante.IMenu;
import Classes.itens.DVD;
import Classes.itens.Item;
import Classes.itens.Livro;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static Scanner in = new Scanner(System.in);

    static Loja loja = new Loja();

    public static void main(String[] args) {
        boolean loop = true;
        while (loop) {
            EMenu opcao = (EMenu) escolherOpcao(null);
            switch (opcao) {
                case SAIR -> loop = false;
                case ADICIONAR_ITEM -> adicionarItem();
                case BUSCAR_ITEM -> buscarItemETratarRetorno();
                case REMOVER_ITEM -> removerItem();
                case MOSTRAR_ITENS -> mostrarItens();
                case ADICIONAR_ESTANTE -> adicionarEstante();
                default -> System.out.println("Opção não implementada!");
            }
            System.out.println();
        }
        System.out.println("Programa finalizado!");
    }
    private static void adicionarEstante() {
        while (true) {
            System.out.print("Informe um identificador: ");
            String id = in.nextLine().toLowerCase();
            if (loja.getEstantes().containsKey(id)) {
                System.out.println("Identificador já utilizado!");
            } else {
                System.out.print("Informe a capacidade máxima da estante: ");
                loja.getEstantes().put(id, new Estante(in.nextInt()));
                in.nextLine();
                break;
            }
        }
    }

    public static IMenu escolherOpcao(Item item) {
        IMenu escolha = null;
        while (escolha == null) {
            if (item != null) {
                while (escolha == null) {
                    System.out.println(item.getTitulo()+ " encontrado! Ações disponíveis: ");
                    for(EMenuItem i : EMenuItem.values()) {
                        System.out.printf("(%d) %s\n", i.getValorOpcao(), i.getDescricao());
                    }
                    escolha = EMenuItem.getByValorOpcao(in.nextInt());
                    if (escolha == null) {
                        System.err.println("Selecione uma opção válida");
                    }
                }
            } else {
                System.out.println("Selecione uma opção");
                for (EMenu menu : EMenu.values()) {
                    System.out.printf("(%d) - %s\n", menu.getValorOpcao(), menu.getDescricao());
                }
                escolha = EMenu.getByValorOpcao(in.nextInt());
            }
            in.nextLine();
            if (escolha == null) {
                System.err.println("Selecione uma opção válida!");
            }
        }
        return escolha;
    }

    public static void adicionarItem() {
        if (loja.estanteCheia()) {
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
            i.montarDetalhes(in);
            if(!loja.adicionarItem(i)){
                System.err.println("Não foi possível adicionar o item na estante!");
            }
            else{
                System.out.println("Item adicionado com sucesso!");
            }
        }
    }


    public static void buscarItemETratarRetorno() {
        System.out.print("Informe o título para busca: ");
        Item i = e.buscarItem(in.nextLine());
        if (i == null) {
            System.err.println("O título buscado não existe na estante!");
        } else {
            EMenuItem escolha = (EMenuItem) escolherOpcao(i);
            switch (escolha) {
                case SAIR -> System.out.println("Retornando...");
                case VER_AVALIACOES -> mostarAvaliacoes(i);
                case AVALIAR_ITEM -> i.avaliar();
                case MOSTRAR_DETALHES -> {
                    System.out.println("Título: "+i.getTitulo());
                    System.out.println("Gênero: "+i.getGenero());
                    i.mostrarDetalhes();
                    System.out.printf("Valor: R$%.2f\n", i.getValor());
                }
                default -> System.out.println("Opção não implementada");
            }
        }
    }


    public static void mostarAvaliacoes(Item i) {
        i.getAvaliacoes().forEach(a -> {
            System.out.println("Data da Avaliação" + a.getDataAvaliação().format(DateTimeFormatter.ofPattern("dd/MM/yyyy '\nHora da Avaliação: ' HH:mm:ss")));
            System.out.println("Autor: "+a.getNome());
            System.out.println("avaliação: "+a.getRating());
            System.out.println("Comentário: ");
            System.out.println(a.getFeedback());
            System.out.println("--------------------");
        });
        System.out.println("Classificação final: "+i.getTotalRating());

    }


    public static void removerItem() {
        if (e.quantidadeItens() == 0) {
            System.err.println("Não é possível remover itens de uma estante vazia!");
        } else {
            int posicao = -1;
            while(posicao < 0 || posicao > e.quantidadeItens()) {
                System.out.print("Informe a posição do item para remover: ");
                posicao = in.nextInt();
                if (posicao < 0 || posicao > e.quantidadeItens()) {
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

    public static void mostrarItens() {
        if (e.quantidadeItens() == 0) {
            System.out.println("Estante vazia!");
        } else {
            for (int i = 0; i < e.quantidadeItens(); i++) {
                Item item = e.getItem().get(i);
                if (item != null) {
                    System.out.println("[" + i + "] " + item.getTitulo() + " (" + item.getGenero() + ")");
                }
            }
        }
    }


}
// coesão : ele faz o que tem que fazer. Cada método executa aquilo que deve executar

