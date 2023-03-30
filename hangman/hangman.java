package hangman;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class hangman {
    public static void main(String[] args) {

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame F = new JFrame();
                F.setTitle("Hangman");
                F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                JPanel P = new hangmanPanel();

                F.getContentPane().add(P);

                F.setSize(400, 400);
                F.setVisible(true);
            }
        });
    }
}
