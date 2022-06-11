package Classes.estante;

import Classes.itens.Item;

import java.util.Locale;

public class Estante {

    private int capMaxima;
    private Item[] item;

    public Estante(int capMaxima){ //O construtor é responsável por criar o objeto
        setCapMaxima(capMaxima);
        setItem(new Item[capMaxima]);
        //TODO
    }

    public boolean estanteCheia(){
        return this.quantidadeItens() == this.getCapMaxima();
    }

    public int quantidadeItens(){
        int contador = 0;
        for (Item i : this.getItem()){
            if (i != null){
                contador++;
            }
        }
        return contador;
    }

    public Item buscarItem(String titulo){
        for (Item i : this.getItem()){
            if ( i != null && i.getTitulo().toLowerCase().contains(titulo.toLowerCase())){
                return i;
            }
        }
        return null;
    }

    public boolean adicionarItem(Item item){
        for( int i = 0; i <this.getItem().length; i++){
            if (this.getItem()[i] == null){
                this.getItem()[i] = item;
                return true;
            }
        }
        return false;
    }

    public Item removerItem(int posicao){
        Item i = this.getItem()[posicao];
        this.getItem()[posicao] = null;
        return i;
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
