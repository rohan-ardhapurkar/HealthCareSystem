package healthcaresystem;

import dao.PatientDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import pojo.PatientPojo;

public class ViewPatientForm extends JPanel {

    dao.PatientDAO patient = new dao.PatientDAO();
    JLabel lblname, lblemail, lblcontact, lbladdress, lbldesc, lblenq;
    JLabel lblViewName, lblViewEmail, lblViewContact, lblViewAddress, lblViewDescription, lblViewEnq;
    JComboBox diseaseType;

    ViewPatientForm() {
        try {
            setLayout(null);
            diseaseType = new JComboBox();
            // String s[];

            PatientDAO p = new PatientDAO();
            // ArrayList al[] = p.GetStringData();

            Vector v = p.getNames();

            diseaseType.setModel(new javax.swing.DefaultComboBoxModel<>(v));
            lblname = new JLabel("Patient Name :");
            lblemail = new JLabel("Email ID :");
            lblcontact = new JLabel("Contact No. :");
            lbladdress = new JLabel("Address :");
            lbldesc = new JLabel("Description :");
            lblenq = new JLabel("Enquiry Date :");

            diseaseType.setBounds(200, 10, 250, 30);
            lblname.setBounds(50, 50, 100, 30);
            lblemail.setBounds(50, 100, 100, 30);
            lblcontact.setBounds(50, 150, 100, 30);
            lbladdress.setBounds(50, 200, 100, 30);
            lbldesc.setBounds(50, 250, 100, 30);
            lblenq.setBounds(50, 300, 100, 30);

            lblViewName = new JLabel();
            lblViewEmail = new JLabel();
            lblViewContact = new JLabel();
            lblViewAddress = new JLabel();
            lblViewDescription = new JLabel();
            lblViewEnq = new JLabel();

            lblViewName.setBounds(150, 50, 100, 30);
            lblViewEmail.setBounds(150, 100, 100, 30);
            lblViewContact.setBounds(150, 150, 100, 30);
            lblViewAddress.setBounds(150, 200, 100, 30);
            lblViewDescription.setBounds(150, 250, 100, 30);
            lblViewEnq.setBounds(150, 300, 100, 30);

            add(diseaseType);
            diseaseType.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {

                }
            });

            add(lblname);
            add(lblemail);
            add(lblcontact);
            add(lbladdress);
            add(lbldesc);
            add(lblenq);

            add(lblViewName);
            add(lblViewEmail);
            add(lblViewContact);
            add(lblViewAddress);
            add(lblViewDescription);
            add(lblViewEnq);

            setSize(800, 900);
            setVisible(true);
        } catch (Exception e) {
            System.out.println("" + e);
        }
    }

}
