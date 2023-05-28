import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfaceJogo {

    public void initInterface() {
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
}
