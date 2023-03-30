package SmallCourseExercices.Exam;

/**
 * Exam exercise for Programming 3
 * Name : Adina Timis
 * Student ID : 0191042056
 * Date : 24 January 2022
 */

/**
* Ici, le professeur nous a donné un screen de l'image souhaitée en output,
* et nous devions trouver comment générer les formes et couleurs du screen
*/

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Paint {
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
                        // Red and Blue Circle in the upper left corner
                        G.setColor(Color.BLUE);
                        G.fillArc(100, 100, 100, 100, 0, 360);
                        G.setColor(Color.RED);
                        G.fillArc(100, 100, 100, 100, 180, 270);

                        // Lines in the upper right corner
                        G.setColor(Color.GRAY);
                        for (int i = 0; i < 10; i++) {
                            G.drawLine(i * 10 + 200, 100, i * 10 + 200, 200);
                        }

                        // Yellow square
                        G.setColor(Color.YELLOW);
                        G.fillRect(100, 200, 100, 100);
                        G.setColor(Color.BLACK);
                        G.fillRect(125, 225, 50, 50);

                        // Green circle
                        G.setColor(Color.GREEN);
                        G.fillOval(200, 200, 100, 100);
                        G.setColor(Color.BLACK);
                        G.fillOval(225, 225, 50, 50);

                    }
                };

                F.getContentPane().add(P);
                F.setSize(400, 400);
                F.setVisible(true);
            }
        });
    }
}