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
            {"João da Silva", "Direito", "Educação Física", "Farmacologia", "Rede de Computadores", "Sistemas de Informações"},
            {"Jorgin Ferrera", "Administração de empresas", "BioMedicina", "Ciências Biológicas", "Ciencias da Computação", "Educação Física"},            
            {"Sr.Ramaus", "Direito", "Educação Física", "Farmacologia", "Rede de Computadores", "Sistemas de Informações"},            
            {"Mr.Silva", "Administração de empresas", "BioMedicina", "Ciências Biológicas", "Ciencias da Computação", "Direito"},            
            {"Sr.Ramaus", "Ciencias da Computação", "Direito", "Educação Física", "Farmacologia", "Rede de Computadores"},
            {"Marie", "Direito", "Educação Física", "Farmacologia", "Rede de Computadores", "Sistemas de Informações"},
            {"Alexandre", "Direito", "Educação Física", "Farmacologia", "Rede de Computadores", "Sistemas de Informações"},
            {"André", "Direito", "Educação Física", "Farmacologia", "Rede de Computadores", "Sistemas de Informações"},            
            {"Antônio", "Ciencias da Computação", "Direito", "Educação Física", "Farmacologia", "Rede de Computadores"},            
            {"Enzo", "Administração de empresas", "BioMedicina", "Ciências Biológicas", "Ciencias da Computação", "Educação Física"},
            {"Henry", "Direito", "Educação Física", "Farmacologia", "Rede de Computadores", "Sistemas de Informações"},            
            {"Gabriel",  "Administração de empresas", "BioMedicina", "Ciências Biológicas", "Ciencias da Computação", "Educação Física"},            
            {"Enzo Miguel ","Administração de empresas", "BioMedicina", "Ciências Biológicas", "Ciencias da Computação", "Educação Física"},            
            {"Agatha", "Ciencias da Computação", "Direito", "Educação Física", "Farmacologia", "Rede de Computadores"},            
            {"Antonela","Administração de empresas", "BioMedicina", "Ciências Biológicas", "Ciencias da Computação", "Direito"},            
            {"Giovanna", "Direito", "Educação Física", "Farmacologia", "Rede de Computadores", "Sistemas de Informações"},            
            {"Lavínia", "Direito", "Educação Física", "Farmacologia", "Rede de Computadores", "Sistemas de Informações"},            
            {"Rebeca", "Ciencias da Computação", "Direito", "Educação Física", "Farmacologia", "Rede de Computadores"},            
            {"Sophie", "Direito", "Educação Física", "Farmacologia", "Rede de Computadores", "Sistemas de Informações"},            
            {"Vitória","Ciencias da Computação", "Direito", "Educação Física", "Farmacologia", "Rede de Computadores"},            
            {"Maria Flor", "Direito", "Educação Física", "Farmacologia", "Rede de Computadores", "Sistemas de Informações"},            
            {"Maria Isis", "Direito", "Educação Física", "Farmacologia", "Rede de Computadores", "Sistemas de Informações"},            
            {"	Maria Luiza", "Direito", "Educação Física", "Farmacologia", "Rede de Computadores", "Sistemas de Informações"},            
            {"Maria Sophia","Ciencias da Computação", "Direito", "Educação Física", "Farmacologia", "Rede de Computadores"},            
            {"Maria Valentina","Direito", "Educação Física", "Farmacologia", "Rede de Computadores", "Sistemas de Informações"},            
            {"Ana Luiza", "Direito", "Educação Física", "Farmacologia", "Rede de Computadores", "Sistemas de Informações"},            
            {"Cora", "Direito", "Educação Física", "Farmacologia", "Rede de Computadores", "Sistemas de Informações"},            
            {"Analu", "Administração de empresas", "BioMedicina", "Ciências Biológicas", "Ciencias da Computação", "Educação Física"},            
            {"Anastácia","Direito", "Educação Física", "Farmacologia", "Rede de Computadores", "Sistemas de Informações"},            
            {"Amélia", "Ciencias da Computação", "Direito", "Educação Física", "Farmacologia", "Rede de Computadores"},            
            {"Julieta", "Ciencias da Computação", "Direito", "Educação Física", "Farmacologia", "Rede de Computadores"}            
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
