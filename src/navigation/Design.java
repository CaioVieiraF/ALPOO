package navigation;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;

public class Design {
    Font FONT_BOLD = new Font("Ubuntu Mono", Font.BOLD, 16);
	Font FONT_REGULAR = new Font("Ubuntu Mono", Font.PLAIN, 16);
	Font fonte = new Font("Arial", Font.BOLD, 25);
	Font fonte2 = new Font("Arial", Font.CENTER_BASELINE, 12);
	
	Color FUNDO = new Color(82, 117, 184);
	Color BUTTON_COLOR = new Color(99, 206, 173);
	Color corF = new Color(200, 200, 200);
	Color corFF = new Color(255, 255, 255);
	Color corF3 = new Color(95, 201, 70);

	public JPanel panelDecorator(int posX, int posY, int width, int height, Color cor, int padding){
		JPanel container = new JPanel();
		container.setBounds(posX-padding, posY-padding, width+padding*2, height+padding*2);
		container.setBackground(cor);
		return container;
	}

	public JPanel panelDecorator(int posX, int posY, int width, int height, int padding){
		JPanel container = new JPanel();
		container.setBounds(posX-padding, posY-padding, width+padding*2, height+padding*2);
		container.setBackground(new Color(220, 220, 220));
		return container;
	}
}
