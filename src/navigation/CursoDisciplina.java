package navigation;

import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class CursoDisciplina extends JPanel {

	Design decoracao = new Design();
	
	// Paineis
	JPanel pCentral = new JPanel();
	JPanel pTabela = new JPanel();
	
	// Colunas da tabela
	Object [][]  diciplinas = {
            {"Medicina", "Fisiologia", "Primeiro Socorros", "Bioquímica", "Biofísica", "Embriologia"},
            {"Ciências da Computação", "Estrututra de Dados", "LPBD", "Ciências Sociais", "Cálculo p/ Computação", "Matemática Discreta"},
            {"Direito", "Análise Textual", "Direito Civil", "Direito Penal", "Direito Agrário", "Criminologia"},
            {"Administração", "Marketing", "Contabilidade", "Principio de Empreendedorismo", "Estrategia de Sustentabilidade", "Metodos Quantitativos"},
            {"Pscicologia", "Pscicologia Social", "Neurociência", "Psicologia Comportamental", "Técnicas de Observação", "Psicologia Construtiva"},
            {"Odontologia", "Fisiologia", "Genética Aplicada à Odonto", "Psicologia Geral", "Bioquóimica", "Patologia Bucal"},
            {"Educação Física", "Anatomia Humana Aplicada", "Ginástica", "Socorros de Urgência", "Bases Fisiológicas", "Bioquímica"},
            {"Nutrição", "Anatomia", "Genética", "Imunologia", "Microbiologia", "Parasitologia"},
            {"Biomedicina", "Anatomia", "Biofísica", "Citologia", "Fisiologia", "Química Indústrial"},
            {"Ciências Contabeis", "Economia", "Auditoria Contábil", "Análise de Custos", "Empreendedorismo", "Fundamentos de Custo"},
            {"Química", "Cálculo", "História da Química", "Química Organica", "Química Forense", "Termodinâmica"},
            {"Letras", "Literatura Brasileira", "Literatura Inglesa", "Literatura Portuguesa", "Didática e Tecnologias", "Morfossintaxe"},
            {"Pedagogia", "Piscicologia do Desenvolvimento", "Ciclo Vital", "História do Pensamento", "Didática Fundamental", "Educação Ambiental"},
            {"Gestão de RH", "Gestão de Projetos", "Desnvolvimento Organizacional", "Qualidade de Vida no Trabalho", "Gestão por competência", "Empreendedorismo"},
            {"Farmácia", "Anatomia Humana", "Bioquímica Geral", "Biossegurança", "Cosmetologia", "Farmotécnica"},
            {"Engenharia Civil", "Cálculo", "Estudo do Solo", "Desenho Técnico", "Álgebra Linear", "Física"},
            {"Engenharia da Computação", "Cálculo", "Automação", "Circuitos Digitais", "Desenho Técnico", "Eletromagnetismo"},
            {"Astronomia", "Física Experimental", "Física Quântica", "Astrofísica", "Eletromagnetismo", "Sistemas Planetários"},
            {"Filosofia", "Antropologia Filosṕofica", "Antropologia Filosófica", "Estética", "Cultura Brasileira", "Hermenêutica"},
            {"Matemática", "Funções", "Cálculo", "Resolução de Problemas", "MAtriz e Geometria Analítica", "Fisíca"},
            {"Med. Veterinaria", "Citologia", "Ciência do Ambiente", "Genética Animal", "Biofísica", "Química"},
            {"Arquitetura", "Urbanismo", "Geometria Gráfica", "Plástica Tridimensional", "Paisagismo", "Sociologia Urbana"},
            {"Física", "Termodinâmica", "Cálculo Diferencial", "Didática Geral", "Educação Inclusiva", "Eletromagnetismo"},
            {"Agronomia", "Agriculcultura", "Anatomia e Fisíologia Animal", "Bioquímica", "Ecologia Vegetal", "Economia"},
            {"Engenharia de Alimentos", "Algebra Linear", "Cálculo", "Desenho Técnico", "Química Orgânica", "Química Análitica"},
            {"Engenharia Elétrica", "Desenho Técnico", "Eletrônica Digital", "Eletricidade", "Empreendedorismo", "Eletrônica Analógica"},
            {"Artes cenicas", "Literatura Dramática", "Expressão Corporal", "História do Teatro", "Cultura e Sociedade", "Iluminação"},
            {"Engenharia Química", "Cálculo", "Análise Industrial", "Fênomenos de Transporte", "Ciência dos Materiais", "Desenho Técnico"},
            {"Economia", "Macroeconomia", "Economia Matemática", "Economia", "História Econômica Geral", "Formação Econômica Brasileira"},
            {"Engenharia Mêcanica", "Administração", "Controle e Automação", "Desenho Técnico", "Elementos de Máquinas", "Estatística"}
            };
	
	// Titulo da tabel
	String [] titulos = {"Cursos", "Disciplina 1", "Disciplina 2", "Disciplina 3", "Disciplina 4", "Disciplina 5"};
	
	// tabela e scroll
    JTable tabela;
    JScrollPane barraRolagem;
	
	public CursoDisciplina() {
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
		pCentral.setBorder(BorderFactory.createTitledBorder("Cursos/Disciplina"));
        			
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
