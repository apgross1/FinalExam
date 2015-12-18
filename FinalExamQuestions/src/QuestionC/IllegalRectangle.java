package QuestionC;

public class IllegalRectangle extends Exception {
	private int x;
	private int y;
	
	public IllegalRectangle(int xVal, int yVal) {
		this.x = xVal;
		this.y = yVal;
	}
	
	public int getxVal() {
		return this.x;
	}
	public int getyVal() {
		return this.y;
	}
}
