package navigation;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class InfoProfessor extends JFrame {
	
	JPanel painelIp= new JPanel();
	
	Color cl = new Color(255,0,0);
	
	public InfoProfessor() {
		
		setSize(900, 600);
		getContentPane().setBackground(cl);
		
		setVisible(true);
	}
	
	public void painel() {
		
		//painelIp.setLayout(new );
		
		
	}
	
	public static void main(String[] args) {
		
		new InfoProfessor();
		
	}
	
}
