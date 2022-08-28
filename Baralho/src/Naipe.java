public enum Naipe {
    PAUS("♣"),
    OURO("♦"),
    ESPADA("♠"),
    COPAS("♥");
public String nomeNaipe;
Naipe(String nome){
    nomeNaipe = nome;
} // pode colocar o private na frente mas não é necessário

    public String getNomeNaipe() {
        return nomeNaipe;
    }

    public void setNomeNaipe(String nomeNaipe) {
        this.nomeNaipe = nomeNaipe;
    }
}
