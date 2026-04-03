import javax.swing.JFrame;
import javax.swing.JButton;

public class CreateButton {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button = new JButton("TOMBOL");
        
        frame.setTitle("CREATE BUTTON");
        frame.setBounds(200, 300, 250, 125);
        button.setBounds(25, 25, 100, 25);
        
        frame.add(button);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}