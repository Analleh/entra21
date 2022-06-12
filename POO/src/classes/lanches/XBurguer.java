package classes.lanches;

public class XBurguer extends Sanduiche{

    private boolean aberto;


    public XBurguer(){
        this.adicionarIngrediente("Hamburguer");
        this.adicionarIngrediente("Queijo");
        this.adicionarIngrediente("Presunto");
        this.adicionarIngrediente("Pão");
        this.setTipo("XBurguer");

    }


    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public boolean isAberto() {
        return this.aberto;
    }


    @Override
    public void mostrarDetalhesComanda() {

    }
}
