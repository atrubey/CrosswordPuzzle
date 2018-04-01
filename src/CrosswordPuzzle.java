
public class CrosswordPuzzle
{
	private Square[][] puzzle; 
	
	public CrosswordPuzzle(boolean[][] blackSquares) {
		puzzle = new Square[blackSquares.length][blackSquares[0].length]; 
		int numCounter = 1; 
		for (int i = 0; i < blackSquares.length; i++) {
			for (int j = 0; j < blackSquares[i].length; j++) {
				if(blackSquares[i][j]) {
					puzzle[i][j] = new Square(true, -1);
				} else {
					puzzle[i][j] = new Square(false, 0);
					if(toBeLabeled(i, j, blackSquares)) {
						puzzle[i][j].setIdentNum(numCounter);
						numCounter++; 
					} else {
						puzzle[i][j].setIdentNum(0);						
					}
				}
			}
		}
	}
	
	private boolean toBeLabeled(int r, int c, boolean[][] blackSquares) {
		if (blackSquares[r][c]) {
			return false; 
		} else {
			if (r == 0 || c == 0) {
				return true; 
			} else if (blackSquares[r-1][c] || blackSquares[r][c-1]) {
				return true; 
			} else {
				return false; 
			}
		}
	}
	
	public String toString() {
		String output = ""; 
		for (int i = 0; i < puzzle.length; i++) {
			for (int j = 0; j < puzzle[i].length; j++) {
				if (puzzle[i][j].getIdentNum() == -1) {
					output += " * "; 					
				} else if (puzzle[i][j].getIdentNum() == 0) {
					output += "   "; 					
				} else if (puzzle[i][j].getIdentNum() < 10) {
					output = output + " " + puzzle[i][j].getIdentNum() + " "; 
				} else {
					output = output + puzzle[i][j].getIdentNum() + " ";
				}
			}
			output += "\n"; 
		}
		
		return output; 
	}
}