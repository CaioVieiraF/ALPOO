package navigation;

import javax.swing.*;
import java.awt.*;

public class ConsultaProfessor extends JPanel {

    int PADDING = 8;
    Design utils = new Design();
    int width, height, mainPosX, mainPosY;
    JPanel panel;
    Color fundoPanel = new Color(220, 220, 220);
    String[] professores = {"Ricardo Veras"};
    JList<String> professoresComponent = new JList<>();

    public ConsultaProfessor(int mainPosX, int mainPosY){
        this.width = mainPosX - mainPosX/3;
        this.height = mainPosY - mainPosY/3;
        this.mainPosX = mainPosX/2 - width/2;
        this.mainPosY = mainPosY/2 - height/2 - height/10;
        
        mainView();
        setLayout(null);
        setBackground(utils.FUNDO);
        JComponent[] components = {panel, professoresComponent};
        addItens(components);
    }

    public void mainView(){
        panel = utils.panelDecorator(mainPosX, mainPosY, width, height, fundoPanel, 8);
        professoresComponent.setBounds(mainPosX, mainPosY, width, height);
    }

    public void addItens(JComponent[] components){
        for (JComponent component : components){
            add(component);
        }
    }

}
