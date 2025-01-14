// Generate n numbers in Fibonacci series.
//sample input: 10
//sample output: 0 1 1 2 3 5 8 13 21 34
// Program:
package topic0;
import java.util.Scanner;
public class fibonacci {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n series:");
		int n=sc.nextInt();
		int n1=0,n2=1;
		for(int i=1;i<=n;i++) {
				System.out.print(n1+" ");
				int temp=n1+n2;
				n1=n2;
				n2=temp;
		}
		sc.close();
		}
	}
