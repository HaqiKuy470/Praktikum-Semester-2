import javax.swing.JFrame;
import javax.swing.JTextField;

public class CreateTextField {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JTextField textfield = new JTextField();
        frame.setTitle("CREATE TEXT FIELD");
        frame.setBounds(200, 200, 300, 200);
        
        frame.add(textfield);        textfield.setBounds(50, 50, 150, 25); 
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
