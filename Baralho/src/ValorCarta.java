public enum ValorCarta {
    A("1"),
    dois("2"),
    tres("3"),
    quatro("4"),
    cinco("5"),
    seis("6"),
    sete("7"),
    oito("8"),
    nove("9"),
    dez("10"),
    J("11"),
    Q("12"),
    K("13");

    public String valorCarta;
    ValorCarta (String valor){ // pode colocar o private na frente mas não é necessário
        valorCarta = valor;
    }

    public String getValorCarta() {
        return valorCarta;
    }

    public void setValorCarta(String valorCarta) {
        this.valorCarta = valorCarta;
    }
}
