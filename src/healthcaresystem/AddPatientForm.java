package healthcaresystem;

import dao.PatientDAO;
import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.event.*;
import pojo.PatientPojo;

public class AddPatientForm extends JFrame implements ActionListener {

    JLabel lblHeader, lblPatientName, lblEmail, lblContact, lblAddress, lblDescription, lblEnqDate;
    JTextField txtPatientName, txtEmail, txtContact, txtAddress, txtDescription, txtEnqDate;
    JButton btnRegister;

    Container c;

    AddPatientForm() {
        setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        setLayout(null);
        c = this.getContentPane();
        lblHeader = new JLabel("FILL PATIENT DETAILS HERE");
        lblPatientName = new JLabel("Patient Name :");
        lblEmail = new JLabel("EMAIL :");
        lblContact = new JLabel("Contact :");
        lblAddress = new JLabel("Address :");
        lblDescription = new JLabel("Description :");
        lblEnqDate = new JLabel("Enquiry Date :");

        //craete the text fields 
        txtPatientName = new JTextField();
        txtEmail = new JTextField();
        txtContact = new JTextField();
        txtAddress = new JTextField();
        txtDescription = new JTextField();
        txtEnqDate = new JTextField();

        //create button 
        btnRegister = new JButton("REGISTER");
        //btnReset = new JButton("RESET");

        // set positions of labels on the form
        lblHeader.setBounds(150, 50, 200, 50);
        lblPatientName.setBounds(50, 100, 100, 30);
        lblEmail.setBounds(50, 150, 100, 30);
        lblContact.setBounds(50, 200, 100, 30);
        lblAddress.setBounds(50, 250, 100, 30);
        lblDescription.setBounds(50, 300, 100, 30);
        lblEnqDate.setBounds(50, 350, 100, 30);

        // set positions of the text fields on the form
        txtPatientName.setBounds(200, 100, 170, 30);
        txtEmail.setBounds(200, 150, 170, 30);
        txtContact.setBounds(200, 200, 170, 30);
        txtAddress.setBounds(200, 250, 170, 30);
        txtDescription.setBounds(200, 300, 170, 30);
        txtEnqDate.setBounds(200, 350, 170, 30);

        c.add(lblHeader);
        c.add(lblPatientName);
        c.add(lblEmail);
        c.add(lblContact);
        c.add(lblAddress);
        c.add(lblDescription);
        c.add(lblEnqDate);

        c.add(txtPatientName);
        c.add(txtEmail);
        c.add(txtContact);
        c.add(txtAddress);
        c.add(txtDescription);
        c.add(txtEnqDate);

        c.add(btnRegister);

        //set the positions of the buttons on form
        btnRegister.setBounds(150, 400, 100, 30);
        btnRegister.addActionListener(this);
        //btnReset.setBounds(300, 400, 100, 30);
        setSize(500, 500);
        setVisible(true);
    }

    public void insertData(PatientPojo patientpojo) {
        String p_name = txtPatientName.getText().toString();
        String p_email = txtEmail.getText().toString();
        String p_contact = txtContact.getText().toString();
        String p_address = txtAddress.getText().toString();
        String p_description = txtDescription.getText().toString();
        String p_enq = txtEnqDate.getText().toString();
        patientpojo.setpName(p_name);
        patientpojo.setpEmail(p_email);
        patientpojo.setpContact(p_contact);
        patientpojo.setpAddress(p_address);
        patientpojo.setpDescription(p_description);
        patientpojo.setpEnquiryDate(p_enq);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        PatientPojo patientpojo = new PatientPojo();
        insertData(patientpojo);
        dao.PatientDAO patientdao = new PatientDAO();
        try {
            boolean b = patientdao.isInsert(patientpojo);
            if (b) {

                JOptionPane.showMessageDialog(this, "INSERTED DATA SUCESSFULLY..");
            } else {

                JOptionPane.showMessageDialog(this, "NOT INSERTED DATA SUCESSFULLY..", "ERROR", JOptionPane.ERROR_MESSAGE);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "EXCEPTION IS" + e, "ERROR", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(AddPatientForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
