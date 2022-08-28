package Aviao;

import Classes.Assento;

public class AssentoVoo extends Assento {

    private String codigo;
    private ClasseAssentoVoo classe;

    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setClasse(ClasseAssentoVoo classe) {
        this.classe = classe;
    }

    public ClasseAssentoVoo getClasse() {
        return classe;
    }
}
