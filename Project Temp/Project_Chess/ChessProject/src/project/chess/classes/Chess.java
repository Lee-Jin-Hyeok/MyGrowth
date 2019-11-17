package project.chess.classes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class OnlyListener implements ActionListener {
	private int x;
	private int y;
	public static String xy;
	
	public OnlyListener(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		xy = x + "_" + y;
		System.out.println(xy);
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
}

class Move implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		if(Chess.chess[Chess.cx][Chess.cy] instanceof Bishop) {
			System.out.println(Chess.cx + "" + Chess.cy);
		} else if(Chess.chess[Chess.cx][Chess.cy] instanceof King) {
			System.out.println(Chess.cx + "" + Chess.cy);
		} else if(Chess.chess[Chess.cx][Chess.cy] instanceof Knight) {
			System.out.println(Chess.cx + "" + Chess.cy);
		} else if(Chess.chess[Chess.cx][Chess.cy] instanceof Pawn) {
			if(((Pawn) Chess.chess[Chess.cx][Chess.cy]).getTeam() == 0) {
				Chess.chessPiece[Chess.cx+1][Chess.cy].setBackground(Color.YELLOW);
				Chess.chessPiece[Chess.cx+2][Chess.cy].setBackground(Color.YELLOW);
			} else {
				Chess.chessPiece[Chess.cx-1][Chess.cy].setBackground(Color.YELLOW);
				Chess.chessPiece[Chess.cx-2][Chess.cy].setBackground(Color.YELLOW);
			}
		} else if(Chess.chess[Chess.cx][Chess.cy] instanceof Queen) {
			System.out.println(Chess.cx + "" + Chess.cy);
		} else if(Chess.chess[Chess.cx][Chess.cy] instanceof Rook) {
			System.out.println(Chess.cx + "" + Chess.cy);
		}
	}
}

public class Chess extends Frame {
	private JFrame frame;
	private JPanel mainPanel;
	private JPanel firstPanel;
	
	public static JButton[][] chessPiece;
	public static char[][] chessPieceChar;
	//private ChessPiece[][] chess;
	public static ActionListener[][] chess;
	
	private ActionListener[][] listener;
	
	public static int cx;
	public static int cy;

	public Chess() {
		FirstSetting();
		
		for(int i = 0 ; i < 8 ; i++) {
			for(int j = 0 ; j < 8 ; j++) {
				chessPiece[i][j].addActionListener(new Move());
			}
		}
		
		listener = new OnlyListener[8][8];
		for(int i = 0 ; i < 8 ; i++) {
			for(int j = 0 ; j < 8 ; j++) {
				listener[i][j] = new OnlyListener(i, j);
				//chessPiece[i][j].addActionListener(listener[i][j]);
				if(chess[i][j] instanceof Bishop) {
					chessPiece[i][j].addActionListener(chess[i][j]);
				} else if(chess[i][j] instanceof King) {
					chessPiece[i][j].addActionListener(chess[i][j]);
				} else if(chess[i][j] instanceof Knight) {
					chessPiece[i][j].addActionListener(chess[i][j]);
				} else if(chess[i][j] instanceof Pawn) {
					chessPiece[i][j].addActionListener(chess[i][j]);
				} else if(chess[i][j] instanceof Queen) {
					chessPiece[i][j].addActionListener(chess[i][j]);
				} else if(chess[i][j] instanceof Rook) {
					chessPiece[i][j].addActionListener(chess[i][j]);
				}
			}
		}
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
		chessPieceChar = new char[8][8];
		chessPieceChar[0] = "♜♞♝♛♚♝♞♜".toCharArray();
		chessPieceChar[1] = "♟♟♟♟♟♟♟♟".toCharArray();
		chessPieceChar[2] = "        ".toCharArray();
		chessPieceChar[3] = "        ".toCharArray();
		chessPieceChar[4] = "        ".toCharArray();
		chessPieceChar[5] = "        ".toCharArray();
		chessPieceChar[6] = "♙♙♙♙♙♙♙♙".toCharArray();
		chessPieceChar[7] = "♖♘♗♕♔♗♘♖".toCharArray();
		
		chessPiece = new JButton[8][8];
		for(int i = 0 ; i < 8 ; i++) {
			for(int j = 0 ; j < 8 ; j++) {
				chessPiece[i][j] = new JButton("" + chessPieceChar[i][j]);
				if((i+j+1) % 2 == 0) {
					chessPiece[i][j].setBackground(Color.GRAY);
				} else {
					chessPiece[i][j].setBackground(Color.WHITE);
				}
				chessPiece[i][j].setPreferredSize(new Dimension(100, 100));
				chessPiece[i][j].setFont(new Font("고딕", Font.BOLD, 15));
				firstPanel.add(chessPiece[i][j]);
			}
		}
		
		//chess = new ChessPiece[8][8];
		chess = new ActionListener[8][8];
		
		chess[0][0] = new Rook(0, 0, 0);
		chess[0][1] = new Knight(0, 0, 1);
		chess[0][2] = new Bishop(0, 0, 2);
		chess[0][3] = new King(0, 0, 3);
		chess[0][4] = new Queen(0, 0, 4);
		chess[0][5] = new Bishop(0, 0, 5);
		chess[0][6] = new Knight(0, 0, 6); 
		chess[0][7] = new Rook(0, 0, 7);
		
		for(int i = 0 ; i < 8 ; i++) {
			chess[1][i] = new Pawn(0, 1, i);
			chess[6][i] = new Pawn(1, 6, i);
		}
		
		for(int i = 2 ; i < 6 ; i++) {
			for(int j = 0 ; j < 8 ; j++) {
				chess[i][j] = null;
			}
		}
		
		chess[7][0] = new Rook(1, 7, 0);
		chess[7][1] = new Knight(1, 7, 1);
		chess[7][2] = new Bishop(1, 7, 2);
		chess[7][3] = new King(1, 7, 3);
		chess[7][4] = new Queen(1, 7, 4);
		chess[7][5] = new Bishop(1, 7, 5);
		chess[7][6] = new Knight(1, 7, 6);
		chess[7][7] = new Rook(1, 7, 7);
		
	}
}