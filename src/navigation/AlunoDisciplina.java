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
			{"João da Silva", "Estrututra de Dados", "Banco de Dados", "Ciências Sociais", "Cálculo p/ Computação", "Matemática Discreta"},
            {"Caio Vieira", "ALPOO"," taw ", "ipe", "lpoo", "libras (optativa)"},
            {"Gustavo Henrrique", "Direitos Humanos (optativa)","rel. Etica...","Estrututra de Dados", "Banco de Dados", "Ciências Sociais"},
            {"Gabriel Paulo", "Cálculo p/ Computação", "Matemática Discreta", "ALPOO"," taw ", "ipe"},
            {"Rodrigo Lago", "lpoo", "libras (optativa)","Direitos Humanos (optativa)","rel. Etica...","Estrututra de Dados"},
            {"Lucas Augusto", "Banco de Dados", "Ciências Sociais", "Cálculo p/ Computação", "Matemática Discreta", "ALPOO"},
            {"Maria Helena", " taw ", "ipe", "lpoo", "libras (optativa)","Direitos Humanos (optativa)"},
            {"Bruna Rosa", "Direitos Humanos (optativa)","rel. Etica...","Estrututra de Dados", "Banco de Dados", "Ciências Sociais"},
            {"Gabriel Elizeu", "Estrututra de Dados", "Banco de Dados", "Ciências Sociais", "Cálculo p/ Computação", "Matemática Discreta"},
            {"Sabrina de Deus", "ALPOO"," taw ", "ipe", "lpoo", "libras (optativa)"},
            {"Pedro Henrique", "Direitos Humanos (optativa)","rel. Etica...","Estrututra de Dados", "Banco de Dados", "Ciências Sociais"},
            {"Rafael Santos", "Cálculo p/ Computação", "Matemática Discreta", "ALPOO"," taw ", "ipe"},
            {"Danilo Barbosa", "Estrututra de Dados", "Banco de Dados", "Ciências Sociais", "Cálculo p/ Computação", "Matemática Discreta"},
            {"Victor Alessandro", "lpoo", "libras (optativa)","Direitos Humanos (optativa)","rel. Etica...","Estrututra de Dados"},
            {"Guilherme Matos", "Banco de Dados", "Ciências Sociais", "Cálculo p/ Computação", "Matemática Discreta", "ALPOO"},
            {"Paula Fernandes", "Estrututra de Dados", "Banco de Dados", "Ciências Sociais", "Cálculo p/ Computação", "Matemática Discreta"},
            {"Thais Silva",  " taw ", "ipe", "lpoo", "libras (optativa)","Direitos Humanos (optativa)"},
            {"Larissa Martins","Direitos Humanos (optativa)","rel. Etica...","Estrututra de Dados", "Banco de Dados", "Ciências Sociais"},
            {"João Victor", "Cálculo p/ Computação", "Matemática Discreta", "ALPOO"," taw ", "ipe"},
            {"Artur Santos",  "ALPOO"," taw ", "ipe", "lpoo", "libras (optativa)"},
            {"Carlos Henrrique", "Direitos Humanos (optativa)","rel. Etica...","Estrututra de Dados", "Banco de Dados", "Ciências Sociais"},
            {"Amanda Oliveira", "Estrututra de Dados", "Banco de Dados", "Ciências Sociais", "Cálculo p/ Computação", "Matemática Discreta"},
            {"José Vieira","Banco de Dados", "Ciências Sociais", "Cálculo p/ Computação", "Matemática Discreta", "ALPOO"},
            {"Mariana Soares",   "taw", "ipe", "lpoo", "libras (optativa)","Direitos Humanos (optativa)"},
            {"Lucca Lima", "Cálculo p/ Computação", "Matemática Discreta", "ALPOO"," taw ", "ipe"},
            {"Renato Silva",  "Direitos Humanos (optativa)","rel. Etica...","Estrututra de Dados", "Banco de Dados", "Ciências Sociais"},
            {"Pedro Augusto","lpoo", "libras (optativa)","Direitos Humanos (optativa)","rel. Etica...","Estrututra de Dados"},
            {"Raissa Carolina",  "ALPOO"," taw ", "ipe", "lpoo", "libras (optativa)"},
            {"Lorena Silva", "Estrututra de Dados", "Banco de Dados", "Ciências Sociais", "Cálculo p/ Computação", "Matemática Discreta"},
            {"Marcia Nunes", "Direitos Humanos (optativa)","rel. Etica...","Estrututra de Dados", "Banco de Dados", "Ciências Sociais"}
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
