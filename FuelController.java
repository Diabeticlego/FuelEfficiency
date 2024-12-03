package FuelEfficiency;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class FuelController {
    @FXML
    DatePicker dpDate = new DatePicker();
    @FXML
    TextField tfDTM = new TextField();
    @FXML
    TextField tfFCG = new TextField();
    @FXML
    TextArea taCalcList = new TextArea();
    @FXML
    Label lbMPG = new Label();


    public void btcalculate(ActionEvent actionEvent) {
        LocalDate date = dpDate.getValue();
        double dist = Double.parseDouble(tfDTM.getText());
        double cons = Double.parseDouble(tfFCG.getText());

        Fuel f1 = new Fuel (date, dist, cons);

        //display of gets and calculate and sout.
        taCalcList.setText( taCalcList.getText()+ f1.toString());


     }
}
