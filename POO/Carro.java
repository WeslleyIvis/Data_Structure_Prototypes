public class Carro {
    private String modelo;
    private String marca;
    private boolean ligado;
    private float velocidade;
    private int qtdPortas;

    Carro(String modelo, String marca, int qtdPortas) {
        this.modelo = modelo;
        this.marca = marca;
        this.qtdPortas = qtdPortas;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getQtdPortas() {
        return this.qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

    public void ligar() {
        this.ligado = true;
    }

    public void desligar() {
        this.ligado = false;
    }

    public void acelerar() {
        this.velocidade += 5;
    }

    public void brecar() {
        this.velocidade -= 10;

        if (this.velocidade < 0)
            this.velocidade = 0;
    }

    public void buzinar() {
        System.out.println("Bi Bi");
    }

    public void imprimir() {
        System.out.println("Modelo: " + this.modelo + "\n Marca: " + this.marca + "\n qtdPortas: " + this.qtdPortas);
    }
}
