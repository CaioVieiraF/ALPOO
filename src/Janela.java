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
    JPanel login = new Login();
    JPanel cursos = new Cursos();
    JPanel diciplinas = new Diciplinas();
    JPanel infoAluno = new InfoAluno();

    JMenuBar bar = new JMenuBar();
    JMenu telas = new JMenu("telas");
    JMenuItem infoProfessorMenu = new JMenuItem("Info do professor");
    JMenuItem cadastroMenu = new JMenuItem("Cadastro");
    JMenuItem loginMenu = new JMenuItem("Login");
    JMenuItem cursosMenu = new JMenuItem("Cursos");
    JMenuItem diciplinasMenu = new JMenuItem("Diciplinas");
    JMenuItem infoAlunoMenu = new JMenuItem("Info do aluno");


    public Janela(){

        ItemEvents itemEvents = new ItemEvents(navigation);

        navigation.setLayout(new CardLayout());
        navigation.add(cadastro, "Cadastro");
        navigation.add(infoProfessor, "Info do professor");
        navigation.add(login, "Login");
        navigation.add(cursos, "Cursos");
        navigation.add(diciplinas, "Diciplinas");
        navigation.add(infoAluno, "Info do aluno");

        telas.add(infoProfessorMenu);
        telas.add(cadastroMenu);
        telas.add(loginMenu);
        telas.add(cursosMenu);
        telas.add(diciplinasMenu);
        telas.add(infoAlunoMenu);
        infoProfessorMenu.addActionListener(itemEvents);
        cadastroMenu.addActionListener(itemEvents);
        loginMenu.addActionListener(itemEvents);
        cursosMenu.addActionListener(itemEvents);
        diciplinasMenu.addActionListener(itemEvents);
        infoAlunoMenu.addActionListener(itemEvents);

        bar.add(telas);
        setJMenuBar(bar);
        add(navigation);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
