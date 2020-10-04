package navigation;

import javax.swing.*;
import java.awt.*;

public class Cadastro extends JPanel{

    JTextField nome = new JTextField();
    JTextField email = new JTextField();
    JTextField senha = new JPasswordField();
    JTextField confirmaSenha = new JPasswordField();
    JButton cadastrar = new JButton("Cadastrar");
    Color fundo = new Color(210, 230, 255);

    int mainWidth = 100;
    int mainHeight = 150;
    int mainPosX, mainPosY;

    public Cadastro(int mainPosX, int mainPosY){

        this.mainPosX = (mainPosX/2) - mainWidth;
        this.mainPosY = (mainPosY/2) - mainHeight;

        nome.setBounds(mainPosX, mainPosY, mainWidth, mainHeight);

        setBackground(fundo);
        add(nome);
        add(email);
        add(senha);
        add(confirmaSenha);
        add(cadastrar);
    }
}
