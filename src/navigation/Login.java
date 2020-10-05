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
	Color fundo = new Color(210, 230, 255);
	Color corBot = new Color(180, 210, 190);
	JButton bLogar = new JButton("Entrar");
	JButton bVoltar = new JButton("Voltar");
	JButton beSenha = new JButton("Esqueceu a senha?");
	JLabel lEmail = new JLabel("Digite o email: ");
	JTextField email = new JTextField();
	JLabel lSenha = new JLabel("Digite a senha: ");
	JPasswordField senha = new JPasswordField("Senha");
	Font fonte = new Font("Ubuntu Mono", Font.BOLD, 14);
	
	public Login(){
		setLayout(null);
		setBackground(fundo);
		
		bVoltar.setBounds(200,300,80,40);
		beSenha.setBounds(350,300,190,40);
		bLogar.setBounds(580,300,80,40);
		lEmail.setBounds(200,100,150,40);
		email.setBounds(350,100,300,40);
		lSenha.setBounds(200,200,150,40);
		senha.setBounds(350,200,300,40);
		
		bVoltar.setFont(fonte);
		bVoltar.setBorder(BorderFactory.createEmptyBorder());
		bVoltar.setBackground(corBot);
		beSenha.setFont(fonte);
		beSenha.setBorder(BorderFactory.createEmptyBorder());
		beSenha.setBackground(corBot);
		bLogar.setFont(fonte);
		bLogar.setBorder(BorderFactory.createEmptyBorder());
		bLogar.setBackground(corBot);
		lEmail.setFont(fonte);
		email.setFont(fonte);
		email.setBorder(BorderFactory.createEmptyBorder());
		lSenha.setFont(fonte);
		senha.setFont(fonte);
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
