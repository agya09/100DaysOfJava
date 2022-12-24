
// Java program to show a popup menu
// and menu items to it
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Popup extends JFrame implements ActionListener {

    // java button
    static JButton b;

    // java frame
    static JFrame f;

    // popup menu
    static JPopupMenu pm;

    // JLabel
    JLabel l;

    // default constructor
    Popup() {
    }

    // main class
    public static void main(String[] args) {
        // create a frame
        f = new JFrame("Popup");

        // set the size of the frame
        f.setSize(400, 400);

        // close the frame when close button is pressed
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // create anew panel
        JPanel p = new JPanel();

        // create an object of mouse class
        Popup pop = new Popup();

        // create a button
        b = new JButton("click");

        // addActionListener
        b.addActionListener(pop);

        // create a popup menu
        pm = new JPopupMenu("Message");

        // create menuItems
        JMenuItem m1 = new JMenuItem("Item1");
        JMenuItem m2 = new JMenuItem("Item2");
        JMenuItem m3 = new JMenuItem("Item3");

        // create a Jlabel
        JLabel l = new JLabel("nothing clicked");

        // add menuitems to popup menu
        pm.add(m1);
        pm.add(m2);
        pm.add(m3);

        // addActionListener
        m1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l.setText("Item 1 clicked.");
            }
        });

        m2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l.setText("Item 2 clicked.");
            }
        });

        m3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l.setText("Item 3 clicked.");
            }
        });

        // add button and label to frame
        p.add(b);
        p.add(l);

        f.add(p);
        f.show();
    }

    // when the button is clicked
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        if (s.equals("click")) {

            // add the popup to the frame
            pm.show(f, 200, 200);
        }
    }
}
