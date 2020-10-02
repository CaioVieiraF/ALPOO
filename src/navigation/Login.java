package navigation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JPanel implements ActionListener{
	JButton bLogar = new JButton("Entrar");
	JButton bVoltar = new JButton("Voltar");
	JButton beSenha = new JButton("Esqueceu a senha?");
	JLabel lEmail = new JLabel("Digite o email");
	JTextField email = new JTextField();
	JLabel lSenha = new JLabel("Digite a senha");
	JPasswordField senha = new JPasswordField("Senha");
		
	void Login(){
		setLayout(null);
		
		//setBounds(300,300,600,900);
		bLogar.setBounds(10,10,10,10);
		bVoltar.setBounds(10,10,10,10);
		beSenha.setBounds(10,10,10,10);
		lEmail.setBounds(10,50,100,20);
		email.setBounds(10,70,100,30);
		lSenha.setBounds(10,100,100,20);
		senha.setBounds(10,120,100,30);
		
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
