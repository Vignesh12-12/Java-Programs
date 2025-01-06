// Read an array as input and rotate left.
// Input: 10 20 30 40 50
// Output: 20 30 40 50 10
// Program:

import java.util.Scanner;
public class Array9 {
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
		int temp=arr[0];
		for(int i=0;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=temp;
		System.out.println("\nAfter rotate left:");
		for(int n:arr){
			System.out.print(n+" ");
		}
	}
}
