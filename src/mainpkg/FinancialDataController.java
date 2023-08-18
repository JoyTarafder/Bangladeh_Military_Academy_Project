/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class FinancialDataController implements Initializable {
    @FXML
    private TextField EnteramountTextField;
    @FXML
    private ComboBox<String> DepartmentComboBox;
    @FXML
    private DatePicker BidDatepicker;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        DepartmentComboBox.getItems().
                addAll(
                        "Infrastructure Enhancement",
                        "Technology Integration",
                        "Research and Innovation",
                        "Healthcare Services",
                        "Emergency Preparedness"
                );
        // TODO
    }    


    @FXML
    private void AddDataButtonOnClick(ActionEvent event) {
        String amountString = Enteramount.getText();
        
//
//        try {
//            int amount = Integer.parseInt(amountString);
//            
//
//            Boolean addStatus = Finance.addNewData(
//                    EnteramountTextField.getText(),
//                    BidDatepicker.getValue(),
//                    DepartmentComboBox.getValue()
//                    
                    
    }
    private static class Enteramount {

        private static String getText() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public Enteramount() {
        }
    }
}
