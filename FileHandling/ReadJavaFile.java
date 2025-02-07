// Write a program to read Java file content and display in output.
// Program:

import java.io.*;
public class ReadJavaFile {
	public static void main(String[] args) throws IOException {
		FileReader f=new FileReader("D:\\print.java");
		int i=0;
		String s="";
		while((i=f.read())!=-1) {
			s=s+(char)i;
		}
		f.close();
		System.out.println("The Java File Content Are:\n"+s);
	}
}

// Output
// The Java File Content Are:
// public class Print {
// 	public static void main(String[] args) {
// 		System.out.println("Hello World");
// 	}
// }
