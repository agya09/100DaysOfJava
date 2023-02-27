import javax.swing.*;
import java.awt.*;

class splitPane extends JFrame{
    JSplitPane sp;
    JTextField tb;
    JLabel lb;
    splitPane(){
        setSize(400,300);
        setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        JPanel p1=new JPanel();
        JPanel p2=new JPanel();
        JPanel p3=new JPanel();
        p1.setLayout(new BorderLayout());
        p2.setLayout(new FlowLayout());
        p1.setPreferredSize(new Dimension(20,20));

        ImageIcon ic = new ImageIcon("test.jpeg");
        p1.add(new JLabel(ic),BorderLayout.CENTER);
        lb=new JLabel("Enter your name");
        tb=new JTextField(20);
        p2.add(lb);
        p2.add(tb);
        p3.setBackground(Color.CYAN);

        sp=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,p1,p2);
        add(sp, BorderLayout.CENTER);
        add(p3, BorderLayout.SOUTH);
        setVisible(true);
    }
    public static void main(String[] args) {
        splitPane frame=new splitPane();
    }
}
