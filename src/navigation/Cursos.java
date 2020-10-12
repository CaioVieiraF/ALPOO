package navigation;


import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;



public class Cursos extends JPanel {
	
	// ------------- Caixas de Texto --------------
	JTextField txtCodCurso = new JTextField();
	JTextField txtCargaHoraria = new JTextField();
	JTextField txtCodIntituto = new JTextField();
	
	// -------------- Radio Buttons ----------
	JRadioButton rdbBacharel = new JRadioButton();
	JRadioButton rdbGestao = new JRadioButton();
	JRadioButton rdbOutros = new JRadioButton();
	
	// --------  Veriaveis -----------------
	String[] nomeCurso = {"Administração de empresas", "BioMedicina", "Ciências Biológicas", "Ciencias da Computação", "Direito", "Educação Física", "Farmacologia", "Rede de Computadores", "Sistemas de Informações"};
	
	// ------- Lista -----------
	JList<String> listNomeCursos = new JList<String>(nomeCurso);
	
	// -------------- Paineis ----------
	JPanel pPrincipal = new JPanel();
	
	// ----------------- Fotnes ---------------
	Font fonte = new Font("Arial", Font.BOLD, 25);
	Font fonte2 = new Font("Arial", Font.CENTER_BASELINE, 12);
	Font fonte3 = new Font("Arial", Font.CENTER_BASELINE, 22);
		
	// ------------ Cores --------------
	Color corF = new Color(200, 200, 200);
	Color corFF = new Color(255, 255, 255);
	Color corF3 = new Color(250, 100, 100);
	Color corF4 = new Color(235, 235, 235);
	Design cor = new Design();
	
	
    public Cursos(){
        
    	Tela();
    	Painelprincipal();
    	
    }
    
    public void Tela() {
    	setSize(900, 600);
    	setLayout(null);
    	Design ds = new Design();
    	setBackground(ds.FUNDO);
    }
    
    public void Painelprincipal() {
    	// painel principal
    	pPrincipal.setLayout(null);
    	pPrincipal.setBackground(corFF);
    	pPrincipal.setBounds(150, 50, 700, 400);
    	
    	
    	
    	//ListaCursos
    	listNomeCursos.setBounds(10, 80, 320, 280);
    	listNomeCursos.setFont(fonte3);
    	listNomeCursos.setBackground(corF4);
    	listNomeCursos.setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, corF));
    	pPrincipal.add(listNomeCursos);
    	
    	
    	
    	
    	add(pPrincipal);
    }
    
    public void ListaCursos(JComponent[] cmpLista ) {
    	
    	for(int i = 0; i < cmpLista.length; i++) {
    		listNomeCursos.add(cmpLista[i]);
    	}
    	
    	pPrincipal.add(listNomeCursos);
    	
    }
    
    
}
