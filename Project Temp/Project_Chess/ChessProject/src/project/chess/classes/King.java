package project.chess.classes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import project.chess.abstractclass.ChessPiece;

public class King implements ChessPiece, ActionListener {
	private int team;
	private int xpos;
	private int ypos;
	
	public King(int team, int xpos, int ypos) {
		this.team = team;
		this.xpos = xpos;
		this.ypos = ypos;
	}
	
	@Override
	public void view() {
		
	}
	@Override
	public void move() {
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Chess.cx = this.xpos;
		Chess.cy = this.ypos;
	}
	
	@Override
	public int getTeam() {
		return team;
	}

	@Override
	public int getXpos() {
		return xpos;
	}

	@Override
	public int getYpos() {
		return ypos;
	}
}
