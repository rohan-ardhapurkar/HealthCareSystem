package healthcaresystem;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;

public class AddNewDiseaseForm extends JPanel {

    JComboBox diseaseType;
    JLabel lbldiseaseName, lblDiseaseDescription;
    JTextField txtDiseaseName, txtDiseaseDescription;

    AddNewDiseaseForm() {

        setLayout(null);
        // create the controls here

        diseaseType = new JComboBox();

        lbldiseaseName = new JLabel("Disease Name");
        lblDiseaseDescription = new JLabel("Description of Disease");

        txtDiseaseName = new JTextField();
        txtDiseaseDescription = new JTextField();

        //set posititions of the fields on the form
        diseaseType.setBounds(150, 50, 150, 30);
        lbldiseaseName.setBounds(70, 150, 150, 30);
        lblDiseaseDescription.setBounds(70, 200, 150, 30);

        txtDiseaseName.setBounds(250, 150, 150, 30);
        txtDiseaseDescription.setBounds(250, 200, 150, 30);

        //
        add(diseaseType);
        add(lbldiseaseName);
        add(lblDiseaseDescription);

        add(txtDiseaseName);
        add(txtDiseaseDescription);

        setVisible(true);
        setSize(800, 800);

    }

}
