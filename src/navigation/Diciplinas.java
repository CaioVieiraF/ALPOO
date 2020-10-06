package navigation;

import javax.swing.*;
import java.awt.*;

public class Diciplinas extends JPanel{
	Design util = new Design();
	String[] materia = {"Estrututra de Dados", "LPBD", "Ciências Sociais", "Calculo p/ Computação", "Matemática Discreta", "ALPOO"};
	String[] professores = {"Paulo", "Alvaro","Norberto", "Luiz Gobita", "Gustavo", "Marcos", "Ricardo Veras"};
	JLabel grade = new JLabel("Disciplinas");
	JList<String> materias = new JList<String>(materia);
	JLabel professor = new JLabel("professor: " + professores[0]);
	JLabel carga = new JLabel("Carga horária: " + "80hr");
	JLabel np1 = new JLabel("Nota P1: " + "8,0");
	JLabel np2 = new JLabel("Nota P2: " + "9,0");
	JRadioButton seg = new JRadioButton("Segunda-feria");
	JRadioButton ter = new JRadioButton("Terça-feira");
	JRadioButton qua = new JRadioButton("Quarta-feira");
	JRadioButton qui = new JRadioButton("Quinta-feira");
	JRadioButton sex = new JRadioButton("Sexta-feira");
	
	public Diciplinas(){
        setLayout(null);
		setBackground(util.FUNDO);
        grade.setBounds(30, 30,200,  30);
        materias.setBounds(50, 100, 300, 200);
        carga.setBounds(500, 100, 250, 30);
        professor.setBounds(500, 150, 350, 30);
        np1.setBounds(500, 200, 200, 30);
        np2.setBounds(500, 250, 200, 30);
        seg.setBounds(480, 300, 200, 30);
        ter.setBounds(480, 340, 200, 30);
        qua.setBounds(480, 380, 200, 30);
        qui.setBounds(480, 420, 200, 30);
        sex.setBounds(480, 460, 200, 30);
        materias.setBorder(BorderFactory.createEmptyBorder());
        grade.setBorder(BorderFactory.createEmptyBorder());
        JComponent[] jcomponent = {grade, carga,materias, professor, np1, np2, seg, ter, qua, qui, sex};
        setComponents(jcomponent);
        
        materias.setBackground(util.BUTTON_COLOR);        
	}
	
	public void setComponents(JComponent[] itens) {
		for(int i = 0; i < itens.length; i++) {
			itens[i].setBackground(util.FUNDO);
			itens[i].setFont(util.FONT_BOLD);
			add(itens[i]);	
		}
	}
}
