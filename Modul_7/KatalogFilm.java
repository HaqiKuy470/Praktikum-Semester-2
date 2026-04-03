import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KatalogFilm extends JFrame implements ActionListener {
    private JComboBox<String> comboFilm;
    private JLabel labelGambar;
    private String[] listFilm = {"Avatar", "Inception", "Interstellar"};

    public KatalogFilm() {
        super("Katalog Film Arshaka");
        setSize(400, 400);
        setLayout(new FlowLayout());

        comboFilm = new JComboBox<>(listFilm);
        comboFilm.addActionListener(this);
        add(comboFilm);

        labelGambar = new JLabel("Pilih film untuk lihat poster");
        add(labelGambar);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        String pilihan = (String) comboFilm.getSelectedItem();
        labelGambar.setText("Menampilkan poster: " + pilihan + ".png");
    }

    public static void main(String[] args) {
        new KatalogFilm();
    }
}