import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

class ImplementsDemo extends Frame implements WindowListener {
    Label label;

    ImplementsDemo(String title) {
        super(title);
        label = new Label("Close the frame.");
        this.add(label);
        this.addWindowListener(this);
    }

    void launchFrame() {
        setSize(300, 300);
        setVisible(true);
    }

    public void windowOpened(WindowEvent e) {
        JOptionPane.showMessageDialog(this, "Selamat datang di aplikasi!");
    }
    public void windowClosing(WindowEvent e) {
        setVisible(false);
        System.exit(0); 
    }

    public void windowActivated(WindowEvent e) {}
    public void windowClosed(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}

    public static void main(String args[]) {
        ImplementsDemo cf = new ImplementsDemo("Close Window Example");
        cf.launchFrame();
    }
}