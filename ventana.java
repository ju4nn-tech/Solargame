package main1;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.GridLayout;

public class ventana {

    public static void main(String[] args) {

        JFrame ventana = new JFrame();

        ventana.setTitle("SOLAR GAME");
        ventana.setSize(800, 600);
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 1));

        JLabel titulo = new JLabel("SOLAR GAME");
        titulo.setFont(new Font("Consolas", Font.BOLD, 40));

        JButton iniciar = new JButton("INICIAR JUEGO");

        panel.add(titulo);
        panel.add(iniciar);

        iniciar.addActionListener(e -> {

            panel.removeAll();

            JPanel recursos = new JPanel();
            recursos.setLayout(new GridLayout(2, 3));
            JLabel combustible = new JLabel("Combustible: 500");
            JLabel oxigeno = new JLabel("Oxígeno: 100");
            JLabel vida = new JLabel("Vida: 1000");
            JLabel comida = new JLabel("Comida: 100");
            JLabel agua = new JLabel("Agua: 50");
            combustible.setFont(new Font("Consolas", Font.BOLD, 18));
            oxigeno.setFont(new Font("Consolas", Font.BOLD, 18));
            vida.setFont(new Font("Consolas", Font.BOLD, 18));
            comida.setFont(new Font("Consolas", Font.BOLD, 18));
            agua.setFont(new Font("Consolas", Font.BOLD, 18));
            recursos.add(combustible);
            recursos.add(oxigeno);
            recursos.add(vida);
            recursos.add(comida);
            recursos.add(agua);
            panel.add(recursos);
            JPanel planetas = new JPanel();
            planetas.setLayout(new GridLayout(1, 5));
            JButton luna = new JButton("LUNA");
            JButton marte = new JButton("MARTE");
            JButton venus = new JButton("VENUS");
            JButton jupiter = new JButton("JÚPITER");
            JButton sol = new JButton("SOL");
            planetas.add(luna);
            planetas.add(marte);
            planetas.add(venus);
            planetas.add(jupiter);
            planetas.add(sol);

            panel.add(planetas);
            panel.revalidate();
            panel.repaint();
        });

        ventana.add(panel);
        ventana.setVisible(true);
    }
}