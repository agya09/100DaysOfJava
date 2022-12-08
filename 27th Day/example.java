import javax.swing.*;

public class example {
    example() {
        JFrame f = new JFrame("Button Styling");
        JButton b = new JButton(new ImageIcon("profile_img.jpg"));
        b.setBounds(100, 100, 100, 40);
        f.add(b);
        f.setSize(300, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new example();
    }

}
