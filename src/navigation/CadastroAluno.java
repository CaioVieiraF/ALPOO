package navigation;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CadastroAluno extends JPanel {
	
	// Painel
	JPanel pCentral = new JPanel();
	JPanel pInfo = new JPanel();
	JPanel pCurso = new JPanel();
	JPanel pNotas = new JPanel();
	JPanel pFaltas = new JPanel();
	
	// Fotnes
	Font fonte = new Font("Arial", Font.BOLD, 25);
	Font fonte2 = new Font("Arial", Font.CENTER_BASELINE, 16);
		
	// Cores
	Color corF = new Color(200, 200, 200);
	Color corFF = new Color(255, 255, 255);
	Color corF3 = new Color(250, 100, 100);
	Design cor = new Design();
		
	// textFiel
	JTextField txtMatricula = new JTextField();
	JTextField txtNome = new JTextField();
	JTextField txtDataNasc = new JTextField();
	JTextField txtCodCurso = new JTextField();
	JTextField txtNomeCurso = new JTextField();
	JTextField txtN1 = new JTextField();
	JTextField txtN2 = new JTextField();
	JTextField txtMedia = new JTextField();
	
	JComponent[] compInfoTxt = {txtNome, txtMatricula, txtDataNasc, txtCodCurso, txtNomeCurso};
	
	//Lista
	String[] diciplinas = {"Estrututra de Dados", "LPBD", "Ciênncias Sociais", "Calculo p/ Computaçãoo", "Matemática Discreta", "ALPOO"," taw ", "ipe", "lpoo", "libras (optativa)","Direitos Humanos (optativa)","rel. Etica..."};
	String[] codDisciplina = new String[diciplinas.length];
	
	// JList
	JList<String> materias = new JList<String>(diciplinas);
	JList<String> codigoDis = new JList<String>(codDisciplina);
	
	// JComboBox
	JComboBox<String> faltas = new JComboBox<String>();
	
	// JButtons
	JButton btnCdastrar = new JButton("Cadastrar");
	JButton btnAtualizar = new JButton("Atualizar");
	
	public CadastroAluno() {
		setBackground(cor.FUNDO);
		setLayout(null);
		Pricipal();
		
	}
	
	public void Pricipal() {
		pCentral.setBounds(90, 10, 700, 520);
		pCentral.setBackground(corF);
		pCentral.setLayout(null);
		pCentral.setBorder(BorderFactory.createTitledBorder("Cadastro Do Aluno"));

		Curso();
		Info();
		Botoes();
		
		pCentral.add(pInfo);
		pCentral.add(pCurso);
		add(pCentral);
	}
	
	public void Info() {
		pInfo.setBounds(20, 30, 660, 150);
		pInfo.setLayout(null);
		pInfo.setBackground(corFF);
		pInfo.setBorder(BorderFactory.createTitledBorder("Info Do Aluno"));
		
		ComponetesInfo();		
	}
	
	public void ComponetesInfo() {
		int x = 15;
		int y = 60;
		int w = 294;
		int h = 40;
		
		compInfoTxt[0].setBounds(15, 20, 625, h);
		compInfoTxt[0].setFont(fonte2);
		
		for (int i = 1; i < compInfoTxt.length; i++) {
			compInfoTxt[i].setBounds(x, y, w, h);
			compInfoTxt[i].setFont(fonte2);
			if(i == 2) {
				y = 20;
				x = 345;
			}
			y += 40;
			pInfo.add(compInfoTxt[i]);
			
		}
		pInfo.add(compInfoTxt[0]);
		compInfoTxt[0].setBorder(BorderFactory.createTitledBorder("Nome"));
		compInfoTxt[1].setBorder(BorderFactory.createTitledBorder("Matricula"));
		compInfoTxt[2].setBorder(BorderFactory.createTitledBorder("Data Nasc"));
		compInfoTxt[3].setBorder(BorderFactory.createTitledBorder("CodCurso"));
		compInfoTxt[4].setBorder(BorderFactory.createTitledBorder("Nome do Curso"));
		
	}
	
	public void Curso() {
		pCurso.setBounds(20, 180, 660, 300);
		pCurso.setLayout(null);
		pCurso.setBackground(corFF);
		pCurso.setBorder(BorderFactory.createTitledBorder("Cursos Do Aluno"));
		
		Diciplinas();
		CodDisciplina();
		Notas();
		Faltas();
	}
	
	public void Diciplinas() {		
		int x = 100;
		int y = 25;
		int w = 230;
		int h = 270;
		
		materias.setBounds(x, y, w, h);
		materias.setFont(fonte2);
		materias.setBorder(BorderFactory.createTitledBorder("Cursos"));
		pCurso.add(materias);
	}
	public void CodDisciplina() {		
		int x = 15;
		int y = 25;
		int w = 80;
		int h = 270;
		
		for (int i = 0; i < codDisciplina.length; i++) {
			codDisciplina[i] = "0"+i;
		}
		
		codigoDis.setBounds(x, y, w, h);
		codigoDis.setFont(fonte2);
		codigoDis.setBorder(BorderFactory.createTitledBorder("Cod dics"));
		pCurso.add(codigoDis);	
	}
	public void Notas() {		
		int x = 330;
		int y = 25;
		int w = 150;
		int h = 270;
		
		pNotas.setBounds(x, y, w, h);
		pNotas.setLayout(null);
		pNotas.setBorder(BorderFactory.createTitledBorder("Notas"));
		pNotas.setBackground(corFF);
		txtN1.setBounds(10, 20, w-20, 40);
		txtN2.setBounds(10, 70, w-20, 40);		
		txtMedia.setBounds(10, 120, w-20, 40);
		txtN1.setFont(fonte2);
		txtN2.setFont(fonte2);
		txtMedia.setFont(fonte2);
		txtN1.setBorder(BorderFactory.createTitledBorder("NP1"));
		txtN2.setBorder(BorderFactory.createTitledBorder("NP2"));
		txtMedia.setBorder(BorderFactory.createTitledBorder("Média"));
		
		pNotas.add(txtN1);
		pNotas.add(txtN2);
		pNotas.add(txtMedia);
		pCurso.add(pNotas);
	}
	
	public void Faltas() {
		int x = 490;
		int y = 25;
		int w = 150;
		int h = 270;
		
		pFaltas.setLayout(null);
		pFaltas.setBorder(BorderFactory.createTitledBorder("Faltas"));
		pFaltas.setBounds(x, y, w, h);
		pFaltas.setBackground(corFF);
		
		for (int i = 0; i <= 20; i++) {
			faltas.addItem(""+i);
		}
		
		faltas.setBounds(10, 25, w-20, 25);
		faltas.setFont(fonte2);
		pFaltas.add(faltas);
		pCurso.add(pFaltas);
	}
	
	public void Botoes() {
		btnCdastrar.setBounds(140, 482, 200, 35);
		btnCdastrar.setBackground(new Color(100, 255, 100));
		btnCdastrar.setFont(fonte);
		btnCdastrar.setBorder(BorderFactory.createEmptyBorder());
		btnAtualizar.setBounds(340, 482, 200, 35);
		btnAtualizar.setBackground(new Color(100, 100, 255));
		btnAtualizar.setFont(fonte);
		btnAtualizar.setBorder(BorderFactory.createEmptyBorder());
		
		pCentral.add(btnAtualizar);
		pCentral.add(btnCdastrar);
	}
	
}
