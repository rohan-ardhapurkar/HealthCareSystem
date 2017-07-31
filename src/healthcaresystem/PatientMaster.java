package healthcaresystem;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class PatientMaster extends JTabbedPane implements ChangeListener{
    
    JPanel add,update,view;
    String center=BorderLayout.CENTER;

    public PatientMaster(){
        
        setLayout(null);
       
        add=new JPanel();
        update=new JPanel();
        view=new JPanel();
        
        setBounds(40,40,500,500);
        addChangeListener(this);
        
        add("ADD PATIENT",add);
        add("UPDATE/DELETE Patient",update);
        add("VIEW Patient",view);
        
        setSize(500,500);
        setVisible(true);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
