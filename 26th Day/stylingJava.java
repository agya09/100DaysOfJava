import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import javax.swing.JButton;
import javax.swing.JFrame;

class ActionEventDemo implements ActionListener {
    JFrame frame = new JFrame();
    JButton button = new JButton("Submit");

    ActionEventDemo() {
        prepareGUI();
        buttonProperties();
    }

    public void prepareGUI() {
        frame.setTitle("Test Program");
        frame.getContentPane().setLayout(null);
        frame.setVisible(true);
        frame.setBounds(200, 200, 400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void buttonProperties() {
        button.setBounds(130, 200, 100, 40);
        frame.add(button);
        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        frame.getContentPane().setBackground(Color.gray);

    }

}

public class stylingJava {
    public static void main(String[] args) {
        new ActionEventDemo();
    }

}
