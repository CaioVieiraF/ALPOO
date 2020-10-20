import javax.swing.*;

import events.ItemEvents;
import navigation.*;

import java.awt.*;

public class Janela extends JFrame {
    int SCREEN_WIDTH = 900;
    int SCREEN_HEIGHT = 600;

    JPanel navigation = new JPanel();
    JPanel CadastroProfessor = new CadastroProfessor();
    JPanel cadastro = new Cadastro(SCREEN_WIDTH, SCREEN_HEIGHT);
    JPanel consultaProf = new ConsultaProfessor(SCREEN_WIDTH, SCREEN_HEIGHT);
    JPanel login = new Login();
    JPanel cursos = new Cursos();
    JPanel diciplinas = new Diciplinas(SCREEN_WIDTH,SCREEN_HEIGHT);
    JPanel infoAluno = new InfoAluno();
    JPanel CadastroAluno = new CadastroAluno();

    JMenuBar bar = new JMenuBar();
    JMenu telas = new JMenu("telas");
    JMenuItem CadastroProfessorMenu, cadastroMenu, consultaProfMenu, loginMenu, cursosMenu, diciplinasMenu, CadastroAlunoMenu, infoAlunoMenu;


    public Janela(){

        JMenuItem[] menuItens = {infoAlunoMenu, CadastroProfessorMenu, consultaProfMenu, cadastroMenu, loginMenu, cursosMenu, CadastroAlunoMenu, diciplinasMenu};
        JPanel[] panels = {login, CadastroProfessor, consultaProf, cadastro, cursos, diciplinas, CadastroAluno, infoAluno};
        String[] panelsIDs = {"Login", "Cadstro do Professor", "Consulta prof", "Cadastro", "Cursos", "Diciplinas", "Cadastro do Aluno", "Info do aluno"};

        for (int i = 0; i < menuItens.length; i++){
            menuItens[i] = new JMenuItem(panelsIDs[i]);
        }

        navigation.setLayout(new CardLayout());

        setJMenuBar(bar);
        bar.add(telas);
        addItens(navigation, panels, panelsIDs);
        addItens(telas, menuItens);
        addActionListeners(menuItens);
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
