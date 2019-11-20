package project.chess.classes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import project.chess.abstractclass.ChessPiece;

public class Null implements ChessPiece, ActionListener {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Chess.cx = -1;
		Chess.cy = -1;
	}

	@Override
	public void view() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getTeam() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getXpos() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getYpos() {
		// TODO Auto-generated method stub
		return 0;
	}

}
