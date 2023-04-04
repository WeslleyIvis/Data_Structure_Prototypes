import java.util.*;

public class MainClass {
    public static void main(String[] args) {
        ArrayList<Carta> baralho = new ArrayList<Carta>();
        Carta[] deck = new Carta[52];

        Carta carta = new Carta();
        // baralho = carta.creatRandomDeck();

        carta.creatDeckVet(deck);
        carta.shuffleDeckVet(deck);
        carta.write(deck);
        // carta.sort(baralho);

    }

}
