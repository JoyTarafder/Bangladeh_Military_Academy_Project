
package mainpkg;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;


public class TrainingSessionController implements Initializable {

    @FXML private TableView<TrainingSession> trainigSessionTableView;
    @FXML private TableColumn<TrainingSession, String> DatetableColumn;
    @FXML private TableColumn<TrainingSession, String> topicTableColumn;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        DatetableColumn.setCellValueFactory(new PropertyValueFactory <TrainingSession,String>( "date" ));
        topicTableColumn.setCellValueFactory(new PropertyValueFactory<TrainingSession,String>( "topic" ));
        
        ObjectInputStream Ois = null;
        TrainingSession tempTrainingSession = null;
        try {
                Ois = new ObjectInputStream (
                new FileInputStream ("TrainingSession.bin"));
//                tempTrainingSession = (TrainingSession)Ois.readObject();

                while (true) {
                    tempTrainingSession = (TrainingSession)Ois.readObject();
                } 
        }
        catch(Exception e){
                trainigSessionTableView.getItems().add(tempTrainingSession);
        }
  
    }    

    @FXML
    private void backStudentDeshboardOnClick(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("StudentDeshBoard.fxml"));
        Scene newScene = new Scene (parent);
        Stage newStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        newStage.setScene(newScene);
        newStage.show();
    }
    
}
