package Classes.itens;


import java.util.Scanner;

public class DVD extends Item {
    private String diretor;
    private double duracao;
    private int anoLancamento;

    // getters e setters

    public void setDiretor(String diretor){
        this.diretor = diretor;
    }
    public String getDiretor(){
        return diretor;
    }

    public void setDuracao(double duracao){
        this.duracao = duracao;
    }
    public double getDuracao(){
        return duracao;
    }

    public void setAnoLancamento(int anoLancamento){
        this.anoLancamento = anoLancamento;
    }
    public int getAnoLancamento(){
        return anoLancamento;
    }

    @Override
    public void montarDetalhes(Scanner in) {
        System.out.println("Informe o diretor: ");
        this.setDiretor(in.nextLine());
        System.out.println("Informe o gênero: ");
        this.setGenero(in.nextLine());
        System.out.println("Informe o tempo de duração:");
        this.setDuracao(in.nextDouble());
        in.nextLine();
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Ano de lançamento" + getAnoLancamento());
        System.out.println("Diretor; "+ getDiretor());
        System.out.println("Gênero: "+ getGenero());
        System.out.println("Tempo de Duração: "+ getDuracao());

    }
}
