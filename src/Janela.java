import javax.swing.JFrame;

import navigation.InfoProfessor;

public class Janela extends JFrame {

    int SCREEN_WIDTH = 900;
    int SCREEN_HEIGHT = 600;

    public Janela(){
    	add(new InfoProfessor());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
