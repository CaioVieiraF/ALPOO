import javax.swing.*;

import events.ItemEvents;
import navigation.*;

import java.awt.*;

public class Janela extends JFrame {
    int SCREEN_WIDTH = 900;
    int SCREEN_HEIGHT = 600;

    JPanel navigation = new JPanel();
    JPanel infoProfessor = new InfoProfessor();
    JPanel cadastro = new Cadastro(SCREEN_WIDTH, SCREEN_HEIGHT);
    JPanel consultaProf = new ConsultaProfessor(SCREEN_WIDTH, SCREEN_HEIGHT);
    JPanel login = new Login();
    JPanel cursos = new Cursos();
    JPanel diciplinas = new Diciplinas();
    JPanel infoAluno = new InfoAluno();

    JMenuBar bar = new JMenuBar();
    JMenu telas = new JMenu("telas");
    JMenuItem infoProfessorMenu, cadastroMenu, loginMenu, cursosMenu, diciplinasMenu, infoAlunoMenu;


    public Janela(){

        JMenuItem[] menuItens = {infoAlunoMenu, infoProfessorMenu, cadastroMenu, loginMenu, cursosMenu, diciplinasMenu};
        JPanel[] panels = {login, infoProfessor, cadastro, cursos, diciplinas, infoAluno};
        String[] panelsIDs = {"Login", "Info do Professor", "Cadastro", "Cursos", "Diciplinas", "Info do aluno"};

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
