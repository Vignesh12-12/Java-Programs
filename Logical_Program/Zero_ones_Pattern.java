// Zeros/ ones Pattern Programs.
// 1 
// 1 0 
// 1 0 1 
// 1 0 1 0 
// 1 0 1 0 1 
// Program:

public class Pattern3 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++) {
				System.out.print((j%2)+" ");
			}
			System.out.println();
		}
	}
}
