import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Carroex carro = new Carroex(50, 50);
        Scanner scanner = new Scanner(System.in);

        int aux = 1;

        while (aux > 0) {
            System.out.println("Valor");
            aux = scanner.nextInt();

            if (aux == 1)
                carro.motor.Ligar();
            else if (aux == 2)
                carro.motor.Desligar();
            else
                aux = 0;
        }
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
