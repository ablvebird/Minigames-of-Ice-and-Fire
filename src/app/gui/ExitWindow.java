package app.gui;

import javax.swing.*;
import java.awt.event.*;

public class ExitWindow extends JWindow {
    private JPanel contentPane;
    private JButton buttonOK;

    public ExitWindow() {
        setContentPane(contentPane);
        setListeners();
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void setListeners(){
        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);

        getRootPane().setDefaultButton(buttonOK);
    }

    private void onOK() {
        System.exit(0);
        dispose();
    }
    private void onCancel() {
        dispose();
    }
}
