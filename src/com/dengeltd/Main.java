package com.dengeltd;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main {
    JPanel panel1;
    private JTree tree1;
    private JTabbedPane tabbedPane1;
    private JTable table1;
    private JButton button1;
    private SqlServerConnector sqlServerConnector;

    public Main() {
        button1.addActionListener((ActionEvent e) -> sqlServerConnector = new SqlServerConnector());
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Main");
        frame.setContentPane(new Main().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}