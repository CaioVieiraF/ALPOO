import navigation.Cadastro;

import javax.swing.*;

public class Janela extends JFrame {

    int SCREEN_WIDTH = 900;
    int SCREEN_HEIGHT = 600;

    public Janela(){
        add(new Cadastro());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
        setVisible(true);
    }
}
