/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author HP
 */
//public class ShowBudgetController implements Initializable {
//    private ComboBox<String> fileNameComboBox;
//    private TextArea fileContentTextArea;
//    @Override
//    public void initialize(URL url, ResourceBundle rb) {
//        fileNameComboBox.getItems().addAll(
//                "select File Name to Load",
//                "FinancialData.bin"
//                
//        );
//        fileContentTextArea.clear();
//    }
//    Data tempData = null;
//
//    @FXML
//    private void LoadfileContentbuttonOnClick(ActionEvent event) {
//        FileInputStream fis = null;
//        ObjectInputStream ois = null;
//        Object object = null;

//        try {
//            String selectedFileName = fileNameComboBox.getItems().toString();
//            fis = new FileInputStream(selectedFileName);
//            ois = new ObjectInputStream(fis);
//            if (selectedFileName.equals("FinancialData.bin")) {
//                Data obj = null;
//        } catch (Exception e) {
//
//        }
//    
//    }   catch (FileNotFoundException ex) {
//            Logger.getLogger(ShowBudgetController.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(ShowBudgetController.class.getName()).log(Level.SEVERE, null, ex);
//        }
