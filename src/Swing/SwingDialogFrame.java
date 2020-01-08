package Swing;

import javax.swing.*;
import java.awt.*;

public class SwingDialogFrame extends JDialog {
    public SwingDialogFrame(Frame owner){
        super(owner);
        setModal(true);
        setSize(500,500);
        //setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }


    public void execute() {
        setVisible(true);
    }
}
