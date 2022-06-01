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

    @Override
    public void montarComanda(){
        super.montarComanda();
        if (this.aberto){
            System.out.println("-- LANCHE ABERTO --");
        }
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public boolean isAberto() {
        return this.aberto;
    }
}
