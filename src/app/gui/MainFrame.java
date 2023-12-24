package app.gui;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainFrame extends JFrame {
    private JPanel mainPanel;
    private JLabel imageLabel;
    private JButton hangmanButton;
    private JButton sorryINeedToButton;
    private JButton chroniclerButton;
    private JButton heraldButton;

    public MainFrame(){
        // Set the title of the frame
        setTitle("ASOIAF Minigames");

        // Set the default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(mainPanel);
        setListeners();

        // Center the frame on the screen
        setLocationRelativeTo(null);

        // Make the frame visible
        setImageLabel();
        pack();
        setVisible(true);
    }

    public void setListeners(){
        sorryINeedToButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                new ExitWindow();
            }
        });
    }

    public void setImageLabel() {
        imageLabel.setText("<html>" +
                "Upon the icy canvas of 'Minigames of Ice and Fire,'<br>" +
                "a direwolf guards a golden joystick.<br>" +
                "Beside it, a lion clutches a d20 die.<br>" +
                "Above, the Targaryen dragon breathes digital fire.<br>" +
                "Subtle icons hint at diverse challenges,<br>" +
                "a pixelated emblem echoing whimsical and grand gaming adventures." +
                "</html>");
    }

}
