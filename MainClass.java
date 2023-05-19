import java.util.*;

public class MainClass {
    public static void main(String[] args) {
        StackDin p1 = new StackDin();
        FilaDin fila = new FilaDin();

        fila.enqueue(10);
        fila.enqueue(10);
        fila.enqueue("Carro");

        System.out.println(fila.toString());
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
