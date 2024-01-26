import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {
    
    JButton rules, back;
    JTextField tfname;

    Login() {
        // Set background color and layout
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        // Load image icon
        ImageIcon i1 = new ImageIcon(getClass().getResource("/icons/login.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 600, 500);
        add(image);
        // Add heading label
        JLabel heading = new JLabel("Simple Minds");
        heading.setBounds(760, 60, 300, 45);
        heading.setFont(new Font("Edwardian Script ITC", Font.BOLD, 48));
        heading.setForeground(Color.BLUE);
        add(heading);
        // Add name label and text field
        JLabel name = new JLabel("Enter your name");
        name.setBounds(810, 150, 300, 20);
        name.setFont(new Font("Arial", Font.BOLD, 20));
        name.setForeground(Color.BLUE);
        add(name);

        tfname = new JTextField();
        tfname.setBounds(735, 200, 300, 25);
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(tfname);
        // Add buttons
        // Rule button
        rules = new JButton("Rules");
        rules.setBounds(735, 270, 120, 25);
        rules.setBackground(Color.BLUE);
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);
        // Back button
        back = new JButton("Back");
        back.setBounds(915, 270, 120, 25);
        back.setBackground(Color.BLUE);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        // Set frame properties
        setSize(1200, 500);
        setLocation(200, 150);
        setVisible(true);
    }
    // ActionListener implementation
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == rules) {
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
        } else if (ae.getSource() == back) {
            setVisible(false);
        }
    }
    // Main method to start the application
    public static void main(String[] args) {
        new Login();
    }
}
