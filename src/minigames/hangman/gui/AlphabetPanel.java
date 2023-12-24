package minigames.hangman.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * A custom JPanel that represents the alphabet panel for a Hangman game.
 */
public class AlphabetPanel extends JPanel {

    /**
     * Constructor to initialize the AlphabetPanel.
     */
    public AlphabetPanel() {
        // Set the layout of the panel to a 3x9 grid.
        setLayout(new GridLayout(3, 9));

        // Generate buttons for each letter of the alphabet.
        for (char letter = 'A'; letter <= 'Z'; letter++) {
            JButton letterButton = new JButton(String.valueOf(letter));
            // Add a listener to handle button click events.
            letterButton.addActionListener(new LetterButtonListener());
            // Add the button to the panel.
            add(letterButton);
        }
    }

    /**
     * ActionListener implementation to handle button click events.
     */
    private class LetterButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Get the button that triggered the event.
            JButton sourceButton = (JButton) e.getSource();
            // Extract the selected letter from the button's label.
            char selectedLetter = sourceButton.getText().charAt(0);
            // Do something with the selected letter (e.g., update the Hangman word).
            System.out.println("Selected letter: " + selectedLetter);
        }
    }
}
