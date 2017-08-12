package dao;
import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class ConnDAO {
     Connection conn;
     ResultSet rs;
     public ConnDAO(){
         try{
         Driver d=new Driver();
         DriverManager.registerDriver(d);
         conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/healthcareapp","root","root");
         if(conn!=null)
         {
             System.out.println("Connected");
         }
         }
         catch(Exception e){
             
         }
        
    }
     
}
