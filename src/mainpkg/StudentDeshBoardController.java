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
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class StudentDeshBoardController implements Initializable {

    @FXML private AnchorPane studentDeshBoardPane;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void signOutButtonOnClick(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("Logpage.fxml"));
        Scene newScene = new Scene (parent);
        Stage newStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        newStage.setScene(newScene);
        newStage.show();
    }

//    private void registrationBillOnClick(ActionEvent event) throws IOException {
//        Parent parent = FXMLLoader.load(getClass().getResource("StudentRegistationBillShow.fxml"));
//        Scene newScene = new Scene (parent);
//        Stage newStage = (Stage)((Node)event.getSource()).getScene().getWindow();
//        newStage.setScene(newScene);
//        newStage.show();
//    }

//    private void courseRegistationOnClick(ActionEvent event) throws IOException {
//        Parent parent = FXMLLoader.load(getClass().getResource("StudentCourseRegistation.fxml"));
//        Scene newScene = new Scene (parent);
//        Stage newStage = (Stage)((Node)event.getSource()).getScene().getWindow();
//        newStage.setScene(newScene);
//        newStage.show();
//    }

    @FXML
    private void registrationBillButtonOnClick(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("StudentRegistationBillShow.fxml"));
        Scene newScene = new Scene (parent);
        Stage newStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        newStage.setScene(newScene);
        newStage.show();
    }

    @FXML
    private void OnlineLibraryOnClick(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("StudentOnlineLibrary.fxml"));
        Scene newScene = new Scene (parent);
        Stage newStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        newStage.setScene(newScene);
        newStage.show();
    }

    @FXML
    private void viewCGPAButtonOnClick(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("StudentViewCGPA.fxml"));
        Scene newScene = new Scene (parent);
        Stage newStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        newStage.setScene(newScene);
        newStage.show();
    }

    @FXML
    private void facultyEvalutionButtonOnClick(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("StudentFacultyEvalution.fxml"));
        Scene newScene = new Scene (parent);
        Stage newStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        newStage.setScene(newScene);
        newStage.show();
    }

    @FXML
    private void viewTranscriptButtonOnClick(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("StudentViewTranscript.fxml"));
        Scene newScene = new Scene (parent);
        Stage newStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        newStage.setScene(newScene);
        newStage.show();
    }

    @FXML
    private void helpCenterButtononClick(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("BMAHelpCenter.fxml"));
        Scene newScene = new Scene (parent);
        Stage newStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        newStage.setScene(newScene);
        newStage.show();
    }

    @FXML
    private void trainingSessionButtonOnClick(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("TrainingSession.fxml"));
        Scene newScene = new Scene (parent);
        Stage newStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        newStage.setScene(newScene);
        newStage.show();
    }

    @FXML
    private void courseRegistationButtonOnClick(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("StudentCourseRegistation.fxml"));
        Scene newScene = new Scene (parent);
        Stage newStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        newStage.setScene(newScene);
        newStage.show();
    }
    
}
