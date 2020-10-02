package navigation;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class InfoProfessor extends JPanel implements ActionListener{
	
	// Labels Textos
	JLabel lblIdProfessor = new JLabel("ID:");
	JLabel lblNomeProfessor = new JLabel("NOME:");
	JLabel lblEnderecoProfessor = new JLabel("ENDEREÇO:");
	
	JLabel lblRuaProfessor = new JLabel("Rua/Av:");
	JLabel lblNumeroProfessor = new JLabel("NÚMERO:");
	JLabel lblBairroProfessor = new JLabel("BAIRRO:");
	JLabel lblCidadeProfessor = new JLabel("CIDADE:");
	JLabel lblEstadoProfessor = new JLabel("ESTADO:");
	
	JLabel lblTelefoneProfessor = new JLabel("TEL:");
	JLabel lblCelulatProfessor = new JLabel("CEL:");
	
	// TExtArea Caixas de Texto
	JTextField txtIdProfessor = new JTextField();
	JTextField txtNomeProfessor  = new JTextField();
	JTextField txtEnderecoProfessor = new JTextField();
	
	JTextField txtRuaProfessor = new JTextField();
	JTextField txtNumeroProfessor = new JTextField();
	JTextField txtBairroProfessor = new JTextField();
	JTextField txtCidadeProfessor = new JTextField();
	JTextField txtEstadoProfessor = new JTextField();
	
	JTextField txtTelefoneProfessor = new JTextField();
	JTextField txtCelulatProfessor = new JTextField();
	
	// Fotnes
	Font fonte = new Font("Arial", Font.BOLD, 25);
	Font fonte2 = new Font("Arial", Font.CENTER_BASELINE, 12);
	
	public InfoProfessor() {
		
		painel();
		Componentes();
		setVisible(true);	
	}
	
	public void painel() {
		setSize(900, 600);		
		setLayout(null);		
	}
	
	// Todos os componentes da tela
	public void Componentes() {
		
		// ID
		lblIdProfessor.setBounds(10, 20, 40, 30);
		lblIdProfessor.setFont(fonte);
		txtIdProfessor.setBounds(50, 20, 100, 30);
		txtIdProfessor.setFont(fonte2);
		
		// NOME
		lblNomeProfessor.setBounds(160, 20, 100, 30);
		lblNomeProfessor.setFont(fonte);
		txtNomeProfessor.setBounds(250, 20, 150, 30);
		txtNomeProfessor.setFont(fonte2);
		
		// ENDERECO
		lblEnderecoProfessor.setBounds(410, 20, 150, 30);
		lblEnderecoProfessor.setFont(fonte);
		txtEnderecoProfessor.setBounds(570, 20, 300, 30);
		txtEnderecoProfessor.setFont(fonte2);
		
		
		// OBJETOS TEXTO E CAIXA DE TEXTO
		add(lblIdProfessor);
		add(txtIdProfessor);
		add(lblNomeProfessor);
		add(txtNomeProfessor);
		add(lblEnderecoProfessor);
		add(txtEnderecoProfessor);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
	
}
