package healthcaresystem;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class ViewMedicines extends JPanel {

    JLabel lblMedicineName, lblMedicineDescription, lblMedicineMFG, lblMedicineEXP;

    ViewMedicines() {

        setLayout(null);
        lblMedicineName = new JLabel("Medicine Name:");
        lblMedicineDescription = new JLabel("Medicine Details");
        lblMedicineMFG = new JLabel("Manufacturing Date");
        lblMedicineEXP = new JLabel("Expiry Date");

        lblMedicineName.setBounds(70, 50, 150, 30);
        lblMedicineDescription.setBounds(70, 100, 150, 30);
        lblMedicineMFG.setBounds(70, 150, 150, 30);
        lblMedicineEXP.setBounds(70, 200, 150, 30);

        add(lblMedicineName);
        add(lblMedicineDescription);
        add(lblMedicineMFG);
        add(lblMedicineEXP);

        setVisible(true);
        setSize(800, 800);

    }
}
