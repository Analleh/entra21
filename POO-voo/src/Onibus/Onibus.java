package Onibus;

import Classes.Assento;
import Classes.MeiodeTransporte;

import java.util.ArrayList;

public class Onibus implements MeiodeTransporte {
    private ArrayList<AssentoOnibus> assentos = new ArrayList<>();


    private boolean leito;

    public Onibus(int linhasCadeiras){

        for(int i = 1; i <= 4*linhasCadeiras; i++){
            AssentoOnibus a = new AssentoOnibus();
            a.setLugar(String.valueOf(i));
            assentos.add(a);
        }


    }

    @Override
    public boolean verificaOcupação(String verifica) {
        for (AssentoOnibus o : assentos){
            if(o.getLugar().equalsIgnoreCase(verifica)){
                return o.isOcupado();
            }
        }
        return false;
    }

    @Override
    public int quantidadeLivre() {
        int qtdLivreOni =0;
        for (AssentoOnibus o : this.assentos){
            if(!o.isOcupado()){
                qtdLivreOni++;
            }
        }
        return qtdLivreOni;
    }

    @Override
    public void mostrarAssento() {
        for (int i = 0; i < this.assentos.size();i++){
            if(this.assentos.get(i).isOcupado()){
                System.out.print("[XX]  ");
            }
            else {
                if ((i+1) < 10){
                    System.out.print("[0" +assentos.get(i).getLugar() + "]  ");
                }
                else{
                    System.out.print("[" +assentos.get(i).getLugar() + "]  ");
                }
            }

            if((i+1)%4 == 0){
                System.out.println();
            }
            else if((i+1)%2 == 0){
                System.out.print("||  ");
            }
        }

    }

    @Override
    public Assento getAssento(String assentos) {
        for (AssentoOnibus o : this.assentos){
            if (o.getLugar().equalsIgnoreCase(assentos)){
                return o;
            }
        }
        return null;
    }
}
