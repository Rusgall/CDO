package View;

import Controller.LoginCtr;

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
    LoginCtr controller;

    public Login(LoginCtr controller){
        this.controller = controller;
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        init();
        addListener();


    }
    void init(){
        add(txtLogin = new JTextField(12));
        add(txtPass = new JPasswordField(12));
        add(btnLogin = new JButton("Login"));
        add(btnRegister = new JButton("Register"));
    }
    void addListener(){
        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                controller.checkUser(txtLogin.getText(), new String(txtPass.getPassword()));
            }
        });
    }
}
