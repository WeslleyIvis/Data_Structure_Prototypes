public class Queue {
    private int comeco;
    private int fim;
    private int[] dados;
    private int total;

    public int getFim() {
        return fim;
    }

    public int getTotal() {
        return total;
    }

    public Queue(int tamanho) {
        dados = new int[tamanho];
        total = 0;
        comeco = 0;
        fim = 0;
    }

    public boolean isEmpty() {
        return total == 0;
    }

    public boolean isFull() {
        return total == dados.length;
    }

    public void enqueue(int dado) {
        if (!isFull()) {
            dados[fim] = dado;
            total++;
            fim++;
            fim %= dados.length;
        } else
            System.out.println("fila cheia");
    }

    public int dequeue() {
        if (!isEmpty()) {
            int value = dados[comeco];
            dados[comeco] = comeco;
            comeco++;
            return value;
        }
        return -1;
    }

    public void write() {
        String data = "F: [";
        for (int i = 0; i < dados.length; i++) {
            if (!(dados[i] == 0)) {
                data += dados[i] + ", ";
            }
        }

        data += "]";

        System.out.println(data);
    }
}
