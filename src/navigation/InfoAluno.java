package navigation;

import javax.swing.*;
import java.awt.*;

public class InfoAluno extends JPanel {

    JPanel panel;
    Design utils = new Design();
    int mainPosX, mainPosY, width, height;

    public InfoAluno(int mainSizeX, int mainSizeY){
        width = mainSizeX - mainSizeX/3;
        height = mainSizeY - mainSizeY/3;
        this.mainPosX = mainSizeX/2 - width/2;
        this.mainPosY = mainSizeY/2 - height/2;
        panel = utils.panelDecorator(mainPosX, mainPosY, width, height, new Color(170, 170, 170), 8);

        setLayout(null);
        add(panel);
    }
}
