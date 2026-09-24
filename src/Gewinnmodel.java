public class Gewinnmodel {
    private int gesamtPunkte;
    private int spielerZahl;
    private int computerZahl;
    private int rundenErgebnis;

    public Gewinnmodel(){
        gesamtPunkte = 30;
        spielerZahl = 0;
        computerZahl = 0;
        rundenErgebnis = 0;
    }

    public int getGesamtPunkte(){
        return gesamtPunkte;
    }

    public int getComputerZahl(){
        return computerZahl;
    }

    public int getRundenErgebnis(){
        return rundenErgebnis;
    }

    public void berechneComputerZahl(){
        computerZahl = (int)(Math.random() * 9) + 1;
    }

    public void berechneRunde (int spielerZahl){
        this.spielerZahl = spielerZahl;
        if(computerZahl == spielerZahl){
            rundenErgebnis = 20;
        } else if(spielerZahl == computerZahl + 1 || spielerZahl == computerZahl - 1){
            rundenErgebnis = 5;
        } else{
            rundenErgebnis = -10;
        }
        gesamtPunkte = gesamtPunkte + rundenErgebnis;
    }
}
