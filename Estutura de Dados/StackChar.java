public class StackChar {
    private char[] dados;
    private int topo;

    public StackChar(int tamanho) {
        dados = new char[tamanho];
        topo = -1;
    }

    boolean isEmpty() {
        return topo <= -1;
    }

    boolean isFull() {
        return topo == dados.length - 1;
    }

    char top() {
        if (!isEmpty())
            return dados[topo];
        else
            return ' ';
    }

    void push(char dado) {
        if (!isFull()) {
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
}