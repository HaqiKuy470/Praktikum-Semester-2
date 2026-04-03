import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class LabelIcon {
    public LabelIcon() {
        JFrame frame = new JFrame();
        frame.setTitle("LABEL ICON");
        frame.setBounds(200, 200, 350, 200);
        
        ImageIcon um = new ImageIcon("um.png"); 
        JLabel label = new JLabel("UNIVERSITAS NEGERI MALANG", um, SwingConstants.CENTER);
        label.setBounds(25, 25, 325, 100);

        label.setHorizontalTextPosition(SwingConstants.LEFT);
        label.setVerticalTextPosition(SwingConstants.TOP);
        
        frame.add(label);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new LabelIcon();
    }
}