import java.util.*;

public class MainClass {
    public static void main(String[] args) {
        // ArrayList<Carta> baralho = new ArrayList<Carta>();

        String tes = toNPR("((A+B-C) * H + (D / O))");
        System.out.println("??: " + tes);

        Dog dogao = new Dog("Donald", 2, "macio", "canídeo", "pastor Alemão", "Black");

        dogao.makeSound();
        dogao.breastfeeding();
        dogao.bark();
    }

    public static String toNPR(String infixa) {
        String saida = "";
        Stack p = new Stack(infixa.length());
        for (int i = 0; i < infixa.length(); i++) {
            char ch = infixa.toUpperCase().charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                saida += infixa.charAt(i);
            }
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                p.push(ch);
            }
            if (ch == ')') {
                saida += p.pop();

            }
        }

        return saida;
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
