package main;

import Swing.SwingBlockDialog;
import Swing.SwingDialogFrame;
import controller.Command;
import loader.ButtonLoader;
import loader.CommandLoader;
import model.Axis;
import Swing.SwingInteractionPanel;
import Swing.SwingMainFrame;
import model.Block;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        Block block = new Block(100,50,new Axis(0,1000));

        SwingMainFrame mainFrame = new SwingMainFrame("App");
        SwingDialogFrame dialogFrame = new SwingDialogFrame(mainFrame);

        SwingBlockDialog dialogPanel = new SwingBlockDialog(0,0,block);
        JButton acceptButton = new JButton("Accept");
        dialogPanel.add(acceptButton);
        JButton cancelButton = new JButton("Cancel");
        dialogPanel.add(cancelButton);
        dialogFrame.add(dialogPanel);

        SwingInteractionPanel mainPanel = new SwingInteractionPanel(block);
        JButton movementButton = new JButton("Move Block");
        mainPanel.add(movementButton);
        JButton resetButton = new JButton("Reset");
        mainPanel.add(resetButton);
        mainFrame.add(mainPanel);

        Map<String, Command> commandList = ((CommandLoader) () -> {
            Map<String, Command> commandList1 = new HashMap<>();
            commandList1.put(acceptButton.getText(), () -> {
                dialogPanel.changePosition(block);
                dialogFrame.setVisible(false);
            });
            System.out.println(cancelButton.getName());
            commandList1.put(cancelButton.getText(), () -> dialogFrame.setVisible(false));
            commandList1.put(movementButton.getText(), () -> {
                dialogFrame.execute();
                mainPanel.paintBlock();
            });
            commandList1.put(movementButton.getText(), () -> {
                dialogFrame.execute();
                mainPanel.paintBlock();
            });
            commandList1.put(resetButton.getText(), () -> {
                block.getAxis().setCurrentPos(block.getAxis().getInitialPos());
                mainPanel.paintBlock();
            });
            return commandList1;
        }).load();

        ButtonLoader.load(acceptButton,commandList);
        ButtonLoader.load(cancelButton,commandList);
        ButtonLoader.load(movementButton,commandList);
        ButtonLoader.load(resetButton,commandList);
            }
}
