/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class FinancialReportController implements Initializable {

    @FXML
    private TableView<FinancialTableData> FinancialReportTableView;
    @FXML
    private ComboBox<String> DepartmentSelectionComboBox;
    @FXML
    private TableColumn<FinancialTableData, String> ScopeTableColumn;
    @FXML
    private TableColumn<FinancialTableData, String> BudgetTableColumn;
    @FXML
    private Label FinancialDepartmentLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        DepartmentSelectionComboBox.getItems().
                addAll(
                        "Infrastructure Enhancement",
                        "Technology Integration",
                        "Research and Innovation",
                        "Healthcare Services",
                        "Emergency Preparedness"
                );
        ScopeTableColumn.setCellValueFactory(new PropertyValueFactory<FinancialTableData, String>("ScopeTableColumn"));
        BudgetTableColumn.setCellValueFactory(new PropertyValueFactory<FinancialTableData, String>("BudgetTableColumn"));
        
        
    }    
    
    
    int facility ;
    int training;
    int equipment;
    int totalbudget;
    int asssociateProfessorCount = 0;
    int professorCount = 0;

    @FXML
    private void DepartmentSelectcomboBoxOnItem(ActionEvent event) {
//        try {
//            if (DepartmentSelectionComboBox.getValue().equals("Select Department")) {
//
//            } else if (DepartmentSelectionComboBox.getValue().equals("Infrastructure Enhancement")) {
//                FinancialDepartmentLabel.setText("Financial Department: Infrastructure Enhancement");
//                facility=200000;
//                training=300000;
//                equipment=400000;
//                totalbudget=equipment'+'facility'+'training

//            } else if (DepartmentSelectionComboBox.getValue().equals("EEE")) {
//
//            } else if (DepartmentSelectionComboBox.getValue().equals("BBA")) {
//
//            } else if (DepartmentSelectionComboBox.getValue().equals("LLB")) {
//
//            } else itry {
////            if (DepartmentSelectionComboBox.getValue().equals("Select Department")) {
////
////            } else if (DepartmentSelectionComboBox.getValue().equals("Infrastructure Enhancement")) {
////                FinancialDepartmentLabel.setText("Financial Department: Infrastructure Enhancement");
////                facility=200000;
////                training=300000;
////                equipment=400000;f (DepartmentSelectionComboBox.getValue().equals("English")) {
//
//            } else if (DepartmentSelectionComboBox.getValue().equals("Finance")) {

//            } else { //Full IUB
//                facultyCountLabel.setText("IUB");
//                ObjectInputStream ois = null;
//                Faculty tempFaculty = null;
//
//                ois = new ObjectInputStream(new FileInputStream("Faculty.bin"));
//
//                while (true) {
//                    tempFaculty = (Faculty) ois.readObject();
////                  if(tempFaculty.getDesignation().equals("Select Designation"))
////                        lecturerCCount++;
//                    if (tempFaculty.getDesignation().equals("Lecture-C")) {
//                        lecturerCCount++;
//                    } else if (tempFaculty.getDesignation().equals("Lecture-B")) {
//                        lecturerBCount++;
//                    } else if (tempFaculty.getDesignation().equals("Lecture-A")) {
//                        lecturerACount++;
//                    } else if (tempFaculty.getDesignation().equals("Assistant Professor")) {
//                        assistantProfessorCount++;
//                    } else if (tempFaculty.getDesignation().equals("Associate Professor")) {
//                        asssociateProfessorCount++;
//                    } else if (tempFaculty.getDesignation().equals("Professor")) {
//                        professorCount++;
//                    }
//
//                }
//            }
//        } catch (Exception e) {
//            facultyCountTableView.getItems().add(
//                    new FacultyDistributionTableDataClass(
//                            "Lecture-C",
//                            lecturerCCount
//                    )
//            );
//            facultyCountTableView.getItems().add(
//                    new FacultyDistributionTableDataClass(
//                            "Lecture-B",
//                            lecturerBCount
//                    )
//            );
//            facultyCountTableView.getItems().add(
//                    new FacultyDistributionTableDataClass(
//                            "Lecture-A",
//                            lecturerACount
//                    )
//            );
//            facultyCountTableView.getItems().add(
//                    new FacultyDistributionTableDataClass(
//                            "Assistant Professor",
//                            assistantProfessorCount
//                    )
//            );
//            facultyCountTableView.getItems().add(
//                    new FacultyDistributionTableDataClass(
//                            "Associate Professor",
//                            asssociateProfessorCount
//                    )
//            );
//            facultyCountTableView.getItems().add(
//                    new FacultyDistributionTableDataClass(
//                            "Professor",
//                            professorCount
//                    )
//            );
        }
}


