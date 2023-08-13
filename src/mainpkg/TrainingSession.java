/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Asus
 */
public class TrainingSession {

    public TrainingSession(String topic, LocalDate date) {
        //......... code
    }
    
    public static boolean addNewTrainingSession( String topic, LocalDate date){
        TrainingSession newTrainingSession = new TrainingSession(
                topic, 
                date
        );
        
        File f = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;
        
        try {
            f = new File("Faculty.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);                
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);               
            }
           
            oos.writeObject(newTrainingSession);
            oos.close();
            return true;
           
        } catch (IOException ex) {
            if(oos!=null) try {
                oos.close();
            } catch (IOException ex1) {
                Logger.getLogger(newTrainingSession.class.getName()).log(Level.SEVERE, null, ex1);
            }
            return false;
        }  
     
    }
}
