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
        computerZahl = (int)(Math.random() * 0) + 1;
    }
}
