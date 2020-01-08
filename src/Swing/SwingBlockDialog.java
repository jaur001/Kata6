package Swing;

import model.Block;
import view.BlockDialog;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingBlockDialog extends JPanel implements BlockDialog {


    private final TextField text;
    private boolean isChanged = false;

    public SwingBlockDialog(int x, int y, Block block) {
        super();
        setLocation(x,y);
        setSize(new Dimension(400,200));
        this.text = new TextField();
        text.setText(block.getAxis().getCurrentPos()+"");

        add(text);
    }


    @Override
    public void changePosition(Block block) {
        block.getAxis().setCurrentPos(Integer.parseInt(text.getText()));
    }

}
