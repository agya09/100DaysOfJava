import java.awt.*;

public class frameinJava {

    public static void main(String[] args) {
        Frame myframe = new Frame("Java Frame");
        Label l1, l2, l3;
        TextField user, pass;
        Button submit;

        l1 = new Label("Username");
        user = new TextField();
        l2 = new Label("Password");
        pass = new TextField();

        submit = new Button("Submit");

        l1.setBounds(20, 100, 100, 20);
        user.setBounds(150, 100, 100, 20);
        l2.setBounds(20, 150, 100, 20);
        pass.setBounds(150, 150, 100, 20);
        submit.setBounds(100, 200, 100, 30);

        myframe.add(l1);
        myframe.add(user);
        myframe.add(l2);
        myframe.add(pass);
        myframe.add(submit);

        myframe.setSize(300, 400);
        myframe.setLayout(null);
        myframe.setVisible(true);
    }

}
