package project.chess.classes;

import project.chess.abstractclass.ChessPiece;

public class Rook implements ChessPiece {
	private int team;
	private int xpos;
	private int ypos;
	
	public Rook(int team, int xpos, int ypos) {
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
}
