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
import javafx.scene.chart.PieChart.Data;

/**
 *
 * @author HP
 */
public class Finance {

    static Boolean addNewData(String text, LocalDate value, String value0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private int authorityLabel;
//    public static boolean addNewData(float amount, String dept , LocalDate BidDate,) {
//        Data newData;
//        newData = new Data(
//                amount,
//                dept,
//                BidDate
//        );
//        File f = null;
//        FileOutputStream fos = null;
//        ObjectOutputStream oos = null;
//        try {
//            f = new File("FinancialData.bin");
//            if (f.exists()) {
//                fos = new FileOutputStream(f, true);
//                oos = new AppendableObjectOutputStream(fos);
//            } else {
//                fos = new FileOutputStream(f);
//                oos = new ObjectOutputStream(fos);
//            }
//            oos.writeObject(newData);
//            return true;
//        } catch (IOException ex) {
//            return false;
//        } finally {
//            try {
//                if (oos != null) {
//                    oos.close();
//                }
//            } catch (IOException ex) {
//                //
//            }
//        }
//
//    }
//
//    private static class AppendableObjectOutputStream extends ObjectOutputStream {
//
//        public AppendableObjectOutputStream(FileOutputStream fos) {
//        }
//    }

    
}
