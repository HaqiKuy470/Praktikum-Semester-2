import java.awt.event.*;
import javax.swing.*;

public class TryTextField implements ActionListener {
    private JTextField textfield;
    private JButton btnTampil;
    private JLabel label;

    public TryTextField() {
        JFrame frame = new JFrame();
        frame.setBounds(200, 200, 325, 175);
        frame.setTitle("TRY TEXT FIELD");
        
        label = new JLabel("Input Kata: ");
        label.setBounds(25, 25, 100, 25);
        frame.add(label);

        textfield = new JTextField();
        textfield.setBounds(125, 25, 150, 25);
        frame.add(textfield);

        btnTampil = new JButton("Tampilkan Kata");
        btnTampil.setBounds(125, 75, 150, 25);
        btnTampil.addActionListener(this); 
        frame.add(btnTampil);

        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnTampil) {
            String kata = textfield.getText();             JOptionPane.showMessageDialog(null, "Anda telah menginput kata: \n" + kata, 
                "INFORMASI", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new TryTextField();
    }
}
