// Read a string as input and remove vowels.
// Eg:: Umbrella ->; mbrll
// Program:

import java.util.Scanner;
public class String8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String s=sc.next();
		char[] s1=s.toCharArray();
		String res="";
		for(int i=0;i<s1.length;i++) {
			if(s1[i]=='a'||s1[i]=='A'||s1[i]=='e'||s1[i]=='E'||
					s1[i]=='i'||s1[i]=='I'||s1[i]=='o'||s1[i]=='O'||
					s1[i]=='u'||s1[i]=='U') 
				continue;
			else
				res=res+s1[i];	
		}
		System.out.println("After removing vowels:\n"+res);	
	}
}
