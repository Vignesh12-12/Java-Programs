// Read a string as input and change every 4th character to underscore _.
// Program:

import java.util.Scanner;
public class Strings3 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a String:");
		String s1=scanner.nextLine();
		scanner.close();
		char[] s1array=s1.toCharArray();
		for(int i=3;i<s1array.length;i+=4) {
				s1array[i]='_';
			}
		String result=new String(s1array);
		System.out.println(result);
		}
}
