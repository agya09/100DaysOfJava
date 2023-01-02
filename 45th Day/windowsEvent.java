import javax.swing.*;
import java.awt.event.*;

public class windowsEvent implements WindowListener {
    windowsEvent() {
        JFrame frame = new JFrame("Windows event Example");
        frame.addWindowListener(this);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new windowsEvent();
    }

    public void windowActivated(WindowEvent e) {
        System.out.println("Window is activated");
    }

    public void windowDeactivated(WindowEvent e) {
        System.out.println("Window is deactivated");
    }

    public void windowClosed(WindowEvent e) {
        System.out.println("Window Closed");
    }

    public void windowClosing(WindowEvent e) {
        System.out.println("Window is Closing");
    }

    public void windowOpened(WindowEvent e) {
        System.out.println("Window is opened");
    }

    public void windowIconified(WindowEvent e) {
        System.out.println("Window is Iconified");
    }

    public void windowDeiconified(WindowEvent e) {
        System.out.println("Window deiconified");
    }

}
