package Classes.itens;

import Classes.avaliacao.Avalicao;

import java.util.Scanner;

public abstract class  Item {

    private String titulo;
    private String genero;
    private double valor;

    private Avalicao[] avaliacoes = new Avalicao[30];

    public void avaliar(){
        Scanner in = new Scanner(System.in);
        Avalicao a = new Avalicao();
        System.out.println("Informe o nome do avaliador:");
        a.setNome(in.nextLine());
        System.out.println("Informe uma nota de 0 a 10:");
        a.setRating(in.nextDouble());
        in.nextLine();
        System.out.println("Informe algum feedback (opcional): ");
        a.setFeedback(in.nextLine());

        for (int i = 0; i < this.getAvaliacoes().length; i++){
            if (this.getAvaliacoes()[i] == null){
                this.getAvaliacoes()[i] = a;
                break;
            }
        }
    }
    public double getTotalRating(){
        double soma = 0;
        int contador =0;

        for (Avalicao a : getAvaliacoes()){
            if (a != null){
                soma += a.getRating();
                contador ++;
            }

        }
        return soma/contador;
    }

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

    public void setAvaliacoes(Avalicao[] avaliacoes) {
        this.avaliacoes = avaliacoes;
    }
    public Avalicao[] getAvaliacoes() {
        return avaliacoes;
    }


}
