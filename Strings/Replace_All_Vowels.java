// Read a string as input and replace all vowels with #.
// Sample Input:Umbrella
// Sample Output: #mb#ell#
// Program:

import java.util.Scanner;
public class String9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String s=sc.next();
		char[] s1=s.toCharArray();
		for(int i=0;i<s1.length;i++) {
			if(s1[i]=='a'||s1[i]=='A'||s1[i]=='e'||s1[i]=='E'||
					s1[i]=='i'||s1[i]=='I'||s1[i]=='o'||s1[i]=='O'||
					s1[i]=='u'||s1[i]=='U') 
				s1[i]='#';		
		}
		String str=new String(s1);
		System.out.println("After changing vowels:\n"+str);	
	}
}
