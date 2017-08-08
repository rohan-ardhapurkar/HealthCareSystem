package healthcaresystem;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UpdateDiseaseForm extends JPanel {

    JComboBox diseaseType;
    JLabel lbldiseaseName, lblDiseaseDescription;
    JTextField txtDiseaseName, txtDiseaseDescription;
    JButton upbtn; 
    UpdateDiseaseForm() {

        setLayout(null);
        // create the controls here

        diseaseType = new JComboBox();

        lbldiseaseName = new JLabel("Disease Name");
        lblDiseaseDescription = new JLabel("Description of Disease");

        txtDiseaseName = new JTextField();
        txtDiseaseDescription = new JTextField();
         
        upbtn=new JButton("Update");
        //set posititions of the fields on the form
        diseaseType.setBounds(150, 50, 150, 30);
        lbldiseaseName.setBounds(70, 150, 150, 30);
        lblDiseaseDescription.setBounds(70, 200, 150, 30);

        txtDiseaseName.setBounds(250, 150, 150, 30);
        txtDiseaseDescription.setBounds(250, 200, 150, 30);
        
        upbtn.setBounds(250,250,150,30);
        //
        add(diseaseType);
        add(lbldiseaseName);
        add(lblDiseaseDescription);

        add(txtDiseaseName);
        add(txtDiseaseDescription);
        
        add(upbtn);
        setVisible(true);
        setSize(800, 800);

    }
}
