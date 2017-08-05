package healthcaresystem;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class ViewPatientForm extends JPanel{
    JLabel lblname,lblemail,lblcontact,lbladdress,lbldesc,lblenq;
    JLabel lblViewName,lblViewEmail,lblViewContact,lblViewAddress,lblViewDescription,lblViewEnq;
    
    ViewPatientForm(){
        setLayout(null);
        
        lblname=new JLabel("Patient Name :");
        lblemail=new JLabel("Email ID :");
        lblcontact=new JLabel("Contact No. :");
        lbladdress=new JLabel("Address :");
        lbldesc=new JLabel("Description :");
        lblenq=new JLabel("Enquiry Date :");
        
        lblname.setBounds(50,50,100,30);
        lblemail.setBounds(50,100,100,30);
        lblcontact.setBounds(50,150,100,30);
        lbladdress.setBounds(50,200,100,30);
        lbldesc.setBounds(50,250,100,30);
        lblenq.setBounds(50,300,100,30);
        
        
        lblViewName=new JLabel();
        lblViewEmail=new JLabel();
        lblViewContact=new JLabel();
        lblViewAddress=new JLabel();
        lblViewDescription=new JLabel();
        lblViewEnq=new JLabel();
        
        
        lblViewName.setBounds(150,50,100,30);
        lblViewEmail.setBounds(150,100,100,30);
        lblViewContact.setBounds(150,150,100,30);
        lblViewAddress.setBounds(150,200,100,30);
        lblViewDescription.setBounds(150,250,100,30);
        lblViewEnq.setBounds(150,300,100,30);
        
        add(lblname);add(lblemail);add(lblcontact);add(lbladdress);add(lbldesc);add(lblenq);
        
        add(lblViewName);add(lblViewEmail);add(lblViewContact);add(lblViewAddress);add(lblViewDescription);
        add(lblViewEnq);
        
        setSize(800,900);
        setVisible(true);
    }
}
