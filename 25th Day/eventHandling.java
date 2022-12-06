import java.awt.*;
import java.awt.event.*;

public class eventHandling extends Frame implements ActionListener {
    Frame frame1 = new Frame("Event Handling");
    TextField message;

    eventHandling() {
        message = new TextField();
        message.setBounds(100, 150, 350, 40);
        Button click = new Button("Click Here!");
        click.setBounds(100, 200, 150, 30);

        click.addActionListener(this);

        frame1.add(click);
        frame1.add(message);
        frame1.setSize(500, 400);
        frame1.setLayout(null);
        frame1.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        message.setText("Java Programming");
    }

    public static void main(String[] args) {
        new eventHandling();
    }

}
