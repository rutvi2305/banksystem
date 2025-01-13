package bankManagementSystem;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Login extends JFrame implements ActionListener{
    JButton login, clear, signup;
    JTextField cardTextField;
    JPasswordField pinTextField;

    Login() {
        setTitle("BANK MANAGEMENT");

        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70, 10, 100, 100);
        add(label);
        JLabel text = new JLabel("WELCOME TO ATM");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Osward",Font.BOLD, 38));
        text.setBounds(200, 40, 400, 40);
        add(text);

        JLabel cardno = new JLabel("CARD NUMBER");
        cardno.setForeground(Color.WHITE);
        cardno.setFont(new Font("Raleway",Font.BOLD, 28));
        cardno.setBounds(200, 150, 150, 30);
        add(cardno);

        cardTextField = new JTextField();
        cardTextField.setBounds(300, 150, 230, 30);
        cardTextField.setFont(new Font("Arial",Font.BOLD, 14));
        add(cardTextField);

        JLabel pin = new JLabel("PIN");
        pin.setForeground(Color.WHITE);
        pin.setFont(new Font("Raleway",Font.BOLD, 28));
        pin.setBounds(200, 220, 250, 30);
        add(pin);

        pinTextField = new JPasswordField();
        pinTextField.setBounds(300, 220, 230, 30);
        add(pinTextField);

        login = new JButton("SIGN IN");
        login.setBounds(300, 300, 100, 30);
        login.setBackground(Color.WHITE);
        login.setForeground(Color.BLACK);
        login.addActionListener(this);
        add(login);

        clear = new JButton("CLEAR");
        clear.setBounds(430, 300, 100, 30);
        clear.setBackground(Color.WHITE);
        clear.setForeground(Color.BLACK);
        clear.addActionListener(this);
        add(clear);

        signup = new JButton("SIGN UP");
        signup.setBounds(300, 350, 230, 30);
        signup.setBackground(Color.WHITE);
        signup.setForeground(Color.BLACK);
        signup.addActionListener(this);
        add(signup);

        getContentPane().setBackground(Color.BLACK);
        
        setSize(800, 480);
        setVisible(true);
        setLocation(350 , 200);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == login) {
            String cardNumber = cardTextField.getText();
            String pin = pinTextField.getText();
        } 
        if(ae.getSource() == clear) {
            cardTextField.setText("");
            pinTextField.setText("");
        }
        if(ae.getSource() == signup) {
            new Signup();
        }
    }
    public static void main(String[] args) {
        new Login();

    }
}
