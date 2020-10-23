package navigation;

import javax.swing.*;
import java.awt.*;

public class ConsultaProfessor extends JPanel {

    int PADDING = 8;
    Design utils = new Design();
    int width, height, mainPosX, mainPosY;
    JComponent panel, busca, resultado, barraDeBusca, btnBusca;
    String[] professores = {"Ricardo Veras"};
    JList<String> professoresComponent = new JList<>(professores);

    public ConsultaProfessor(int mainPosX, int mainPosY){
        this.width = mainPosX - mainPosX/3;
        this.height = mainPosY - mainPosY/3;
        this.mainPosX = mainPosX/2 - width/2;
        this.mainPosY = mainPosY/2 - height/2 - height/10;
        
        mainView();
        setLayout(null);
        setBackground(utils.FUNDO);
        JComponent[] components = {busca, resultado, panel};
        addItens(components);

    }

    public void mainView(){
        resultado = new JPanel();
        panel = utils.panelDecorator(mainPosX, mainPosY, width, height, PADDING);
        busca = new JPanel();
        barraDeBusca = new JTextField();
        btnBusca = new JButton("BUSCAR");

        btnBusca.setBackground(utils.BUTTON_COLOR);
        btnBusca.setFont(utils.FONT_BOLD);
        btnBusca.setBorder(BorderFactory.createLineBorder(utils.BUTTON_COLOR, 5));

        professoresComponent.setFont(utils.FONT_BOLD);
        searchView();
        infoView();
    }

    public void addItens(JComponent[] components){
        for (JComponent component : components){
            add(component);
        }
    }

    public void searchView(){
        busca.setLayout(new BorderLayout());
        busca.setBounds(mainPosX, mainPosY, width/2, height);
        busca.add(barraDeBusca, BorderLayout.NORTH);
        busca.add(professoresComponent, BorderLayout.CENTER);
        busca.add(btnBusca, BorderLayout.SOUTH);
    }

    public void infoView(){
        resultado.setLayout(new BorderLayout());
        resultado.setBounds(mainPosX+width/2, mainPosY, width/2, height);
        resultado.setBorder(BorderFactory.createLineBorder(new Color(170, 170, 170)));


    }

}
