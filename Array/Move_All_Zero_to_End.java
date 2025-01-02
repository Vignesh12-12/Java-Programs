// Java program to move all zero of an integer array to the end of the array?
// Program:

package topic0;
import java.util.Scanner;
public class Array5 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of inputs:");
		int n=scanner.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the values:");
		for(int i=0;i<n;i++) {
			arr[i]=scanner.nextInt();
		}
		System.out.println("Before moving the 0s");
		for(int no:arr) {
				System.out.print(no+" ");
		}
		int index=0;
		for(int i=0;i<n;i++) {
			if(arr[i]!=0) {
				arr[index]=arr[i];
				index++;
			}
		}
		while(index<n) {
			arr[index]=0;
			index++;
		}
		System.out.println("\nafter moving the 0s");
		for(int no:arr) {
				System.out.print(no+" ");
		}
		scanner.close();
	}
}
