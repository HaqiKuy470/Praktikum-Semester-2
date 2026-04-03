import javax.swing.*;
import java.awt.event.*;

public class TryComboBox extends JFrame implements ActionListener {
    private JComboBox daftar;
    private JTextArea tArea;

    public TryComboBox() {
        super("MENGGUNAKAN COMBO BOX");
        setSize(350, 150);

        String[] mataKuliah = {"Fisika Teknik", "Komputasi Numerik", "Matematika Diskrit"};
        daftar = new JComboBox(mataKuliah);
        daftar.addActionListener(this);

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

    public void actionPerformed(ActionEvent e) {

        String keterangan = (String) daftar.getSelectedItem();
        tArea.setText("\nItem yang terpilih :\n" + keterangan);
    }

    public static void main(String[] args) {
        new TryComboBox();
    }
}
