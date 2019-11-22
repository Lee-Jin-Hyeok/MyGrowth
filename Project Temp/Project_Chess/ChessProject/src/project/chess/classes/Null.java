package project.chess.classes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import project.chess.abstractclass.ChessPiece;

public class Null implements ChessPiece, ActionListener, Cloneable {
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
		
	}

	@Override
	public void move() {
		
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
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
	
	@Override
	public void setTeam(int team) {
		this.team = team;
	}

	@Override
	public void setXpos(int xpos) {
		this.xpos = xpos;
	}

	@Override
	public void setYpos(int ypos) {
		this.ypos = ypos;
	}

}
