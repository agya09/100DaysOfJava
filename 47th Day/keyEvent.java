import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class keyEvent implements KeyListener {
    JFrame f;
    JLabel l;
    JTextArea area;

    keyEvent() {

        f = new JFrame("Key Event Example");

        l = new JLabel();
        l.setBounds(20, 30, 100, 30);
        f.add(l);

        area = new JTextArea();
        area.setBounds(20, 50, 300, 300);
        f.add(area);
        area.addKeyListener(this);
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);

    }

    public void keyPressed(KeyEvent e) {
        l.setText("Key is Pressed");
    }

    public void keyReleased(KeyEvent e) {
        l.setText("Key Released");
    }

    public void keyTyped(KeyEvent e) {
        l.setText("Key Typed");
    }

    public static void main(String[] args) {
        new keyEvent();
    }
}
