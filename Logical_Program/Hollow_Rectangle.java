// Program to print hollow rectangle or square star patterns.
// *   *   *   *   *   *   
// *                   *   
// *                   *   
// *                   *   
// *                   *   
// *                   *   
// *   *   *   *   *   *   

// Program:

public class Pattern4 {
	public static void main(String[] args) {
		for(int i=1;i<=7;i++) {
			for(int j=1;j<=6;j++) {
				if(i==1||i==7||j==1||j==6)
					System.out.print("*"+"   ");
				else
					System.out.print("    ");
			}
			System.out.println();
		}
	}
}
