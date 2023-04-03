import java.util.*;

public class MainClass {
    public static void main(String[] args) {
        ArrayList<Carta> baralho = new ArrayList<Carta>();
        baralho.add(new Carta());
        for (int i = 0; i < 52; i++) {
            Carta carta = new Carta();
            boolean ok = true;
            while (ok && baralho.size() < 52) {
                ok = false;
                for (int j = 0; j < baralho.size(); j++) {
                    if (carta.getFace() == baralho.get(j).getFace() && carta.getNaipe() == baralho.get(j).getNaipe()) {
                        carta = new Carta();
                        ok = true;
                    }
                }
            }
            baralho.add(carta);
        }
        sort(baralho);
    }

    static void sort(ArrayList<Carta> array) {
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
