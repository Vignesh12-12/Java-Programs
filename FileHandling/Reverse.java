// Read content from a file and reverse it. Store results in another file.
// Program:

import java.io.*;
public class Reverse {
	public static void main(String[] args) throws IOException{
		FileReader f=new FileReader("example.txt");
		int i=0;
		String s="";
		while((i=f.read())!=-1) {
				s=s+(char)i;
			}
		f.close();
		System.out.println("String:"+s);
		char[] carr=s.toCharArray();
		String rev="";
		for(int j=carr.length-1;j>=0;j--) {
			rev+=carr[j];
		}
		System.out.println("Reverse :"+rev);
		FileWriter fw=new FileWriter("Example1.txt");
		fw.write(rev);
		fw.close();
		System.out.println("File Saved");
	}
}
// Output
// String:Hello
// Reverse :olleH
// File Saved

