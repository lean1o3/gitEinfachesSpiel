import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class GewinnController {
    private Gewinnmodel spielModel;
    private GewinnView spielView;

    public GewinnController(Gewinnmodel spielModel, GewinnView spielView){
        this.spielModel = spielModel;
        this.spielView = spielView;
    }
}
