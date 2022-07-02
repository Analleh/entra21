package Classes.itens;

import Classes.avaliacao.Avalicao;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class  Item {

    private String titulo;
    private String genero;
    private double valor;

    private ArrayList<Avalicao> avaliacoes = new ArrayList<>();

    public void avaliar() {
        Scanner in = new Scanner(System.in);
        Avalicao a = new Avalicao();
        System.out.println("Informe o nome do avaliador:");
        a.setNome(in.nextLine());
        System.out.println("Informe uma nota de 0 a 10:");
        a.setRating(in.nextDouble());
        in.nextLine();
        System.out.println("Informe algum feedback (opcional): ");
        a.setFeedback(in.nextLine());
        this.avaliacoes.add(a);
    }

    public double getTotalRating() {

//        for (Avalicao a : getAvaliacoes()){
//            soma += a.getRating();
//        }
        return this.avaliacoes.stream().mapToDouble(Avalicao::getRating).sum() / this.avaliacoes.size();

    }

    public abstract void montarDetalhes(Scanner in);

    public abstract void mostrarDetalhes();

    //getters e setters

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setAvaliacoes(ArrayList<Avalicao> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    public ArrayList<Avalicao> getAvaliacoes() {
        return avaliacoes;
    }

}
