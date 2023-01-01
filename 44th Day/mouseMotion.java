import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;

import org.w3c.dom.events.MouseEvent;

public class mouseMotion implements MouseMotionListener {
    mouseMotion() {
        JFrame frame = new JFrame("Mouse MOtion Listener Example");
        frame.addMouseMotionListener(this);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    // public void mouseDragged(MouseEvent e) {
    // Graphics g = getGraphics();
    // g.setColor(Color.RED);
    // g.fillOval(e.getX(), e.getY(), 20, 20);
    // }

    // public void mouseMoved(MouseEvent e) {
    // System.out.println("Mouse is moved");
    // }

    public static void main(String[] args) {
        new mouseMotion();
    }

    @Override
    public void mouseDragged(java.awt.event.MouseEvent e) {
        // TODO Auto-generated method stub
        System.out.println("Mouse is dragged");

    }

    @Override
    public void mouseMoved(java.awt.event.MouseEvent e) {
        // TODO Auto-generated method stub
        System.out.println("Mouse is moved");

    }
}
