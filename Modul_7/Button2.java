import javax.swing.*;
import java.awt.*;
import java.awt.event.*;class Button2 extends JFrame implements ActionListener {
    private JButton btnEvent;
    private JLabel label;

    public Button2() {
        super("SHOW BUTTON 2");
        setSize(300, 200);
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 50));
        label = new JLabel("Menampilkan ");
        btnEvent = new JButton("BUTTON 2");
        panel.add(label);
        panel.add(btnEvent);
        add("South", panel);
        btnEvent.addActionListener(this);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnEvent) {
            new Button1(); 
            setVisible(false);
        }
    }
}