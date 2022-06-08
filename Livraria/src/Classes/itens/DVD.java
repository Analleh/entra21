package Classes.itens;


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
}
