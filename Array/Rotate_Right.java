// Read an array as input and rotate right.
// Input: 10 20 30 40 50
// Output: 50 10 20 30 40
// Program:

import java.util.Scanner;
public class Array10 {
	public static void main(String[] args) {
		int[] arr=new int[5];
		System.out.println("Enter 5 numbers:");
		Scanner scanner=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			arr[i]=scanner.nextInt();
		}
		scanner.close();
		System.out.println("the inputs:");
		for(int n:arr){
			System.out.print(n+" ");
		}
		int temp=arr[arr.length-1];
		for(int i=arr.length-1;i>0;i--) {
			arr[i]=arr[i-1];
		}
		arr[0]=temp;
		System.out.println("\nAfter rotate right:");
		for(int n:arr){
			System.out.print(n+" ");
		}
	}
}
