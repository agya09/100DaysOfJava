import javax.swing.*;

public class checkBoxAndRadioBtnMenu {
    JFrame f;
    JMenuBar mb;
    JCheckBoxMenuItem i1, i2;
    JRadioButtonMenuItem i3, i4;
    ButtonGroup bg;

    checkBoxAndRadioBtnMenu() {
        f = new JFrame("Menu with Checkbox and RadioButton");
        f.setSize(600, 600);
        f.setLayout(null);
        f.setVisible(true);
        mb = new JMenuBar();
        JMenu menu = new JMenu("Menu");
        mb.add(menu);
        i1 = new JCheckBoxMenuItem("Item A");
        i2 = new JCheckBoxMenuItem("Item B");
        i3 = new JRadioButtonMenuItem("Item C");
        i4 = new JRadioButtonMenuItem("Item D");
        bg = new ButtonGroup();
        bg.add(i3);
        bg.add(i4);
        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        menu.add(i4);

        f.setJMenuBar(mb);

    }

    public static void main(String[] args) {
        new checkBoxAndRadioBtnMenu();
    }

}
