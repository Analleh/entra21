package classes.pedidos;

import classes.lanches.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Pedido {

    private ArrayList<Lanche> lanches = new ArrayList<>();
    private LocalDateTime dataPedido = LocalDateTime.now();

    public void imprimirComanda() {
        System.out.println("Data do pedido: " + dataPedido.format(DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm:ss")));
        for (Lanche l : this.getLanches()) {
            System.out.println("......................................");
            l.mostrarDetalhesComanda();
            System.out.println("-INGREDIENTES-");
            for (String ingrediente : l.getIngredientes()) {
                System.out.println(ingrediente);
            }
            System.out.printf("Valor: R$%.2f\n", l.getValor());
        }
        System.out.println("......................................");
        System.out.printf("Valor total do pedido: R$%.2f\n", this.calcularValorTotal());
        System.out.println("------------------------------------");
    }

    public double calcularValorTotal() {
        double vlrTotal = 0;
        for (Lanche l : this.getLanches()) {
            vlrTotal += l.getValor();
        }
        return vlrTotal;
    }

    public void setLanches(ArrayList<Lanche> lanches) {
        this.lanches = lanches;
    }

    public LocalDateTime getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(LocalDateTime dataPedido) {
        this.dataPedido = dataPedido;
    }

    public void adicionarLanche(Lanche lanche) {
        this.lanches.add(lanche);
    }

    public ArrayList<Lanche> getLanches() {
        return this.lanches;
    }
}
// Agregação - relacionamento tem um. e o objeto composto apenas usa ou tem conhecimento da existência do(s)
//objeto(s) componente(s) os objetos componentes podem existir sem o agregado e vice-versa.

// Composição - relacionamento é parte. Forma de associação em que o objeto composto é responsável pela existência dos componentes
//O componente não tem sentido fora da composição.

// Herança - é um

// métodos ficam dentro da classe, não dentro de outros métodos