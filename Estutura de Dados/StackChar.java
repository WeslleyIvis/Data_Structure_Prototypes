public class StackChar {
    // atributos
    private char[] dados;
    private int topo;

    // construtor
    public StackChar(int tamanho) {
        dados = new char[tamanho];
        topo = -1;
    }

    // mÃ©todos auxiliares
    boolean isEmpty() {
        return topo <= -1;
    }

    boolean isFull() {
        return topo == dados.length - 1;
    }

    // mÃ©todo que retorna o valor do topo
    char top() {
        if (!isEmpty())
            return dados[topo];
        else
            return ' '; // pilha vazia
    }

    // mÃ©todo que insere no topo
    void push(char dado) {
        if (!isFull()) {
            // sobe o topo
            // insere o dado
            dados[++topo] = dado;
        } else
            System.out.println("pilha cheia");
    }

    char pop() {
        if (!isEmpty()) {
            return dados[topo--];
        } else
            return ' ';
    }

    void imprime() {
        String pilha = "P:[";

        for (int i = 0; i <= topo; i++)
            pilha += dados[i] + ", ";

        pilha += "]";
        System.out.println(pilha);
    }
    // implementar um cÃ³digo no main que usa pilha para converter um numero de
    // decimal
    // para binario
}