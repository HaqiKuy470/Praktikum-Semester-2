import javax.swing.*;
import java.awt.*;

public class KeteranganLabel extends JFrame {
    public KeteranganLabel() {
        setTitle("KETERANGAN LABEL");
        setBounds(200, 200, 400, 300);
        setLayout(null);

        // Label 1: Teks saja
        JLabel l1 = new JLabel("Label 1: Label berupa teks saja.");
        l1.setBounds(20, 20, 300, 25);
        l1.setToolTipText("Ini adalah ToolTip untuk Label 1");
        add(l1);

        // Label 2: Icon di kiri teks
        ImageIcon iconJava = new ImageIcon("Modul_4/java_icon.png"); 
        JLabel l2 = new JLabel("Label 2: Icon di kiri teks.", iconJava, SwingConstants.LEFT);
        l2.setBounds(20, 60, 300, 50);
        l2.setToolTipText("Mouse pointer berada pada label 2");
        add(l2);

        // Label 3: Icon di atas teks
        JLabel l3 = new JLabel("Label 3: Icon di atas teks.", iconJava, SwingConstants.CENTER);
        l3.setVerticalTextPosition(SwingConstants.BOTTOM);
        l3.setHorizontalTextPosition(SwingConstants.CENTER);
        l3.setBounds(20, 130, 300, 100);
        l3.setToolTipText("Ini adalah ToolTip untuk Label 3");
        add(l3);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new KeteranganLabel();
    }
}