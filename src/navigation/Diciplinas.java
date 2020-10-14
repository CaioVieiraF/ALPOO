package navigation;

import javax.swing.*;
import java.awt.*;

public class Diciplinas extends JPanel{
	int x = 420, w = 200, h = 30;
	int px, py, pw, ph;
	int padding = 20;

	Design util = new Design();
	String[] materia = {"Estrututra de Dados", "LPBD", "Ciências Sociais", "Calculo p/ Computa��o", "Matem�tica Discreta", "ALPOO"," taw ", "ipe", "lpoo", "libras (optativa)","Direitos Humanos (optativa)","rel. Etica..."};
	String[] professores = {"Paulo", "Alvaro","Norberto", "Luiz Gobita", "Gustavo", "Marcos", "Ricardo Veras"};
	JList<String> materias = new JList<String>(materia);

	JLabel aulas = new JLabel("Aulas por semana:");
	JLabel professor = new JLabel("professor: " + professores[0]);
	JLabel carga = new JLabel("Carga hor�ria: " + "80hr");
	JLabel np1 = new JLabel("Nota P1: " + "8,0");
	JLabel np2 = new JLabel("Nota P2: " + "9,0");

	JPanel container;
	JScrollPane scrList = new JScrollPane();

	ButtonGroup rb = new ButtonGroup();
	JRadioButton rb1 = new JRadioButton("1");
	JRadioButton rb2 = new JRadioButton("2");
	JRadioButton rb3 = new JRadioButton("3");
	JRadioButton rb4 = new JRadioButton("4");

	Color WHITE = new Color(255,255,255);

	public Diciplinas(int screenW, int screenH){
        this.pw = 700;
        this.ph = 450;
        this.px = (screenW / 2) - (pw / 2);
        this.py = (screenH / 2) - (ph / 2) - (ph/10);
		setLayout(null);
		setBackground(util.FUNDO);

		rb.add(rb1);
		rb.add(rb2);
		rb.add(rb3);
		rb.add(rb4);

		JComponent[] jcomponent = {scrList, materias, carga, professor, np1, np2, aulas, rb1, rb2, rb3, rb4};
		container = util.panelDecorator(px, py, pw, ph, new Color(200, 200, 200), padding);
		container.setLayout(null);

		setComponents(jcomponent);

		add(container);

        materias.setBackground(WHITE);

        scrList.setViewportView(materias);
		scrList.setBounds(50, 80, 350, 270);
		scrList.setBackground(WHITE);
		scrList.setBorder(BorderFactory.createTitledBorder("Selecione uma disciplina"));

        aulas.setLocation(60, 330 + padding);
        rb1.setBounds(60, 400, 50, h);
        rb2.setBounds(120 , 400, 50, h);
        rb3.setBounds(180 , 400, 50, h);
        rb4.setBounds(240 , 400, 50, h);
	}
	
	public void setComponents(JComponent[] itens) {
		for(int i = 0; i < itens.length; i++) {
			itens[i].setLocation(x + padding, h +(i * h) - 30);
			itens[i].setSize(w + padding,h + padding);
			itens[i].setBackground(container.getBackground());
			itens[i].setBorder(BorderFactory.createEmptyBorder());
			itens[i].setFont(new Font("Ubuntu Mono", Font.BOLD, 22));
			container.add(itens[i]);
		}
	}
}
