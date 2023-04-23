public class ToNPR {

    public String npr(String infixa) {
        String npr = "";

        StackChar stack = new StackChar(infixa.length());
        infixa = infixa.toUpperCase();

        for (int i = 0; i < infixa.length(); i++) {
            char current = infixa.charAt(i);

            if (current >= 'A' && current <= 'Z') {
                npr += current;
            }

            else if (current == '+' || current == '-' || current == '*' || current == '/') {

                while (!stack.isEmpty() && prior(stack.top()) >= prior(current))
                    npr += stack.pop();
            } else if (current == '(') {
                stack.push(current);
            }

            else if (current == ')') {
                char op = stack.pop();

                while (op != '(') {
                    npr += op;
                    op = stack.pop();
                }
            }
        }

        while (!stack.isEmpty())
            npr += stack.pop();

        return npr;
    }

    public static int prior(char operador) {
        int resp = 0;

        switch (operador) {
            case '(':
                resp = 1;
                break;
            case '+':
            case '-':
                resp = 2;
                break;
            case '*':
            case '/':
                resp = 3;
                break;
        }

        return resp;
    }
}
