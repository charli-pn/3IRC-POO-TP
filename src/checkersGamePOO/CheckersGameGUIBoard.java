package checkersGamePOO;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Map;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import checkersGamePOO.CheckersGameGUIBoardListeners.PieceListener;
import checkersGamePOO.CheckersGameGUIBoardListeners.SquareListener;

public class CheckersGameGUIBoard extends JPanel {
	
	private PieceListener pieceListener;
	private SquareListener caseListener;
	protected PieceGUI selectedPieceGUI;
	private int length;;
	
	private Map<Object, Object> checkersGameGUIData;
	
	public CheckersGameGUIBoard(Map<Object, Object> CheckersGameGUIData, CheckersGameGUIBoardListeners listeners) {
		super();
		
		this.checkersGameGUIData = CheckersGameGUIData;
		
		this.length = (int) this.checkersGameGUIData.get("Taille");
		
		this.pieceListener = listeners.new PieceListener(this);
		this.caseListener = listeners.new SquareListener(this);
		
		this.selectedPieceGUI = null;
		
		this.setBackGroundCheckersBoard();
		this.setPiecesCheckersBoard();
		
	}
	
	private void setBackGroundCheckersBoard() {
		
		int length = this.length;
		
		this.setLayout(new GridLayout(length, length));
		
		Boolean isBlack = false;
		
		for(int row=0; row<length;row++){
			
			for(int col=0; col<length; col++){
				PieceSquareColor color = isBlack ? PieceSquareColor.NOIR : PieceSquareColor.BLANC;
				
				JPanel cell = new SquareGUI(checkersGameGUIData, color);
				cell.setLayout(new BorderLayout());
				cell.setBorder(new EmptyBorder(5,5,5,5));
				cell.addMouseListener(this.caseListener);
				this.add(cell);
				
				isBlack = !isBlack;
			}
			isBlack = !isBlack;
		}
		
	}
	
	private void setPiecesCheckersBoard(){
		
		this.fillRowsWithPions(PieceSquareColor.NOIR, 1, 4);
		this.fillRowsWithPions(PieceSquareColor.BLANC, 7, 10);
		
	}
	
	private void fillRowsWithPions(PieceSquareColor color, int startingRow, int endingRow){
		
		boolean isBlackCase = false;
		
		for(int row=(startingRow-1); row<endingRow; row++){
			for(int col=0; col<10; col++){
				
				JPanel cell = (JPanel) this.getComponent(col + 10*row);
				if(isBlackCase){
					
					JPanel pion = new PieceGUI(checkersGameGUIData, color);
					pion.addMouseListener(this.pieceListener);
					cell.add(pion);
					
				}
				isBlackCase = !isBlackCase;
			}
			isBlackCase = !isBlackCase;
		}
	}
	
	public void movePiece(SquareGUI cell){
		if(selectedPieceGUI==null)return;
		selectedPieceGUI.getParent().repaint();
		cell.add(this.selectedPieceGUI);  
		cell.repaint();
	}
	
	
}
