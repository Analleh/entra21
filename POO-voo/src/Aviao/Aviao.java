package Aviao;

import Classes.Assento;
import Classes.MeiodeTransporte;
import Onibus.Onibus;

import java.util.ArrayList;

public class Aviao implements MeiodeTransporte {
    private ArrayList<AssentoVoo> assentos = new ArrayList<>();

    public Aviao(int linhasCadeirasLuxo, int linhasCadeirasEconomicas){

        for (int i = 1; i <= 4*linhasCadeirasLuxo; i++){
            AssentoVoo luxo = new AssentoVoo();
            luxo.setClasse("LUXO");
            assentos.add(luxo);

        }
        for (int i =1; i <= 6*linhasCadeirasEconomicas;i++){
            AssentoVoo economica = new AssentoVoo();
            economica.setClasse("ECONÔMICA");
            assentos.add(economica);
        }

    }

    @Override
    public boolean verificaOcupação(String verifica) {
        for(AssentoVoo a : this.assentos){
            if(a.getCodigo().equalsIgnoreCase(verifica)){
                return a.isOcupado();
            }
        }
        return false;

    }

    @Override
    public int quantidadeLivre() {
        int qtdLivreAvi =0;
        for (AssentoVoo a : this.assentos){
            if(!a.isOcupado()){
                qtdLivreAvi++;
            }
        }
        return qtdLivreAvi;
    }

    @Override
    public void mostrarAssento() {

    }

    @Override
    public Assento getAssento(String assento){
        for (AssentoVoo a : this.assentos){
            if(a.getCodigo().equalsIgnoreCase(assento));
            return a;
        }
       return null;
    }

    public Assento getAssento(String assento,String classe) {
       for (AssentoVoo a : this.assentos){
           if (a.getCodigo().equalsIgnoreCase(assento) && a.getClasse().equalsIgnoreCase(classe)){
               return a;
           }
       }
        return null;
    }
}
