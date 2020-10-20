package navigation;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CadastroAluno extends JPanel {
	
	// Painel
	JPanel pCentral = new JPanel();
	JPanel pInfo = new JPanel();
	JPanel pCurso = new JPanel();
	
	
	// Fotnes
	Font fonte = new Font("Arial", Font.BOLD, 25);
	Font fonte2 = new Font("Arial", Font.CENTER_BASELINE, 12);
		
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
	
	JComponent[] compInfoTxt = {txtMatricula , txtNome, txtDataNasc, txtCodCurso, txtNomeCurso};
	
	//JList
	
	
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
		
		pCentral.add(pInfo);
		pCentral.add(pCurso);
		add(pCentral);
	}
	
	
	public void Info() {
		pInfo.setBounds(20, 20, 280, 280);
		pInfo.setLayout(null);
		pInfo.setBackground(corFF);
		pInfo.setBorder(BorderFactory.createTitledBorder("Info Do Aluno"));
		
		ComponetesInfo();		
	}
	
	
	public void Curso() {
		pCurso.setBounds(330, 20, 200, 200);
		pCurso.setLayout(null);
		pCurso.setBackground(corFF);
		pCurso.setBorder(BorderFactory.createTitledBorder("Cursos Do Aluno"));
		
	}
	
	public void ComponetesInfo() {
		int x = 15;
		int y = 20;
		int w = 250;
		int h = 50;
		
		for (int i = 0; i < compInfoTxt.length; i++) {
			compInfoTxt[i].setBounds(x, y, w, h);
			compInfoTxt[i].setFont(fonte2);
			pInfo.add(compInfoTxt[i]);
			y += 50;
		}
		
		compInfoTxt[0].setBorder(BorderFactory.createTitledBorder("Matricula"));
		compInfoTxt[1].setBorder(BorderFactory.createTitledBorder("Nome"));
		compInfoTxt[2].setBorder(BorderFactory.createTitledBorder("Data Nasc"));
		compInfoTxt[3].setBorder(BorderFactory.createTitledBorder("CodCurso"));
		compInfoTxt[4].setBorder(BorderFactory.createTitledBorder("Nome do Curso"));
		
	}
	
}
