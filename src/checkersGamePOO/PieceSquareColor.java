package checkersGamePOO;

import java.awt.Color;

public enum PieceSquareColor {
	BLANC, NOIR;
	
	public Color getColor(){
		Color color;
		
		switch (this) {
		case NOIR:
			color = Color.black;
			break;
		case BLANC:
		default:
			color = Color.white;
			break;
		}
		return color;
	}
}
