package minigames.hangman.gui;

import javax.swing.*;

public class DifficultyWindow extends JWindow {

    private JPanel contentPane;
    private JPanel labelPanel;
    private JButton easyButton;

    public DifficultyWindow(){
        setContentPane(contentPane);
        setListeners();
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void setListeners(){

    }


}
