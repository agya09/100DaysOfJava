import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ActioneventExample {
    public static void main(String args[]) {
        Abc obj = new Abc();
    }
}

class Abc extends JFrame implements ActionListener {
    JLabel l1;
    JTextField t1;
    JLabel l2;
    JTextField t2;
    JButton b;
    JLabel l3;

    public Abc() {
        setLayout(new FlowLayout());

        l1 = new JLabel("First Number:");
        t1 = new JTextField(20);

        l2 = new JLabel("Second Number:");
        t2 = new JTextField(20);

        b = new JButton("Add");

        l3 = new JLabel("Result");

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b);
        add(l3);

        b.addActionListener(this);

        setVisible(true);
        setSize(250, 400);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae) {
        int num1 = Integer.parseInt(t1.getText());
        int num2 = Integer.parseInt(t2.getText());

        int value = num1 + num2;
        l3.setText("" + value);
    }

}
