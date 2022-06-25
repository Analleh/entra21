package Classes;

public abstract class Assento {

    private boolean ocupado;
    private double valor;

    public void ocupar(){
        this.setOcupado(true);

    }

    //getter e setter


    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}
