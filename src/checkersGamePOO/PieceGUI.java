package checkersGamePOO;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Map;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class PieceGUI extends JPanel {
	
	private Map<Object, Object> checkersGameGUIData;
	private PieceSquareColor color;
	

	public PieceGUI (Map<Object, Object> checkersGameGUIData, PieceSquareColor color) {
		super();
		this.checkersGameGUIData = checkersGameGUIData;
		this.color = color;
	}
	
	@Override
	protected void paintComponent(Graphics arg0) {
		super.paintComponent(arg0);
		this.setBackground((Color)checkersGameGUIData.get(Color.TRANSLUCENT));
		//this.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		
		String forme = (String) checkersGameGUIData.get("Forme");
		
	
		arg0.setColor((this.color == PieceSquareColor.NOIR) ? Color.black : Color.white);
		switch (forme) {
		case "Cercle":
			arg0.fillOval(0, 0, 50, 50);
			break;
		case "Carré":
			arg0.fillRect(5, 5, 45,	45);
			break;
		case "Arc":
			arg0.fillArc(0, 0, 50,50, 0, 50);
			break;
		default:
			System.out.println("test");
			break;
		}
		
		
		
		
	}
	
}
