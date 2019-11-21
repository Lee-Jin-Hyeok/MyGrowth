package project.chess.classes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import project.chess.abstractclass.ChessPiece;

public class Null implements ChessPiece, ActionListener {
	private int team;
	private int xpos;
	private int ypos;
	
	public Null(int team, int xpos, int ypos) {
		this.team = team;
		this.xpos = xpos;
		this.ypos = ypos;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Chess.cx = this.xpos;
		Chess.cy = this.ypos;
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
		return team;
	}

	@Override
	public int getXpos() {
		// TODO Auto-generated method stub
		return xpos;
	}

	@Override
	public int getYpos() {
		// TODO Auto-generated method stub
		return ypos;
	}

}
