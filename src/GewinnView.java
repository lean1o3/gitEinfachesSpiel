import javax.swing.*;
import java.awt.*;
public class GewinnView extends JFrame{
    private JLabel gesamtPunkteLabel;
    private JLabel rundenErgebnisLabel;
    private JTextField spielerTextFeld;
    private JTextField computerTextFeld;
    private JButton nochmalButton;

    public GewinnView(){
        setTitle("Einfaches Spiel (v1.0)");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(5, 5));
    }
}
