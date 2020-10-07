package navigation;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Cadastro extends JPanel{

    JTextField nome, email, senha, confirmaSenha;
    JPanel container, radioContainer;
    JRadioButton aluno, professor;
    ButtonGroup radioButtonGroup;
    JButton cadastrar = new JButton("Cadastrar");
    Design util = new Design();

    int PADDING = 8;
    int mainWidth = 300;
    int mainItemHeight = 50;
    int mainPosX, mainPosY, mainHeight;

    public Cadastro(int mainPosX, int mainPosY){
        nome = new JTextField();
        email = new JTextField();
        senha = new JPasswordField();
        confirmaSenha = new JPasswordField();
        aluno = new JRadioButton("Sou aluno");
        professor = new JRadioButton("Sou professor");
        radioButtonGroup = new ButtonGroup();
        container = new JPanel();
        radioContainer = new JPanel();

        this.mainPosX = mainPosX/2 - mainWidth/2;
        this.mainPosY = mainPosY/2;
        radioButtonGroup.add(aluno);
        radioButtonGroup.add(professor);

        JComponent[] components = {nome, email, senha, confirmaSenha, radioContainer,cadastrar};
        this.mainHeight = this.mainPosY - (mainItemHeight * components.length)/2;
        addComponents(components);
        Border border = BorderFactory.createLineBorder(new Color(170, 170, 170));
        nome.setBorder(BorderFactory.createTitledBorder(border, "Nome"));
        email.setBorder(BorderFactory.createTitledBorder(border, "Email"));
        senha.setBorder(BorderFactory.createTitledBorder(border, "Senha"));
        confirmaSenha.setBorder(BorderFactory.createTitledBorder(border, "Confirma senha"));

        radioContainer.setBackground(new Color(200, 200, 200));
        aluno.setBounds(0, 0, mainWidth/2, mainItemHeight);
        professor.setBounds(mainWidth/2, 0, mainWidth/2, mainItemHeight);

        container.setBounds(this.mainPosX-PADDING, mainHeight-PADDING, mainWidth+PADDING*2, mainItemHeight*components.length);
        container.setBackground(new Color(200, 200, 200));
        cadastrar.setBackground(util.BUTTON_COLOR);

        setBackground(util.FUNDO);
        setLayout(null);
        radioContainer.add(aluno);
        radioContainer.add(professor);
        add(container);
    }

    void addComponents(JComponent[] itens){
        for (int i = 0; i < itens.length; i++){
            itens[i].setBounds(this.mainPosX, this.mainHeight+(this.mainItemHeight*i), mainWidth, mainItemHeight-PADDING*2);
            itens[i].setBorder(BorderFactory.createEmptyBorder());
            itens[i].setFont(util.FONT_BOLD);
            add(itens[i]);
        }
    }
}
