package minigames.hangman.gui;

import javax.swing.*;

public class GameWindow extends JFrame {
    private JPanel mainPanel;
    private JTextPane textPane1;
    private JPanel namePanel;
    private JPanel hangmanPanel;
    private JButton helpButton;
    private JPanel gamePanel;
    private JPanel lettersPanel;
    private JButton exitButton;
    private JButton yieldButton;

    public GameWindow(){
        // Set the title of the frame
        setTitle("At the sept of Baelor");

        // Set the default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(mainPanel);
        setListeners();

        //Add Alphabet Panel
        lettersPanel.add(new AlphabetPanel());

        // Center the frame on the screen
        setLocationRelativeTo(null);

        // Make the frame visible
        pack();
        setVisible(true);
    }

    public void setListeners(){
        //FUTURE IMPLEMENTATION DO NOT TOUCH
    }
}
