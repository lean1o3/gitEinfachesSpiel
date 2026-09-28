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

        JPanel ergebnisBereich = new JPanel(new GridLayout(2, 2, 5, 2));
        JLabel rundenTitel = new JLabel("Rundenergebnis: ", SwingConstants.CENTER);
        JLabel punkteTitel = new JLabel("Gesamtpunkte: ", SwingConstants.CENTER);
        rundenErgebnisLabel = new JLabel("Schreibe eine Zahl von 1 bis 9", SwingConstants.CENTER);
        gesamtPunkteLabel = new JLabel("30", SwingConstants.CENTER);

        rundenErgebnisLabel.setOpaque(true);
        gesamtPunkteLabel.setOpaque(true);

        rundenErgebnisLabel.setBackground(Color.WHITE);
        gesamtPunkteLabel.setBackground(Color.WHITE);

        ergebnisBereich.add(rundenTitel);
        ergebnisBereich.add(punkteTitel);
        ergebnisBereich.add(rundenErgebnisLabel);
        ergebnisBereich.add(gesamtPunkteLabel);

        add(ergebnisBereich, BorderLayout.NORTH);
    }
}
