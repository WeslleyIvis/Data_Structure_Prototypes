import javax.swing.JOptionPane;

public class FilaDin {
    Node comeco;
    Node fim;
    int total;

    public FilaDin() {
        comeco = null;
        fim = null;
        total = 0;
    }

    public Boolean isEmpty() {
        return (total == 0);
    }

    public void enqueue(Object value) {
        Node obj = new Node();
        obj.setData(value);
        obj.setProximo(null);
        if (isEmpty()) {
            this.comeco = obj;
            this.fim = comeco;
        } else {
            fim.setProximo(obj);
            fim = obj;
        }
        total++;
    }

    public Object dequeue() {
        Object resp = null;
        if (!isEmpty()) {
            resp = comeco.getData();
            comeco = comeco.getProx();
            total--;
            return resp;
        }
        return resp;
    }

    public String toString() {
        if (isEmpty()) {
            return "Fila Vazia";
        } else {
            Node aux;
            String saida = "";
            aux = comeco;
            while (aux != null) {
                saida += aux.getData().toString() + ", ";
                aux = aux.getProx();
            }
            return "F: [" + saida + "]";
        }
    }
}
