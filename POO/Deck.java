import java.util.ArrayList;

public class Deck {

    private ArrayList<Carta> deck;

    public Deck() {
        deck = new ArrayList<Carta>();
    }

    public boolean isEmpty() {
        return deck.size() == 0;
    }

    public void getDeck() {
        System.out.println(deck);
    }

    public ArrayList<Carta> gerarBaralho(int qtd) {
        int aux = 0;
        while (aux < qtd) {
            for (int i = 1; i <= 4; i++) {
                for (int j = 1; j <= 13; j++) {
                    deck.add(new Carta(j, i));
                }
            }
            aux++;
        }
        return deck;
    }

    public void embaralhar() {
        if (!isEmpty()) {
            Carta aux;
            for (int i = 0; i < deck.size(); i++) {
                int random = (int) (Math.random() * (deck.size() - 1));
                aux = deck.get(i);
                deck.set(i, deck.get(random));
                deck.set(random, aux);
            }
        }
    }

    public Carta darCarta() {
        int random = (int) (Math.random() * (deck.size() - 1));
        if (!isEmpty())
            return deck.remove(random);
        else
            return null;
    }

    public void imprimirBaralho() {
        for (Carta carta : deck) {
            System.out.println(carta.getNaipe() + " - " + carta.getFace());
        }
    }

    public String imprimirCarta(Carta carta) {
        String valor = "";

        if (carta.getFace() == 1)
            valor += "A";
        else if (carta.getFace() == 11)
            valor += "J";
        else if (carta.getFace() == 12)
            valor += "Q";
        else if (carta.getFace() == 13)
            valor += "K";
        else
            valor += carta.getFace();

        if (carta.getNaipe() == 1)
            valor += " Ouros";
        else if (carta.getNaipe() == 2)
            valor += " Espadas";
        else if (carta.getNaipe() == 3)
            valor += " Copas";
        else
            valor += " Paus";

        return valor;
    }
}
