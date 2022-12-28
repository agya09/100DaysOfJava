import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class mouseEvent implements MouseListener {
    JFrame f;

    mouseEvent() {
        f = new JFrame("Mouse Event Handling");
        f.setSize(600, 600);
        f.setLayout(null);
        f.setVisible(true);
        f.addMouseListener(this);
    }

    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse Clicked");

    }

    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse Entered");
    }

    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse Exited");
    }

    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse Pressed");
    }

    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse Released");
    }

    public static void main(String[] args) {
        new mouseEvent();
    }

}
