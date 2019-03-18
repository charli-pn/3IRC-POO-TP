package checkersGamePOO;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

import javax.swing.JColorChooser;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class CheckersGameGUIMenu extends JMenuBar {

	private Map<Object, Object> checkersGameGUIData;

	public CheckersGameGUIMenu(final Map<Object, Object> checkersGameGUIData) {
		super();
		this.checkersGameGUIData = checkersGameGUIData;
		JMenu menu = new JMenu("Paramètres d'affichage");
		menu.add(new JMenuItem("Couleur cases blanches"));
		menu.add(new JMenuItem("Couleur cases noires"));
		
		JMenu formePions = new JMenu("Forme des pions");
		formePions.add(new JMenuItem("Cercle"));
		formePions.add(new JMenuItem("Carré"));
		formePions.add(new JMenuItem("Arc"));
		menu.add(formePions);
		
		// Couleur case blanches
		menu.getItem(0).addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JColorChooser colorChooser = new JColorChooser();
				Color chosenColor = colorChooser.showDialog(null, "Couleur cases blanches", Color.white);
				checkersGameGUIData.put(PieceSquareColor.BLANC, chosenColor);
			}
		});
	
		// Couleur case noires
		menu.getItem(1).addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JColorChooser colorChooser = new JColorChooser();
				Color chosenColor = colorChooser.showDialog(null, "Couleur cases noires", Color.black);
				checkersGameGUIData.put(PieceSquareColor.NOIR, chosenColor);
			}
		});
		
		// Forme cercle
		formePions.getItem(0).addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				checkersGameGUIData.put("Forme", "Cercle");
			}
		});
		
		// Forme carré
		formePions.getItem(1).addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				checkersGameGUIData.put("Forme", "Carré");
			}
		});
		
		// Forme Arc
		formePions.getItem(2).addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				checkersGameGUIData.put("Forme", "Arc");
			}
		});
		
		this.add(menu);
	}
	
	
}
