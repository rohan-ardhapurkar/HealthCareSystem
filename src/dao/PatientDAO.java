package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PatientDAO {
    ConnDAO connection=ConnDAO.getInstance();
    Connection conn; 
    PreparedStatement stmt;
    ResultSet rs;
    public boolean isInsert(pojo.PatientPojo patient)throws SQLException
    {   
        stmt=conn.prepareStatement("insert into patientmaster values(0,?,?,?,?,?,?)");
        stmt.setString(1,patient.getpName() );
        stmt.setString(2,patient.getpEmail());
        stmt.setString(3,patient.getpContact());
        stmt.setString(4,patient.getpAddress());
        stmt.setString(5,patient.getpDescription());
        stmt.setString(6,patient.getpEnquiryDate());
        int val=stmt.executeUpdate();
        if(val>0)
            return true;
        else
            return false;
    }
}
