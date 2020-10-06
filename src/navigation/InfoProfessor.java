package navigation;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class InfoProfessor extends JPanel implements ActionListener{
	
	// Labels Textos
	
	// TExtArea Caixas de Texto
	JTextField txtIdProfessor = new JTextField();
	JTextField txtNomeProfessor  = new JTextField();
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
	
	Color corF = new Color(230, 230, 230);
	
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
		
		setBackground(new Color(200, 200, 200));
		
		// ID
		txtIdProfessor.setBounds(10, 20, 70, 40);
		txtIdProfessor.setFont(fonte2);
		txtIdProfessor.setBorder(BorderFactory.createEmptyBorder());
		txtIdProfessor.setBorder(BorderFactory.createTitledBorder("ID"));
		txtIdProfessor.setBackground(corF);
		
		// NOME
		txtNomeProfessor.setBounds(80, 20, 210, 40);
		txtNomeProfessor.setFont(fonte2);
		txtNomeProfessor.setBorder(BorderFactory.createEmptyBorder());
		txtNomeProfessor.setBorder(BorderFactory.createTitledBorder("NOME"));
		txtNomeProfessor.setBackground(corF);
		
		// RUA/AV
		txtRuaProfessor.setBounds(290, 20, 280, 40);
		txtRuaProfessor.setFont(fonte2);
		txtRuaProfessor.setBorder(BorderFactory.createEmptyBorder());
		txtRuaProfessor.setBorder(BorderFactory.createTitledBorder("RUA / AV"));
		txtRuaProfessor.setBackground(corF);
		
		// BAIRRO
		txtBairroProfessor.setBounds(570, 20, 300, 40);
		txtBairroProfessor.setFont(fonte2);
		txtBairroProfessor.setBorder(BorderFactory.createEmptyBorder());
		txtBairroProfessor.setBorder(BorderFactory.createTitledBorder("BAIRRO"));
		txtBairroProfessor.setBackground(corF);
		
		//CIDADE		
		txtCidadeProfessor.setBounds(10, 60, 200, 40);
		txtCidadeProfessor.setFont(fonte2);
		txtCidadeProfessor.setBorder(BorderFactory.createEmptyBorder());
		txtCidadeProfessor.setBorder(BorderFactory.createTitledBorder("cidade"));
		txtCidadeProfessor.setBackground(corF);		
		
		//ESTADO		
		txtEstadoProfessor.setBounds(210, 60, 200, 40);
		txtEstadoProfessor.setFont(fonte2);
		txtEstadoProfessor.setBorder(BorderFactory.createEmptyBorder());
		txtEstadoProfessor.setBorder(BorderFactory.createTitledBorder("cidade"));
		txtEstadoProfessor.setBackground(corF);		
		
		// NÚMERO
		txtNumeroProfessor.setBounds(410, 60, 200, 40);
		txtNumeroProfessor.setFont(fonte2);
		txtNumeroProfessor.setBorder(BorderFactory.createEmptyBorder());
		txtNumeroProfessor.setBorder(BorderFactory.createTitledBorder("TELELEFONE"));
		txtNumeroProfessor.setBackground(corF);
		
		// CELULAR
		txtCelulatProfessor.setBounds(610, 60, 200, 40);
		txtCelulatProfessor.setFont(fonte2);
		txtCelulatProfessor.setBorder(BorderFactory.createEmptyBorder());
		txtCelulatProfessor.setBorder(BorderFactory.createTitledBorder("CELULAR"));
		txtCelulatProfessor.setBackground(corF);
		
		
		
		
		// OBJETOS TEXTO E CAIXA DE TEXTO
		add(txtIdProfessor);	
		add(txtNomeProfessor);
		add(txtBairroProfessor);		
		add(txtRuaProfessor);
		add(txtCidadeProfessor);
		add(txtEstadoProfessor);
		add(txtNumeroProfessor);
		add(txtCelulatProfessor);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
	
}
