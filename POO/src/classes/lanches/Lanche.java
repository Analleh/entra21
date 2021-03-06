package classes.lanches;

public abstract class Lanche {
    private String[] ingredientes = new String[10];
    private double valor;
    private String tipo;


    public void adicionarIngrediente(String ingrediente){
        for (int i = 0;i < 10; i++){
            if (this.ingredientes[i] == null){
                this.ingredientes[i] = ingrediente;
                break;
            }
        }
    }
    public abstract void mostrarDetalhesComanda(); // Força todas as classes que "extends" de lanche a ter este método

    //getter e setter
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getTipo(){
        return this.tipo;
    }
    public void setValor(double valor){
        this.valor = valor;
    }
    public double getValor(){
        return this.valor;
    }
    public void setIngredientes(String[] ingredientes){
        this.ingredientes = ingredientes;
    }
    public String[] getIngredientes(){
        return ingredientes;
    }
}
