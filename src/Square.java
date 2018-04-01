public class Square{
	
	private boolean isBlack; 
	private int identNum; 
	
	public Square(boolean isBlk, int num) {
		isBlack = isBlk;
		identNum = num;
	}
	public Square() {
		isBlack = false;
		identNum = 0;
	}
	
	public boolean isBlack() {
		return isBlack; 
	}
	public int getIdentNum() {
		return identNum; 
	}
	public void setIdentNum(int num) {
		identNum = num;
	}
	public void setIsBlack(boolean isBlk) {
		isBlack = isBlk; 
	}

}