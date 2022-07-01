import java.util.ArrayList;

public class Jogo {
    private ArrayList<Carta> handPlayer = new ArrayList<>();
    private ArrayList<Carta> handCPU = new ArrayList<>();
    private Baralho deck;
    private int playerwins;

    public void firstRound(){

    }
    public void handlePlayerOption(){

    }
    public void playerWin(){

    }public void oneMore(){

    }
    public void stop(){

    }
    public void doubleCard(){

    }

    //getters and setters

    public ArrayList<Carta> getHandPlayer() {
        return handPlayer;
    }

    public void setHandPlayer(ArrayList<Carta> handPlayer) {
        this.handPlayer = handPlayer;
    }

    public ArrayList<Carta> getHandCPU() {
        return handCPU;
    }

    public void setHandCPU(ArrayList<Carta> handCPU) {
        this.handCPU = handCPU;
    }

    public Baralho getDeck() {
        return deck;
    }

    public void setDeck(Baralho deck) {
        this.deck = deck;
    }

    public int getPlayerwins() {
        return playerwins;
    }

    public void setPlayerwins(int playerwins) {
        this.playerwins = playerwins;
    }
}
