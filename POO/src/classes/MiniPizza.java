package classes;

import java.util.Locale;

public class MiniPizza extends Lanche {


    public boolean borda;
    public String sabor;
    public MiniPizza(){
        this.adicionarIngrediente("Massa");
        this.adicionarIngrediente("Molho de Tomate");
        this.adicionarIngrediente("Calabresa");
        this.adicionarIngrediente("Queijo Mussarela");
        this.adicionarIngrediente("Catupiry");
        this.adicionarIngrediente("Cebola");
        this.adicionarIngrediente("Orégano");

        this.tipo = "Mini Pizza";
    }
    @Override
    public void montarComanda(){
        super.montarComanda();
        if (this.borda){
            System.out.println("-- COM BORDA RECHEADA: " +this.sabor.toUpperCase()+ " --");

        }
    }
}
