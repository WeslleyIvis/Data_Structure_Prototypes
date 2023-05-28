public class TriAtleta extends Pessoa implements Nadador, Corredor, Ciclista {
    public TriAtleta(String nome, String endereco) {
        super(nome, endereco);
    }

    public void aquecer() {
        System.out.println(getNome() + " Está aquecendo");
    }

    public void nadar() {
        System.out.println(getNome() + " Está nadando");
    }

    public void pedalar() {
        System.out.println(getNome() + " Está pedelando");
    }

    public void correr() {
        System.out.println(getNome() + " Está correndo");
    }
}
