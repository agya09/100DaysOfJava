import javax.swing.*;

public class menuExample {

    JFrame f;
    JMenuBar mb;
    JMenu file, edit, save, help;
    JMenuItem cut, copy, paste, selectAll, saveAs, saveAll, saveAsAll, about;

    menuExample() {
        f = new JFrame("Menu Example");

        cut = new JMenuItem("Cut");
        copy = new JMenuItem("Copy");
        paste = new JMenuItem("Paste");
        selectAll = new JMenuItem("Select All");
        saveAs = new JMenuItem("Save As");
        saveAll = new JMenuItem("Save All");
        saveAsAll = new JMenuItem("Save As All");
        about = new JMenuItem("About");

        mb = new JMenuBar();
        file = new JMenu("File");
        edit = new JMenu("Edit");
        save = new JMenu("Save");
        help = new JMenu("Help");

        file.add(save);
        file.add(saveAs);
        file.add(saveAll);
        file.add(saveAsAll);
        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(selectAll);
        help.add(about);

        mb.add(file);
        mb.add(edit);
        mb.add(help);

        JTextArea txt = new JTextArea("Write here!!!");
        txt.setBounds(40, 50, 300, 200);
        f.add(txt);

        JButton btn = new JButton("Submit");
        btn.setBounds(200, 280, 100, 30);
        f.add(btn);

        f.setJMenuBar(mb);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new menuExample();
    }

}
