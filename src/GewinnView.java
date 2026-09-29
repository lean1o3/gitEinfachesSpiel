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

        JPanel spielBereich = new JPanel(new GridLayout(2, 2, 10, 5));
        JLabel spielerLabel = new JLabel("Deine Zahl: ", SwingConstants.CENTER);
        JLabel computerLabel = new JLabel("Computer: ", SwingConstants.CENTER);

        spielerTextFeld = new JTextField();
        computerTextFeld = new JTextField();

        computerTextFeld.setEditable(false);

        spielerTextFeld.setHorizontalAlignment(JTextField.CENTER);
        computerTextFeld.setHorizontalAlignment(JTextField.CENTER);

        spielBereich.add(spielerLabel);
        spielBereich.add(computerLabel);
        spielBereich.add(spielerTextFeld);
        spielBereich.add(computerTextFeld);

        add(spielBereich, BorderLayout.CENTER);

        JPanel buttonBereich = new JPanel();
        nochmalButton = new JButton("noch einmal");
        buttonBereich.add(nochmalButton);
        add(buttonBereich, BorderLayout.SOUTH);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public JLabel getGesamtPunkteLabel(){
        return gesamtPunkteLabel;
    }

    public JLabel getRundenErgebnisLabel(){
        return rundenErgebnisLabel;
    }

    public JTextField getSpielerTextFeld(){
        return spielerTextFeld;
    }

    public JTextField getComputerTextFeld(){
        return computerTextFeld;
    }

    public JButton getNochmalButton(){
        return nochmalButton;
    }
}
