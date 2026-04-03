import javax.swing.*;
import javax.swing.event.*;

public class TryList extends JFrame implements ListSelectionListener {
    private JList daftar;
    private JTextArea tArea;

    public TryList() {
        super("MENGGUNAKAN LIST");
        setSize(350, 150);

        String[] mataKuliah = {"Fisika Teknik", "Komputasi Numerik", "Matematika Diskrit"};
        daftar = new JList(mataKuliah);

        daftar.setSelectedIndex(0);
        daftar.addListSelectionListener(this);

        tArea = new JTextArea(4, 15);
        tArea.setEditable(false);

        JPanel p1 = new JPanel();
        p1.add(daftar);
        
        JPanel p2 = new JPanel();
        p2.add(tArea);

        add("West", p1);
        add("East", p2);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void valueChanged(ListSelectionEvent e) {
        if (!e.getValueIsAdjusting()) {
            tArea.setText("\nItem yang terpilih :\n" + daftar.getSelectedValue());
        }
    }

    public static void main(String[] args) {
        new TryList();
    }
}
