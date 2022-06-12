package Classes.itens;

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

}
