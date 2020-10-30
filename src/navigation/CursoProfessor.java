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
            {"Jo�o da Silva", "Estrututra de Dados", "LPBD", "Ci�ncias Sociais", "C�lculo p/ Computa��oo", "Matem�tica Discreta"},
            {"Jorgin Ferrera", "Estrututra de Dados", "LPBD", "Ci�ncias Sociais", "C�lculo p/ Computa��oo", "Matem�tica Discreta"},       
            {"Sr.Ramaus", "ALPOO"," taw ", "ipe", "lpoo", "libras (optativa)"},
            {"Mr.Silva", "Estrututra de Dados", "LPBD", "Ci�ncias Sociais", "C�lculo p/ Computa��oo", "Matem�tica Discreta"},
            {"Sr.Ramaus", "ALPOO"," taw ", "ipe", "lpoo", "libras (optativa)"},
            {"Marie", "Matem�tica Discreta", "ALPOO"," taw ", "ipe", "lpoo"},
            {"Alexandre", "C�lculo p/ Computa��oo", "Matem�tica Discreta", "ALPOO"," taw ", "ipe"},
            {"Andr�", "Matem�tica Discreta", "ALPOO"," taw ", "ipe", "lpoo"},
            {"Ant�nio", " taw ", "ipe", "lpoo", "libras (optativa)","Direitos Humanos (optativa)"},
            {"Enzo", "Ci�ncias Sociais", "C�lculo p/ Computa��oo", "Matem�tica Discreta", "ALPOO"," taw "},
            {"Henry",  "Estrututra de Dados", "LPBD", "Ci�ncias Sociais", "C�lculo p/ Computa��oo", "Matem�tica Discreta"},
            {"Gabriel", "Matem�tica Discreta", "ALPOO"," taw ", "ipe", "lpoo"},
            {"Enzo Miguel ", "ALPOO"," taw ", "ipe", "lpoo", "libras (optativa)"},
            {"Agatha", "Estrututra de Dados", "LPBD", "Ci�ncias Sociais", "C�lculo p/ Computa��oo", "Matem�tica Discreta"},
            {"Antonela", "Ci�ncias Sociais", "C�lculo p/ Computa��oo", "Matem�tica Discreta", "ALPOO"," taw "},
            {"Giovanna", "Matem�tica Discreta", "ALPOO"," taw ", "ipe", "lpoo"},
            {"Lav�nia", "ALPOO"," taw ", "ipe", "lpoo", "libras (optativa)"},
            {"Rebeca", "Matem�tica Discreta", "ALPOO"," taw ", "ipe", "lpoo"},
            {"Sophie", "ALPOO"," taw ", "ipe", "lpoo", "libras (optativa)"},
            {"Vit�ria", "Matem�tica Discreta", "ALPOO"," taw ", "ipe", "lpoo"},
            {"Maria Flor", "Ci�ncias Sociais", "C�lculo p/ Computa��oo", "Matem�tica Discreta", "ALPOO"," taw "},
            {"Maria Isis", "Matem�tica Discreta", "ALPOO"," taw ", "ipe", "lpoo"},
            {"	Maria Luiza", "ALPOO"," taw ", "ipe", "lpoo", "libras (optativa)"},
            {"Maria Sophia", "Matem�tica Discreta", "ALPOO"," taw ", "ipe", "lpoo"},
            {"Maria Valentina", "ALPOO"," taw ", "ipe", "lpoo", "libras (optativa)"},
            {"Ana Luiza", "Matem�tica Discreta", "ALPOO"," taw ", "ipe", "lpoo"},
            {"Cora", " taw ", "ipe", "lpoo", "libras (optativa)","Direitos Humanos (optativa)"},
            {"Analu", "Ci�ncias Sociais", "C�lculo p/ Computa��oo", "Matem�tica Discreta", "ALPOO"," taw "},
            {"Anast�cia",  "Estrututra de Dados", "LPBD", "Ci�ncias Sociais", "C�lculo p/ Computa��oo", "Matem�tica Discreta"},
            {"Am�lia", "Matem�tica Discreta", "ALPOO"," taw ", "ipe", "lpoo"},
            {"Julieta", "ALPOO"," taw ", "ipe", "lpoo", "libras (optativa)"}
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
