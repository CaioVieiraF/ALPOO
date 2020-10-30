package navigation;

import backend.DiciplinasHandler;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class CadastroDisciplina extends JPanel{
    Design util = new Design();
    Color GRAY = new Color(200, 200, 200);
    Color WHITE = new Color(255,255,255);

    // Variáveis
    int x = 30, w = 200, h = 30;
    int padding = 20;
    int px = 20, py = 50;

    // Caixas de Texto
    JTextField nmDisciplina = new JTextField();
    JTextField cargaHoraria = new JTextField();

    // ------------ Radio Buttons ----------
    JRadioButton rb1 = new JRadioButton("1");
    JRadioButton rb2 = new JRadioButton("2");
    JRadioButton rb3 = new JRadioButton("3");
    JRadioButton rb4 = new JRadioButton("4");
    JRadioButton rb5 = new JRadioButton("5");
    JRadioButton rb6 = new JRadioButton("6");
    ButtonGroup rdbGrupo = new ButtonGroup();

    // Paineis
    JPanel pPrincipal = new JPanel();
    JPanel pInterno = new JPanel();
    JPanel pBotoes = new JPanel();

    // JButtons
    JButton btnCadastrar = new JButton("Inserir");

    // JComponet
    JRadioButton[] buttons = { rb1, rb2, rb3, rb4, rb5, rb6};
    JComponent[] jComponents = {nmDisciplina, cargaHoraria, btnCadastrar};

    public CadastroDisciplina(int screenW, int screenH) {
        Tela();
        Painel();
    }

    public void Tela() {
        setLayout(null);
        setBackground(util.FUNDO);
    }

    public void Painel() {
        // painel principal
        pPrincipal.setLayout(null);
        pPrincipal.setBackground(GRAY);
        pPrincipal.setBounds(150, 50, 600, 450);

        // painel interno
        pInterno.setLayout(null);
        pInterno.setBounds(20,20,560,410);
        pInterno.setBackground(WHITE);
        pInterno.setBorder(BorderFactory.createEtchedBorder());

        // painel dos RadioButtons
        pBotoes.setLayout(null);
        pBotoes.setBounds(x,230,330,70);
        pBotoes.setBackground(WHITE);
        pBotoes.setBorder(BorderFactory.createTitledBorder("Aulas p/ semana"));
        pInterno.add(pBotoes);

        //ajuste dos RadioButtons
        for (JRadioButton button : buttons) {
            button.setBounds(px, 20, 40, h);
            button.setBackground(WHITE);
            button.setFont(util.FONT_REGULAR);
            rdbGrupo.add(button);
            pBotoes.add(button);
            px += 50;
        }

        // Metodos
        setComponents(jComponents);

        // Botão Cadastrar
        btnCadastrar.setBounds(200, 340, 150, 50);
        btnCadastrar.setBackground(util.BUTTON_COLOR);
        btnCadastrar.setFont(util.FONT_BOLD);
        btnCadastrar.setBorder(BorderFactory.createEmptyBorder());
        btnCadastrar.addActionListener(actionEvent -> {
            DiciplinasHandler handler = new DiciplinasHandler();

            int i = 0;
            boolean condition = true;
            while (condition && i < buttons.length){
                if (buttons[i].isSelected()){
                    condition = false;
                    handler.cadastrarDiciplina(nmDisciplina, cargaHoraria, Integer.parseInt(buttons[i].getText()));
                }
                i++;
            }

        });

        pPrincipal.add(pInterno);
        add(pPrincipal);
    }

    public void setComponents(JComponent[] itens) {
        for (JComponent iten : itens) {
            iten.setBackground(WHITE);
            iten.setFont(new Font("Arial", Font.BOLD, 20));
            iten.setBounds(x, py, 400, 70);
            pInterno.add(iten);
            py += 90;
        }
        jComponents[0].setBorder(BorderFactory.createTitledBorder("Nome da Disciplina"));
        jComponents[1].setBorder(BorderFactory.createTitledBorder("Carga Horária da Disciplina"));
        jComponents[2].setBackground(util.BUTTON_COLOR);
    }
}
