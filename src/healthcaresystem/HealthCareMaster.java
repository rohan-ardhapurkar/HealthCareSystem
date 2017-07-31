package healthcaresystem;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import pojo.PatientPojo;

public class HealthCareMaster extends JFrame implements MouseListener {

    JTabbedPane jtp;
    JPanel patientPanel, diseasePanel, medicinePanel, reportPanel;

    HealthCareMaster() {
        //set layout to null for setting bounds 
        setLayout(null);
        setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        setResizable(true);
        setFocusable(true);
        //create the patient panel 
        patientPanel = new JPanel();
        diseasePanel = new JPanel();
        medicinePanel = new JPanel();
        reportPanel = new JPanel();

        patientPanel.addMouseListener(this);
        //create JTabbedPane on the form
        jtp = new JTabbedPane();

        //set position of the tabbed pane on the form
        jtp.setBounds(20, 20, 600, 600);

        //add the panel on the tabbed pane
        jtp.add("Patient", patientPanel);
        jtp.add("Disease", diseasePanel);
        jtp.add("Medicine", medicinePanel);
        jtp.add("Report", reportPanel);

        this.add(jtp);
        setLocation(50, 50);
        setSize(600, 600);
        setVisible(true);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == patientPanel) {
            new AddPatientForm();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

}
