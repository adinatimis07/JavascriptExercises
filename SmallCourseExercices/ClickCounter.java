package SmallCourseExercices;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractAction;
import javax.swing.AbstractButton;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.text.Document;

public class ClickCounter {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // create the JFrame
                JFrame F = new JFrame();
                F.setTitle("Click Counter");
                F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                F.getContentPane().setLayout(new BorderLayout());

                JPanel P = new JPanel();
                P.getLayout();

                // Create the JLabel object and add it to the content pane
                JLabel T = new JLabel();
                F.add(T, BorderLayout.CENTER);

                // create a JButton object and add it to the content pane (Borderlayout.SOUTH)
                JButton B = new JButton("Click here !");
                F.add(B, BorderLayout.SOUTH);

                // create a static field count
                int count = 0;
                T.setText("Clicks = " + count);

                // add a Listener to the JButton that increments the static field count and
                // updates the text of the JLabel.
                B.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        int count = 0;
                        count++;
                        T.setText("Clicks = " + count);
                    }
                });

                F.setSize(400, 400);
                F.setVisible(true);
            }
        });
    }
}
