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

public class CadastroDisciplina extends JPanel{
    //---classe Design--
    Design util = new Design();

    // Fotnes
    Font fonte = new Font("Arial", Font.BOLD, 25);
    Font fonte2 = new Font("Arial", Font.CENTER_BASELINE, 12);
    Font fonte3 = new Font("Arial", Font.CENTER_BASELINE, 22);

    // ------------ Cores --------------
    Color corF = new Color(200, 200, 200);
    Color corFF = new Color(255, 255, 255);
    Color corF4 = new Color(235, 235, 235);

    // Caixas de Texto
    JTextField txtCodCurso = new JTextField();
    JTextField txtCargaHoraria = new JTextField();
    JTextField txtCodIntituto = new JTextField();

    // -------------- Radio Buttons ----------
    JRadioButton rdbBacharel = new JRadioButton("Bacharel");
    JRadioButton rdbGestao = new JRadioButton("Gest�o");
    JRadioButton rdbOutros = new JRadioButton("outros");
    ButtonGroup rdbGrupo = new ButtonGroup();

    // Veriaveis
    String[] nomeDisciplina = { "Estrutura de Dados", "ALPOO", "Cálculo p/ computação", "Matemática Discreta",
            "LPOO", "IPE", "LPBD", "TAW", "Teoria dos Grafos"};

    // Lista
    JList<String> listNomeCursos = new JList<String>(nomeDisciplina);

    // Paineis
    JPanel pPrincipal = new JPanel();
    JPanel pCods = new JPanel();
    JPanel pBotoes = new JPanel();

    // JComponet
    JComponent[] cBotoes = { rdbBacharel, rdbGestao, rdbOutros };
    JComponent[] cCaixas = { txtCodCurso, txtCodIntituto, txtCargaHoraria };

    // JButtons
    JButton btnCadastrar = new JButton("Cadastrar");

    public CadastroDisciplina(int screenW, int screenH) {
        Tela();
        Painelprincipal();
    }

    public void Tela() {
        setLayout(null);
        setBackground(util.FUNDO);
    }

    public void Painelprincipal() {
        // painel principal
        pPrincipal.setLayout(null);
        pPrincipal.setBackground(new Color(200, 200, 200));
        pPrincipal.setBounds(150, 50, 600, 450);
        pPrincipal.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, corF));

        // Metodos
        ListaCursos();
        BotoesR(cBotoes);
        Cods(cCaixas);

        // Botoes
        btnCadastrar.setBounds(190, 340, 160, 50);
        btnCadastrar.setBackground(util.BUTTON_COLOR);
        btnCadastrar.setFont(fonte);
        btnCadastrar.setBorder(BorderFactory.createEmptyBorder());

        pPrincipal.add(btnCadastrar);

        add(pPrincipal);
    }

    public void ListaCursos() {
        listNomeCursos.setBounds(30, 40, 320, 280);
        listNomeCursos.setFont(fonte3);
        listNomeCursos.setBackground(corF4);
        listNomeCursos.setBorder(BorderFactory.createEtchedBorder());
        pPrincipal.add(listNomeCursos);
    }

    public void BotoesR(JComponent[] compo) {
        pBotoes.setBounds(360, 40, 200, 100);
        pBotoes.setLayout(new GridLayout(3, 1));
        pBotoes.setBackground(corF4);
        pBotoes.setFont(fonte3);
        pBotoes.setBorder(BorderFactory.createEtchedBorder());

        for (int i = 0; i < compo.length; i++) {
            pBotoes.add(compo[i]);
        }

        rdbGrupo.add(rdbBacharel);
        rdbGrupo.add(rdbGestao);
        rdbGrupo.add(rdbOutros);
        pPrincipal.add(pBotoes);
    }

    public void Cods(JComponent[] compo) {
        pCods.setBounds(360, 150, 200, 170);
        pCods.setBorder(BorderFactory.createEtchedBorder());
        pCods.setBackground(corF4);
        pCods.setLayout(null);

        compo[0].setBounds(10, 10, 180, 50);
        compo[1].setBounds(10, 60, 180, 50);
        compo[2].setBounds(10, 110, 180, 50);

        for(JComponent compon : compo) {
            compon.setEnabled(false);
            compon.setFont(fonte3);
            pCods.add(compon);
        }

        compo[0].setBorder(BorderFactory.createTitledBorder("Cod Curso"));
        compo[1].setBorder(BorderFactory.createTitledBorder("Carga Horaria"));
        compo[2].setBorder(BorderFactory.createTitledBorder("Cod Intituto"));
        pPrincipal.add(pCods);
    }
}
