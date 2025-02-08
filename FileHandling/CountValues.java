// Write a program to read a text file and display the no of alphabets, numbers, special symbols, blank spaces in the file.
// program:
import java.io.*;
public class CountValues {
	public static void main(String[] args) throws IOException {
		FileReader f=new FileReader("Example2.txt");
		int i=0;
		String s="";
		while((i=f.read())!=-1) {
			s=s+(char)i;
		}
		f.close();
		char[] carr=s.toCharArray();
		int countalpha=0,countnum=0,countspecial=0,countspaces=0;
		for (char c : carr) {
            if (Character.isLetter(c)) {
                countalpha++; 
            } else if (Character.isDigit(c)) {
                countnum++; 
            } else if (Character.isWhitespace(c)) {
                countspaces++; 
            } else {
                countspecial++;
            }
        }
        System.out.println("String:"+s);
        System.out.println("Number of Alphabets: "+countalpha);
        System.out.println("Number of Numbers: "+countnum);
        System.out.println("Number of Special Symbols: "+countspecial);
        System.out.println("Number of Blank Spaces: "+countspaces);
	}
}
// Output
// String:Hello 123 @#$
// Number of Alphabets: 5
// Number of Numbers: 3
// Number of Special Symbols: 3
// Number of Blank Spaces: 2

