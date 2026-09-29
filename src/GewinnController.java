import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
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

                spielView.getSpielerTextFeld().setEnabled(false);
                spielView.getNochmalButton().setEnabled(true);
            }
        });
    }
}
