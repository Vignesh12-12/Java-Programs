// Read a number and convert to binary.
// Eg: 23 = 10111
// Program:
package topic0;
import java.util.Scanner;
public class Binary {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Integer");
		int n=sc.nextInt();
		int bin=0,res=0,num=n; 
		while(n!=0) {
			int rem=n%2;
			bin=bin*10+rem;
			n=n/2;
		}
		while(bin>0) {
			int rem=bin%10;
			res=res*10+rem;
			bin=bin/10;
		}
		System.out.printf("Binary of %d is %d",num,res);
		sc.close();
	}
}
