// 1. Use File Reader class and read content from a file. Count the number of characters in the file. 
// If the file does not exist, handle exceptions.
// program:

import java.io.*;
public class NumberOfCharacters {
	public static void main(String[] args) throws IOException {
		FileReader f=new FileReader("example.txt");
		int i=0,count=0;
		String s="";
		while((i=f.read())!=-1) {
			if(i>=65 && i<=91 || i>=97 && i<=123) {
				count++;
				s=s+(char)i;
			}
		}
		f.close();
		System.out.println("The number of Characters:"+count);
		System.out.println("The Characters are:"+s);
	}
}
// Output
// The number of Characters:5
// The Characters are:Hello
// -----------------------------------------


