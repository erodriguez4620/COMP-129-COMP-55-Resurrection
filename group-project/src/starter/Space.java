package starter;

public class Space {
	int row;
	int col;
	public Space(int row, int col) {
		this.row = row;
		this.col = col;
	}
	
	public int getRow() {
		return row;
	}
	
	public int getCol() {
		return col;
	}
	
	public void setRow(int val) {
		row = val;
	}
	
	public void setCol(int val) {
		col = val;
	}
}