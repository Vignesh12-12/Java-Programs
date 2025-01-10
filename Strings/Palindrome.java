// Get the input from the user and check whether the given string ispalindrome or not. Do not reverse the string.
// Eg:: s=”mom” ->; palindrome
//      s=”dam” ->; not a palindrome.
// Program:

import java.util.Scanner;
public class String7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String s=sc.next();
		boolean flag=true;
		char[] s1=s.toCharArray();
		for(int i=0,j=s1.length-1;i<s1.length && j>=0;i++,j--) {	
				if(s1[i]!=s1[j])
					flag=false;		
		}
		if(flag)
			System.out.println(s+" is a palindrome");
		else
			System.out.println(s+" is not a palindrome");
		sc.close();
	}
}
