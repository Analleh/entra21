package Aviao;

import Classes.Assento;
import Classes.MeiodeTransporte;
import Onibus.Onibus;

import java.util.ArrayList;

public class Aviao implements MeiodeTransporte {
    private ArrayList<AssentoVoo> assentos = new ArrayList<>();
    public ArrayList<AssentoVoo> getAssentos() {
        return assentos;
    }

    public void setAssentos(ArrayList<AssentoVoo> assentos) {
        this.assentos = assentos;
    }

    public Aviao(int linhasCadeirasLuxo, int linhasCadeirasEconomicas){

//        String codigoAssentos = "ABCD";
//        for (int i = 1; i <= 4*linhasCadeirasLuxo; i++){
//            AssentoVoo luxo = new AssentoVoo();
//            luxo.setClasse(ClasseAssentoVoo.LUXO);
//            assentos.add(luxo);
        String codigoAssentos = "ABCD";
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < linhasCadeirasLuxo; j++) {
                AssentoVoo a = new AssentoVoo();
                a.setCodigo(String.valueOf(codigoAssentos.charAt(i))+j);
                a.setClasse(ClasseAssentoVoo.LUXO);
                assentos.add(a);
            }

        }
//        for (int i =1; i <= 6*linhasCadeirasEconomicas;i++){
//            AssentoVoo economica = new AssentoVoo();
//            economica.setClasse(ClasseAssentoVoo.ECONOMICA);
//            assentos.add(economica);
//        }
        codigoAssentos = "ABCDEF";
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < linhasCadeirasEconomicas; j++) {
                AssentoVoo a = new AssentoVoo();
                a.setCodigo(String.valueOf(codigoAssentos.charAt(i))+j);
                a.setClasse(ClasseAssentoVoo.ECONOMICA);
                assentos.add(a);
            }
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
           if (a.getCodigo().equalsIgnoreCase(assento) && a.getClasse().equals(classe)){
               return a;
           }
       }
        return null;
    }


}
