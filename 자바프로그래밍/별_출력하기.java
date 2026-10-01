package six_java;

public class StarDrawing {

	public static void main(String[] args) {
		//2차원 배열을 활용하여 1 2 3 4 5 별모양 출력하기
		char[][] stars = new char[5][5];
		for (int i = 0; i < stars.length; i++) {
			for (int j = 0; j < stars[i].length; j++) {
				if (j < i + 1) {
					stars[i][j] = '*';
				} else {
					stars[i][j] = ' ';
				}
				
			}
		}
		
		for (int i = 0; i < stars.length; i++) {
			for (int j = 0; j < stars[i].length; j++) {
				System.out.print(stars[i][j]);
			}
			System.out.println();
		}
		
	}

}

/*
*    
**   
***  
**** 
*****
*/
