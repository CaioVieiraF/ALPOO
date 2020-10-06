package navigation;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JPanel {
	Design util = new Design();
	JButton bLogar = new JButton("Entrar");
	JButton bVoltar = new JButton("Sair");
	JButton beSenha = new JButton("Esqueceu a senha?");
	JLabel lEmail = new JLabel("Email:");
	JTextField email = new JTextField("exmplo@gmail.com");
	JLabel lSenha = new JLabel("Senha:");
	JPasswordField senha = new JPasswordField("password");
	Font fonte2 = new Font("Ubuntu Mono", Font.BOLD | Font.ITALIC, 16);
	
	public Login(){
		setLayout(null);
		setBackground(util.FUNDO);
		
		bVoltar.setBounds(300,350,80,40);
		beSenha.setBounds(290,290,170,40);
		bLogar.setBounds(520,350,80,40);
		lEmail.setBounds(300,90,80,40);
		email.setBounds(300,140,300,40);
		lSenha.setBounds(300,190,80,40);
		senha.setBounds(300,240,300,40);
		JComponent[] jcomponent = {lEmail, email, lSenha, senha, bVoltar, bLogar,beSenha};
		setComponents(jcomponent);
		bVoltar.setBackground(util.BUTTON_COLOR);
		beSenha.setFont(fonte2);
		beSenha.setBackground(util.FUNDO);
		bLogar.setBackground(util.BUTTON_COLOR);
	}
	
	public void setComponents(JComponent[] itens) {
		for(int i = 0; i < itens.length; i++) {
			itens[i].setBorder(BorderFactory.createEmptyBorder());
			itens[i].setFont(util.FONT_BOLD);
			add(itens[i]);	
		}
	}
}
