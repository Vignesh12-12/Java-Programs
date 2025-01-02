// Get 10 input from the user and print all even numbers using a single dimensional array.
// Program:

package topic0;
import java.util.Scanner;
public class Array4 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of inputs:");
		int n=scanner.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the values:");
		for(int i=0;i<n;i++) {
			arr[i]=scanner.nextInt();
		}
		System.out.println("The even numbers are:");
		for(int no:arr) {
			if(no%2==0)
				System.out.println(no);
		}
		scanner.close();
	}
}
