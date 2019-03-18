package checkersGamePOO;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

public class CheckersGameGUIDataFactory {

	private CheckersGameGUIDataFactory() {
	}
	
	public static Map<Object, Object> createCheckersGameGUIData(){
		
		Map<Object, Object> map = new CheckersGameGUIData(new HashMap<Object, Object>());
		map.put(PieceSquareColor.NOIR, Color.BLUE);		
		map.put(PieceSquareColor.BLANC, Color.LIGHT_GRAY);
		map.put("Taille", 10);
		map.put("Forme", "Cercle");
	
		return map;
		
	}

}
