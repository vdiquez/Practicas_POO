package src.poo.interfaces;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame implements Matematicas, ActionListener {
    //GUI
    public Calculadora() {
        agregarComponentes();
        configuracionMarco();
    }

    private void agregarComponentes() {
        JPanel panel = new JPanel();
        JLabel etiqueta = new JLabel("Operaciones: ");
        JTextField campoTexto = new JTextField("Escribe aquí tus operaciones");
        //TextPrompt placeholder = new TextPrompt("Apellido", textField);

        panel.add(etiqueta);
        panel.add(campoTexto);
        this.add(panel);

    }

    private void configuracionMarco() {
        this.setTitle("Calculadora");
        this.setLocationRelativeTo(null);
        this.setSize(400,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    @Override
    public Integer suma() {
        return null;
    }

    @Override
    public Double resta() {
        return null;
    }

    @Override
    public Integer multi() {
        return null;
    }

    @Override
    public Integer divi() {
        return null;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
