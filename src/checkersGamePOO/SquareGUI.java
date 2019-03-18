package checkersGamePOO;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Map;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class SquareGUI extends JPanel {
	
	private Map<Object, Object> checkersGameGUIData;
	private PieceSquareColor color;
	private int id;
	
	private static int nextId = 1;

	public SquareGUI(Map<Object, Object> checkersGameGUIData, PieceSquareColor color) {
		super();
		this.checkersGameGUIData = checkersGameGUIData;
		this.color = color;
		this.id=nextId;
		SquareGUI.nextId++;
		System.out.println(id);
	}
	
	@Override
	protected void paintComponent(Graphics arg0) {
		this.setBackground((Color)checkersGameGUIData.get(this.color));
		this.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		super.paintComponent(arg0);
		
	}
}
