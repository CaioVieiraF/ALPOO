package navigation;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JPanel implements ActionListener{
	Design util = new Design();
	JButton bLogar = new JButton("Entrar");
	JButton bVoltar = new JButton("Sair");
	JButton beSenha = new JButton("Esqueceu a senha?");
	JLabel lEmail = new JLabel("Email:");
	JTextField email = new JTextField();
	JLabel lSenha = new JLabel("Senha:");
	JPasswordField senha = new JPasswordField("Senha");
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
		
		bVoltar.setFont(util.FONT_BOLD);
		bVoltar.setBorder(BorderFactory.createEmptyBorder());
		bVoltar.setBackground(util.BUTTON_COLOR);
		beSenha.setFont(fonte2);
		beSenha.setBorder(BorderFactory.createEmptyBorder());
		beSenha.setBackground(util.FUNDO);
		bLogar.setFont(util.FONT_BOLD);
		bLogar.setBorder(BorderFactory.createEmptyBorder());
		bLogar.setBackground(util.BUTTON_COLOR);
		lEmail.setFont(util.FONT_BOLD);
		email.setFont(util.FONT_BOLD);
		email.setBorder(BorderFactory.createEmptyBorder());
		lSenha.setFont(util.FONT_BOLD);
		senha.setFont(util.FONT_BOLD);
		senha.setBorder(BorderFactory.createEmptyBorder());
		
		add(lEmail);
		add(email);
		add(lSenha);
		add(senha);
		add(beSenha);
		add(bVoltar);
		add(bLogar);
		
		setVisible(true);
		
		beSenha.addActionListener(this);
		bVoltar.addActionListener(this);
		bLogar.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
			
		if(obj.equals(bLogar)){
				
		}else if(obj.equals(bVoltar)) {
				
		}else if(obj.equals(beSenha)) {
				
		}
	}
}
