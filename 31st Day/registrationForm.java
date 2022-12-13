import javax.swing.*;

public class registrationForm {
    registrationForm() {
        JFrame frame = new JFrame("Registration Form");
        JTextField full_name, u_age, u_address, u_contact, u_email;
        JLabel name, age, address, contact, email, gender;
        JRadioButton male, female;
        JComboBox citizenship;

        name = new JLabel("Name");
        name.setBounds(50, 50, 100, 20);
        frame.add(name);

        age = new JLabel("Age");
        age.setBounds(50, 90, 100, 20);
        frame.add(age);

        address = new JLabel("Address");
        address.setBounds(50, 120, 100, 20);
        frame.add(address);

        contact = new JLabel("Contact");
        contact.setBounds(50, 160, 100, 20);
        frame.add(contact);

        email = new JLabel("Email");
        email.setBounds(50, 50, 100, 20);
        frame.add(email);

        gender = new JLabel("Gender");
        gender.setBounds(50, 50, 100, 20);
        frame.add(gender);

        frame.setLayout(null);
        frame.setSize(500, 500);
        // frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new registrationForm();

    }

}
