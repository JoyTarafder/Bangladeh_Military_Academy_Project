/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class LogpageController implements Initializable {

    @FXML private TextField usernameTextField;
    @FXML private TextField passwordTextField;
    @FXML
    private CheckBox showPasswordCheckBox;
    @FXML
    private AnchorPane logIndeshBoardAnchorPane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void logInButtonOnClick(ActionEvent event) throws IOException {
        
        String username = usernameTextField.getText();
        String password = passwordTextField.getText();
        
        if(username.equals("admin") && password.equals("password")){
            showAlert("Login Sccessfull!", Alert.AlertType.INFORMATION);
            Parent parent = FXMLLoader.load(getClass().getResource("StudentDeshBoard.fxml"));
            Scene newScene = new Scene (parent);
            Stage newStage = new Stage();
            newStage.setScene(newScene);
            newStage.show();
        }
        else if(username.equals("") && password.equals("")){
            showAlert("Please! Fill out username && Password", Alert.AlertType.ERROR);
        }
        else if(username.equals("")){
            showAlert("Please! Fill out username.", Alert.AlertType.ERROR);
        }
        else if(password.equals("")){
            showAlert("Please! Fill out password.", Alert.AlertType.ERROR);
        }
        else if(username.equals("faculty") && password.equals("pass")){
            showAlert("Login Sccessfull!", Alert.AlertType.INFORMATION);
            Parent parent = FXMLLoader.load(getClass().getResource("FacultyDeshBoard.fxml"));
            Scene newScene = new Scene (parent);
            Stage newStage = new Stage();
            newStage.setScene(newScene);
            newStage.show();
 
        }
        else{
            showAlert("Invalid usename && password!\nTry Aging....",Alert.AlertType.ERROR);
        }     
    }
    
    private void showAlert(String login_sccessful, Alert.AlertType alertType){
        Alert alert = new Alert(alertType);
        alert.setTitle("Login Result");
        alert.setHeaderText(null);
        alert.setContentText(login_sccessful);
        alert.showAndWait();
    }

//    @FXML
//    private void forgotPasswordLinkOnClick(ActionEvent event) {
//    }

    @FXML
    private void forgotPasswordLinkOnClick(ActionEvent event) {
    }

    @FXML
    private void showPasswordCheckBoxOnClick(ActionEvent event) {
        if(showPasswordCheckBox.isSelected()){
//            passwordTextField.setEchoChar((char),0);
        }
    }
    
}
