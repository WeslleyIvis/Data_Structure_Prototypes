class Televisao {
    int canal;
    String marca;
    float tamanho;

    Televisao(int canal, String marca, float tamanho) {
        this.canal = canal;
        this.marca = marca;
        this.tamanho = tamanho;
    }

    public int aumentarCanal() {
        return this.canal += 1;
    }

    public int diminuirCanal() {
        return this.canal -= 1;
    }

    public void impirimir() {
        System.out.println("Canal: " + this.canal + "\nMarca: " + this.marca + "\nTamanho: " + this.tamanho);
    }
}