package View;

import Controller.TeacherCtr;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Руслан on 27.06.2016.
 */
public class TeacherPanel extends JFrame {
    TeacherCtr controller;
    JTextArea txtQuestion,txtAnswer;
    JButton btnAddQuestion,btnBack;
    JRadioButton[] btnSubject;
    public JLabel label;
    ButtonGroup bg;

    public TeacherPanel(TeacherCtr controller){
        this.controller = controller;
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        init();
        addListener(this);
    }

    private void init(){
        add(txtQuestion = new JTextArea(5,20));
        add(txtAnswer = new JTextArea(5,20));
        add(btnAddQuestion = new JButton("Add Question"));
        add(label = new JLabel());
        add(btnBack = new JButton("Back"));
        btnSubject = new JRadioButton[5];
        bg = new ButtonGroup();
        for(int i = 0; i < btnSubject.length; i++){
            add(btnSubject[i] = new JRadioButton("Subject0"+(i+1)));
            bg.add(btnSubject[i]);
        }

    }
    private void addListener(final TeacherPanel teacherPanel){
        btnAddQuestion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String subject ="Empty";
                for(int i = 0; i < btnSubject.length; i++){
                    if(btnSubject[i].isSelected())
                        subject = btnSubject[i].getText();
                }
                controller.addQuestion(txtQuestion.getText(),txtAnswer.getText(),subject,teacherPanel);
            }
        });
        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.goNext("Login");
            }
        });
    }
}
