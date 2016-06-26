package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Руслан on 26.06.2016.
 */
public class Login extends JFrame {
    JButton btnLogin, btnRegister;
    JTextField txtLogin;
    JPasswordField txtPass;
    public Login(){
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        init();
        setVisible(true);
        addListener();


    }
    void init(){
        add(txtLogin = new JTextField());
        add(txtPass = new JPasswordField());
        add(btnLogin = new JButton());
        add(btnRegister = new JButton());
    }
    void addListener(){
        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
