package healthcaresystem;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AddNewMedicine extends javax.swing.JPanel {

    JLabel lblmedicineName, lblmedDescription, lblmfg, lblexp;
    JTextField txtmedname, txtmeddescription, txtmfg, txtexp;
    JButton addmed;

    AddNewMedicine() {
        setLayout(null);

        //
        lblmedicineName = new JLabel("Medicine Name");
        lblmedDescription = new JLabel("Description");
        lblmfg = new JLabel("Manufacturing Date");
        lblexp = new JLabel("Expiry Date");

        //
        txtmedname = new JTextField();
        txtmeddescription = new JTextField();
        txtmfg = new JTextField();
        txtexp = new JTextField();

        //
        addmed = new JButton("ADD MEDICINE");
        //
        lblmedicineName.setBounds(70, 50, 150, 30);
        lblmedDescription.setBounds(70, 100, 150, 30);
        lblmfg.setBounds(70, 150, 150, 30);
        lblexp.setBounds(70, 200, 150, 30);

        txtmedname.setBounds(250, 50, 150, 30);
        txtmeddescription.setBounds(250, 100, 150, 30);
        txtmfg.setBounds(250, 150, 150, 30);
        txtexp.setBounds(250, 200, 150, 30);

        addmed.setBounds(250, 250, 150, 30);

        add(lblmedicineName);
        add(lblmedDescription);
        add(lblmfg);
        add(lblexp);

        add(txtmedname);
        add(txtmeddescription);
        add(txtmfg);
        add(txtexp);

        add(addmed);

        setVisible(true);
        setSize(800, 800);
    }
}
