package navigation;

import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class CursoProfessor extends JPanel {

	Design decoracao = new Design();
	
	// Paineis
	JPanel pCentral = new JPanel();
	JPanel pTabela = new JPanel();
	
	// Colunas da tabela
	Object [][]  diciplinas = {
            {"João da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345"},
            {"João da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345"},
            {"João da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345"},
            {"João da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345"},
            {"João da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345"},
            {"João da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345"},
            {"João da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345"},
            {"João da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345"},
            {"João da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345"},
            {"João da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345"},
            {"João da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345"},
            {"João da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345"},
            {"João da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345"},
            {"João da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345"},
            {"João da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345"},
            {"João da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345"},
            {"João da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345"},
            {"João da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345"},
            {"João da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345"},
            {"João da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345"},
            {"João da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345"},
            {"João da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345"},
            {"João da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345"},
            {"João da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345"},
            {"João da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345"},
            {"João da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345"},
            {"João da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345"},
            {"João da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345"},
            {"João da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345"},
            {"João da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345"}
            };
	
	// Titulo da tabel
	String [] titulos = {"Cursos", "Professor 1", "Professor 2", "Professor 3", "Professor 4", "Professor 5"};
	
	// tabela e scroll
    JTable tabela;
    JScrollPane barraRolagem;
	
	public CursoProfessor() {
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
		pCentral.setBorder(BorderFactory.createTitledBorder("Cursos/Professor"));
        			
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
