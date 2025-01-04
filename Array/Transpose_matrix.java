// Initialize a 3x3 matrix and display its transpose.
// Program:

public class Array8 {
	public static void main(String[] args) {
		int[][] a= {{2,3,4},{5,6,7},{8,9,1}};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}
	}
}
