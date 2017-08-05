/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthcaresystem;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddDiseaseTypeForm extends JPanel{
    JLabel lbldtypename;
    JTextField txtdtypename;
    JButton btnAdddtype;
    AddDiseaseTypeForm(){
        setLayout(null);
        
        lbldtypename=new JLabel("ADD DISEASE TYPE HERE");
        
        lbldtypename.setBounds(70,150,150,30);
        
        txtdtypename=new JTextField();
        
        txtdtypename.setBounds(250,150,250,30);
        
        btnAdddtype=new JButton("ADD DISEASE TYPE");
        
        btnAdddtype.setBounds(250,250,250,30);
        add(lbldtypename);
        add(txtdtypename);
        add(btnAdddtype);
        setVisible(true);
        setSize(800,800);
        
    }
}
