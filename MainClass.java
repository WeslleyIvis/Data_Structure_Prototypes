import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();

        StackDin pilha = new StackDin();
        Queue fila = new Queue(10);

        fila.enqueue(3);
        fila.enqueue(7);
        fila.enqueue(5);
        fila.enqueue(5);
        fila.dequeue();

        pilha.push(2);
        pilha.pop();
        pilha.pop();
        pilha.push(1);

        list.add(fila);
        list.add(pilha);

        System.out.println(fila.getFim());
        System.out.println(fila.getTotal());
    }
}
