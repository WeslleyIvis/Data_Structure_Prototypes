import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ObjetoMovel extends JFrame {

    private JPanel panel;
    private int x;
    private int direction;

    public ObjetoMovel() {
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Objeto Móvel");

        // Painel para desenhar o objeto
        panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.RED);
                g.fillRect(x, 100, 50, 50);
            }
        };

        getContentPane().add(panel);

        // Inicialização das variáveis
        x = 0;
        direction = 0; // 0 para parado, 1 para direita, -1 para esquerda

        // Criação do Timer para atualizar a posição do objeto a cada intervalo
        Timer timer = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Atualiza a posição do objeto
                x += direction;

                // Verifica os limites da tela para manter o objeto dentro da janela
                if (x < 0) {
                    x = 0;
                } else if (x > getWidth() - 50) {
                    x = getWidth() - 50;
                }

                // Redesenha o painel para exibir o objeto na nova posição
                panel.repaint();
            }
        });

        // Inicia o Timer
        timer.start();

        // Adiciona o ouvinte de eventos de teclado à janela
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println(e);
                System.out.println(e.getKeyCode());
                // Verifica a tecla pressionada
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    direction = -1; // Move para a esquerda quando a tecla esquerda é pressionada
                } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    direction = 1; // Move para a direita quando a tecla direita é pressionada
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                // Verifica a tecla solta
                if (e.getKeyCode() == KeyEvent.VK_LEFT || e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    direction = 0; // Para de mover quando a tecla esquerda ou direita é solta
                }
            }
        });

        // Permite que o painel receba o foco do teclado
        panel.setFocusable(true);
    }
}
