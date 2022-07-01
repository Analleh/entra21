import java.util.ArrayList;
import java.util.Collections;

public class Baralho {

    ArrayList<Carta> cartas = new ArrayList<>();
    Baralho(){
        int valorNaipe =1;
        for (ValorCarta vc : ValorCarta.values()){

        }
    }
    private Carta carta;

    public void shuffle(){
        Collections.shuffle(this.cartas);

    }
    public Carta getFromTop(){
        return this.cartas.remove(0);
    }
    public Carta getFromBottom(){
        return this.cartas.remove(this.cartas.size()-1);
    }
    public Carta searchCard (Naipe naipe, ValorCarta valorCarta){
        return null;
    }
    public Carta searchCard (Naipe naipe, int valorReal){
        return null;
    }
}
