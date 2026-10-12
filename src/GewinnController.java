import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.Color;
public class GewinnController {
    private Gewinnmodel spielModel;
    private GewinnView spielView;

    public GewinnController(Gewinnmodel spielModel, GewinnView spielView){
        this.spielModel = spielModel;
        this.spielView = spielView;

        spielView.getSpielerTextFeld().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                int eingegebeneZahl = Integer.parseInt(spielView.getSpielerTextFeld().getText());
                spielModel.berechneComputerZahl();
                spielModel.berechneRunde(eingegebeneZahl);

                spielView.getComputerTextFeld().setText(String.valueOf(spielModel.getComputerZahl()));
                spielView.getRundenErgebnisLabel().setText("Rundenergebnis: " + spielModel.getRundenErgebnis());
                spielView.getGesamtPunkteLabel().setText("Gesamtpunkte: " + spielModel.getGesamtPunkte());

                if(spielModel.getRundenErgebnis() > 0) {
                    spielView.getRundenErgebnisLabel().setBackground(Color.GREEN);
                    spielView.getGesamtPunkteLabel().setBackground(Color.GREEN);
                } else if(spielModel.getRundenErgebnis() < 0){
                    spielView.getRundenErgebnisLabel().setBackground(Color.RED);
                    spielView.getGesamtPunkteLabel().setBackground(Color.RED);
                } else{
                    spielView.getRundenErgebnisLabel().setBackground(Color.WHITE);
                    spielView.getGesamtPunkteLabel().setBackground(Color.WHITE);
                }

                if(spielModel.hatGewonnen()){
                    JOptionPane.showMessageDialog(spielView, "Du hast gewonnen!");
                } else if (spielModel.hatVerloren()) {
                    JOptionPane.showMessageDialog(spielView, "Du hast verloren!");
                }

                spielView.getSpielerTextFeld().setEnabled(false);
                spielView.getNochmalButton().setEnabled(true);
                spielView.getNochmalButton().requestFocus();
            }
        });

        spielView.getNochmalButton().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                spielView.getSpielerTextFeld().setText("");
                spielView.getComputerTextFeld().setText("");

                spielView.getRundenErgebnisLabel().setText("Tippe eine Zahl von 1 bis 9 ein");

                spielView.getSpielerTextFeld().setEnabled(true);
                spielView.getNochmalButton().setEnabled(false);
                spielView.getSpielerTextFeld().requestFocus();
            }
        });
    }
}