package navigation;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Cursos extends JPanel {

	// --------------------DESIGN----------------------- //

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

	// ------------------COMPONENTES-------------------- //

	// ------------- Caixas de Texto --------------
	JTextField txtCodCurso = new JTextField();
	JTextField txtCargaHoraria = new JTextField();
	JTextField txtCodIntituto = new JTextField();

	// -------------- Radio Buttons ----------
	JRadioButton rdbBacharel = new JRadioButton("Bacharel");
	JRadioButton rdbGestao = new JRadioButton("Gestão");
	JRadioButton rdbOutros = new JRadioButton("outros");
	ButtonGroup rdbGrupo = new ButtonGroup();

	// -------- Veriaveis -----------------
	String[] nomeCurso = { "Administração de empresas", "BioMedicina", "Ciências Biológicas", "Ciencias da Computação",
			"Direito", "Educação Física", "Farmacologia", "Rede de Computadores", "Sistemas de Informações" };

	// ------- Lista -----------
	JList<String> listNomeCursos = new JList<String>(nomeCurso);

	// -------------- Paineis ----------
	JPanel pPrincipal = new JPanel();
	JPanel pCods = new JPanel();
	JPanel pBotoes = new JPanel();

	// ----------- JComponet --------------
	JComponent[] cBotoes = { rdbBacharel, rdbGestao, rdbOutros };
	JComponent[] cCaixas = { txtCodCurso, txtCodIntituto, txtCargaHoraria };

	// JButtons
	JButton btnCadastrar = new JButton("Cadastrar");
	JButton btnVisualisar = new JButton("Visualisar");

	public Cursos() {

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
		pPrincipal.setBackground(corF4);
		pPrincipal.setBounds(150, 50, 600, 450);
		pPrincipal.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, corF));

		// Metodos
		ListaCursos();
		BotoesR(cBotoes);
		Cods(cCaixas);

		// Botoes
		btnCadastrar.setBounds(170, 380, 160, 50);
		btnCadastrar.setBackground(new Color(100, 255, 100));
		btnCadastrar.setFont(fonte);
		btnCadastrar.setBorder(BorderFactory.createEmptyBorder());
		btnVisualisar.setBounds(10, 380, 160, 50);
		btnVisualisar.setBackground(new Color(100, 100, 255));
		btnVisualisar.setFont(fonte);
		btnVisualisar.setBorder(BorderFactory.createEmptyBorder());

		pPrincipal.add(btnCadastrar);
		pPrincipal.add(btnVisualisar);

		add(pPrincipal);
	}

	public void ListaCursos() {
		listNomeCursos.setBounds(10, 80, 320, 280);
		listNomeCursos.setFont(fonte3);
		listNomeCursos.setBackground(corF4);
		listNomeCursos.setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, corF));
		pPrincipal.add(listNomeCursos);

	}

	public void BotoesR(JComponent[] compo) {
		pBotoes.setBounds(340, 80, 200, 100);
		pBotoes.setLayout(new GridLayout(3, 1));
		pBotoes.setBackground(corF4);
		pBotoes.setFont(fonte3);
		pBotoes.setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, corF));
		for (int i = 0; i < compo.length; i++) {
			pBotoes.add(compo[i]);
		}
		rdbGrupo.add(rdbBacharel);
		rdbGrupo.add(rdbGestao);
		rdbGrupo.add(rdbOutros);
		pPrincipal.add(pBotoes);
	}

	public void Cods(JComponent[] compo) {
		pCods.setBounds(10, 30, 320, 80);
		pCods.setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, corF));
		pCods.setBackground(corF4);
		pCods.setLayout(null);
		compo[0].setBounds(10, 10, 100, 40);
		compo[0].setBorder(BorderFactory.createTitledBorder("Cod Curso"));
		compo[0].setFont(fonte3);
		compo[1].setBounds(110, 10, 100, 40);
		compo[1].setBorder(BorderFactory.createTitledBorder("Carga Horaria"));
		compo[1].setFont(fonte3);
		compo[2].setBounds(210, 10, 100, 40);
		compo[2].setBorder(BorderFactory.createTitledBorder("Cod Instituto"));
		compo[2].setFont(fonte3);

		pCods.add(compo[0]);
		pCods.add(compo[1]);
		pCods.add(compo[2]);

		pPrincipal.add(pCods);
	}

}
