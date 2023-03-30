package SmallCourseExercices.Exam;

/*
 * Même exercice, mais avec des autres formes et d'autres couleurs ...
 */

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Paint2 {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame F = new JFrame();
                F.setTitle("Swing custom paint");
                F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                JPanel P = new JPanel() {
                    public void paintComponent(Graphics G) {
                        super.paintComponent(G);
                        G.setColor(Color.BLACK);
                        G.fillRect(100, 100, 200, 200);

                        // ADD CODE HERE

                        // Blue circle
                        G.setColor(Color.BLUE);
                        G.fillOval(100, 100, 100, 100);
                        G.setColor(Color.BLACK);
                        G.fillOval(125, 125, 50, 50);

                        // Red and Green Circle
                        G.setColor(Color.GREEN);
                        G.fillArc(200, 100, 100, 100, 0, 360);
                        G.setColor(Color.RED);
                        G.fillArc(200, 100, 100, 100, 270, 90);

                        // Yellow square
                        G.setColor(Color.YELLOW);
                        G.fillRect(100, 200, 100, 100);
                        G.setColor(Color.BLACK);
                        G.fillRect(125, 225, 50, 50);

                        // Gray lines
                        G.setColor(Color.GRAY);
                        for (int i = 0; i < 10; i++) {
                            G.drawLine(i * 10 + 200, 300, i * 10 + 200, 200);
                        }
                    }
                };

                F.getContentPane().add(P);
                F.setSize(400, 400);
                F.setVisible(true);
            }
        });
    }
}