package healthcaresystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class AddPatientForm extends JFrame implements ActionListener {

    JLabel lblHeader, lblPatientName, lblEmail, lblContact, lblAddress, lblDescription, lblEnqDate;
    JTextField txtPatientName, txtEmail, txtContact, txtAddress, txtDescription, txtEnqDate;
    JButton btnRegister, btnReset;
    Container c;

    AddPatientForm() {
        setLayout(null);
        c = this.getContentPane();

        //create the labels
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
        btnReset = new JButton("RESET");

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

        //set the positions of the buttons on form
        btnRegister.setBounds(150, 400, 100, 30);
        btnReset.setBounds(300, 400, 100, 30);

        //add the labels on the form
        c.add(lblHeader);
        c.add(lblPatientName);
        c.add(lblEmail);
        c.add(lblContact);
        c.add(lblAddress);
        c.add(lblDescription);
        c.add(lblEnqDate);

        //add the text fields on the form
        c.add(txtPatientName);
        c.add(txtEmail);
        c.add(txtContact);
        c.add(txtAddress);
        c.add(txtDescription);
        c.add(txtEnqDate);

        // add buttons on the form
        c.add(btnRegister);
        c.add(btnReset);
        // set visiblity  
        setSize(600, 600);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
