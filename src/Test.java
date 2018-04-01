import java.util.Random;

public class Test {
	
	public static void main(String[] args) {
		
		boolean[][] testArr = new boolean[10][10]; 
		Random randGen = new Random(); 
		
		for (int i = 0; i < testArr.length; i++) {
			for (int j = 0; j < testArr[i].length; j++) {
				int rand = randGen.nextInt(2);
				if (rand == 0) {
					testArr[i][j] = true; 
				} else {
					testArr[i][j] = false; 
				}
			}
		}
		
		CrosswordPuzzle puzzle = new CrosswordPuzzle(testArr); 

		System.out.println(puzzle);
	}

}
