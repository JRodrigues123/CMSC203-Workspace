import java.util.Scanner;
public class Rain {

	public static void main(String[] args) {
		
		double [][] rainFalls = new double[4][3];
		
		rainFalls[2][1] = 2.5;
		
		rainFalls[0][0] = 3.5;
//		
//		for(int i = 0; i < rainFalls.length; i++) {
//			
//			for(int j = 0; j < rainFalls[i].length; j++ ) {
//				
//				System.out.print(rainFalls[i][j] + " "); 
//				
//				
//			}
//			
//			System.out.println();
//		}
		
		for(double[] r : rainFalls) {
			
			for(double c : r) {
				System.out.print(c + " ");
			}
			System.out.println();
		}
	}

}
