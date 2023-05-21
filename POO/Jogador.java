import java.util.ArrayList;

public class Jogador {
    private ArrayList<Carta> mao;

    public Jogador() {
        mao = new ArrayList<Carta>();
    }

    public boolean isEmpty() {
        return mao.size() == 0;
    }

    public ArrayList<Carta> getMao() {
        return mao;
    }

    public void setMao(ArrayList<Carta> carta) {
        this.mao = carta;
    }

    public void comprarCarta(Carta carta) {
        mao.add(carta);
    }

    public String imprimirMao() {
        if (!isEmpty()) {
            String valor = "";

            for (int i = 0; i < mao.size(); i++) {
                if (mao.get(i).getFace() == 1)
                    valor += "A";
                else if (mao.get(i).getFace() == 11)
                    valor += "J";
                else if (mao.get(i).getFace() == 12)
                    valor += "Q";
                else if (mao.get(i).getFace() == 13)
                    valor += "K";
                else
                    valor += mao.get(i).getFace();

                if (mao.get(i).getNaipe() == 1)
                    valor += " Ouros";
                else if (mao.get(i).getNaipe() == 2)
                    valor += " Espadas";
                else if (mao.get(i).getNaipe() == 3)
                    valor += " Copas";
                else
                    valor += " Paus";

                valor += "\n";
            }

            return valor;
        } else
            return "";
    }

    public int valorDaMao() {
        if (!isEmpty()) {
            int value = 0;
            for (Carta carta : mao) {
                value += carta.getFace();
            }
            return value;
        } else
            return -1;
    }
}
