import javax.swing.*;

import events.ItemEvents;
import navigation.*;

import java.awt.*;

public class Janela extends JFrame {
    int SCREEN_WIDTH = 900;
    int SCREEN_HEIGHT = 600;

    JPanel navigation = new JPanel();
    JPanel cadastroProfessor = new CadastroProfessor();
    JPanel consultaProf = new ConsultaProfessor(SCREEN_WIDTH, SCREEN_HEIGHT);
    JPanel cursos = new Cursos();
    JPanel diciplinas = new Disciplinas(SCREEN_WIDTH,SCREEN_HEIGHT);
    JPanel infoAluno = new InfoAluno(SCREEN_WIDTH, SCREEN_HEIGHT);
    JPanel cadastroAluno = new CadastroAluno();
    JPanel cadastroDisciplina = new CadastroDisciplina(SCREEN_WIDTH,SCREEN_HEIGHT);
    
    JPanel alunoDisciplina = new AlunoDisciplina();
    JPanel cursoDisciplina = new CursoDisciplina();
    JPanel cursoProfessor = new CursoProfessor();
    JPanel ProfessorDisciplina = new ProfessorDisciplina();
    
    Font fonte = new Font("Arial", Font.BOLD, 12);
    
    JMenuBar bar = new JMenuBar();
    JMenu mostrar = new JMenu("Mostrar");
    JMenu cadastrar = new JMenu("Cadastrar");
    JMenu sair = new JMenu("Sair");
    JMenuItem cadastroProfessorMenu, consultaProfMenu, cursosMenu, diciplinasMenu, cadastroAlunoMenu,  alunoDisciplinaMenu, cadastroDisciplinaMenu, cursoDisciplinaMenu, cursoProfessorMenu, ProfessorDisciplinaMenu, infoAlunoMenu, sairMenu;


    public Janela(){

        JMenuItem[] menuItensMostrar = {consultaProfMenu, cursosMenu, diciplinasMenu, infoAlunoMenu, alunoDisciplinaMenu, cursoDisciplinaMenu, cursoProfessorMenu, ProfessorDisciplinaMenu};
        JMenuItem[] menuItemsCadastrar = {cadastroAlunoMenu, cadastroProfessorMenu, cadastroDisciplinaMenu};
        JPanel[] panels = {consultaProf, cursos, diciplinas, infoAluno, alunoDisciplina, cursoDisciplina, cursoProfessor, ProfessorDisciplina, cadastroAluno, cadastroProfessor, cadastroDisciplina};
        String[] panelsIDs = {"Consulta prof", "Cursos", "Disciplinas", "Info do aluno", "Curso/Disciplina", "Curso/Aluno", "Curso/Professor", "Professor/Disciplina", "Cadastro do Aluno", "Cadstro do Professor", "Cadastro Disciplina"};
        JMenuItem[] menuP = {mostrar, cadastrar, sair};
        
        for (int i = 0; i < menuItensMostrar.length; i++){
            menuItensMostrar[i] = new JMenuItem(panelsIDs[i]);
        }
        for (int i = 0; i < menuItemsCadastrar.length; i++){
            menuItemsCadastrar[i] = new JMenuItem(panelsIDs[i+menuItensMostrar.length]);
        }

        sairMenu = new JMenuItem("Sair");

        navigation.setLayout(new CardLayout());

        setJMenuBar(bar);
        bar.add(mostrar);
        bar.add(cadastrar);
        bar.add(sair);
        bar.setBackground(Color.DARK_GRAY);
        bar.setBorder(BorderFactory.createEmptyBorder());
       	
        sairMenu.setFont(fonte);
        sairMenu.setForeground(Color.WHITE);
        sairMenu.setBackground(Color.DARK_GRAY);
        sairMenu.setBorder(BorderFactory.createEmptyBorder());
        
        for (JMenuItem jMenuItem : menuP) {
			jMenuItem.setFont(fonte);
			jMenuItem.setForeground(Color.WHITE);
		}

        configureMenu(menuItensMostrar);
        configureMenu(menuItemsCadastrar);

        addItens(navigation, panels, panelsIDs);

        addItens(mostrar, menuItensMostrar);
        addItens(cadastrar, menuItemsCadastrar);
        sair.add(sairMenu);

        addActionListeners(menuItensMostrar);
        addActionListeners(menuItemsCadastrar);
        sairMenu.addActionListener(actionEvent -> System.exit(0));

        add(navigation);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public void addItens(JComponent surface, JComponent[] components){
        for (JComponent component : components){
            surface.add(component);
        }
    }

    public void addItens(JComponent surface, JComponent[] components, String[] componentsId){
        for (int i = 0; i < components.length; i++){
            surface.add(components[i], componentsId[i]);
        }
    }

    public void addActionListeners(JMenuItem[] surfaces){
        ItemEvents itemEvents = new ItemEvents(navigation);
        for (JMenuItem surface : surfaces){
            surface.addActionListener(itemEvents);
        }
    }

    public void configureMenu(JMenuItem[] list){
        for (JMenuItem jMenuItem : list) {
            jMenuItem.setBackground(Color.DARK_GRAY);
            jMenuItem.setForeground(Color.WHITE);
            jMenuItem.setFont(fonte);
        }
    }
}
