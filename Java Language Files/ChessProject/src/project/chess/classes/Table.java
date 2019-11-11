package project.chess.classes;

public class Table {
	char[][] table;
	
	public Table() {
		table = new char[8][8];
		for(int i = 0 ; i < 8 ; i ++) {
			for(int j = 0 ; j < 8 ; j++) {
				table[i][j] = 'бс';
			}
		}
	}
	
	public void ShowTable() {
		for(int i = 0 ; i < 8 ; i ++) {
			for(int j = 0 ; j < 8 ; j++) {
				System.out.print(table[i][j] + " ");
			}
			System.out.println();
		}
	}
}