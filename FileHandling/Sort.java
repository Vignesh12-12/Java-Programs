// Write a program that get the name of the file as input from the user and display all the words in alphabetical order.
// Program:
import java.util.Scanner;
import java.io.*;
public class Sort {
	public static void main(String[] args) throws IOException {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the File Name:");
		String filename=s.next();
		s.close();
		FileReader f=new FileReader(filename);
		int i=0;
		String S="";
		while((i=f.read())!=-1) {
			S=S+(char)i;
		}
		f.close();
		String[] Sarr=S.split(" ");
		for ( i = 0; i < Sarr.length - 1; i++) {
            for (int j = i + 1; j < Sarr.length; j++) {
                if (Sarr[i].compareToIgnoreCase(Sarr[j]) > 0) {
                    String temp = Sarr[i];
                    Sarr[i] = Sarr[j];
                    Sarr[j] = temp;
                }
            }
        }
		System.out.println("Words in alphabetical order:");
		for(String n:Sarr)
			System.out.println(n);	
	}
}
// Output
// Enter the File Name:
// Example.txt
// Words in alphabetical order:
// Example
// is
// java
// this

