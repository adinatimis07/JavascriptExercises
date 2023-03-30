package SmallCourseExercices.Exam;

/**
 * Exam exercise for Programming 3
 * Name : Adina Timis
 * Student ID : 0191042056
 * Date : 24 January 2022
 */

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class TODOlist {

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame F = new JFrame();
                F.setTitle("TODO list");
                F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                F.getContentPane().setLayout(new BorderLayout());

                final DefaultListModel<String> M = new DefaultListModel<String>();
                final JList<String> L = new JList<String>(M);
                final JTextField T = new JTextField();
                JButton B = new JButton("Remove selected line");

                F.getContentPane().add(new JScrollPane(L));
                F.getContentPane().add(T, BorderLayout.NORTH);
                F.getContentPane().add(B, BorderLayout.SOUTH);

                // ADD LISTENER TO TEXTFIELD T
                T.addActionListener(e -> {
                    M.add(M.getSize(), " - " + T.getText());
                    T.setText("");
                });

                // ADD LISTENER TO BUTTON B
                B.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        int index = L.getSelectedIndex();
                        if (index != -1) {
                            M.remove(L.getSelectedIndex());
                        }
                    }
                });

                F.setSize(400, 400);
                F.setVisible(true);
            }
        });
    }
}
