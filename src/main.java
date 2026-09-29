public class main {
    public static void main(String[] args){
        Gewinnmodel model = new Gewinnmodel();
        GewinnView view = new GewinnView();
        new GewinnController(model, view);
    }
}
