package View;

import Controller.AdminCtr;
import Controller.FormManager;
import Model.Admin;
import Model.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Руслан on 27.06.2016.
 */
public class AdminPanel extends JFrame {
    JTextField txtLogin, txtPass, txtName;
    JButton btnRegister, btnBack;
    public JLabel label;
    AdminCtr controller;

    public AdminPanel(AdminCtr controller){
        this.controller = controller;
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        init();
        addListener(this);

    }

    private void init() {
        add(txtLogin = new JTextField(12));
        add(txtPass = new JTextField(12));
        add(txtName = new JTextField(12));
        add(btnRegister = new JButton("Register teacher"));
        add(btnBack = new JButton("Back"));
        add(label = new JLabel());
    }

    private void addListener(final AdminPanel adminPanel){
        btnRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.registerTeacher(txtLogin.getText(), txtPass.getText(), txtName.getText(),adminPanel);
            }
        });

        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.goNext("Register");
            }
        });
    }

}
