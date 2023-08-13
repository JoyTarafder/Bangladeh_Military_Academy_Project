/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class FacultyTrainingSessionSceneController implements Initializable {

    @FXML
    private TextField trainingTopicTextField;
    @FXML
    private DatePicker trainingDatePicker;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void backBattonOnClick(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("FacultyDeshBoard.fxml"));
        Scene newScene = new Scene (parent);
        Stage newStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        newStage.setScene(newScene);
        newStage.show();
    }

    @FXML
    private void addSessionButtonOnClick(ActionEvent event) {
        
        Boolean addTrainingSession = 
                TrainingSession.addNewTrainingSession(
                        trainingTopicTextField.getText(), 
                        trainingDatePicker.getValue()
                );
        if(addTrainingSession)
        {
            Alert a = new Alert(Alert.AlertType.INFORMATION);
            a.setContentText("New training session is added successfully.");
            a.showAndWait();
        }
        else
        {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Oops! Something went wrong. \nTry later...");
            a.showAndWait();
        }  
    }
    
}
