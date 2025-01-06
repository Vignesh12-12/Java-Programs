// Read a string using Scanner and convert to character array using charAt().
// program:

import java.util.Scanner;
public class Strings1 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a String:");
		String s1=scanner.nextLine();
		scanner.close();
		for(int i=0;i<s1.length();i++) {
			System.out.println(s1.charAt(i));
		}
	}
}
