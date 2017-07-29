package healthcaresystem;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class MasterForm extends JFrame implements ActionListener{

    JDesktopPane jdp;
    JMenu patientMenu, diseaseMenu;
    JMenuItem addPatient, updatePatient, viewPatient, deletePatient;

    JMenuBar jmb;
    Container c;

    MasterForm() {
        setLayout(null);
        c = this.getContentPane();

        //add the patient menu 
        jdp = new JDesktopPane();
        jmb = new JMenuBar();
        patientMenu = new JMenu("Patient");
        addPatient = new JMenuItem("ADD Patient");
        updatePatient = new JMenuItem("Update Patient");
        viewPatient = new JMenuItem("View Patient Details");
        deletePatient = new JMenuItem("Remove Patient");

        // add menus on form
        patientMenu.add(addPatient);
        patientMenu.add(updatePatient);
        patientMenu.add(viewPatient);
        patientMenu.add(deletePatient);

        // add menu to menu bar
        jmb.add(patientMenu);
        setJMenuBar(jmb);
        
        addPatient.addActionListener(this);

        setSize(600, 400);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==addPatient)
        {
            new AddPatientForm();
        }
    }
}
