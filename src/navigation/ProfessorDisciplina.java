package navigation;

import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ProfessorDisciplina extends JPanel {

	Design decoracao = new Design();
	
	// Paineis
	JPanel pCentral = new JPanel();
	JPanel pTabela = new JPanel();
	
	// Colunas da tabela
	Object [][]  diciplinas = {
            {"Jo�o da Silva", "Direito", "Educa��o F�sica", "Farmacologia", "Rede de Computadores", "Sistemas de Informa��es"},
            {"Jorgin Ferrera", "Administra��o de empresas", "BioMedicina", "Ci�ncias Biol�gicas", "Ciencias da Computa��o", "Educa��o F�sica"},            
            {"Sr.Ramaus", "Direito", "Educa��o F�sica", "Farmacologia", "Rede de Computadores", "Sistemas de Informa��es"},            
            {"Mr.Silva", "Administra��o de empresas", "BioMedicina", "Ci�ncias Biol�gicas", "Ciencias da Computa��o", "Direito"},            
            {"Sr.Ramaus", "Ciencias da Computa��o", "Direito", "Educa��o F�sica", "Farmacologia", "Rede de Computadores"},
            {"Marie", "Direito", "Educa��o F�sica", "Farmacologia", "Rede de Computadores", "Sistemas de Informa��es"},
            {"Alexandre", "Direito", "Educa��o F�sica", "Farmacologia", "Rede de Computadores", "Sistemas de Informa��es"},
            {"Andr�", "Direito", "Educa��o F�sica", "Farmacologia", "Rede de Computadores", "Sistemas de Informa��es"},            
            {"Ant�nio", "Ciencias da Computa��o", "Direito", "Educa��o F�sica", "Farmacologia", "Rede de Computadores"},            
            {"Enzo", "Administra��o de empresas", "BioMedicina", "Ci�ncias Biol�gicas", "Ciencias da Computa��o", "Educa��o F�sica"},
            {"Henry", "Direito", "Educa��o F�sica", "Farmacologia", "Rede de Computadores", "Sistemas de Informa��es"},            
            {"Gabriel",  "Administra��o de empresas", "BioMedicina", "Ci�ncias Biol�gicas", "Ciencias da Computa��o", "Educa��o F�sica"},            
            {"Enzo Miguel ","Administra��o de empresas", "BioMedicina", "Ci�ncias Biol�gicas", "Ciencias da Computa��o", "Educa��o F�sica"},            
            {"Agatha", "Ciencias da Computa��o", "Direito", "Educa��o F�sica", "Farmacologia", "Rede de Computadores"},            
            {"Antonela","Administra��o de empresas", "BioMedicina", "Ci�ncias Biol�gicas", "Ciencias da Computa��o", "Direito"},            
            {"Giovanna", "Direito", "Educa��o F�sica", "Farmacologia", "Rede de Computadores", "Sistemas de Informa��es"},            
            {"Lav�nia", "Direito", "Educa��o F�sica", "Farmacologia", "Rede de Computadores", "Sistemas de Informa��es"},            
            {"Rebeca", "Ciencias da Computa��o", "Direito", "Educa��o F�sica", "Farmacologia", "Rede de Computadores"},            
            {"Sophie", "Direito", "Educa��o F�sica", "Farmacologia", "Rede de Computadores", "Sistemas de Informa��es"},            
            {"Vit�ria","Ciencias da Computa��o", "Direito", "Educa��o F�sica", "Farmacologia", "Rede de Computadores"},            
            {"Maria Flor", "Direito", "Educa��o F�sica", "Farmacologia", "Rede de Computadores", "Sistemas de Informa��es"},            
            {"Maria Isis", "Direito", "Educa��o F�sica", "Farmacologia", "Rede de Computadores", "Sistemas de Informa��es"},            
            {"	Maria Luiza", "Direito", "Educa��o F�sica", "Farmacologia", "Rede de Computadores", "Sistemas de Informa��es"},            
            {"Maria Sophia","Ciencias da Computa��o", "Direito", "Educa��o F�sica", "Farmacologia", "Rede de Computadores"},            
            {"Maria Valentina","Direito", "Educa��o F�sica", "Farmacologia", "Rede de Computadores", "Sistemas de Informa��es"},            
            {"Ana Luiza", "Direito", "Educa��o F�sica", "Farmacologia", "Rede de Computadores", "Sistemas de Informa��es"},            
            {"Cora", "Direito", "Educa��o F�sica", "Farmacologia", "Rede de Computadores", "Sistemas de Informa��es"},            
            {"Analu", "Administra��o de empresas", "BioMedicina", "Ci�ncias Biol�gicas", "Ciencias da Computa��o", "Educa��o F�sica"},            
            {"Anast�cia","Direito", "Educa��o F�sica", "Farmacologia", "Rede de Computadores", "Sistemas de Informa��es"},            
            {"Am�lia", "Ciencias da Computa��o", "Direito", "Educa��o F�sica", "Farmacologia", "Rede de Computadores"},            
            {"Julieta", "Ciencias da Computa��o", "Direito", "Educa��o F�sica", "Farmacologia", "Rede de Computadores"}            
            };
	
	// Titulo da tabel
	String [] titulos = {"Professor", "Disciplina 1", "Disciplina 2", "Disciplina 3", "Disciplina 4", "Disciplina 5"};
	
	// tabela e scroll
    JTable tabela;
    JScrollPane barraRolagem;
	
	public ProfessorDisciplina() {
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
		pCentral.setBorder(BorderFactory.createTitledBorder("Professor/Disciplina"));		
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
