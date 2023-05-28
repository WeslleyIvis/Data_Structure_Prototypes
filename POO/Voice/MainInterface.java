package Voice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MainInterface extends JFrame {

    private JTextField textField;
    private JButton buttonSave;

    public MainInterface() {
        setSize(500, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Save DATA");

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        textField = new JTextField();
        panel.add(textField, BorderLayout.CENTER);

        buttonSave = new JButton("Enviar");
        buttonSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                salvarDados();
            }
        });
        panel.add(buttonSave, BorderLayout.SOUTH);

        getContentPane().add(panel);
    }

    private void salvarDados() {
        String texto = textField.getText();

        try {
            // Abre o arquivo em modo de adição
            FileWriter fileWriter = new FileWriter("dados.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Escreve o texto no arquivo
            bufferedWriter.write(texto);
            bufferedWriter.newLine();

            // Fecha o arquivo
            bufferedWriter.close();

            JOptionPane.showMessageDialog(this, "Dados salvos");
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao salvar dados!");
        }
    }
}
