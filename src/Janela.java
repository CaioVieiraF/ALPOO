import javax.swing.*;

import events.ItemEvents;
import navigation.*;

import java.awt.*;

public class Janela extends JFrame {
    int SCREEN_WIDTH = 900;
    int SCREEN_HEIGHT = 600;

    JPanel navigation = new JPanel();
    JPanel cadastroProfessor = new CadastroProfessor();
    JPanel cadastro = new Cadastro(SCREEN_WIDTH, SCREEN_HEIGHT);
    JPanel consultaProf = new ConsultaProfessor(SCREEN_WIDTH, SCREEN_HEIGHT);
    JPanel login = new Login();
    JPanel cursos = new Cursos();
    JPanel diciplinas = new Diciplinas(SCREEN_WIDTH,SCREEN_HEIGHT);
    JPanel infoAluno = new InfoAluno();
    JPanel cadastroAluno = new CadastroAluno();

    JMenuBar bar = new JMenuBar();
    JMenu mostrar = new JMenu("Mostrar");
    JMenu cadastrar = new JMenu("Cadastrar");
    JMenu sair = new JMenu("Sair");
    JMenuItem cadastroProfessorMenu, cadastroMenu, consultaProfMenu, loginMenu, cursosMenu, diciplinasMenu, cadastroAlunoMenu, infoAlunoMenu, sairMenu;


    public Janela(){

        JMenuItem[] menuItensMostrar = {loginMenu, consultaProfMenu, cursosMenu, diciplinasMenu, infoAlunoMenu};
        JMenuItem[] menuItemsCadastrar = {cadastroMenu, cadastroAlunoMenu, cadastroProfessorMenu};
        JPanel[] panels = {login, consultaProf, cursos, diciplinas, infoAluno, cadastro, cadastroAluno, cadastroProfessor};
        String[] panelsIDs = {"Login", "Consulta prof", "Cursos", "Diciplinas", "Info do aluno", "Cadastro", "Cadastro do Aluno", "Cadstro do Professor"};

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
        bar.setBackground(Color.WHITE);
        bar.setBorder(BorderFactory.createEmptyBorder());

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
}
