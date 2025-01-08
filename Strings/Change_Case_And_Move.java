// Given a string that contains uppercase letters as well as lower case letters. The task is to move all uppercase characters at the end of
// the String. The uppercase characters must be in the same order as in the original string.
// Input :heLLGFg
// Output :hegLLGF

// Program:

import java.util.Scanner;
public class Strings5 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a String:");
		String string=scanner.next();
		String low="";
		String upp="";
		char[] s1=string.toCharArray();
		for(int i=0;i<s1.length;i++) {
			if(s1[i]>='A' && s1[i]<='Z')
				upp+=s1[i];
			else
				low+=s1[i];
		}
		String result=low+upp;
		System.out.println("output:"+result);
		scanner.close();
	}
}
