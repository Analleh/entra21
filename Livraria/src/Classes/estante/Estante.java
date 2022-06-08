package Classes.estante;

import Classes.itens.Item;

public class Estante {

    private int capMaxima;
    private Item[] item;


    public Estante(int capMaxima){ //O construtor é responsável por criar o objeto
        setCapMaxima(capMaxima);
        setItem(new Item[capMaxima]);
        //TODO
    }

    public boolean estanteCheia(){
        return quantidadeItens() == capMaxima;
    }

    public int quantidadeItens(){
        //TODO
        return 0;
    }

    public Item buscarItem(String titulo){
        //TODO
        return null;
    }

    public boolean adicionarItem(Item item){
        //TODO
        return false;
    }

    public Item removerItem(int posicao){
        //TODO
        return null;
    }

    //getters e setter

    public void setItem(Item[] item) {
        this.item = item;
    }
    public Item[] getItem() {
        return item;
    }

    public void setCapMaxima(int capMaxima) {
        this.capMaxima = capMaxima;
    }
    public int getCapMaxima() {
        return capMaxima;
    }


}
