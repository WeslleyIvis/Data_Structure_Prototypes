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

}
