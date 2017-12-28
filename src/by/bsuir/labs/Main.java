package by.bsuir.labs;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import by.bsuir.labs.view.MainWindow;


public class Main {

    public static void main(String[] args) {
        JFrame mainFrame = new JFrame("DrawService");
        mainFrame.setVisible(true);
        mainFrame.setMinimumSize(new Dimension(1200, 700));
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setContentPane(new MainWindow());
        mainFrame.pack();
    }
}
