import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JuegoReciclaje extends JFrame {
    private Papel papel;

    public JuegoReciclaje() {
        papel = new Papel("Papel", 1.5, "Celulosa", "Blanco");

        setTitle("Juego de Reciclaje");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JButton btnReciclar = new JButton("Reciclar Papel");
        btnReciclar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                papel.reciclar();
            }
        });

        JButton btnInfo = new JButton("Información de Reciclaje");
        btnInfo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(papel.obtenerInformacionReciclaje());
            }
        });

        add(btnReciclar);
        add(btnInfo);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new JuegoReciclaje().setVisible(true);
            }
        });
    }
}
