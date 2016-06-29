package View;

import Controller.StudentCtr;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Created by Руслан on 28.06.2016.
 */
public class StudentPanel extends JFrame {
    StudentCtr controller;
    ArrayList<JRadioButton> btnSubject;
    ArrayList<String> subjects;
    JButton btnStart, btnResult;
    ButtonGroup bg;
    public JLabel label;

    public StudentPanel(StudentCtr controller){
        this.controller = controller;
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        init();
        addListener(this);
    }

    private void init(){
        label = new JLabel();
        btnSubject = new ArrayList<>();
        subjects = controller.getNames();
        bg = new ButtonGroup();
        for(String name:subjects)
            btnSubject.add(new JRadioButton(name));
        for(JRadioButton btn:btnSubject){
            add(btn);
            bg.add(btn);
        }
        add(btnStart = new JButton("Start"));
        add(btnResult = new JButton("Result"));
    }
    private void addListener(final StudentPanel studentPanel){
        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String subject = "Empty";
                for(JRadioButton btn: btnSubject){
                    if(btn.isSelected())
                        subject = btn.getText();
                }

                controller.goStart(subject,studentPanel);
            }
        });
        btnResult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.goNext("Result");
            }
        });
    }
}
