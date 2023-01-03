import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;

public class actionEvent implements ActionListener {

    actionEvent() {
        JFrame frame;
        JLabel user, gender;
        JTextField name;
        JRadioButton rb1, rb2;

        frame = new JFrame("Action Event Listener Example");
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);

        user = new JLabel("Enter your name");
        user.setBounds(20, 50, 100, 30);
        frame.add(user);

        name = new JTextField();
        name.setBounds(150, 50, 100, 30);
        frame.add(name);

        gender = new JLabel("Enter your gender");
        gender.setBounds(20, 120, 100, 30);
        frame.add(gender);
        rb1 = new JRadioButton("Male");
        rb1.setBounds(160, 100, 100, 30);

        rb2 = new JRadioButton("Female");
        rb2.setBounds(160, 150, 100, 30);

        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        frame.add(rb1);
        frame.add(rb2);

        JButton btn = new JButton("SUBMIT");
        btn.setBounds(100, 200, 100, 30);
        frame.add(btn);

        btn.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {

        if (rb1.isSelected()) {
            JOptionPane.showMessageDialog(null, "You are Male.");
        }
        if (rb2.isSelected()) {
            JOptionPane.showMessageDialog(null, "You are Female.");
        }

    }

    public static void main(String[] args) {
        new actionEvent();
    }

}
