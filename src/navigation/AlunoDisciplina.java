package navigation;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class AlunoDisciplina extends JPanel {

	Design decoracao = new Design();
	
	// Paineis
	JPanel pCentral = new JPanel();
	JPanel pTabela = new JPanel();
	
	// Colunas da tabela
	Object [][]  diciplinas = {
            {"Jo�o da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345"},
            {"Jo�o da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345"},
            {"Jo�o da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345"},
            {"Jo�o da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345"},
            {"Jo�o da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345"},
            {"Jo�o da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345"},
            {"Jo�o da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345"},
            {"Jo�o da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345"},
            {"Jo�o da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345"},
            {"Jo�o da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345"},
            {"Jo�o da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345"},
            {"Jo�o da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345"},
            {"Jo�o da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345"},
            {"Jo�o da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345"},
            {"Jo�o da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345"},
            {"Jo�o da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345"},
            {"Jo�o da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345"},
            {"Jo�o da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345"},
            {"Jo�o da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345"},
            {"Jo�o da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345"},
            {"Jo�o da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345"},
            {"Jo�o da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345"},
            {"Jo�o da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345"},
            {"Jo�o da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345"},
            {"Jo�o da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345"},
            {"Jo�o da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345"},
            {"Jo�o da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345"},
            {"Jo�o da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345"},
            {"Jo�o da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345"},
            {"Jo�o da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345"}
            };
	
	// Titulo da tabel
	String [] titulos = {"Aluno", "Disciplina 1", "Disciplina 2", "Disciplina 3", "Disciplina 4", "Disciplina 5"};
	
	// tabela e scroll
    JTable tabela;
    JScrollPane barraRolagem;
	
	public AlunoDisciplina() {
		Tela();
		Principal();
	}
	
	public void Tela() {
		setBackground(decoracao.FUNDO);
		setLayout(null);
	}
	
	public void Principal() {
		pCentral.setBounds(100, 10, 680, 520);
		pCentral.setBackground(decoracao.corF);
		pCentral.setLayout(null);
		pCentral.setBorder(BorderFactory.createTitledBorder("Aluno/Disciplina"));
        			
        CriarTabela(titulos, diciplinas);

        add(pCentral);
	}
	
	public void CriarTabela(String [] titulos, Object [][]  diciplinas) {
		pTabela.setBounds(20, 20, 640, 480);
		pTabela.setLayout(new GridLayout(1, 1));
		pTabela.setBackground(decoracao.corF3);
		tabela = new JTable(diciplinas, titulos);
		tabela.setFont(decoracao.fonte2);
		tabela.setEnabled(false);
        barraRolagem = new JScrollPane(tabela);
        pTabela.add(barraRolagem);
        pCentral.add(pTabela);		 
	}
	

}
