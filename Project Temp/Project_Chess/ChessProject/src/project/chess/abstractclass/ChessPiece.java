package project.chess.abstractclass;

public interface ChessPiece {
	public void view();
	public void move();
	public int getTeam();
	public int getXpos();
	public int getYpos();
	public void setTeam(int team);
	public void setXpos(int xpos);
	public void setYpos(int ypos);
}
