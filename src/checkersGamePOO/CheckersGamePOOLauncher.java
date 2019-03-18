package checkersGamePOO;

import javax.swing.JFrame;

public class CheckersGamePOOLauncher {

	public static void main(String[] args){
		JFrame frame = new CheckersGameGUI();
		
		frame.setTitle("Ceci est la fenetre de mon jeu de dames - version POO");
		frame.setSize(600,600);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
