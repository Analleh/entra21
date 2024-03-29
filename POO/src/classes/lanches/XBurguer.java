package classes.lanches;

import java.util.Scanner;

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
        super.mostrarDetalhesComanda();
        if (this.isAberto()) {
            System.out.println("-- LANCHE ABERTO --");
        }
    }

    @Override
    public void montarDetalhesLanche(Scanner in) {
        super.montarDetalhesLanche(in);
        System.out.println("Lanche aberto? (S/N)");
        String aberto = in.nextLine();
        this.setAberto(aberto.equalsIgnoreCase("S"));
    }
}
