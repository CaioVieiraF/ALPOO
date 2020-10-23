package navigation;

import java.awt.Color;
import java.awt.Font;
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
	
	// Fotnes
	Font fonte = new Font("Arial", Font.BOLD, 25);
	Font fonte2 = new Font("Arial", Font.CENTER_BASELINE, 12);
	
	// Cores
	Color corF = new Color(200, 200, 200);
	Color corFF = new Color(255, 255, 255);
	Color corF3 = new Color(95, 201, 70);
	Design cor = new Design();
	
	
	// Paineis
	JPanel pCentral = new JPanel();
	JPanel pTabela = new JPanel();
	
	// TESTE -----------------------------------------------------------------------------------------------------
	Object [][]  diciplinas = {
            {"João da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com"},
            {"João da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com"},
            {"João da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com"},
            {"João da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com"},
            {"João da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com"},
            {"João da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com"},
            {"João da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com"},
            {"João da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com"},
            {"João da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com"},
            {"João da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com"},
            {"João da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com"},
            {"João da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com"},
            {"João da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com"},
            {"João da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com"},
            {"João da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com"},
            {"João da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com"},
            {"João da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com"},
            {"João da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com"},
            {"João da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com"},
            {"João da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com"},
            {"João da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com"},
            {"João da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com"},
            {"João da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com"},
            {"João da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com"},
            {"João da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com"},
            {"João da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com"},
            {"João da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com"},
            {"João da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com"},
            {"João da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com"},
            {"João da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com"},
            {"João da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com"},
            {"João da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com"},
            {"João da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com"},
            {"João da Silva", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com", "48 8890-3345", "joaosilva@hotmail.com"}
            };
	
	String [] titulos = {"Aluno", "Disciplina 1", "Disciplina 2", "d3", "d4", "d5", "d6"};
	
	// FIM TESTE -----------------------------------------------------------------------------------------------------
	
	ArrayList<String> listaDisciplina = new ArrayList<String>();
	
	// tabela e scroll
    JTable tabela;
    JScrollPane barraRolagem;
	
	public AlunoDisciplina() {
		Tela();
		Principal();
	}
	
	public void Tela() {
		setBackground(cor.FUNDO);
		setLayout(null);
	}
	
	public void Principal() {
		pCentral.setBounds(200, 10, 550, 540);
		pCentral.setBackground(corF);
		pCentral.setLayout(null);
		pCentral.setBorder(BorderFactory.createTitledBorder("Aluno/Disciplina"));
        
		
		Titulo();		
        CriarTabela(titulos, diciplinas);
        
        
        pTabela.add(barraRolagem);
        pCentral.add(pTabela);		
        add(pCentral);
	}
	
	
	
	public void CriarTabela(String [] titulos, Object [][]  diciplinas) {
		pTabela.setBounds(10, 20, 480, 500);
		tabela = new JTable(diciplinas, titulos);
        barraRolagem = new JScrollPane(tabela); 
	}
	
	// ADD COMPONENTES A TABELA
	public void Titulo() {
		for(String nn: titulos) {
			listaDisciplina.add(nn);
		}
		
		
		String[] TITULO = new String[listaDisciplina.size()];
		System.out.println(listaDisciplina.toString());
		
		
		for(int i = 0; i < listaDisciplina.size(); i++) {
			TITULO[i] = listaDisciplina.get(i);
		}
		
	}
	//----------------------------------------------------------------
	
	
	
	// BANCO DE DADOS PEGAR DADOS
	public void DadosBD() {
		
		String queryDisciplina = "SELECT disciplina FROM cursos";
		String queryNomes = "SELECT nomes FROM aluno";
		
		try {
			
			// TEste para nn dar erro
			Class.forName("Driver");
			Connection con = DriverManager.getConnection("teste","teste","teste");
			// Fim ------------------------------------
			
			
			PreparedStatement stmtDisciplina = con.prepareStatement(queryDisciplina);
			PreparedStatement stmtNomes = con.prepareStatement(queryNomes);
			ResultSet resultadoDis = stmtDisciplina.executeQuery();
			ResultSet resultadoNome = stmtNomes.executeQuery();
		
			
			while (resultadoDis.next()){
				String disciplina = resultadoDis.getString("disciplinas");
				String nomes = resultadoNome.getString("nomes");
				listaDisciplina.add(disciplina);
				
			}
			while (resultadoNome.next()){
				
				
			}
			
			resultadoDis.close();
			resultadoNome.close();			
			stmtNomes.close();
			stmtDisciplina.close();
			con.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		}
	
}
