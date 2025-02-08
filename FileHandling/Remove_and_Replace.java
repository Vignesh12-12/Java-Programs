// Remove and replace the word in the text file with user inputted word.
// Program:
import java.util.Scanner;
import java.io.*;
public class Remove_and_Replace {

	public static void main(String[] args) throws IOException {
		FileReader f=new FileReader("example.txt");
		int i=0;
		String S="";
		while((i=f.read())!=-1) {
			S=S+(char)i;
		}
		f.close();
		System.out.println("String:"+S);
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the word to replace");
		String replace=s.next();
		System.out.println("Enter the word to replace with:");
		String replacewith=s.next();
		s.close();
		String[] Sarr=S.split(" ");
		for(i=0;i<Sarr.length;i++) {
			if(Sarr[i].equalsIgnoreCase(replace))
				Sarr[i]=replacewith;
		}
		String newstring=String.join(" ", Sarr);
		System.out.println("Updated String:"+newstring);
	}
}
// Output
// String:this is java Example
// Enter the word to replace
// java
// Enter the word to replace with:
// python
// Updated String:this is python Example
