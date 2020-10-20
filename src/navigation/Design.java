package navigation;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;

public class Design {
	Font FONT_BOLD = new Font("Ubuntu Mono", Font.BOLD, 16);
	Color FUNDO = new Color(82, 117, 184);
	Color BUTTON_COLOR = new Color(99, 206, 173);

	public JPanel panelDecorator(int posX, int posY, int width, int height, Color cor, int padding){
		JPanel container = new JPanel();
		container.setBounds(posX-padding, posY-padding, width+padding*2, height+padding*2);
		container.setBackground(cor);
		return container;
	}
}
