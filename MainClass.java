import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainClass {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Jogador mao = new Jogador();

        deck.gerarBaralho(2);
        deck.embaralhar();

        JFrame frame = new JFrame("Jogo do Bixo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JLabel cartaAtual = new JLabel("Comprou: --");
        JLabel label = new JLabel("Valor: 0");
        label.setPreferredSize(new Dimension(300, 300));

        JButton button = new JButton("Comprar Carta");

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Carta cartaComprada = deck.darCarta();
                mao.comprarCarta(cartaComprada);
                cartaAtual.setText("" + deck.imprimirCarta(cartaComprada));
                label.setText("Valor: " + mao.valorDaMao());
            }
        });

        frame.getContentPane().add(cartaAtual);
        frame.getContentPane().add(label);
        frame.getContentPane().add(button);
        frame.pack();
        frame.setVisible(true);

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
