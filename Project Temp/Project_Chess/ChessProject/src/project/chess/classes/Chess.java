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

import project.chess.abstractclass.ChessPiece;

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
		if(Chess.piece[Chess.cx][Chess.cy] instanceof Null) {
			if(Chess.chessPiece[Chess.cx][Chess.cy].getBackground() == Color.YELLOW) {
				greenCheck();
				Chess.piece[Chess.cx][Chess.cy] = Chess.piece[Chess.tx][Chess.ty];
				Chess.piece[Chess.tx][Chess.ty] = new Null(-1, Chess.tx, Chess.ty);
				
				String temp1 = Chess.chessPiece[Chess.tx][Chess.ty].getText();
				Chess.chessPiece[Chess.tx][Chess.ty].setText(Chess.chessPiece[Chess.cx][Chess.cy].getText());
				Chess.chessPiece[Chess.cx][Chess.cy].setText(temp1);
			
				ChessPiece temp2 = Chess.piece[Chess.cx][Chess.cy];
				Chess.piece[Chess.cx][Chess.cy]= Chess.piece[Chess.tx][Chess.ty];
				Chess.piece[Chess.tx][Chess.ty] = temp2;
			}
		} else if(Chess.chess[Chess.cx][Chess.cy] instanceof Bishop) {
			if(((Bishop) Chess.chess[Chess.cx][Chess.cy]).getTeam() == 0) {
				if(!(Chess.chessPiece[Chess.cx][Chess.cy].getBackground() == Color.GREEN)) {
					if(colorCheck())
						colorInit();
					Chess.chessPiece[Chess.cx][Chess.cy].setBackground(Color.GREEN);
					
					for(int i = 1 ; i < 8 ; i++) {
						if((Chess.cx+i) > 7 || (Chess.cy+i) > 7)
							break;
						if(Chess.piece[Chess.cx+i][Chess.cy+i].getTeam() == 1) {
							Chess.chessPiece[Chess.cx+i][Chess.cy+i].setBackground(Color.RED);
							break;
						}
						if(!(Chess.chess[Chess.cx+i][Chess.cy+i] instanceof Null))
							break;
						Chess.chessPiece[Chess.cx+i][Chess.cy+i].setBackground(Color.YELLOW);
					}
					for(int i = 1 ; i < 8 ; i++) {
						if((Chess.cx+i) > 7 || (Chess.cy-i) < 0)
							break;
						if(Chess.piece[Chess.cx+i][Chess.cy-i].getTeam() == 1) {
							Chess.chessPiece[Chess.cx+i][Chess.cy-i].setBackground(Color.RED);
							break;
						}
						if(!(Chess.chess[Chess.cx+i][Chess.cy-i] instanceof Null))
							break;
						Chess.chessPiece[Chess.cx+i][Chess.cy-i].setBackground(Color.YELLOW);
					}
					for(int i = 1 ; i < 8 ; i++) {
						if((Chess.cx-i) < 0 || (Chess.cy+i) > 7)
							break;
						if(Chess.piece[Chess.cx-i][Chess.cy+i].getTeam() == 1) {
							Chess.chessPiece[Chess.cx-i][Chess.cy+i].setBackground(Color.RED);
							break;
						}
						if(!(Chess.chess[Chess.cx-i][Chess.cy+i] instanceof Null))
							break;
						Chess.chessPiece[Chess.cx-i][Chess.cy+i].setBackground(Color.YELLOW);
					}
					for(int i = 1 ; i < 8 ; i++) {
						if((Chess.cx-i) < 0 || (Chess.cy-i) < 0)
							break;
						if(Chess.piece[Chess.cx-i][Chess.cy-i].getTeam() == 1) {
							Chess.chessPiece[Chess.cx-i][Chess.cy-i].setBackground(Color.RED);
							break;
						}
						if(!(Chess.chess[Chess.cx-i][Chess.cy-i] instanceof Null))
							break;
						Chess.chessPiece[Chess.cx-i][Chess.cy-i].setBackground(Color.YELLOW);
					}
					
				} else
					colorInit();
			} else {
				if(!(Chess.chessPiece[Chess.cx][Chess.cy].getBackground() == Color.GREEN)) {
					if(colorCheck())
						colorInit();
					Chess.chessPiece[Chess.cx][Chess.cy].setBackground(Color.GREEN);
					
					for(int i = 1 ; i < 8 ; i++) {
						if((Chess.cx+i) > 7 || (Chess.cy+i) > 7)
							break;
						if(Chess.piece[Chess.cx+i][Chess.cy+i].getTeam() == 0) {
							Chess.chessPiece[Chess.cx+i][Chess.cy+i].setBackground(Color.RED);
							break;
						}
						if(!(Chess.chess[Chess.cx+i][Chess.cy+i] instanceof Null))
							break;
						Chess.chessPiece[Chess.cx+i][Chess.cy+i].setBackground(Color.YELLOW);
					}
					for(int i = 1 ; i < 8 ; i++) {
						if((Chess.cx+i) > 7 || (Chess.cy-i) < 0)
							break;
						if(Chess.piece[Chess.cx+i][Chess.cy-i].getTeam() == 0) {
							Chess.chessPiece[Chess.cx+i][Chess.cy-i].setBackground(Color.RED);
							break;
						}
						if(!(Chess.chess[Chess.cx+i][Chess.cy-i] instanceof Null))
							break;
						Chess.chessPiece[Chess.cx+i][Chess.cy-i].setBackground(Color.YELLOW);
					}
					for(int i = 1 ; i < 8 ; i++) {
						if((Chess.cx-i) < 0 || (Chess.cy+i) > 7)
							break;
						if(Chess.piece[Chess.cx-i][Chess.cy+i].getTeam() == 0) {
							Chess.chessPiece[Chess.cx-i][Chess.cy+i].setBackground(Color.RED);
							break;
						}
						if(!(Chess.chess[Chess.cx-i][Chess.cy+i] instanceof Null))
							break;
						Chess.chessPiece[Chess.cx-i][Chess.cy+i].setBackground(Color.YELLOW);
					}
					for(int i = 1 ; i < 8 ; i++) {
						if((Chess.cx-i) < 0 || (Chess.cy-i) < 0)
							break;
						if(Chess.piece[Chess.cx-i][Chess.cy-i].getTeam() == 0) {
							Chess.chessPiece[Chess.cx-i][Chess.cy-i].setBackground(Color.RED);
							break;
						}
						if(!(Chess.chess[Chess.cx-i][Chess.cy-i] instanceof Null))
							break;
						Chess.chessPiece[Chess.cx-i][Chess.cy-i].setBackground(Color.YELLOW);
					}
					
				} else
					colorInit();
			}
			
			
		} else if(Chess.chess[Chess.cx][Chess.cy] instanceof King) {
			if(((King) Chess.chess[Chess.cx][Chess.cy]).getTeam() == 0) {
				if(!(Chess.chessPiece[Chess.cx][Chess.cy].getBackground() == Color.GREEN)) {
					if(colorCheck())
						colorInit();
					Chess.chessPiece[Chess.cx][Chess.cy].setBackground(Color.GREEN);
					
					if((Chess.cx-1 > -1) && (Chess.cy-1 > -1)) {
						if(Chess.piece[Chess.cx-1][Chess.cy-1].getTeam() == 1)
							Chess.chessPiece[Chess.cx-1][Chess.cy-1].setBackground(Color.RED);
						else if(Chess.chess[Chess.cx-1][Chess.cy-1] instanceof Null)
							Chess.chessPiece[Chess.cx-1][Chess.cy-1].setBackground(Color.YELLOW);
					}
					if(Chess.cx-1 > -1) {
						if(Chess.piece[Chess.cx-1][Chess.cy].getTeam() == 1)
							Chess.chessPiece[Chess.cx-1][Chess.cy].setBackground(Color.RED);
						else if(Chess.chess[Chess.cx-1][Chess.cy] instanceof Null)
							Chess.chessPiece[Chess.cx-1][Chess.cy].setBackground(Color.YELLOW);
					}
					if((Chess.cx-1 > -1) && (Chess.cy+1 < 8)) {
						if(Chess.piece[Chess.cx-1][Chess.cy+1].getTeam() == 1)
							Chess.chessPiece[Chess.cx-1][Chess.cy+1].setBackground(Color.RED);
						else if(Chess.chess[Chess.cx-1][Chess.cy+1] instanceof Null)
							Chess.chessPiece[Chess.cx-1][Chess.cy+1].setBackground(Color.YELLOW);
					}
					if(Chess.cy-1 > -1) {
						if(Chess.piece[Chess.cx][Chess.cy-1].getTeam() == 1)
							Chess.chessPiece[Chess.cx][Chess.cy-1].setBackground(Color.RED);
						else if(Chess.chess[Chess.cx][Chess.cy-1] instanceof Null)
							Chess.chessPiece[Chess.cx][Chess.cy-1].setBackground(Color.YELLOW);
					}
					if(Chess.cy+1 < 8) {
						if(Chess.piece[Chess.cx][Chess.cy+1].getTeam() == 1)
							Chess.chessPiece[Chess.cx][Chess.cy+1].setBackground(Color.RED);
						else if(Chess.chess[Chess.cx][Chess.cy+1] instanceof Null)
							Chess.chessPiece[Chess.cx][Chess.cy+1].setBackground(Color.YELLOW);
					}
					if((Chess.cx+1 < 8) && (Chess.cy-1 > -1)) {
						if(Chess.piece[Chess.cx+1][Chess.cy-1].getTeam() == 1)
							Chess.chessPiece[Chess.cx+1][Chess.cy-1].setBackground(Color.RED);
						else if(Chess.chess[Chess.cx+1][Chess.cy-1] instanceof Null)
							Chess.chessPiece[Chess.cx+1][Chess.cy-1].setBackground(Color.YELLOW);
					}
					if(Chess.cx+1 < 8) {
						if(Chess.piece[Chess.cx+1][Chess.cy].getTeam() == 1)
							Chess.chessPiece[Chess.cx+1][Chess.cy].setBackground(Color.RED);
						else if(Chess.chess[Chess.cx+1][Chess.cy] instanceof Null)
							Chess.chessPiece[Chess.cx+1][Chess.cy].setBackground(Color.YELLOW);
					}
					if((Chess.cx+1 < 8) && (Chess.cy+1 < 8)) {
						if(Chess.piece[Chess.cx+1][Chess.cy+1].getTeam() == 1)
							Chess.chessPiece[Chess.cx+1][Chess.cy+1].setBackground(Color.RED);
						else if(Chess.chess[Chess.cx+1][Chess.cy+1] instanceof Null)
							Chess.chessPiece[Chess.cx+1][Chess.cy+1].setBackground(Color.YELLOW);
					}
					
				} else
					colorInit();
			} else {
				if(!(Chess.chessPiece[Chess.cx][Chess.cy].getBackground() == Color.GREEN)) {
					if(colorCheck())
						colorInit();
					Chess.chessPiece[Chess.cx][Chess.cy].setBackground(Color.GREEN);
					
					if((Chess.cx-1 > -1) && (Chess.cy-1 > -1)) {
						if(Chess.piece[Chess.cx-1][Chess.cy-1].getTeam() == 0)
							Chess.chessPiece[Chess.cx-1][Chess.cy-1].setBackground(Color.RED);
						else if(Chess.chess[Chess.cx-1][Chess.cy-1] instanceof Null)
							Chess.chessPiece[Chess.cx-1][Chess.cy-1].setBackground(Color.YELLOW);
					}
					if(Chess.cx-1 > -1) {
						if(Chess.piece[Chess.cx-1][Chess.cy].getTeam() == 0)
							Chess.chessPiece[Chess.cx-1][Chess.cy].setBackground(Color.RED);
						else if(Chess.chess[Chess.cx-1][Chess.cy] instanceof Null)
							Chess.chessPiece[Chess.cx-1][Chess.cy].setBackground(Color.YELLOW);
					}
					if((Chess.cx-1 > -1) && (Chess.cy+1 < 8)) {
						if(Chess.piece[Chess.cx-1][Chess.cy+1].getTeam() == 0)
							Chess.chessPiece[Chess.cx-1][Chess.cy+1].setBackground(Color.RED);
						else if(Chess.chess[Chess.cx-1][Chess.cy+1] instanceof Null)
							Chess.chessPiece[Chess.cx-1][Chess.cy+1].setBackground(Color.YELLOW);
					}
					if(Chess.cy-1 > -1) {
						if(Chess.piece[Chess.cx][Chess.cy-1].getTeam() == 0)
							Chess.chessPiece[Chess.cx][Chess.cy-1].setBackground(Color.RED);
						else if(Chess.chess[Chess.cx][Chess.cy-1] instanceof Null)
							Chess.chessPiece[Chess.cx][Chess.cy-1].setBackground(Color.YELLOW);
					}
					if(Chess.cy+1 < 8) {
						if(Chess.piece[Chess.cx][Chess.cy+1].getTeam() == 0)
							Chess.chessPiece[Chess.cx][Chess.cy+1].setBackground(Color.RED);
						else if(Chess.chess[Chess.cx][Chess.cy+1] instanceof Null)
							Chess.chessPiece[Chess.cx][Chess.cy+1].setBackground(Color.YELLOW);
					}
					if((Chess.cx+1 < 8) && (Chess.cy-1 > -1)) {
						if(Chess.piece[Chess.cx+1][Chess.cy-1].getTeam() == 0)
							Chess.chessPiece[Chess.cx+1][Chess.cy-1].setBackground(Color.RED);
						else if(Chess.chess[Chess.cx+1][Chess.cy-1] instanceof Null)
							Chess.chessPiece[Chess.cx+1][Chess.cy-1].setBackground(Color.YELLOW);
					}
					if(Chess.cx+1 < 8) {
						if(Chess.piece[Chess.cx+1][Chess.cy].getTeam() == 0)
							Chess.chessPiece[Chess.cx+1][Chess.cy].setBackground(Color.RED);
						else if(Chess.chess[Chess.cx+1][Chess.cy] instanceof Null)
							Chess.chessPiece[Chess.cx+1][Chess.cy].setBackground(Color.YELLOW);
					}
					if((Chess.cx+1 < 8) && (Chess.cy+1 < 8)) {
						if(Chess.piece[Chess.cx+1][Chess.cy+1].getTeam() == 0)
							Chess.chessPiece[Chess.cx+1][Chess.cy+1].setBackground(Color.RED);
						else if(Chess.chess[Chess.cx+1][Chess.cy+1] instanceof Null)
							Chess.chessPiece[Chess.cx+1][Chess.cy+1].setBackground(Color.YELLOW);
					}
					
				}
				else
					colorInit();
			}
			
			
		} else if(Chess.chess[Chess.cx][Chess.cy] instanceof Knight) {
			if(((Knight) Chess.chess[Chess.cx][Chess.cy]).getTeam() == 0) {
				if(!(Chess.chessPiece[Chess.cx][Chess.cy].getBackground() == Color.GREEN)) {
					if(colorCheck())
						colorInit();
					Chess.chessPiece[Chess.cx][Chess.cy].setBackground(Color.GREEN);
					
					if((Chess.cx-2 > -1) && (Chess.cy-1 > -1)) {
						if(Chess.piece[Chess.cx-2][Chess.cy-1].getTeam() == 1)
							Chess.chessPiece[Chess.cx-2][Chess.cy-1].setBackground(Color.RED);
						else if(Chess.chess[Chess.cx-2][Chess.cy-1] instanceof Null)
							Chess.chessPiece[Chess.cx-2][Chess.cy-1].setBackground(Color.YELLOW);
					}
					if((Chess.cx-2 > -1) && (Chess.cy+1 < 8)) {
						if(Chess.piece[Chess.cx-2][Chess.cy+1].getTeam() == 1)
							Chess.chessPiece[Chess.cx-2][Chess.cy+1].setBackground(Color.RED);
						else if(Chess.chess[Chess.cx-2][Chess.cy+1] instanceof Null)
							Chess.chessPiece[Chess.cx-2][Chess.cy+1].setBackground(Color.YELLOW);
					}
					if((Chess.cx-1 > -1) && (Chess.cy+2 < 8)) {
						if(Chess.piece[Chess.cx-1][Chess.cy+2].getTeam() == 1)
							Chess.chessPiece[Chess.cx-1][Chess.cy+2].setBackground(Color.RED);
						else if(Chess.chess[Chess.cx-1][Chess.cy+2] instanceof Null)
							Chess.chessPiece[Chess.cx-1][Chess.cy+2].setBackground(Color.YELLOW);
					}
					if((Chess.cx+1 < 8) && (Chess.cy+2 < 8)) {
						if(Chess.piece[Chess.cx+1][Chess.cy+2].getTeam() == 1)
							Chess.chessPiece[Chess.cx+1][Chess.cy+2].setBackground(Color.RED);
						else if(Chess.chess[Chess.cx+1][Chess.cy+2] instanceof Null)
							Chess.chessPiece[Chess.cx+1][Chess.cy+2].setBackground(Color.YELLOW);
					}
					if((Chess.cx+2 < 8) && (Chess.cy+1 < 8)) {
						if(Chess.piece[Chess.cx+2][Chess.cy+1].getTeam() == 1)
							Chess.chessPiece[Chess.cx+2][Chess.cy+1].setBackground(Color.RED);
						else if(Chess.chess[Chess.cx+2][Chess.cy+1] instanceof Null)
							Chess.chessPiece[Chess.cx+2][Chess.cy+1].setBackground(Color.YELLOW);
					}
					if((Chess.cx+2 < 8) && (Chess.cy-1 > -1)) {
						if(Chess.piece[Chess.cx+2][Chess.cy-1].getTeam() == 1)
							Chess.chessPiece[Chess.cx+2][Chess.cy-1].setBackground(Color.RED);
						else if(Chess.chess[Chess.cx+2][Chess.cy-1] instanceof Null)
							Chess.chessPiece[Chess.cx+2][Chess.cy-1].setBackground(Color.YELLOW);
					}
					if((Chess.cx+1 < 8) && (Chess.cy-2 > -1)) {
						if(Chess.piece[Chess.cx+1][Chess.cy-2].getTeam() == 1)
							Chess.chessPiece[Chess.cx+1][Chess.cy-2].setBackground(Color.RED);
						else if(Chess.chess[Chess.cx+1][Chess.cy-2] instanceof Null)
							Chess.chessPiece[Chess.cx+1][Chess.cy-2].setBackground(Color.YELLOW);
					}
					if((Chess.cx-1 > -1) && (Chess.cy-2 > -1)) {
						if(Chess.piece[Chess.cx-1][Chess.cy-2].getTeam() == 1)
							Chess.chessPiece[Chess.cx-1][Chess.cy-2].setBackground(Color.RED);
						else if(Chess.chess[Chess.cx-1][Chess.cy-2] instanceof Null)
							Chess.chessPiece[Chess.cx-1][Chess.cy-2].setBackground(Color.YELLOW);
					}
						
				} else
					colorInit();
			} else {
				if(!(Chess.chessPiece[Chess.cx][Chess.cy].getBackground() == Color.GREEN)) {
					if(colorCheck())
						colorInit();
					Chess.chessPiece[Chess.cx][Chess.cy].setBackground(Color.GREEN);
					
					if((Chess.cx-2 > -1) && (Chess.cy-1 > -1)) {
						if(Chess.piece[Chess.cx-2][Chess.cy-1].getTeam() == 0)
							Chess.chessPiece[Chess.cx-2][Chess.cy-1].setBackground(Color.RED);
						else if(Chess.chess[Chess.cx-2][Chess.cy-1] instanceof Null)
							Chess.chessPiece[Chess.cx-2][Chess.cy-1].setBackground(Color.YELLOW);
					}
					if((Chess.cx-2 > -1) && (Chess.cy+1 < 8)) {
						if(Chess.piece[Chess.cx-2][Chess.cy+1].getTeam() == 0)
							Chess.chessPiece[Chess.cx-2][Chess.cy+1].setBackground(Color.RED);
						else if(Chess.chess[Chess.cx-2][Chess.cy+1] instanceof Null)
							Chess.chessPiece[Chess.cx-2][Chess.cy+1].setBackground(Color.YELLOW);
					}
					if((Chess.cx-1 > -1) && (Chess.cy+2 < 8)) {
						if(Chess.piece[Chess.cx-1][Chess.cy+2].getTeam() == 0)
							Chess.chessPiece[Chess.cx-1][Chess.cy+2].setBackground(Color.RED);
						else if(Chess.chess[Chess.cx-1][Chess.cy+2] instanceof Null)
							Chess.chessPiece[Chess.cx-1][Chess.cy+2].setBackground(Color.YELLOW);
					}
					if((Chess.cx+1 < 8) && (Chess.cy+2 < 8)) {
						if(Chess.piece[Chess.cx+1][Chess.cy+2].getTeam() == 0)
							Chess.chessPiece[Chess.cx+1][Chess.cy+2].setBackground(Color.RED);
						else if(Chess.chess[Chess.cx+1][Chess.cy+2] instanceof Null)
							Chess.chessPiece[Chess.cx+1][Chess.cy+2].setBackground(Color.YELLOW);
					}
					if((Chess.cx+2 < 8) && (Chess.cy+1 < 8)) {
						if(Chess.piece[Chess.cx+2][Chess.cy+1].getTeam() == 0)
							Chess.chessPiece[Chess.cx+2][Chess.cy+1].setBackground(Color.RED);
						else if(Chess.chess[Chess.cx+2][Chess.cy+1] instanceof Null)
							Chess.chessPiece[Chess.cx+2][Chess.cy+1].setBackground(Color.YELLOW);
					}
					if((Chess.cx+2 < 8) && (Chess.cy-1 > -1)) {
						if(Chess.piece[Chess.cx+2][Chess.cy-1].getTeam() == 0)
							Chess.chessPiece[Chess.cx+2][Chess.cy-1].setBackground(Color.RED);
						else if(Chess.chess[Chess.cx+2][Chess.cy-1] instanceof Null)
							Chess.chessPiece[Chess.cx+2][Chess.cy-1].setBackground(Color.YELLOW);
					}
					if((Chess.cx+1 < 8) && (Chess.cy-2 > -1)) {
						if(Chess.piece[Chess.cx+1][Chess.cy-2].getTeam() == 0)
							Chess.chessPiece[Chess.cx+1][Chess.cy-2].setBackground(Color.RED);
						else if(Chess.chess[Chess.cx+1][Chess.cy-2] instanceof Null)
							Chess.chessPiece[Chess.cx+1][Chess.cy-2].setBackground(Color.YELLOW);
					}
					if((Chess.cx-1 > -1) && (Chess.cy-2 > -1)) {
						if(Chess.piece[Chess.cx-1][Chess.cy-2].getTeam() == 0)
							Chess.chessPiece[Chess.cx-1][Chess.cy-2].setBackground(Color.RED);
						else if(Chess.chess[Chess.cx-1][Chess.cy-2] instanceof Null)
							Chess.chessPiece[Chess.cx-1][Chess.cy-2].setBackground(Color.YELLOW);
					}
						
				} else
					colorInit();
			}
			
			
		} else if(Chess.chess[Chess.cx][Chess.cy] instanceof Pawn) {
			if(((Pawn) Chess.chess[Chess.cx][Chess.cy]).getTeam() == 0) {
				if(!(Chess.chessPiece[Chess.cx][Chess.cy].getBackground() == Color.GREEN)) {
					if(colorCheck())
						colorInit();
					Chess.chessPiece[Chess.cx][Chess.cy].setBackground(Color.GREEN);
					
					if(Chess.cx+1 < 8) {
						if((Chess.chess[Chess.cx+1][Chess.cy]) instanceof Null) {
							Chess.chessPiece[Chess.cx+1][Chess.cy].setBackground(Color.YELLOW);
							if(Chess.cx+2 < 8) {
								if((Chess.chess[Chess.cx+2][Chess.cy]) instanceof Null) {
									Chess.chessPiece[Chess.cx+2][Chess.cy].setBackground(Color.YELLOW);
								}
							}
						}
					}
					
					if(Chess.cx+1 < 8 && Chess.cy+1 < 8)
						if(Chess.piece[Chess.cx+1][Chess.cy+1].getTeam() == 1)
							Chess.chessPiece[Chess.cx+1][Chess.cy+1].setBackground(Color.RED);
					
					if(Chess.cx+1 < 8 && Chess.cy-1 > -1)
						if(Chess.piece[Chess.cx+1][Chess.cy-1].getTeam() == 1)
							Chess.chessPiece[Chess.cx+1][Chess.cy-1].setBackground(Color.RED);
					
				} else
					colorInit();
			} else {
				if(!(Chess.chessPiece[Chess.cx][Chess.cy].getBackground() == Color.GREEN)) {
					if(colorCheck())
						colorInit();
					Chess.chessPiece[Chess.cx][Chess.cy].setBackground(Color.GREEN);
					
					if(Chess.cx-1 > -1) {
						if((Chess.chess[Chess.cx-1][Chess.cy]) instanceof Null) {
							Chess.chessPiece[Chess.cx-1][Chess.cy].setBackground(Color.YELLOW);
							if(Chess.cx-2 > -1) {
								if((Chess.chess[Chess.cx-2][Chess.cy]) instanceof Null) {
									Chess.chessPiece[Chess.cx-2][Chess.cy].setBackground(Color.YELLOW);
								}
							}
						}
					}
					
					if(Chess.cx-1 > -1 && Chess.cy-1 > -1)
						if(Chess.piece[Chess.cx-1][Chess.cy-1].getTeam() == 0)
							Chess.chessPiece[Chess.cx+1][Chess.cy+1].setBackground(Color.RED);
					
					if(Chess.cx-1 > -1 && Chess.cy+1 < 8)
						if(Chess.piece[Chess.cx-1][Chess.cy+1].getTeam() == 0)
							Chess.chessPiece[Chess.cx+1][Chess.cy-1].setBackground(Color.RED);
					
				}
				else
					colorInit();
			}
			
			
		} else if(Chess.chess[Chess.cx][Chess.cy] instanceof Queen) {
			if(((Queen) Chess.chess[Chess.cx][Chess.cy]).getTeam() == 0) {
				if(!(Chess.chessPiece[Chess.cx][Chess.cy].getBackground() == Color.GREEN)) {
					if(colorCheck())
						colorInit();
					Chess.chessPiece[Chess.cx][Chess.cy].setBackground(Color.GREEN);
					
					for(int i = 1 ; i < 8 ; i++) {
						if(Chess.cx-i < 0)
							break;
						if(Chess.piece[Chess.cx-i][Chess.cy].getTeam() == 1) {
							Chess.chessPiece[Chess.cx-i][Chess.cy].setBackground(Color.RED);
							break;
						}
						if(!(Chess.chess[Chess.cx-i][Chess.cy] instanceof Null))
							break;
						Chess.chessPiece[Chess.cx-i][Chess.cy].setBackground(Color.YELLOW);
					}
					for(int i = 1 ; i < 8 ; i++) {
						if(Chess.cx+i > 7)
							break;
						if(Chess.piece[Chess.cx+i][Chess.cy].getTeam() == 1) {
							Chess.chessPiece[Chess.cx+i][Chess.cy].setBackground(Color.RED);
							break;
						}
						if(!(Chess.chess[Chess.cx+i][Chess.cy] instanceof Null))
							break;
						Chess.chessPiece[Chess.cx+i][Chess.cy].setBackground(Color.YELLOW);
					}
					for(int i = 1 ; i < 8 ; i++) {
						if(Chess.cy-i < 0)
							break;
						if(Chess.piece[Chess.cx][Chess.cy-i].getTeam() == 1) {
							Chess.chessPiece[Chess.cx][Chess.cy-i].setBackground(Color.RED);
							break;
						}
						if(!(Chess.chess[Chess.cx][Chess.cy-i] instanceof Null))
							break;
						Chess.chessPiece[Chess.cx][Chess.cy-i].setBackground(Color.YELLOW);
					}
					for(int i = 1 ; i < 8 ; i++) {
						if(Chess.cy+i > 7)
							break;
						if(Chess.piece[Chess.cx][Chess.cy+i].getTeam() == 1) {
							Chess.chessPiece[Chess.cx][Chess.cy+i].setBackground(Color.RED);
							break;
						}
						if(!(Chess.chess[Chess.cx][Chess.cy+i] instanceof Null))
							break;
						Chess.chessPiece[Chess.cx][Chess.cy+i].setBackground(Color.YELLOW);
					}
					
					for(int i = 1 ; i < 8 ; i++) {
						if((Chess.cx+i) > 7 || (Chess.cy+i) > 7)
							break;
						if(Chess.piece[Chess.cx+i][Chess.cy+i].getTeam() == 1) {
							Chess.chessPiece[Chess.cx+i][Chess.cy+i].setBackground(Color.RED);
							break;
						}
						if(!(Chess.chess[Chess.cx+i][Chess.cy+i] instanceof Null))
							break;
						Chess.chessPiece[Chess.cx+i][Chess.cy+i].setBackground(Color.YELLOW);
					}
					for(int i = 1 ; i < 8 ; i++) {
						if((Chess.cx+i) > 7 || (Chess.cy-i) < 0)
							break;
						if(Chess.piece[Chess.cx+i][Chess.cy-i].getTeam() == 1) {
							Chess.chessPiece[Chess.cx+i][Chess.cy-i].setBackground(Color.RED);
							break;
						}
						if(!(Chess.chess[Chess.cx+i][Chess.cy-i] instanceof Null))
							break;
						Chess.chessPiece[Chess.cx+i][Chess.cy-i].setBackground(Color.YELLOW);
					}
					for(int i = 1 ; i < 8 ; i++) {
						if((Chess.cx-i) < 0 || (Chess.cy+i) > 7)
							break;
						if(Chess.piece[Chess.cx-i][Chess.cy+i].getTeam() == 1) {
							Chess.chessPiece[Chess.cx-i][Chess.cy+i].setBackground(Color.RED);
							break;
						}
						if(!(Chess.chess[Chess.cx-i][Chess.cy+i] instanceof Null))
							break;
						Chess.chessPiece[Chess.cx-i][Chess.cy+i].setBackground(Color.YELLOW);
					}
					for(int i = 1 ; i < 8 ; i++) {
						if((Chess.cx-i) < 0 || (Chess.cy-i) < 0)
							break;
						if(Chess.piece[Chess.cx-i][Chess.cy-i].getTeam() == 1) {
							Chess.chessPiece[Chess.cx-i][Chess.cy-i].setBackground(Color.RED);
							break;
						}
						if(!(Chess.chess[Chess.cx-i][Chess.cy-i] instanceof Null))
							break;
						Chess.chessPiece[Chess.cx-i][Chess.cy-i].setBackground(Color.YELLOW);
					}
					
				} else
					colorInit();
			} else {
				if(!(Chess.chessPiece[Chess.cx][Chess.cy].getBackground() == Color.GREEN)) {
					if(colorCheck())
						colorInit();
					Chess.chessPiece[Chess.cx][Chess.cy].setBackground(Color.GREEN);
					
					for(int i = 1 ; i < 8 ; i++) {
						if(Chess.cx-i < 0)
							break;
						if(Chess.piece[Chess.cx-i][Chess.cy].getTeam() == 0) {
							Chess.chessPiece[Chess.cx-i][Chess.cy].setBackground(Color.RED);
							break;
						}
						if(!(Chess.chess[Chess.cx-i][Chess.cy] instanceof Null))
							break;
						Chess.chessPiece[Chess.cx-i][Chess.cy].setBackground(Color.YELLOW);
					}
					for(int i = 1 ; i < 8 ; i++) {
						if(Chess.cx+i > 7)
							break;
						if(Chess.piece[Chess.cx+i][Chess.cy].getTeam() == 0) {
							Chess.chessPiece[Chess.cx+i][Chess.cy].setBackground(Color.RED);
							break;
						}
						if(!(Chess.chess[Chess.cx+i][Chess.cy] instanceof Null))
							break;
						Chess.chessPiece[Chess.cx+i][Chess.cy].setBackground(Color.YELLOW);
					}
					for(int i = 1 ; i < 8 ; i++) {
						if(Chess.cy-i < 0)
							break;
						if(Chess.piece[Chess.cx][Chess.cy-i].getTeam() == 0) {
							Chess.chessPiece[Chess.cx][Chess.cy-i].setBackground(Color.RED);
							break;
						}
						if(!(Chess.chess[Chess.cx][Chess.cy-i] instanceof Null))
							break;
						Chess.chessPiece[Chess.cx][Chess.cy-i].setBackground(Color.YELLOW);
					}
					for(int i = 1 ; i < 8 ; i++) {
						if(Chess.cy+i > 7)
							break;
						if(Chess.piece[Chess.cx][Chess.cy+i].getTeam() == 0) {
							Chess.chessPiece[Chess.cx][Chess.cy+i].setBackground(Color.RED);
							break;
						}
						if(!(Chess.chess[Chess.cx][Chess.cy+i] instanceof Null))
							break;
						Chess.chessPiece[Chess.cx][Chess.cy+i].setBackground(Color.YELLOW);
					}
					
					for(int i = 1 ; i < 8 ; i++) {
						if((Chess.cx+i) > 7 || (Chess.cy+i) > 7)
							break;
						if(Chess.piece[Chess.cx+i][Chess.cy+i].getTeam() == 0) {
							Chess.chessPiece[Chess.cx+i][Chess.cy+i].setBackground(Color.RED);
							break;
						}
						if(!(Chess.chess[Chess.cx+i][Chess.cy+i] instanceof Null))
							break;
						Chess.chessPiece[Chess.cx+i][Chess.cy+i].setBackground(Color.YELLOW);
					}
					for(int i = 1 ; i < 8 ; i++) {
						if((Chess.cx+i) > 7 || (Chess.cy-i) < 0)
							break;
						if(Chess.piece[Chess.cx+i][Chess.cy-i].getTeam() == 0) {
							Chess.chessPiece[Chess.cx+i][Chess.cy-i].setBackground(Color.RED);
							break;
						}
						if(!(Chess.chess[Chess.cx+i][Chess.cy-i] instanceof Null))
							break;
						Chess.chessPiece[Chess.cx+i][Chess.cy-i].setBackground(Color.YELLOW);
					}
					for(int i = 1 ; i < 8 ; i++) {
						if((Chess.cx-i) < 0 || (Chess.cy+i) > 7)
							break;
						if(Chess.piece[Chess.cx-i][Chess.cy+i].getTeam() == 0) {
							Chess.chessPiece[Chess.cx-i][Chess.cy+i].setBackground(Color.RED);
							break;
						}
						if(!(Chess.chess[Chess.cx-i][Chess.cy+i] instanceof Null))
							break;
						Chess.chessPiece[Chess.cx-i][Chess.cy+i].setBackground(Color.YELLOW);
					}
					for(int i = 1 ; i < 8 ; i++) {
						if((Chess.cx-i) < 0 || (Chess.cy-i) < 0)
							break;
						if(Chess.piece[Chess.cx-i][Chess.cy-i].getTeam() == 0) {
							Chess.chessPiece[Chess.cx-i][Chess.cy-i].setBackground(Color.RED);
							break;
						}
						if(!(Chess.chess[Chess.cx-i][Chess.cy-i] instanceof Null))
							break;
						Chess.chessPiece[Chess.cx-i][Chess.cy-i].setBackground(Color.YELLOW);
					}
					
				} else
					colorInit();
			}
			
			
		} else if(Chess.chess[Chess.cx][Chess.cy] instanceof Rook) {
			if(((Rook) Chess.chess[Chess.cx][Chess.cy]).getTeam() == 0) {
				if(!(Chess.chessPiece[Chess.cx][Chess.cy].getBackground() == Color.GREEN)) {
					if(colorCheck())
						colorInit();
					Chess.chessPiece[Chess.cx][Chess.cy].setBackground(Color.GREEN);
					
					for(int i = 1 ; i < 8 ; i++) {
						if(Chess.cx-i < 0)
							break;
						if(Chess.piece[Chess.cx-i][Chess.cy].getTeam() == 1) {
							Chess.chessPiece[Chess.cx-i][Chess.cy].setBackground(Color.RED);
							break;
						}
						if(!(Chess.chess[Chess.cx-i][Chess.cy] instanceof Null))
							break;
						Chess.chessPiece[Chess.cx-i][Chess.cy].setBackground(Color.YELLOW);
					}
					for(int i = 1 ; i < 8 ; i++) {
						if(Chess.cx+i > 7)
							break;
						if(Chess.piece[Chess.cx+i][Chess.cy].getTeam() == 1) {
							Chess.chessPiece[Chess.cx+i][Chess.cy].setBackground(Color.RED);
							break;
						}
						if(!(Chess.chess[Chess.cx+i][Chess.cy] instanceof Null))
							break;
						Chess.chessPiece[Chess.cx+i][Chess.cy].setBackground(Color.YELLOW);
					}
					for(int i = 1 ; i < 8 ; i++) {
						if(Chess.cy-i < 0)
							break;
						if(Chess.piece[Chess.cx][Chess.cy-i].getTeam() == 1) {
							Chess.chessPiece[Chess.cx][Chess.cy-i].setBackground(Color.RED);
							break;
						}
						if(!(Chess.chess[Chess.cx][Chess.cy-i] instanceof Null))
							break;
						Chess.chessPiece[Chess.cx][Chess.cy-i].setBackground(Color.YELLOW);
					}
					for(int i = 1 ; i < 8 ; i++) {
						if(Chess.cy+i > 7)
							break;
						if(Chess.piece[Chess.cx][Chess.cy+i].getTeam() == 1) {
							Chess.chessPiece[Chess.cx][Chess.cy+i].setBackground(Color.RED);
							break;
						}
						if(!(Chess.chess[Chess.cx][Chess.cy+i] instanceof Null))
							break;
						Chess.chessPiece[Chess.cx][Chess.cy+i].setBackground(Color.YELLOW);
					}
				} else
					colorInit();
			} else {
				if(!(Chess.chessPiece[Chess.cx][Chess.cy].getBackground() == Color.GREEN)) {
					if(colorCheck())
						colorInit();
					Chess.chessPiece[Chess.cx][Chess.cy].setBackground(Color.GREEN);
					
					for(int i = 1 ; i < 8 ; i++) {
						if(Chess.cx-i < 0)
							break;
						if(Chess.piece[Chess.cx-i][Chess.cy].getTeam() == 0) {
							Chess.chessPiece[Chess.cx-i][Chess.cy].setBackground(Color.RED);
							break;
						}
						if(!(Chess.chess[Chess.cx-i][Chess.cy] instanceof Null))
							break;
						Chess.chessPiece[Chess.cx-i][Chess.cy].setBackground(Color.YELLOW);
					}
					for(int i = 1 ; i < 8 ; i++) {
						if(Chess.cx+i > 7)
							break;
						if(Chess.piece[Chess.cx+i][Chess.cy].getTeam() == 0) {
							Chess.chessPiece[Chess.cx+i][Chess.cy].setBackground(Color.RED);
							break;
						}
						if(!(Chess.chess[Chess.cx+i][Chess.cy] instanceof Null))
							break;
						Chess.chessPiece[Chess.cx+i][Chess.cy].setBackground(Color.YELLOW);
					}
					for(int i = 1 ; i < 8 ; i++) {
						if(Chess.cy-i < 0)
							break;
						if(Chess.piece[Chess.cx][Chess.cy-i].getTeam() == 0) {
							Chess.chessPiece[Chess.cx][Chess.cy-i].setBackground(Color.RED);
							break;
						}
						if(!(Chess.chess[Chess.cx][Chess.cy-i] instanceof Null))
							break;
						Chess.chessPiece[Chess.cx][Chess.cy-i].setBackground(Color.YELLOW);
					}
					for(int i = 1 ; i < 8 ; i++) {
						if(Chess.cy+i > 7)
							break;
						if(Chess.piece[Chess.cx][Chess.cy+i].getTeam() == 0) {
							Chess.chessPiece[Chess.cx][Chess.cy+i].setBackground(Color.RED);
							break;
						}
						if(!(Chess.chess[Chess.cx][Chess.cy+i] instanceof Null))
							break;
						Chess.chessPiece[Chess.cx][Chess.cy+i].setBackground(Color.YELLOW);
					}
					
				} else
					colorInit();
			}
			
			
		} else {
			
		}
	}
	
	public boolean colorCheck() {
		for(int i = 0 ; i < 8 ; i++) {
			for(int j = 0 ; j < 8 ; j++) {
				if(Chess.chessPiece[i][j].getBackground() == Color.GREEN) {
					return true;
				}
			}
		}
		return false;
	}
	
	public void colorInit() {
		for(int i = 0 ; i < 8 ; i++) {
			for(int j = 0 ; j < 8 ; j++) {
				if((i+j+1) % 2 == 0) {
					Chess.chessPiece[i][j].setBackground(Color.GRAY);
				} else {
					Chess.chessPiece[i][j].setBackground(Color.WHITE);
				}
			}
		}
	}
	
	public void greenCheck() {
		root:for(int i = 0 ; i < 8 ; i++) {
			for(int j = 0 ; j < 8 ; j++) {
				if(Chess.chessPiece[i][j].getBackground() == Color.GREEN) {
					Chess.tx = i;
					Chess.ty = j;
					break root;
				}
			}
		}
	}
	
}

