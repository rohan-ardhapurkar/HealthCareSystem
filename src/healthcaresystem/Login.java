package healthcaresystem;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {

    JButton btnLogin;
    JTextField txtUser;
    JPasswordField txtPass;
    JLabel lblUser, lblPass;
    Container c;

    Login() {
        setLayout(null);
        c = this.getContentPane();
        //login button created   
        btnLogin = new JButton("Login");
        //create the textbox for login
        txtUser = new JTextField();
        txtPass = new JPasswordField();
        //label for login
        lblUser = new JLabel("Username");
        lblPass = new JLabel("Password");

        //set position of label on form
        lblUser.setBounds(50, 100, 150, 30);
        lblPass.setBounds(50, 150, 150, 30);

        //set position of textbox on form
        txtUser.setBounds(220, 100, 200, 30);
        txtPass.setBounds(220, 150, 200, 30);

        //set button position on form
        btnLogin.setBounds(220, 200, 200, 40);
        //add label on form
        c.add(lblUser);
        c.add(lblPass);

        //add textbox
        c.add(txtUser);
        c.add(txtPass);

        //add button on form
        c.add(btnLogin);

        //add event on button
        btnLogin.addActionListener(this);
        setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        setLocation(50, 50);
        setSize(600, 400);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String username = txtUser.getText();
        String password = txtPass.getText();

        if (username.equals("admin") && password.equals("admin")) {
            JOptionPane.showMessageDialog(this, "Login Success");
            setVisible(false);
            //new HealthCareMaster();
            new HealthCareMaster();
        } else {
            JOptionPane.showMessageDialog(this, "Login Failed", "FAILED", JOptionPane.ERROR_MESSAGE);
            txtUser.setText("");
            txtPass.setText("");
        }
    }
}
