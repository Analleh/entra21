package Classes.estante;

import Classes.itens.Item;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Map;

public class Estante {

//    LocalDate date = null;
//    LocalTime time = null;
//    LocalDateTime dateTime= null;

    private int capMaxima;
    private ArrayList<Item> item = new ArrayList<>();

    public Estante(int capMaxima){ //O construtor é responsável por criar o objeto
        setCapMaxima(capMaxima);


    }

    public boolean estanteCheia(){
        return this.quantidadeItens() == this.getCapMaxima();
    }

    public int quantidadeItens(){
        return this.item.size();
    }

    public Item buscarItem(String titulo){
        for (Item i : this.getItem()){
            if ( i .getTitulo().toLowerCase().contains(titulo.toLowerCase())){
                return i;
            }
        }
        return null;

        //return this.item.stream().filter(i -> i.getTitulo().equalsIgnoreCase(titulo)).findFirst().orElse(null);  - lambda
    }

    public boolean adicionarItem(Item item){

        if (!estanteCheia()){
            this.item.add(item);
            return true;
        }

        return false;
    }

    public Item removerItem(int posicao){
        return  this.item.remove(posicao);
    }

    //getters e setter


    public ArrayList<Item> getItem() {
        return item;
    }

    public void setItem(ArrayList<Item> item) {
        this.item = item;
    }

    public void setCapMaxima(int capMaxima) {
        this.capMaxima = capMaxima;
    }
    public int getCapMaxima() {
        return capMaxima;
    }



}
