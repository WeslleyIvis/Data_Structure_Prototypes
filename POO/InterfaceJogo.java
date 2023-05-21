import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfaceJogo {

    public void initInterface() {
        JFrame frame = new JFrame("Jogo do Bixo");
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("Valor: 0");
        JButton button = new JButton("Clique Aqui");
        label.setPreferredSize(new Dimension(500, 300));
        button.setSize(300, 400);

        int[] valor = { 0 }; // Valor a ser modificado

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                valor[0]++; // Incrementa o valor
                label.setText("Valor: " + valor[0]); // Atualiza o texto do label
            }
        });

        frame.getContentPane().add(label);
        frame.getContentPane().add(button);
        frame.pack();
        frame.setVisible(true);
    }
}
