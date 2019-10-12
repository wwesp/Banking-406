package src;

import src.Accounts.CheckingAccount;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {

    private JPanel HomePage;
    private JButton AcceptButton;
    private JTextField textField4;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField1;
    private JLabel account_num;
    private JLabel routing_num;
    private JLabel balance;
    private JLabel history;
    private JButton Clear;
    private JTextField textField5;
    private JLabel Customer;


    public static void main(String[] args) {
        JFrame frame = new JFrame("Enter ");
        frame.setContentPane(new GUI().HomePage);
        frame.setPreferredSize(new Dimension(800, 600));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    public GUI() {

        //double bal = Double.parseDouble(new GUI().textField3.getText());
        AcceptButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String accountnum = textField1.getText();
                String routingnum = textField2.getText();
                double balance = Double.parseDouble(textField3.getText());
                String history = textField4.getText();
                CheckingAccount x = new CheckingAccount(accountnum, routingnum, balance,null);
                JOptionPane.showInternalMessageDialog(null, x );
                System.out.println("This is the Checking Account " + x );
            }
        });
        Clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}




