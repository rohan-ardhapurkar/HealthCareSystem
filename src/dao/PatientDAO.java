package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import pojo.PatientPojo;

import java.util.Vector;

public class PatientDAO extends ConnDAO {

    PreparedStatement stmt;
    ResultSet rs;

    public boolean isInsert(pojo.PatientPojo patient) throws SQLException {
        stmt = conn.prepareStatement("insert into patientmaster values(0,?,?,?,?,?,?)");
        stmt.setString(1, patient.getpName());
        stmt.setString(2, patient.getpEmail());
        stmt.setString(3, patient.getpContact());
        stmt.setString(4, patient.getpAddress());
        stmt.setString(5, patient.getpDescription());
        stmt.setString(6, patient.getpEnquiryDate());
        int val = stmt.executeUpdate();
        if (val > 0) {
            return true;
        } else {
            return false;
        }
    }

    public ResultSet getData() throws Exception {

        stmt = conn.prepareStatement("select * from patientmaster");
        rs = stmt.executeQuery();

        return rs;
    }

    public ArrayList[] GetStringData() throws Exception {
        ArrayList al[] = null;
        int count = 0;
        stmt = conn.prepareStatement("select * from patientmaster");
        rs = stmt.executeQuery();
        while (rs.next()) {
            count++;
        }
        al = new ArrayList[count];
        count = 0;
        stmt = conn.prepareStatement("select * from patientmaster");
        rs = stmt.executeQuery();
        while (rs.next()) {
            al[count] = new ArrayList();
            al[count].add(rs.getString(1));
            al[count].add(rs.getString(2));
            count++;
        }
        return al;
    }

    public Vector getNames() throws Exception {
        Vector v = new Vector();
        stmt = conn.prepareStatement("select * from patientmaster");
        rs = stmt.executeQuery();
        while (rs.next()) {
            v.add(rs.getString(2));

        }

        return v;
    }

    public String[] getStringArrayData() throws Exception {
        String s[] = null;
        int count = 0;
        stmt = conn.prepareStatement("select * from patientmaster");
        rs = stmt.executeQuery();

        while (rs.next()) {
            count++;
        }
        s = new String[count];
        count = 0;
        stmt = conn.prepareStatement("select * from patientmaster");
        rs = stmt.executeQuery();
        while (rs.next()) {
            s[count] = rs.getString(2).toString();
            count++;
        }

        return s;
    }
}
