import javax.swing.JFrame;
import javax.swing.JLabel;

public class CreateLabel {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("CREATE LABEL");
        frame.setBounds(200, 200, 300, 150);
        
        JLabel label = new JLabel("S1 Pendidikan Teknik Informatika");
        label.setBounds(25, 25, 200, 25);
        
        frame.add(label);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}