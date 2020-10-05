package navigation;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import java.awt.*;

public class Cadastro extends JPanel{

    JTextField nome, email, senha, confirmaSenha;
    JButton cadastrar = new JButton("Cadastrar");
    Color fundo = new Color(210, 230, 255);
    Color buttonColor = new Color(180, 210, 190);
    Font font = new Font("Ubuntu Mono", Font.BOLD, 14);

    int mainWidth = 300;
    int mainItemHeight = 50;
    int mainPosX, mainPosY, mainHeight;

    public Cadastro(int mainPosX, int mainPosY){
        this.nome = new JTextField("nome");
        this.email = new JTextField("email");
        this.senha = new JPasswordField("senha");
        this.confirmaSenha = new JPasswordField("confirmar senha");

        this.mainPosX = mainPosX/2 - mainWidth/2;
        this.mainPosY = mainPosY/2;
        this.mainHeight = this.mainPosY - (mainItemHeight * 5)/2;

        JComponent[] components = {nome, email, senha, confirmaSenha, cadastrar};
        addComponents(components);

        cadastrar.setBackground(buttonColor);

        setBackground(fundo);
        this.add(nome);
        this.add(email);
        this.add(senha);
        this.add(confirmaSenha);
        this.add(cadastrar);
        setLayout(null);
//        add(email);
//        add(senha);
//        add(confirmaSenha);
//        add(cadastrar);
    }

    void addComponents(JComponent[] itens){
        int padding = 5;
        for (int i = 0; i < itens.length; i++){
            itens[i].setBounds(this.mainPosX-padding, this.mainHeight+(this.mainItemHeight*i), mainWidth, mainItemHeight-padding*2);
            itens[i].setBorder(BorderFactory.createEmptyBorder());
            itens[i].setFont(font);
        }
    }
}
