package checkersGamePOO;

import java.awt.HeadlessException;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class CheckersGameGUI extends JFrame implements Observer{

	private JPanel checkersBoard;
	private JMenuBar menuBar;
	
	private CheckersGameGUIData checkersGameGUIData;

	public CheckersGameGUI() throws HeadlessException {
		super();
		
		this.checkersGameGUIData = (CheckersGameGUIData) CheckersGameGUIDataFactory.createCheckersGameGUIData();
		
		this.checkersGameGUIData.addObserver(this);

		this.checkersBoard = new CheckersGameGUIBoard(this.checkersGameGUIData, new CheckersGameGUIBoardListeners());
		
		this.setContentPane(this.checkersBoard);
		
		this.menuBar = new CheckersGameGUIMenu(this.checkersGameGUIData);
		this.setJMenuBar(menuBar);
		
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		this.checkersBoard.repaint();
	}

}
