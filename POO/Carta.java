import java.util.*;

public class Carta {
    // atributos
    private int face;
    private int naipe;
    private boolean visivel;

    // construtores
    public Carta() {
        face = (int) (Math.random() * 13 + 1);
        naipe = (int) (Math.random() * 4);
        visivel = true;
    }

    public Carta(int face, int naipe) {
        if (face >= 1 && face <= 13)
            this.face = face;
        else
            this.face = 1; // um valor padrao
        if (naipe >= 0 && naipe <= 3)
            this.naipe = naipe;
        else
            this.naipe = 0;

        this.visivel = true;
    }

    public void sh(int fa, int na) {
        this.face = fa;
        this.naipe = na;
    }

    // mÃ©todos
    public int getNaipe() {
        return naipe;
    }

    public int getFace() {
        return face;
    }

    public void virarCarta() {
        visivel = !visivel;
    }

    public void imprimir() {
        String carta = "";
        if (face == 1)
            carta = "A";
        else if (face == 11)
            carta = "J";
        else if (face == 12)
            carta = "Q";
        else if (face == 13)
            carta = "K";
        else
            carta += face;

        if (naipe == 0)
            carta += " ouros";
        else if (naipe == 1)
            carta += " espadas";
        else if (naipe == 2)
            carta += " copas";
        else
            carta += " paus";

        if (visivel)
            System.out.println(carta);
        else
            System.out.println("##");
    }

    // Cria todas as cartas do baralho em um vetor de 52 espaços
    public void creatDeckVet(Carta[] array) {
        int aux = 0;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 13; j++) {
                array[aux] = new Carta(j, i);
                aux++;
            }
        }
    }

    // Embaralha as posições do vetor
    public void shuffleDeckVet(Carta[] array) {
        Carta aux;
        for (int i = 0; i < array.length; i++) {
            int random = (int) (Math.random() * array.length);
            aux = array[i];
            array[i] = array[random];
            array[random] = aux;
        }
    }

    // Imprime as cartas do deck
    public void write(Carta[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Face: " + array[i].getFace() + " Naipe: " + array[i].getNaipe());
        }
    }

    // Deck com ArrayList = Vetor dinamico
    public ArrayList<Carta> creatRandomDeck() {
        ArrayList<Carta> array = new ArrayList<Carta>();
        for (int i = 0; i < 52; i++) {
            Carta carta = new Carta();
            boolean ok = true;
            while (ok && array.size() < 52) {
                ok = false;
                for (int j = 0; j < array.size(); j++) {
                    if (carta.face == array.get(j).getFace() && carta.naipe == array.get(j).getNaipe()) {
                        carta = new Carta();
                        ok = true;
                    }
                }
            }
            array.add(carta);
        }
        return array;
    }

    // Organiza as cartas de forma li
    public void sort(ArrayList<Carta> array) {
        int face, naipe;
        boolean ok = true;
        while (ok) {
            ok = false;
            for (int i = 0; i + 1 < array.size(); i++) {
                if (array.get(i).getFace() > array.get(i + 1).getFace()) {
                    face = array.get(i).getFace();
                    naipe = array.get(i).getNaipe();
                    array.get(i).sh(array.get(i + 1).getFace(), array.get(i + 1).getNaipe());
                    array.get(i + 1).sh(face, naipe);
                    ok = true;
                }
            }
        }

        array.forEach((e) -> {
            e.imprimir();
        });
    }
}
