import javax.swing.JFrame;

public class CreateFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("CREATE FRAME");
        frame.setBounds(200, 200, 300, 150);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
