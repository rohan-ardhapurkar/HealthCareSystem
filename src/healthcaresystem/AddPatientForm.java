/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthcaresystem;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Sandip
 */
public class AddPatientForm extends JPanel
{  
    JLabel lblpname,lblemail,lblcontact,lbladdress,lbldescription,lblenqdate;
    JTextField txtName,txtEmail,txtContact,txtAddress,txtDescription,txtEnqdate;
    JButton btnSubmit,btnReset;
    AddPatientForm()
    {  setLayout(null);
        //add new labels
        
        lblpname=new JLabel("NAME :");
        lblemail=new JLabel("EMAIL :");
        lblcontact=new JLabel("CONTACT NO. :");
        lbladdress=new JLabel("ADDRESS :");
        lbldescription=new JLabel("DESCRIPTION :");
        lblenqdate=new JLabel("ENQUIRY DATE :");
        
        //set the labels positions 
        
        lblpname.setBounds(50,50,100,30);
        lblemail.setBounds(50,100,100,30);
        lblcontact.setBounds(50,150,100,30);
        lbladdress.setBounds(50,200,100,30);
        lbldescription.setBounds(50,250,100,30);
        lblenqdate.setBounds(50,300,100,30);
    
        //add new textboxes
        
        txtName=new JTextField();
        txtEmail=new JTextField();
        txtContact=new JTextField();
        txtAddress=new JTextField();
        txtDescription=new JTextField();
        txtEnqdate=new JTextField();
        
        //set the positions of textboxes on the form
        txtName.setBounds(200,50,200,30);
        txtEmail.setBounds(200,100,200,30);
        txtContact.setBounds(200,150,200,30);
        txtAddress.setBounds(200,200,200,30);
        txtDescription.setBounds(200,250,200,30);
        txtEnqdate.setBounds(200,300,200,30);
        
        
        // add the buttons 
        
        btnSubmit=new JButton("ADD PATIENT");
        btnReset=new JButton("RESET");


        //set the positions of the buttons 
        
        btnSubmit.setBounds(50,350,100,30);
        btnReset.setBounds(200,350,100,30);
        // add all the fields on the form
        add(lblpname);add(lblemail);add(lblcontact);
          add(lbladdress);add(lbldescription);add(lblenqdate);
          
        add(txtName);add(txtEmail);add(txtContact);add(txtAddress);add(txtDescription);
        add(txtEnqdate);
        
        add(btnSubmit);add(btnReset);
          setVisible(true);
          setSize(800,900);
    }
}
