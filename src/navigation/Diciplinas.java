package navigation;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import java.awt.*;

public class Diciplinas extends JPanel{
	int x = 400, w = 200, h = 30;
	int px, py, pw, ph;
	int p2 = 360;
	int padding = 20;

	Design util = new Design();
	String[] materia = {"Estrututra de Dados", "LPBD", "Ciências Sociais", "Cálculo p/ Computação", "Matemática Discreta", "ALPOO"," taw ", "ipe", "lpoo", "libras (optativa)","Direitos Humanos (optativa)","rel. Etica..."};
	String[] professores = {"Paulo", "Alvaro","Norberto", "Luiz Gobita", "Gustavo", "Marcos", "Ricardo Veras"};
	JList<String> materias = new JList<String>(materia);

	JLabel aulas = new JLabel("Aulas por semana:");
	JLabel carga = new JLabel("Carga horária: " + "80hr");
	JLabel cd = new JLabel("Código da disciplina: " + "7AB8");

	JPanel container;
	JPanel container2 = new JPanel();
	JScrollPane scrList = new JScrollPane();

	ButtonGroup rb = new ButtonGroup();
	JRadioButton rb1 = new JRadioButton("1");
	JRadioButton rb2 = new JRadioButton("2");
	JRadioButton rb3 = new JRadioButton("3");
	JRadioButton rb4 = new JRadioButton("4");
	JRadioButton rb5 = new JRadioButton("5");
	JRadioButton rb6 = new JRadioButton("6");

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
		rb.add(rb5);
		rb.add(rb6);

		JComponent[] jcomponent = {scrList, materias, container2, carga, cd, aulas, rb1, rb2, rb3, rb4, rb5, rb6};
		container = util.panelDecorator(px, py, pw, ph, new Color(200, 200, 200), padding);
		container.setLayout(null);

		setComponents(jcomponent);

		add(container);
		materias.setBackground(WHITE);

		container2.setLayout(null);
		container2.setBounds(x - padding,80,330,p2);
		container2.setBackground(WHITE);
		container2.setBorder(BorderFactory.createEtchedBorder());

        scrList.setViewportView(materias);
		scrList.setBounds(20, 80, p2 - padding, p2);
		scrList.setBackground(WHITE);
		scrList.setBorder(BorderFactory.createTitledBorder("Selecione uma disciplina"));

		container2.add(carga);
		container2.add(cd);
		container2.add(aulas);
		container2.add(rb1);
		container2.add(rb2);
		container2.add(rb3);
		container2.add(rb4);
		container2.add(rb5);
		container2.add(rb6);

		carga.setLocation(10,10);
		cd.setLocation(10,70);
		aulas.setLocation(x + padding, 150);
        rb1.setBounds(10, 130, 40, h);
        rb2.setBounds(60, 130, 40, h);
        rb3.setBounds(110, 130, 40, h);
        rb4.setBounds(160, 130, 40, h);
        rb5.setBounds(210, 130, 40, h);
        rb6.setBounds(260, 130, 40, h);
	}
	
	public void setComponents(JComponent[] itens) {
		for(int i = 0; i < itens.length; i++) {
			itens[i].setLocation(x + padding, h +(i * h) - 30);
			itens[i].setSize(w * padding,h + padding);
			itens[i].setBackground(WHITE);
			itens[i].setBorder(BorderFactory.createEmptyBorder());
			itens[i].setFont(new Font("Ubuntu Mono", Font.BOLD, 20));
			container.add(itens[i]);

		}
	}
}