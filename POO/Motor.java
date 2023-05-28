public class Motor {
    private double diametro;
    private String cor;
    private int potencia;

    public Motor(int diametro) {
        this.cor = "Vermelho";
        this.diametro = diametro;
    }

    public void Ligar() {
        this.cor = "Verde";
    }

    public String Desligar() {
        this.cor = "Vermelho";
        return cor;
    }

    public String toString() {
        return "Diametro: " + this.diametro + "\nCor: " + this.cor + "\nPotencia: " + this.potencia;
    }
}
