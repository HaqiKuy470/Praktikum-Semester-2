import javax.swing.*;
import java.awt.event.*;

public class FourOperations extends JFrame implements ActionListener {
    private JTextField jTFinput1, jTFinput2, jTFHasil;
    private JLabel label1, label2, labelHasil;
    private JButton btnJumlah, btnKurang, btnKali, btnBagi;

    public FourOperations() {
        setTitle("SIMPLE PROGRAM TO COUNT");
        setBounds(200, 200, 450, 300);
        setLayout(null);

        label1 = new JLabel("Bilangan 1 :");
        label1.setBounds(30, 30, 100, 25);
        add(label1);

        jTFinput1 = new JTextField();
        jTFinput1.setBounds(130, 30, 100, 25);
        add(jTFinput1);

        label2 = new JLabel("Bilangan 2 :");
        label2.setBounds(30, 80, 100, 25);
        add(label2);

        jTFinput2 = new JTextField();
        jTFinput2.setBounds(130, 80, 100, 25);
        add(jTFinput2);

        labelHasil = new JLabel("Hasil :");
        labelHasil.setBounds(150, 150, 100, 25);
        add(labelHasil);

        jTFHasil = new JTextField();
        jTFHasil.setBounds(200, 150, 150, 25);
        jTFHasil.setEditable(false); 
        add(jTFHasil);

        // Tombol Operasi
        btnJumlah = new JButton("+");
        btnJumlah.setBounds(250, 30, 60, 25);
        btnJumlah.addActionListener(this);
        add(btnJumlah);

        btnKali = new JButton("*");
        btnKali.setBounds(330, 30, 60, 25);
        btnKali.addActionListener(this);
        add(btnKali);

        btnKurang = new JButton("-");
        btnKurang.setBounds(250, 80, 60, 25);
        btnKurang.addActionListener(this);
        add(btnKurang);

        btnBagi = new JButton("/");
        btnBagi.setBounds(330, 80, 60, 25);
        btnBagi.addActionListener(this);
        add(btnBagi);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int bil1 = Integer.parseInt(jTFinput1.getText().trim());
            int bil2 = Integer.parseInt(jTFinput2.getText().trim());
            double hasil = 0;

            if (e.getSource() == btnJumlah) hasil = bil1 + bil2;
            else if (e.getSource() == btnKurang) hasil = bil1 - bil2;
            else if (e.getSource() == btnKali) hasil = (double) bil1 * bil2;
            else if (e.getSource() == btnBagi) {
                if (bil2 != 0) hasil = (double) bil1 / bil2;
                else JOptionPane.showMessageDialog(this, "Pembagi tidak boleh nol!");
            }

            jTFHasil.setText(String.valueOf(hasil));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Input harus berupa angka!");
        }
    }

    public static void main(String[] args) {
        new FourOperations();
    }
}