// Diamond shape composed of Numbers.
//     1
//    212
//   32123
//  4321234
//   32123
//    212
//     1


// Program:

public class Pattern5 {
	public static void main(String[] args) {
		int n=4;
		for(int i=1;i<=n;i++) {
			for(int k=i;k<=n;k++)
				System.out.print(" ");
			
			for(int j=i;j>1;j--)
				System.out.print(j);
		
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		for(int i=n-1;i>=1;i--) {
			for(int k=i;k<=n;k++)
				System.out.print(" ");
			
			for(int j=i;j>1;j--)
				System.out.print(j);
		
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
