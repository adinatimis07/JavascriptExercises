package SmallCourseExercices.Exam;

/**
 * Exam exercise for Programming 3
 * Name : Adina Timis
 * Student ID : 0191042056
 * Date : 24 January 2022
 */

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Hashtable;

public class Squaring {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame F = new JFrame("Squaring");
                F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                F.setSize(600, 300);
                F.setVisible(true);

                JPanel P = (JPanel) F.getContentPane();

                // STEP 1: set the layout of the panel
                P.setLayout(new GridLayout(3, 1));

                // STEP 2: create a customized slider, a label and a button
                final JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 20, 0);
                slider.setMajorTickSpacing(1);
                slider.setPaintTicks(true);
                slider.setPaintLabels(true);

                Hashtable position = new Hashtable();
                position.put(0, new JLabel("0"));
                slider.setMinorTickSpacing(4);
                position.put(5, new JLabel("5"));
                slider.setMinorTickSpacing(4);
                position.put(10, new JLabel("10"));
                slider.setMinorTickSpacing(4);
                position.put(15, new JLabel("15"));
                slider.setMinorTickSpacing(4);
                position.put(20, new JLabel("20"));
                slider.setLabelTable(position);

                JButton resetB = new JButton("Reset");
                JLabel squarL = new JLabel("0x0 = 0");

                // STEP 3: add components to the panel
                P.add(slider);
                P.add(squarL, BorderLayout.CENTER);
                P.add(resetB);

                // STEP 4: add listener for the slider that computes the squaring and puts the
                // result in the label
                slider.addChangeListener(new ChangeListener() {
                    public void stateChanged(ChangeEvent event) {
                        int value = slider.getValue();
                        squarL.setText(value + "x" + value + " = " + (value * value));
                    }
                });

                // STEP 5: add listener for the button that resets the slider to 0
                resetB.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        slider.setValue(0);
                        ;
                    }
                });

            }
        });
    }
}
