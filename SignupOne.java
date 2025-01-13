package bankManagementSystem;

import java.awt.Color;
import java.awt.Font;
import java.util.Random;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;


public class SignupOne extends JFrame implements ActionListener {

    long random;
    JTextField nameTextField, eTextField,fnamTextField, aTextField, cTextField, sTextField, pTextField;
    JButton x;
    JRadioButton male, female, o , m, s;
    JDateChooser dob;


    SignupOne(){
        setLayout(null);

        Random ran = new Random();
        random = Math.abs((ran.nextLong()%9000L)+ 1000L);

        JLabel formno = new JLabel("APPLICATION FORM NUMBER" + random);
        formno.setFont(new Font("Raleway", Font.BOLD, 38));
        formno.setBounds(140, 20, 600, 40);
        add(formno);

        JLabel personDetails = new JLabel("PAGE 1: PERSONAL DETAILS");
        personDetails.setBounds(290, 80, 400, 30);
        personDetails.setFont(new Font("Raleway", Font.BOLD, 20));
        add(personDetails);

        JLabel name = new JLabel("Name:");
        name.setBounds(100, 140, 100, 30);
        name.setFont(new Font("Raleway", Font.BOLD, 18));
        add(name);

        nameTextField = new JTextField();
        nameTextField.setBounds(300, 140, 400, 30);
        nameTextField.setFont(new Font("Raleway", Font.PLAIN, 14));
        add(nameTextField);


        JLabel fname = new JLabel("Father's Name:");
        fname.setBounds(100, 190, 200, 30);
        fname.setFont(new Font("Raleway", Font.BOLD, 18));
        add(fname);

        JTextField fnameTextField = new JTextField();
        fnameTextField.setBounds(300, 190, 400, 30);
        fnameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        add(fnameTextField);

        JLabel dob = new JLabel("Date Of Birth:");
        dob.setBounds(100, 240, 200, 30);
        dob.setFont(new Font("Raleway", Font.BOLD, 18));
        add(dob);

        JDateChooser dob = new JDateChooser();
        dob.setBounds(300, 240, 400, 30);
        dob.setForeground(new Color(105, 105, 105));
        dob.setFont(new Font("Raleway", Font.BOLD, 30));
        add(dob);

        JLabel gender = new JLabel("Gender:");
        gender.setBounds(100, 290, 200, 30);
        gender.setFont(new Font("Raleway", Font.BOLD, 18));
        add(gender);

        male = new JRadioButton("Male");
        male.setBounds(300, 290, 60, 30);
        male.setBackground(Color.WHITE);
        add(male);

        female = new JRadioButton("Female");
        female.setBounds(450, 290, 120, 30);
        female.setBackground(Color.WHITE);
        add(female);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        
        JLabel email = new JLabel("Email Address:");
        email.setBounds(100, 340, 200, 30);
        email.setFont(new Font("Raleway", Font.BOLD, 18));
        add(email);

        eTextField = new JTextField();
        eTextField.setBounds(300, 340, 400, 30);
        eTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        add(eTextField);

        JLabel ms = new JLabel("Marital Status:");
        ms.setBounds(100, 390, 200, 30);
        ms.setFont(new Font("Raleway", Font.BOLD, 18));
        add(ms);

        m = new JRadioButton("Married");
        m.setBounds(300, 390, 100, 30);
        m.setBackground(Color.WHITE);
        add(m);

        s = new JRadioButton("Unmarried");
        s.setBounds(450, 390, 100, 30);
        s.setBackground(Color.WHITE);
        add(s);

        o = new JRadioButton("Other");
        o.setBounds(630, 390, 120, 30);
        o.setBackground(Color.WHITE);
        add(o);

        ButtonGroup mos = new ButtonGroup();
        mos.add(m);
        mos.add(s);
        mos.add(o);

        JLabel add = new JLabel("Address:");
        add.setBounds(100, 440, 200, 30);
        add.setFont(new Font("Raleway", Font.BOLD, 18));
        add(add);

        aTextField = new JTextField();
        aTextField.setBounds(300, 440, 400, 30);
        aTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        add(aTextField);

        JLabel city = new JLabel("City:");
        city.setBounds(100, 490, 200, 30);
        city.setFont(new Font("Raleway", Font.BOLD, 18));
        add(city);

        cTextField = new JTextField();
        cTextField.setBounds(300, 490, 400, 30);
        cTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        add(cTextField);

        JLabel st = new JLabel("State:");
        st.setBounds(100, 540, 200, 30);
        st.setFont(new Font("Raleway", Font.BOLD, 18));
        add(st);

        sTextField = new JTextField();
        sTextField.setBounds(300, 540, 400, 30);
        sTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        add(sTextField);

        JLabel pin = new JLabel("Pin Code:");
        pin.setBounds(100, 590, 200, 30);
        pin.setFont(new Font("Raleway", Font.BOLD, 18));
        add(pin);

        pTextField = new JTextField();
        pTextField.setBounds(300, 590, 400, 30);
        pTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        add(pTextField);

        x = new JButton("Next");
        x.setBounds(620, 660, 80, 30);
        x.setFont(new Font("Raleway", Font.BOLD, 18));
        x.setBackground(Color.BLACK);
        x.setForeground(Color.WHITE);
        x.addActionListener(this);
        add(x);


        getContentPane(). setBackground(Color.WHITE);
        setSize(850, 800);
        setLocation(350,10);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae){
        String formno = "" + random;
        String name = nameTextField.getText();
        String fname = fnameTextField.getText();
        String dob = ((JTextField) dob.getDateEditor().getUIComponent()).getText();
        String gender = male.isSelected()? "Male" : female.isSelected()? "Female" : "Other";
        String email = eTextField.getText();
        String mos = m.isSelected()? "Married" : s.isSelected()? "Unmarried" : "Other";
        String add = aTextField.getText();
        String city = cTextField.getText();
        String st = sTextField.getText();
        String pin = pTextField.getText();

        try{
            if (name.equals("")) {
                JOptionPane.showMessageDialog(null, "Please enter your name"); 
            } else {
                Conn c = new Conn();
                String query = "insert into signup values ('" + formno + "','" + name + "','" + fname + "','" + gender + "','" + add + "','" + dob + "','" + city + "','" + st + "','" + pin + "','" + email + "','" + ms + "')";
                c.s.executeUpdate(query);
            }


        }catch (Exception e){
            System.out.println(e);
        }

    }
    public static void main(String[] args) {
        new SignupOne();
        
    }
    

}
