import Voice.MainInterface;

public class MainClass {
    public static void main(String[] args) {
        MainInterface saveFile = new MainInterface();
        saveFile.setVisible(true);

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
