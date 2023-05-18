import java.util.*;

public class MainClass {
    public static void main(String[] args) {
        StackDin p1 = new StackDin();

        p1.push(7);
        p1.push(9);
        p1.push(4);
        p1.push(1);

        System.out.println(p1.toString());
        System.out.println(p1.pop());
        System.out.println(p1.toString());
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
