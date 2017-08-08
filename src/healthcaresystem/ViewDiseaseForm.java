package healthcaresystem;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class ViewDiseaseForm extends JPanel{
    JComboBox diseaseType;
    JLabel lbldiseaseName, lblDiseaseDescription;
         
    ViewDiseaseForm(){
        setLayout(null);
        diseaseType=new JComboBox();
        lbldiseaseName=new JLabel("Disease Name");
        lblDiseaseDescription=new JLabel("Description of Disease");
        
         
                diseaseType.setBounds(150, 50, 150, 30);

        lbldiseaseName.setBounds(70, 150, 150, 30);
        lblDiseaseDescription.setBounds(70, 200, 150, 30);

        add(diseaseType);add(lbldiseaseName);add(lblDiseaseDescription);

        setVisible(true);
        setSize(800,800);
    }
}
