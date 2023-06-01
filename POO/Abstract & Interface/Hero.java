
interface Guerreiro {
    public void atackFisico();
}

interface Mago {
    public void atackMagico();
}

interface Arqueiro {
    public void atackDistante();
}

class Profissao extends Hero implements Guerreiro, Mago, Arqueiro {
    Profissao() {
        super("Velajuel", Mago)
    }

}

public class Hero {
    String nome;
    Object profissao;

    Hero(String nome, Object profissao) {
        this.nome = nome;
        this.profissao = profissao;
    }
}