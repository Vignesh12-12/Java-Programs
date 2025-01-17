// Find n-th term of series 1,3,6,10,15,21.
//output:Eg: n=7
//1 3 6 10 15 21 28
// Program:
package topic0;
import java.util.Scanner;
public class Logical5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the nth term:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			int res=i*(i+1)/2;
			System.out.print(res+" ");
		}
	}
}
