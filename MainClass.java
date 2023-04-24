import java.util.*;

public class MainClass {
    public static void main(String[] args) {
        // ArrayList<Carta> baralho = new ArrayList<Carta>();

        ToNPR to = new ToNPR();

        String value = to.npr("A + B * (C - D) * (E + F)");
        System.out.println(value);

        Queue fila = new Queue(5);

        fila.enqueue(10);
        fila.enqueue(5);
        fila.enqueue(3);
        fila.enqueue(4);
        fila.enqueue(5);
        fila.enqueue(3);

        fila.dequeue();
        fila.dequeue();
        fila.dequeue();

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
