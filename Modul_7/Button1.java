import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Button1 extends JFrame implements ActionListener {
    private JButton btnEvent;
    private JLabel label;

    public Button1() {
        super("SHOW BUTTON 1");
        setSize(300, 200);
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 50));
        label = new JLabel("Menampilkan ");
        btnEvent = new JButton("BUTTON 1");
        panel.add(label);
        panel.add(btnEvent);
        add("North", panel);
        btnEvent.addActionListener(this);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnEvent) {
            new Button2();
            setVisible(false); 
        }
    }
}
