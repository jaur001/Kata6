package Swing;

import javax.swing.*;
import java.awt.*;

public class SwingMainFrame extends JFrame {

    public SwingMainFrame(String title) throws HeadlessException {
        super(title);
        Dimension screenDimension = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(screenDimension);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        execute();
    }


    public void execute(){
        setVisible(true);
    }
}
