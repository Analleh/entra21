package Aviao;

import Classes.Assento;

public class AssentoVoo extends Assento {

    private String codigo;
    private String classe;

    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getClasse() {
        return classe;
    }
}
