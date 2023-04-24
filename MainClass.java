import java.util.*;

public class MainClass {
    public static void main(String[] args) {
        // ArrayList<Carta> baralho = new ArrayList<Carta>();

        ToNPR to = new ToNPR();

        String value = to.npr("A + B * (C - D) * (E + F)");
        System.out.println(value);

        QueueCircular fila = new QueueCircular(5);

        fila.enqueue(0);
        fila.enqueue(10);
        fila.enqueue(20);
        fila.enqueue(30);
        fila.dequeue();
        fila.dequeue();
        fila.enqueue(40);
        fila.enqueue(50);
        fila.dequeue();
        fila.dequeue();
        fila.dequeue();
        fila.enqueue(60);
        fila.enqueue(70);
        fila.dequeue();
        fila.enqueue(80);
        fila.enqueue(90);
        fila.enqueue(100);

        fila.write();
    }

    public static void decimalToBinary(int value) {
        Stack stack = new Stack(value / 2);
        String output = "";

        do {
            stack.push(value % 2);
            value = value / 2;
        } while (value > 0);

        while (!stack.isEmpty()) {
            output += stack.pop();
        }

        System.out.println(output);
    }

}
