package Classes.itens;

import java.util.Scanner;

public class Livro extends Item{
    private String autor;
    private int qtdePaginas;
    private int anoPublicacao;
    private int edicao;



    public void setAutor(String autor){
        this.autor = autor;
    }
    public String getAutor(){
        return autor;
    }
    public void setQtdePaginas(int qtdePaginas){
        this.qtdePaginas = qtdePaginas;
    }
    public int getQtdePaginas(){
        return qtdePaginas;
    }
    public void setAnoPublicacao(int anoPublicacao){
        this.anoPublicacao = anoPublicacao;
    }
    public int getAnoPublicacao(){
        return anoPublicacao;
    }
    public void setEdicao(int edicao){
        this.edicao = edicao;
    }
    public int getEdicao(){
        return edicao;
    }

    @Override
    public void montarDetalhes(Scanner in) {
        System.out.println("Informe o autor: ");
        this.setAutor(in.nextLine());
        System.out.println("Informe a quantidade de páginas: ");
        this.setQtdePaginas(in.nextInt());
        System.out.println("Informe o ano de publicação: ");
        this.setAnoPublicacao(in.nextInt());
        System.out.println("Informe a edição: ");
        this.setEdicao(in.nextInt());
        in.nextLine();
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Ator: " + this.getAutor());
        System.out.println("Número de páginas: " + this.getQtdePaginas());
        System.out.println("Ano de publicação: " + getAnoPublicacao());
        System.out.println("Edição: " + getEdicao());

    }


}
