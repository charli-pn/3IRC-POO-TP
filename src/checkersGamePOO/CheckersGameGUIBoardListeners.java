package checkersGamePOO;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class CheckersGameGUIBoardListeners {

	protected class PieceListener implements MouseListener{

		private CheckersGameGUIBoard checkersGameGUIBoard;
		
		public PieceListener(CheckersGameGUIBoard checkersGameGUIBoard) {
			super();
			this.checkersGameGUIBoard = checkersGameGUIBoard;
		}

		@Override
		public void mouseClicked(MouseEvent arg0) {
			this.checkersGameGUIBoard.selectedPieceGUI=(PieceGUI)arg0.getSource();
			
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}

	protected class SquareListener implements MouseListener{
		
		private CheckersGameGUIBoard checkersGameGUIBoard;

		public SquareListener(CheckersGameGUIBoard checkersGameGUIBoard) {
			super();
			this.checkersGameGUIBoard = checkersGameGUIBoard;
		}

		@Override
		public void mouseClicked(MouseEvent arg0) {
			checkersGameGUIBoard.movePiece((SquareGUI)arg0.getSource());
			
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}

}
