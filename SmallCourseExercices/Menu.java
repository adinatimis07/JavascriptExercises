package SmallCourseExercices;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 * Complete the following Swing code to realize an Interface with two menus:
 * - a menu 'color' with the submenus red, green and blue
 * - a menu 'name' with the submenus Alice, Bob and Carol
 * Add listeners so that the choice of a submenu adjusts the color and the name
 * of the label.
 */
public class Menu {

    static JLabel B = new JLabel();

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame F = new JFrame();
                F.setTitle("JMenu Exercise");
                F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                F.getContentPane().add(B);
                B.setOpaque(true);
                B.setHorizontalAlignment(JLabel.CENTER);

                F.setJMenuBar(createJMenuBar());

                F.setSize(400, 400); // set Window size
                F.setVisible(true);
            }
        });
    }

    static JMenuBar createJMenuBar() {
        JMenuBar M = new JMenuBar();
        JMenu menu1 = new JMenu();
        JMenu menu2 = new JMenu();
        JMenuItem I1 = new JMenuItem();
        JMenuItem I2 = new JMenuItem();
        JMenuItem I3 = new JMenuItem();
        JMenuItem I4 = new JMenuItem();
        JMenuItem I5 = new JMenuItem();
        JMenuItem I6 = new JMenuItem();

        // ADD CODE HERE

        // First menu - red green blue
        menu1 = new JMenu("color");
        M.add(menu1);
        I1 = new JMenuItem("red");
        I2 = new JMenuItem("green");
        I3 = new JMenuItem("blue");
        menu1.add(I1);
        menu1.add(I2);
        menu1.add(I3);

        // Second menu - alice bob carole
        menu2 = new JMenu("name");
        M.add(menu2);
        I4 = new JMenuItem("alice");
        I5 = new JMenuItem("bob");
        I6 = new JMenuItem("carole");
        menu2.add(I4);
        menu2.add(I5);
        menu2.add(I6);

        return M;
    }
}
