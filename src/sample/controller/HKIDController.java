package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

import java.net.URL;
import java.util.ResourceBundle;

public class HKIDController implements Initializable {

    @FXML
    private Button GenerateID;

    @FXML
    private TextField OutputTextField;

    @FXML
    private RadioButton PrefixSingle;

    @FXML
    private ToggleGroup PrefixChoice;

    @FXML
    private RadioButton PrefixDouble;

    @FXML
    void GenerateHKID(ActionEvent event) {
        if(PrefixChoice.getSelectedToggle() !=null){
            RadioButton choice = (RadioButton) PrefixChoice.getSelectedToggle();
            OutputTextField.setText(choice.getText());
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        setRadioButtonsInit();
    }

    private void setRadioButtonsInit(){
        PrefixSingle.setToggleGroup(PrefixChoice);
        PrefixDouble.setToggleGroup(PrefixChoice);
        PrefixSingle.setSelected(true);
    }

}
