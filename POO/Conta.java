public class Conta {
    private String nome;
    private int n_conta;
    private double saldo;

    Conta(String nome, int conta, double saldo) {
        this.nome = nome;
        this.n_conta = conta;
        this.saldo = saldo;
    }

    public void write() {
        System.out.println("Nome: " + this.nome + "\nConta: " + this.n_conta + "\nSaldo: " + this.saldo);
    }

    public double sacar(double value) {
        this.saldo = this.saldo - value;
        return this.saldo;
    }

    public double depositar(double value) {
        this.saldo = this.saldo + value;
        return this.saldo;
    }
}
