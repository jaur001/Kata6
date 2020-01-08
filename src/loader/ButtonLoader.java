package loader;

import controller.Command;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

public class ButtonLoader {
    public static void load(JButton button, Map<String, Command> commandList){
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                commandList.get(button.getText()).execute();
            }
        });
    }
}
