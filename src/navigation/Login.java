package navigation;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JPanel {
	int x = 300, y = 140;
	int h = 50;
	int padding = 8;
	Design util = new Design();
	JButton bLogar = new JButton("Entrar");
	JButton bVoltar = new JButton("Sair");
	JButton beSenha = new JButton("Esqueceu a senha?");
	JTextField email = new JTextField("exmplo@gmail.com");
	JPasswordField senha = new JPasswordField("password");
	Font fonte2 = new Font("Ubuntu Mono", Font.BOLD | Font.ITALIC, 15);
	JPanel buttons = new JPanel();
	JPanel container;
	
	public Login(){
		setLayout(null);
		setBackground(util.FUNDO);
		
		buttons.setLayout(new GridLayout(1,2));
		buttons.add(bVoltar);
		buttons.add(bLogar);
		
		JComponent[] jcomponent = {email, senha, beSenha, buttons};
		container = util.panelDecorator(x - padding, y - padding * 2, x + padding * 2, h*jcomponent.length + padding * 2 ,new Color(200, 200, 200));
		setComponents(jcomponent);		
		bVoltar.setBackground(util.BUTTON_COLOR);
		bVoltar.setBorder(BorderFactory.createEmptyBorder());
		bVoltar.setFont(util.FONT_BOLD);
		beSenha.setFont(fonte2);
		beSenha.setBackground(new Color(200, 200, 200));
		bLogar.setBackground(util.BUTTON_COLOR);
		bLogar.setFont(util.FONT_BOLD);
		bLogar.setBorder(BorderFactory.createEmptyBorder());
		email.setBorder(BorderFactory.createTitledBorder("Email"));
		senha.setBorder(BorderFactory.createTitledBorder("Senha"));
		add(container);
	}
	
	public void setComponents(JComponent[] itens) {
		
		for(int i = 0; i < itens.length; i++) {
			itens[i].setBounds(x, y + (i * h), x, h - padding);
			itens[i].setBorder(BorderFactory.createEmptyBorder());
			itens[i].setFont(util.FONT_BOLD);
			add(itens[i]);
		}
	}
}
