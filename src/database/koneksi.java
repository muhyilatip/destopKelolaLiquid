package database;

import com.mysql.cj.xdevapi.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class koneksi {

    public static Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public Connection connection;
    
    public koneksi(){
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/liquid",
                    "root","");            
            //JOptionPane.showMessageDialog(null, "terkoneksi database");            
        } 
        catch(SQLException se){
            JOptionPane.showMessageDialog(null, "gagal terkoneksi database");
            System.exit(0);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    
}