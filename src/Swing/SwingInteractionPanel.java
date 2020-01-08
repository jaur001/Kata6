package Swing;

import model.Block;
import view.InteractionPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingInteractionPanel extends JPanel implements InteractionPanel {

    private Block block;

    public SwingInteractionPanel(Block block) {
        super();
        this.block = block;
        Dimension screenDimension = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((int)screenDimension.getWidth()/2,(int)screenDimension.getHeight()/2);
        setSize(new Dimension(block.getAxis().getSize(),block.getHeight()));
        paintBlock();
    }

    @Override
    public void paintBlock(){
        repaint();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(new Color(0,0,0));
        g.drawRect(block.getAxis().getCurrentPos(),500,block.getWeight(),block.getHeight());
    }
}
