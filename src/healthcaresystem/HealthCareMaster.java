package healthcaresystem;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import pojo.PatientPojo;

public class HealthCareMaster extends JFrame implements ChangeListener {

    JTabbedPane jtp, patient, disease, medicine, report;
    JPanel patientPanel, diseasePanel, medicinePanel, reportPanel;
    JPanel addPatient, viewPatient, updatePatient;
    JPanel addDiseaseType, addDisease, updateDisease, viewDisease;
    JPanel addMedicine, viewMedicines, updateMedicines;
    JPanel viewReports, viewGraphs;
    String center = BorderLayout.CENTER;

    public HealthCareMaster() {
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

        //create JTabbedPane on the form
        jtp = new JTabbedPane();

        //set position of the tabbed pane on the form
        jtp.setBounds(20, 20, 600, 600);
        jtp.addChangeListener(this);
        //add the panel on the tabbed pane
        jtp.add("Patient", patientPanel);
        jtp.add("Disease", diseasePanel);
        jtp.add("Medicine", medicinePanel);
        jtp.add("Report", reportPanel);

        jtp.setSize(800, 500);
        this.add(jtp, center);
        setLocation(50, 50);
        setSize(900, 600);
        setVisible(true);

    }

    /* public void addPatientPanel(){
        patientPanel.setLayout(null);
        patientPanel.setAutoscrolls(true);
        
        JLabel lblpname,lblemail,lblcontact,lbladdress,lbldescription,lblenqdate;
        JTextField txtpname,txtemail,txtcontact,txtaddress,txtdescription,txtenqdate;
        JButton btnRegister,btnReset;
        lblpname=new JLabel("Patient Name");
        lblemail=new JLabel("Email");
        lblcontact=new JLabel("Contact");
        lbladdress=new JLabel("Address");
        lbldescription=new JLabel("Description");
        lblenqdate=new JLabel("Enquiry Date");
        
        txtpname=new JTextField();
        txtemail=new JTextField();
        txtcontact=new JTextField();
        txtaddress=new JTextField();
        txtdescription=new JTextField();
        txtenqdate=new JTextField();
        
        btnRegister=new JButton("ADD");
        btnReset=new JButton("RESET");
        
        lblpname.setBounds(100,50,100,30);
        lblemail.setBounds(100, 100, 100, 30);
        lblcontact.setBounds(100,150,100,30);
        lbladdress.setBounds(100,200,100,30);
        lbldescription.setBounds(100,250,100,30);
        lblenqdate.setBounds(100,300,100,30);
        
        txtpname.setBounds(250,50,200,30);
        txtemail.setBounds(250,100,200,30);
        txtcontact.setBounds(250,150,200,30);
        txtaddress.setBounds(250,200,200,30);
        txtdescription.setBounds(250,250,200,30);
        txtenqdate.setBounds(250,300,200,30);
        
        
        btnRegister.setBounds(100,350,200,30);
        btnReset.setBounds(350,350,200,30);
        
        patientPanel.add(lblpname);
        patientPanel.add(lblemail);
        patientPanel.add(lblcontact);
        patientPanel.add(lbladdress);
        patientPanel.add(lbldescription);
        patientPanel.add(lblenqdate);
        
        
        patientPanel.add(txtpname);
        patientPanel.add(txtemail);
        patientPanel.add(txtcontact);
        patientPanel.add(txtaddress);
        patientPanel.add(txtdescription);
        patientPanel.add(txtenqdate);
        
        patientPanel.add(btnRegister);
        patientPanel.add(btnReset);
        
        
        
        patientPanel.setVisible(true);
        
        
        
    }*/
    public void addPatientPane() {

        patientPanel.setLayout(null);
        addPatient = new JPanel();
        viewPatient = new JPanel();
        updatePatient = new JPanel();

        patient = new JTabbedPane();

        patient.setBounds(40, 40, 600, 400);

        patient.add("ADD PATIENT", addPatient);
        patient.add("VIEW PATIENT", viewPatient);
        patient.add("UPDATE PATIENT", updatePatient);

        patientPanel.add(patient, center);
        patientPanel.setSize(800, 800);
        patientPanel.setVisible(true);
    }

    public void addDiseasePane() {
        diseasePanel.setLayout(null);
        addDiseaseType = new JPanel();
        addDisease = new JPanel();
        updateDisease = new JPanel();
        viewDisease = new JPanel();

        disease = new JTabbedPane();

        disease.setBounds(40, 40, 600, 400);

        disease.add("ADD DISEASE TYPE", addDiseaseType);
        disease.add("ADD NEW DISEASE", addDisease);
        disease.add("UPDATE DISEASE", updateDisease);
        disease.add("VIEW DISEASE", viewDisease);

        diseasePanel.add(disease, center);
        diseasePanel.setSize(800, 800);
        diseasePanel.setVisible(true);

    }

    public void addMedicinePane() {
        medicinePanel.setLayout(null);
        addMedicine = new JPanel();
        viewMedicines = new JPanel();
        updateMedicines = new JPanel();

        medicine = new JTabbedPane();

        medicine.setBounds(40, 40, 600, 400);

        medicine.add("ADD MEDICINE", addMedicine);
        medicine.add("VIEW MEDICINES", viewMedicines);
        medicine.add("UPDATE MEDICINES", updateMedicines);

        medicinePanel.add(medicine, center);
        medicinePanel.setSize(800, 800);
        medicinePanel.setVisible(true);

    }

    public void addReportPane() {
        reportPanel.setLayout(null);
        viewReports = new JPanel();
        viewGraphs = new JPanel();

        report = new JTabbedPane();

        report.setBounds(40, 40, 600, 400);

        report.add("VIEW REPORTS", viewReports);
        report.add("VIEW GRAPHS", viewGraphs);

        reportPanel.add(report, center);
        reportPanel.setSize(800, 800);
        reportPanel.setVisible(true);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        JTabbedPane sourceTabbedPane = (JTabbedPane) e.getSource();
        int index = sourceTabbedPane.getSelectedIndex();
        if (index == 0) {
            addPatientPane();
        } else if (index == 1) {
            addDiseasePane();
        } else if (index == 2) {
            addMedicinePane();

        } else if (index == 3) {

            addReportPane();
        }

    }

}
