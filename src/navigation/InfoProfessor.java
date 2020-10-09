package navigation;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class InfoProfessor extends JPanel implements ActionListener{
	
	// sobre
	JTextField txtIdProfessor = new JTextField();
	JTextField txtNomeProfessor  = new JTextField();
	JTextField txtDataNascimentoProfessor  = new JTextField();
	
	
	//endereço
	JTextField txtNumeroProfessor = new JTextField();
	JTextField txtRuaProfessor = new JTextField();
	JTextField txtBairroProfessor = new JTextField();
	JTextField txtCidadeProfessor = new JTextField();
	JTextField txtEstadoProfessor = new JTextField();
	
	// telefone
	JTextField txtTelefoneProfessor = new JTextField();
	JTextField txtCelulatProfessor = new JTextField();
	
	// DATA
	JTextField txtDataProfessor = new JTextField();
	
	// Fotnes
	Font fonte = new Font("Arial", Font.BOLD, 25);
	Font fonte2 = new Font("Arial", Font.CENTER_BASELINE, 12);
	
	// Cores
	Color corF = new Color(200, 200, 200);
	Color corFF = new Color(255, 255, 255);
	Color corF3 = new Color(250, 100, 100);
	Design cor = new Design();
	
	// Paineis
	JPanel pEndereco = new JPanel();
	JPanel pContatos = new JPanel();
	JPanel pIdentificacao = new JPanel();
	JPanel pEspecialidades = new JPanel();
	JPanel pTitulos = new JPanel();
	JPanel pPrincipal = new JPanel();
	
	// CheckBox Especializacoes
	JCheckBox cboxInformatica = new JCheckBox("Informática");
	JCheckBox cboxMatematica = new JCheckBox("Matemática");
	JCheckBox cboxMedicina = new JCheckBox("Medicina");
	JCheckBox cboxCiencias = new JCheckBox("Ciências");
	JCheckBox cboxLetras = new JCheckBox("Letras");
	
	// CheckBox Titulos
	JCheckBox cboxBacharel = new JCheckBox("Bacharel");
	JCheckBox cboxEspecialistaLatoSensu = new JCheckBox("Especialista Lato Sensu");
	JCheckBox cboxMestrado = new JCheckBox("Mestrado");
	JCheckBox cboxDoutorado = new JCheckBox("Doutorado");
	
	// Lista com Os CheckBox
	JComponent[] componentesCbox = {cboxInformatica, cboxMatematica, cboxMedicina, cboxCiencias, cboxLetras}; 
	JComponent[] componentesCboxTitulos = {cboxBacharel, cboxEspecialistaLatoSensu, cboxMestrado, cboxDoutorado}; 
	
	// Botao Atualizar cadastro
	JButton btnAtualizar = new JButton("Atualizar");
	
	public InfoProfessor() {
		painel();
		Componentes();
		painelCentral();
	}
	
	public void painel() {
		setSize(900, 600);		
		setLayout(null);		
	}
	
	public void painelCentral() {
		
		// CONFG DO PAINEL PRINCIPAL
		pPrincipal.setLayout(null);
		
		pPrincipal.setBounds(90, 10, 700, 520);
		pPrincipal.setBorder(BorderFactory.createTitledBorder("Informaçõs Do Professor"));
		pPrincipal.setBackground(corF);
		
		// Botão atualizar
		btnAtualizar.setBounds(220, 485, 280, 30);
		btnAtualizar.setFont(fonte);
		btnAtualizar.setBorder(BorderFactory.createEmptyBorder());
		btnAtualizar.setBackground(corF3);
		pPrincipal.add(btnAtualizar);
		
		// ADD PAINEIS
		pPrincipal.add(pIdentificacao);
		pPrincipal.add(pContatos);
		pPrincipal.add(pEndereco);
		pPrincipal.add(pEspecialidades);
		pPrincipal.add(pTitulos);
		add(pPrincipal);
		
	}
	
	// Todos os componentes da tela
	public void Componentes() {
		
		setBackground(cor.FUNDO);
		
		Identificacao(); 
		contato();
		Endereco();
		Especialidades(componentesCbox);
		Titulos(componentesCboxTitulos);
		
		
	}
	
	public void Endereco() {
		
		// RUA/AV
		txtRuaProfessor.setBounds(30, 25, 280, 40);
		txtRuaProfessor.setFont(fonte2);
		txtRuaProfessor.setBorder(BorderFactory.createEmptyBorder());
		txtRuaProfessor.setBorder(BorderFactory.createTitledBorder("Rua / Av"));
		txtRuaProfessor.setBackground(corFF);
		
		// BAIRRO
		txtBairroProfessor.setBounds(320, 25, 300, 40);
		txtBairroProfessor.setFont(fonte2);
		txtBairroProfessor.setBorder(BorderFactory.createEmptyBorder());
		txtBairroProfessor.setBorder(BorderFactory.createTitledBorder("Bairro"));
		txtBairroProfessor.setBackground(corFF);
		
		//CIDADE		
		txtCidadeProfessor.setBounds(30, 65, 200, 40);
		txtCidadeProfessor.setFont(fonte2);
		txtCidadeProfessor.setBorder(BorderFactory.createEmptyBorder());
		txtCidadeProfessor.setBorder(BorderFactory.createTitledBorder("Cidade"));
		txtCidadeProfessor.setBackground(corFF);		
		
		//ESTADO		
		txtEstadoProfessor.setBounds(240, 65, 200, 40);
		txtEstadoProfessor.setFont(fonte2);
		txtEstadoProfessor.setBorder(BorderFactory.createEmptyBorder());
		txtEstadoProfessor.setBorder(BorderFactory.createTitledBorder("Estado"));
		txtEstadoProfessor.setBackground(corFF);		
		
		// NÚMERO
		txtNumeroProfessor.setBounds(450, 65, 100, 40);
		txtNumeroProfessor.setFont(fonte2);
		txtNumeroProfessor.setBorder(BorderFactory.createEmptyBorder());
		txtNumeroProfessor.setBorder(BorderFactory.createTitledBorder("N°"));
		txtNumeroProfessor.setBackground(corFF);
		
		
		pEndereco.add(txtBairroProfessor);		
		pEndereco.add(txtRuaProfessor);
		pEndereco.add(txtCidadeProfessor);
		pEndereco.add(txtEstadoProfessor);
		pEndereco.add(txtNumeroProfessor);
		
		// Painel Endereco
		pEndereco.setBorder(BorderFactory.createTitledBorder("Endereço"));
		pEndereco.setBackground(corFF);
		pEndereco.setLayout(null);
		pEndereco.setBounds(30, 200, 630, 120);
		add(pEndereco);
	}
	
	public void contato() {
		
		
		// TELEFONE FIX
		txtTelefoneProfessor.setBounds(30, 25, 200, 40);
		txtTelefoneProfessor.setFont(fonte2);
		txtTelefoneProfessor.setBorder(BorderFactory.createEmptyBorder());
		txtTelefoneProfessor.setBorder(BorderFactory.createTitledBorder("Telefone"));
		txtTelefoneProfessor.setBackground(corFF);
		
		// CELULAR
		txtCelulatProfessor.setBounds(280, 25, 200, 40);
		txtCelulatProfessor.setFont(fonte2);
		txtCelulatProfessor.setBorder(BorderFactory.createEmptyBorder());
		txtCelulatProfessor.setBorder(BorderFactory.createTitledBorder("Celular"));
		txtCelulatProfessor.setBackground(corFF);
		
		
		pContatos.add(txtTelefoneProfessor);
		pContatos.add(txtCelulatProfessor);
		
		// Painel Contatos
		pContatos.setLayout(null);
		pContatos.setBorder(BorderFactory.createTitledBorder("Contatos"));
		pContatos.setBackground(corFF);
		pContatos.setBounds(30, 120, 630, 80);
		add(pContatos);
	}
	
	public void Identificacao() {
		
		// ID
		txtIdProfessor.setBounds(30, 30, 50, 40);
		txtIdProfessor.setFont(fonte2);
		txtIdProfessor.setBorder(BorderFactory.createEmptyBorder());
		txtIdProfessor.setBorder(BorderFactory.createTitledBorder("ID"));
		txtIdProfessor.setBackground(corFF);
		
		// NOME
		txtNomeProfessor.setBounds(100, 30, 300, 40);
		txtNomeProfessor.setFont(fonte2);
		txtNomeProfessor.setBorder(BorderFactory.createEmptyBorder());
		txtNomeProfessor.setBorder(BorderFactory.createTitledBorder("Nome"));
		txtNomeProfessor.setBackground(corFF);
		
		// DATA DE NASCIMENTO
		txtDataNascimentoProfessor.setBounds(410, 30, 100, 40);
		txtDataNascimentoProfessor.setFont(fonte2);
		txtDataNascimentoProfessor.setBorder(BorderFactory.createEmptyBorder());
		txtDataNascimentoProfessor.setBorder(BorderFactory.createTitledBorder("Data de Nasc"));
		txtDataNascimentoProfessor.setBackground(corFF);
		
		pIdentificacao.add(txtIdProfessor);	
		pIdentificacao.add(txtNomeProfessor);
		pIdentificacao.add(txtDataNascimentoProfessor);
		
		// Painel Identificacao
		
		pIdentificacao.setLayout(null);
		pIdentificacao.setBorder(BorderFactory.createTitledBorder("Identificação"));
		pIdentificacao.setBackground(corFF);
		pIdentificacao.setBounds(30, 40, 630, 80);
		add(pIdentificacao);
		
	}
	
	public void Especialidades(JComponent[] comp) {
		int cont = 50;
		for(int i = 0; i < comp.length; i++) {
			comp[i].setBounds(cont, 30, 100, 40);
			comp[i].setBackground(corFF);			
			cont += 100;
		}
		
		pEspecialidades.add(comp[0]);
		pEspecialidades.add(comp[1]);
		pEspecialidades.add(comp[2]);
		pEspecialidades.add(comp[3]);
		pEspecialidades.add(comp[4]);
		
		// Painel Especialidades
		pEspecialidades.setLayout(null);
		pEspecialidades.setBorder(BorderFactory.createTitledBorder("Especializações"));
		pEspecialidades.setBackground(corFF);
		pEspecialidades.setBounds(30, 320, 630, 80);
		add(pEspecialidades);
	}
	
	public void Titulos(JComponent[] comp) {
		
		comp[0].setBackground(corFF);			
		comp[0].setBounds(50, 30, 80, 40);	
		
		comp[1].setBounds(140, 30, 180, 40);
		comp[1].setBackground(corFF);	
		
		
		comp[2].setBounds(320, 30, 80, 40);
		comp[2].setBackground(corFF);	
		
		comp[3].setBounds(430, 30, 100, 40);
		comp[3].setBackground(corFF);	
		
		pTitulos.add(comp[0]);
		pTitulos.add(comp[1]);
		pTitulos.add(comp[2]);
		pTitulos.add(comp[3]);
		
		// Painel Especialidades
		pTitulos.setLayout(null);
		pTitulos.setBorder(BorderFactory.createTitledBorder("Títulos"));
		pTitulos.setBackground(corFF);
		pTitulos.setBounds(30, 400, 630, 80);
		add(pTitulos);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		
	}
	
}
