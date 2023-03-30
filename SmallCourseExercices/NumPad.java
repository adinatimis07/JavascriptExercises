package SmallCourseExercices;

import javax.swing.*;
import java.awt.*;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractAction;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class NumPad {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame F = new JFrame("NumPad");
                F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                F.setSize(400, 300);
                F.setVisible(true);
                F.getContentPane().setLayout(new BorderLayout());

                JTextField T = new JTextField();
                F.getContentPane().add(T, BorderLayout.NORTH);

                JPanel P = new JPanel();
                F.getContentPane().add(P, BorderLayout.CENTER);

                P.setBackground(Color.GREEN);

                // STEP 1: create 12 buttons
                JButton B1 = new JButton("1");
                JButton B2 = new JButton("2");
                JButton B3 = new JButton("3");
                JButton B4 = new JButton("4");
                JButton B5 = new JButton("5");
                JButton B6 = new JButton("6");
                JButton B7 = new JButton("7");
                JButton B8 = new JButton("8");
                JButton B9 = new JButton("9");
                JButton Bpoint = new JButton(".");
                JButton B0 = new JButton("0");
                JButton Bdel = new JButton("DEL");

                // STEP 2: set layout of panel
                P.setLayout(new GridLayout(4, 1));

                // STEP 3: add buttons to panel
                P.add(B1);
                P.add(B2);
                P.add(B3);
                P.add(B4);
                P.add(B5);
                P.add(B6);
                P.add(B7);
                P.add(B8);
                P.add(B9);
                P.add(Bpoint);
                P.add(B0);
                P.add(Bdel);

                // STEP 4: add listeners !!!!! A revoir car setText supprime le numéro précédent
                B1.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        T.setText("1");
                    }
                });
                B2.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        T.setText("2");
                    }
                });
                B3.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        T.setText("3");
                    }
                });
                B4.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        T.setText("4");
                    }
                });
                B5.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        T.setText("5");
                    }
                });
                B6.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        T.setText("6");
                    }
                });
                B7.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        T.setText("7");
                    }
                });
                B8.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        T.setText("8");
                    }
                });
                B9.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        T.setText("9");
                    }
                });
                Bpoint.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        T.setText(".");
                    }
                });
                B0.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        T.setText("0");
                    }
                });
                Bdel.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        T.setText("");
                    }
                });
            }
        });
    }
}
