package healthcaresystem;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UpdateMedicines extends JPanel {

    JLabel lblMedName, lblMedDes, lblMFG, lblEXP;
    JTextField txtMedName, txtMedDes, txtMFG, txtEXP;
    JButton updateBtn;

    UpdateMedicines() {
        setLayout(null);

        //create the all controls  
        lblMedName = new JLabel("Medicine Name");
        lblMedDes = new JLabel("Medicine Details");
        lblMFG = new JLabel("Manufacturing Date");
        lblEXP = new JLabel("Expiry Date");

        txtMedName = new JTextField();
        txtMedDes = new JTextField();
        txtMFG = new JTextField();
        txtEXP = new JTextField();

        updateBtn = new JButton("Update");

        //set control positions 
        lblMedName.setBounds(70, 50, 150, 30);
        lblMedDes.setBounds(70, 100, 150, 30);
        lblMFG.setBounds(70, 150, 150, 30);
        lblEXP.setBounds(70, 200, 150, 30);

        txtMedName.setBounds(250, 50, 150, 30);
        txtMedDes.setBounds(250, 100, 150, 30);
        txtMFG.setBounds(250, 150, 150, 30);
        txtEXP.setBounds(250, 200, 150, 30);

        updateBtn.setBounds(250, 250, 150, 30);
        
        //add all controls
        add(lblMedName);
        add(lblMedDes);
        add(lblMFG);
        add(lblEXP);

        add(txtMedName);
        add(txtMedDes);
        add(txtMFG);
        add(txtEXP);

        add(updateBtn);

        setVisible(true);
        setSize(800, 800);

    }
}
