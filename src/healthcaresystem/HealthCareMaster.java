package healthcaresystem;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import pojo.PatientPojo;

public class HealthCareMaster extends JFrame implements ChangeListener {
    
    JTabbedPane jtp, patient, disease, medicine, report;
    JPanel patientPanel, diseasePanel, medicinePanel, reportPanel;
    JPanel addDiseaseType,addDisease,updateDisease,viewDisease;
    JPanel addMedicine,viewMedicines,updateMedicines;
    JPanel viewReports,viewGraphs;
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
        
        jtp.setSize(700, 700);
        this.add(jtp, center);
        setLocation(50, 50);
        setSize(800, 800);
        setVisible(true);
        
    }

    public void addPatientPane() {
        
        patientPanel.setLayout(null);
       AddPatientForm apf=new AddPatientForm();
       ViewPatientForm vpf=new ViewPatientForm();
       UpdatePatientForm upf=new UpdatePatientForm();
        //  addPatient.setBackground(Color.red);
        //viewPatient = new JPanel();
        //viewPatient.setBackground(Color.green);
        patient = new JTabbedPane();
        
        patient.setBounds(40, 40, 600, 400);
        
        patient.add("ADD PATIENT", apf);
        patient.add("VIEW PATIENT", vpf);
        patient.add("UPDATE PATIENT", upf);
        patient.setSize(600,600);
        patientPanel.add(patient,center);
        patientPanel.setSize(800, 800);
        patientPanel.setVisible(true);
    }
    
    public void addDiseasePane() {
        diseasePanel.setLayout(null);
        AddDiseaseTypeForm adf=new AddDiseaseTypeForm();
        AddNewDiseaseForm andf=new AddNewDiseaseForm();
           UpdateDiseaseForm updf=new UpdateDiseaseForm();
           ViewDiseaseForm vdf=new ViewDiseaseForm();
        
        disease = new JTabbedPane();
        
        disease.setBounds(40, 40, 600, 400);
        
        disease.add("ADD DISEASE TYPE", adf);
        disease.add("ADD NEW DISEASE", andf);
        disease.add("UPDATE DISEASE", updf);
        disease.add("VIEW DISEASE", vdf);
        
        diseasePanel.add(disease, center);
        diseasePanel.setSize(800, 800);
        diseasePanel.setVisible(true);
        
    }
    
    public void addMedicinePane() {
        medicinePanel.setLayout(null);
       AddNewMedicine anm=new AddNewMedicine();
       ViewMedicines vm=new ViewMedicines();
        medicine = new JTabbedPane();
        
        medicine.setBounds(40, 40, 600, 400);
        
        medicine.add("ADD MEDICINE",anm);
        medicine.add("VIEW MEDICINES", vm);
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
