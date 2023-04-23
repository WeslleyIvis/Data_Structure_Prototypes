import java.util.*;

public class MainClass {
    public static void main(String[] args) {
        // ArrayList<Carta> baralho = new ArrayList<Carta>();

        ToNPR to = new ToNPR();

        String value = to.npr("A + B * (C - D) * (E + F)");

        System.out.println(value);
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
