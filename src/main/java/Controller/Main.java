package Controller;

import View.Login;

import javax.swing.*;

/**
 * Created by Руслан on 26.06.2016.
 */
public class Main {
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Login();
            }
        });
    }
}
