package project.chess.classes;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Chess {
	private JFrame frame;
	private JPanel mainPanel;
	private JPanel firstPanel;
	private JButton[][] chessPiece;
	private char[] chessPieceChar;
	
	public Chess() {
		FirstSetting();
	
		
		
		LastSetting();
	}
	
	private void FirstSetting() {
		this.frame = new JFrame("Chess");
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		this.mainPanel = new JPanel();
		this.mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
	
		this.firstPanel = new JPanel();
		this.firstPanel.setLayout(new GridLayout(8, 8));
		this.firstPanel.setMaximumSize(new Dimension(400, 400));
		
		ChessPieceSet();
	
		mainPanel.add(firstPanel);
		frame.setContentPane(mainPanel);
	}
	
	private void LastSetting() {
		frame.setSize(1000,1000);
		frame.setMinimumSize(new Dimension(100,100));
		frame.setVisible(true);
	}
	
	private void ChessPieceSet() {
		chessPieceChar = new char[12];
		chessPieceChar = "♔♕♖♗♘♙♚♛♜♝♞♟".toCharArray();
		
		chessPiece = new JButton[8][8];
		for(int i = 0 ; i < 8 ; i++) {
			for(int j = 0 ; j < 8 ; j++) {
				chessPiece[i][j] = new JButton();
				chessPiece[i][j].setPreferredSize(new Dimension(100, 100));
				firstPanel.add(chessPiece[i][j]);
			}
		}
		
		for(int i = 0 ; i < 8 ; i++)
			chessPiece[0][i].setText("" + chessPieceChar[i]);
		for(int i = 0 ; i < 8 ; i++)
			chessPiece[1][i].setText("" + chessPieceChar[i]);
		
	}
	
}