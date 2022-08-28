import Aviao.Voo;
import Onibus.Onibus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Onibus onibus = new Onibus(4);
        onibus.getAssento("2").ocupar();
        onibus.mostrarAssento();
    }
}
