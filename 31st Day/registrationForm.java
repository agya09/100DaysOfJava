import javax.swing.*;

public class registrationForm {
    registrationForm() {
        JFrame frame = new JFrame("Registration Form");
        JTextField full_name, u_age, u_address, u_contact, u_email;
        JLabel name, age, address, contact, email, gender, country;
        JRadioButton male, female;
        JCheckBox term;
        JComboBox citizenship;
        JButton submit;
        String countries[] = { "Nepal", "America", "Canada", "Bhutan", "India" };

        name = new JLabel("Name");
        name.setBounds(50, 50, 100, 30);
        frame.add(name);

        full_name = new JTextField();
        full_name.setBounds(160, 50, 200, 30);
        frame.add(full_name);

        age = new JLabel("Age");
        age.setBounds(50, 90, 100, 30);
        frame.add(age);

        u_age = new JTextField();
        u_age.setBounds(160, 90, 200, 30);
        frame.add(u_age);

        address = new JLabel("Address");
        address.setBounds(50, 120, 100, 30);
        frame.add(address);

        u_address = new JTextField();
        u_address.setBounds(160, 120, 200, 30);
        frame.add(u_address);

        contact = new JLabel("Contact");
        contact.setBounds(50, 160, 100, 30);
        frame.add(contact);

        u_contact = new JTextField();
        u_contact.setBounds(160, 160, 200, 30);
        frame.add(u_contact);

        email = new JLabel("Email");
        email.setBounds(50, 200, 100, 30);
        frame.add(email);

        u_email = new JTextField();
        u_email.setBounds(160, 200, 200, 30);
        frame.add(u_email);

        gender = new JLabel("Gender");
        gender.setBounds(50, 240, 100, 30);
        frame.add(gender);

        male = new JRadioButton("Male");
        male.setBounds(160, 240, 100, 30);
        frame.add(male);

        female = new JRadioButton("Female");
        female.setBounds(260, 240, 100, 30);
        frame.add(female);

        country = new JLabel("Country");
        country.setBounds(50, 280, 100, 30);
        frame.add(country);

        citizenship = new JComboBox<>(countries);
        citizenship.setBounds(160, 280, 200, 30);
        frame.add(citizenship);

        term = new JCheckBox("I agree to the terms and conditions.");
        term.setBounds(50, 320, 400, 30);
        frame.add(term);

        submit = new JButton("Submit");
        submit.setBounds(260, 380, 100, 30);
        frame.add(submit);

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
