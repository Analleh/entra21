package classes.lanches;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Lanche {
    public static Scanner in = new Scanner(System.in);
    private ArrayList<String> ingredientes= new ArrayList<>();
    private double valor;
    private String tipo;


    public void adicionarIngrediente(String ingrediente){
      this.ingredientes.add(ingrediente);
    }
    public abstract void mostrarDetalhesComanda();


    public abstract void montarDetalhesLanche(Scanner in);
// Força todas as classes que "extends" de lanche a ter este método

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

    public ArrayList<String> getIngredientes(){
        return ingredientes;
    }
}
