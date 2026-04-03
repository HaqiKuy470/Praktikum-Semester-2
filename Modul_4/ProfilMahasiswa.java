import javax.swing.*;
import java.awt.*;

public class ProfilMahasiswa extends JFrame {
    public ProfilMahasiswa() {
        setTitle("PROFIL MAHASISWA");
        setBounds(200, 200, 500, 250);
        setLayout(null);

        ImageIcon logo = new ImageIcon("um.png");
        JLabel labelFoto = new JLabel(logo);
        labelFoto.setBounds(20, 20, 150, 150);
        add(labelFoto);

        String data = "<html>NIM: 2405336xxxxx<br>Nama: Moh. Dhiyaulhaq U.<br>"
                    + "Prodi: S1 Pendidikan Teknik Informatika<br>Tempat Lahir: Lamongan<br>"
                    + "Tanggal Lahir: 30 Febuari 2007<br>Jenis Kelamin: Laki-laki</html>";
        
        JLabel labelData = new JLabel(data);
        labelData.setBounds(190, 20, 300, 150);
        add(labelData);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ProfilMahasiswa();
    }
}