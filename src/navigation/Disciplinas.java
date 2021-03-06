package navigation;

import backend.Diciplina;
import backend.DiciplinasHandler;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class Disciplinas extends JPanel{
	//Vari�veis
	int x = 400, w = 200, h = 30 , rbc = 10;
	int px, py, pw, ph;
	int p2 = 360;
	int padding = 20;
	int ch;

	DiciplinasHandler disciplina = new DiciplinasHandler();
	Design util = new Design();

	String[] disciplinasNome = {};
	Diciplina[] disciplinas = disciplina.getDisciplinas();

	JLabel aulas = new JLabel("Aulas por semana:");
	JTextField txtCarga = new JTextField();
	JLabel cd = new JLabel("C�digo da disciplina: ");
	
	JLabel carga = new JLabel("Carga horaria: ");

	JButton buscar= new JButton ("Buscar");
	JButton  atualizar= new JButton ("Atualizar");
	JButton excluir= new JButton ("Exlcuir");
	JButton [] botoes = {buscar, atualizar, excluir};

	JTextField eDisciplina = new JTextField();

	JList<String> materias;

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

	JRadioButton[] rbList = {rb1, rb2, rb3, rb4, rb5, rb6};

	public Disciplinas(int screenW, int screenH){
        this.pw = 700;
        this.ph = 450;
        this.px = (screenW / 2) - (pw / 2);
        this.py = (screenH / 2) - (ph / 2) - (ph/10);
		setLayout(null);
		setBackground(util.FUNDO);

		for(Diciplina disc : disciplinas){
			disciplinasNome = Arrays.copyOf(disciplinasNome, disciplinasNome.length + 1);
			disciplinasNome[disciplinasNome.length - 1] = disc.nome;
		}

		materias = new JList<>(disciplinasNome);
		JComponent[] jcomponent = {scrList, materias, container2, carga, txtCarga, cd, aulas, rb1, rb2, rb3, rb4, rb5, rb6};

		for (JRadioButton jRadioButton : rbList) {
			rb.add(jRadioButton);
		}

		//Eventos do JList
		materias.addListSelectionListener(listSelectListener -> {
			if(materias.getSelectedIndex() >= 0) {
				Diciplina valor = disciplinas[materias.getSelectedIndex()];
				txtCarga.setText(""+valor.cargaHoraria);
				cd.setText("C�digo da disciplina: " + valor.id);
				rbList[valor.dias - 1].setSelected(true);
			}
		});

		container = util.panelDecorator(px, py, pw, ph, new Color(200, 200, 200), padding);
		container.setLayout(null);

		setComponents(jcomponent);

		add(container);
		materias.setBackground(WHITE);

		container2.setLayout(null);
		container2.setBounds(x - padding,80,330,p2);
		container2.setBackground(WHITE);
		container2.setBorder(BorderFactory.createTitledBorder("Informa��es"));

        scrList.setViewportView(materias);
		scrList.setBounds(20, 80, p2 - padding, p2);
		scrList.setBackground(WHITE);
		scrList.setBorder(BorderFactory.createTitledBorder("Selecione uma disciplina"));

		for (int i = 3; i < jcomponent.length; i ++){
			container2.add(jcomponent[i]);
		}

		carga.setLocation(10,10);
		txtCarga.setLocation(150, 10);
		cd.setLocation(10,70);
		aulas.setLocation(x + padding, 150);

		for (JRadioButton jRadioButton : rbList) {
			jRadioButton.setBounds(rbc, 130, 40, h);
			rbc += 50;
		}
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
		//campo de busca
		eDisciplina.setBounds(20, 20, 340, 50);
		eDisciplina.setBackground(WHITE);
		eDisciplina.setBorder(BorderFactory.createTitledBorder("Busque uma disciplina"));
		eDisciplina.setFont(util.FONT_BOLD);

		//botões
		int n = 380;
		for (JButton botoe : botoes) {
			botoe.setBounds(n, 20, 105, 50);
			botoe.setBackground(util.BUTTON_COLOR);
			botoe.setBorder(BorderFactory.createEmptyBorder());
			botoe.setFont(util.FONT_BOLD);
			container.add(botoe);
			n += 110;
		}

		container.add(eDisciplina);

		//evento dos bot�es
		buscar.addActionListener(actionEvent -> {
			disciplinas = disciplina.getDisciplinas(eDisciplina.getText());
			atualizaLista();
		});

		atualizar.addActionListener(actionEvent -> {
			Diciplina novo = disciplinas[materias.getSelectedIndex()];
			JRadioButton rbNovo = new JRadioButton();
			for(JRadioButton botao : rbList){
				if(botao.isSelected()){
					rbNovo = botao;
				}
			}
			disciplina.executarQuery("UPDATE disciplinas "
					+ "SET nome = '" + novo.nome
					+ "', dia = " +	rbNovo.getText()
					+ ", carga = " + txtCarga.getText()
					+ " WHERE id = " + novo.id);
			
			disciplinas = disciplina.getDisciplinas();
			atualizaLista();

		});

		excluir.addActionListener(actionEvent -> {
			disciplina.executarQuery("DELETE FROM disciplinas WHERE id = " + disciplinas[materias.getSelectedIndex()].id + ";");
			atualizaLista();
		});
	}

	public void atualizaLista() {
		String[] disciplinasNome = {};
		for(Diciplina disc : disciplinas){
			disciplinasNome = Arrays.copyOf(disciplinasNome, disciplinasNome.length + 1);
			disciplinasNome[disciplinasNome.length - 1] = disc.nome;
		}
		materias.setListData(disciplinasNome);
		materias.clearSelection();
	}
}