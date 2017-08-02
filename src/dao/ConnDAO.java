package dao;
import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
class ConnDAO {
    private Connection conn;
    private static ConnDAO obj=null;
    private ConnDAO()throws SQLException{
           Driver d=new Driver();
           DriverManager.registerDriver(d);
           conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/healthcareapp","root","root");
           if(conn!=null){
               System.out.println("SUCCESS");
           }
           else{
               System.out.println("NOT SUCCESS");
               
           }
   }
    public static ConnDAO getInstance()
    {
        if(obj==null)
            try {
                obj=new ConnDAO();
        } catch (SQLException ex) {
            Logger.getLogger(ConnDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }
}
