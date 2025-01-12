// Read a sentence and split the words using predefined function.
// Sample Input: Java Program example
// Sample Output:
                // Java
                // Program
                // example
// Program:

import java.util.Scanner;
public class String10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String s=sc.nextLine();
		String[] res=s.split(" ");
		System.out.println("After Splitting:");
		for(int i=0;i<res.length;i++)
			System.out.println(res[i]);
		sc.close();
	}
}
