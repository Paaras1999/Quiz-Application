import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {

    // Constructor to initialize the Score window
    Score(String name, int score) {
        setBounds(400, 150, 750, 550); // Setting the position and size of the frame
        getContentPane().setBackground(Color.WHITE); // Setting the background color
        setLayout(null); // Setting layout to null for manual component placement
        
        // Adding an image icon to the frame
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT); // Scaling the image
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 200, 300, 250); // Setting bounds for the image
        add(image); // Adding the image to the frame
        
        // Adding a heading label to display a thank you message with the player's name
        JLabel heading = new JLabel("Thank you " + name + " for playing Simple Minds");
        heading.setBounds(45, 30, 700, 30); // Setting bounds for the heading
        heading.setFont(new Font("Tahoma", Font.PLAIN, 26)); // Setting font for the heading
        add(heading); // Adding the heading to the frame
        
        // Adding a label to display the player's score
        JLabel lblscore = new JLabel("Your score is " + score);
        lblscore.setBounds(350, 200, 300, 30); // Setting bounds for the score label
        lblscore.setFont(new Font("Tahoma", Font.PLAIN, 26)); // Setting font for the score label
        add(lblscore); // Adding the score label to the frame
        
        // Adding a button to allow the player to play again
        JButton submit = new JButton("Play Again");
        submit.setBounds(380, 270, 120, 30); // Setting bounds for the button
        submit.setBackground(new Color(30, 144, 255)); // Setting background color for the button
        submit.setForeground(Color.WHITE); // Setting text color for the button
        submit.addActionListener(this); // Adding ActionListener to the button
        add(submit); // Adding the button to the frame
        
        setVisible(true); // Making the frame visible
    }
    
    // ActionListener implementation for button click
    public void actionPerformed(ActionEvent ae) {
        setVisible(false); // Hiding the Score window
        new Login(); // Opening the Login window to allow the player to play again
    }

    // Main method to test the Score window
    public static void main(String[] args) {
        new Score("User", 0); // Creating an instance of Score window with sample values
    }
}
