import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener {

    String name;
    JButton Start, Back;

    // Constructor to initialize the Rules window
    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.WHITE); // Setting the background color
        setLayout(null); // Setting layout to null for manual component placement

        // Adding a heading label to welcome the user
        JLabel heading = new JLabel("Welcome " + name + " to Simple Minds");
        heading.setBounds(50, 30, 700, 30); // Setting bounds for the heading
        heading.setFont(new Font("Edwardian Script ITC", Font.BOLD, 42)); // Setting font for the heading
        heading.setForeground(Color.BLUE); // Setting text color for the heading
        add(heading); // Adding the heading to the frame

        // Adding a label to display the rules of the game
        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350); // Setting bounds for the rules label
        rules.setFont(new Font("Arial", Font.PLAIN, 16)); // Setting font for the rules label
        rules.setText(
            "<html>"+ 
            "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
            "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
            "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
            "4. Crying is allowed but please do so quietly." + "<br><br>" +
            "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
            "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
            "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
            "8. May you know more than what Aman knows, Good Luck" + "<br><br>" +
            "<html>"
        );
        add(rules); // Adding the rules label to the frame

        // Adding a button to go back to the Login window
        Back = new JButton("Back");
        Back.setBounds(250, 500, 100, 30); // Setting bounds for the button
        Back.setBackground(new Color(30, 144, 254)); // Setting background color for the button
        Back.setForeground(Color.WHITE); // Setting text color for the button
        Back.addActionListener(this); // Adding ActionListener to the button
        add(Back); // Adding the button to the frame

        // Adding a button to start the Quiz
        Start = new JButton("Start");
        Start.setBounds(400, 500, 100, 30); // Setting bounds for the button
        Start.setBackground(new Color(30, 144, 254)); // Setting background color for the button
        Start.setForeground(Color.WHITE); // Setting text color for the button
        Start.addActionListener(this); // Adding ActionListener to the button
        add(Start); // Adding the button to the frame

        setSize(800, 650); // Setting the size of the frame
        setLocation(300, 150); // Setting the initial position of the frame
        setVisible(true); // Making the frame visible
    }

    // ActionListener implementation for button clicks
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == Start) { // If Start button is clicked
            setVisible(false); // Hide the Rules window
            new Quiz(name); // Open the Quiz window
        } else { // If Back button is clicked
            setVisible(false); // Hide the Rules window
            new Login(); // Open the Login window
        }
    }

    // Main method to test the Rules window
    public static void main(String[] args) {
        new Rules("User"); // Creating an instance of Rules window with sample values
    }
}
