package healthcaresystem;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddDiseaseTypeForm extends JPanel {

    JLabel lbldtypename;
    JTextField txtdtypename;
    JButton btnAdddtype;

    AddDiseaseTypeForm() {
        setLayout(null);
        //create label
        lbldtypename = new JLabel("ADD DISEASE TYPE HERE");
        //set label position
        lbldtypename.setBounds(70, 150, 150, 30);
        //create textbox 
        txtdtypename = new JTextField();
        //set textbox position
        txtdtypename.setBounds(250, 150, 250, 30);
        //create buttons
        btnAdddtype = new JButton("ADD DISEASE TYPE");
        //set button positions 
        btnAdddtype.setBounds(250, 250, 250, 30);
        add(lbldtypename);
        add(txtdtypename);
        add(btnAdddtype);
        setVisible(true);
        setSize(800, 800);

    }
}
