package View;

import Controller.ResultCtr;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Руслан on 29.06.2016.
 */
public class ResultPanel extends JFrame {
    ResultCtr controller;
    public ResultPanel(ResultCtr controller){
        this.controller = controller;
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5,2));

        controller.setResult(this);
    }
}
