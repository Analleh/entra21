public enum ELanche {

    X_SALADA(1,"X-Salada"),
    X_BURGUER(2, "X-Burguer"),
    MISTO_QUENTE(3, "Misto Quente"),
    HOT_DOG(4, "Hot Dog"),
    MINI_PIZZA(5, "Mini Pizza"),
    PIZZA(6,"Pizza");

    private int valorOpção;
    private String descrição;
    ELanche(int valor, String lanche)
    {
        valorOpção = valor;
        this.descrição = lanche;
    }
    public static ELanche getByValorOpcao(int escolha) {
        for (ELanche e : ELanche.values()) {
            if (e.getValorOpção() == escolha) {
                return e;
            }
        }
        return null;
    }

    public int getValorOpção() {
        return valorOpção;
    }

    public void setValorOpção(int valorOpção) {
        this.valorOpção = valorOpção;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }
}
