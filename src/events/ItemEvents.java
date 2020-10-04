package events;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ItemEvents implements ActionListener {

    JPanel navigator;
    public ItemEvents(JPanel navigator){
        this.navigator = navigator;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        JMenuItem source = (JMenuItem) actionEvent.getSource();
        CardLayout card = (CardLayout) navigator.getLayout();
        card.show(navigator, source.getActionCommand());
    }
}