public class Chess extends Frame {
	private JFrame frame;
	private JPanel mainPanel;
	private JPanel firstPanel;
	
	public static JButton[][] chessPiece;
	public static char[][] chessPieceChar;
	//public ChessPiece[][] chess;
	public static ActionListener[][] chess;
	public static ChessPiece[][] piece;
	
	private ActionListener[][] listener;
	
	public static int cx;
	public static int cy;
	
	public static int tx;
	public static int ty;

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
				chessPiece[i][j].addActionListener(chess[i][j]);
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
				chess[i][j] = new Null(-1, i, j);
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
		
		
		
		
		
		piece = new ChessPiece[8][8];
		
		piece[0][0] = new Rook(0, 0, 0);
		piece[0][1] = new Knight(0, 0, 1);
		piece[0][2] = new Bishop(0, 0, 2);
		piece[0][3] = new King(0, 0, 3);
		piece[0][4] = new Queen(0, 0, 4);
		piece[0][5] = new Bishop(0, 0, 5);
		piece[0][6] = new Knight(0, 0, 6); 
		piece[0][7] = new Rook(0, 0, 7);
		
		for(int i = 0 ; i < 8 ; i++) {
			piece[1][i] = new Pawn(0, 1, i);
			piece[6][i] = new Pawn(1, 6, i);
		}
		
		for(int i = 2 ; i < 6 ; i++) {
			for(int j = 0 ; j < 8 ; j++) {
				piece[i][j] = new Null(-1, i, j);
			}
		}
		
		piece[7][0] = new Rook(1, 7, 0);
		piece[7][1] = new Knight(1, 7, 1);
		piece[7][2] = new Bishop(1, 7, 2);
		piece[7][3] = new King(1, 7, 3);
		piece[7][4] = new Queen(1, 7, 4);
		piece[7][5] = new Bishop(1, 7, 5);
		piece[7][6] = new Knight(1, 7, 6);
		piece[7][7] = new Rook(1, 7, 7);
		
		for(int i = 0 ; i < 8 ; i++) {
			for(int j = 0 ; j < 8 ; j++) {
				System.out.print(piece[i][j].getTeam() + " ");
			}
			System.out.println();
		}
		
	}
}