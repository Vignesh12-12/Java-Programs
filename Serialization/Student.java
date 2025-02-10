// 1. Create a Student class with regno, name and marks in 5 subjects. It should be serializable.
// 2. Read values from the user and create a Student object.
// 3. Serialize the object and store it in a file named the same as the name of the student.
// 4. Raise an exception if File Name already exists.
// program:

import java.io.*;
import java.util.Scanner;
public class Student implements Serializable{
	int regno,mark1,mark2,mark3,mark4,mark5;
	String name;
	Student(int regno,String name,int mark1,int mark2,int mark3,int mark4,int mark5){
		this.regno=regno;
		this.name=name;
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;
		this.mark4=mark4;
		this.mark5=mark5;			
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try {
			System.out.println("Enter the Student Name:");
			String name=s.nextLine();
			System.out.println("Enter the Student regno:");
			int regno=s.nextInt();
			System.out.println("Enter the Subject1 mark:");
			int mark1=s.nextInt();
			System.out.println("Enter the Subject2 mark:");
			int mark2=s.nextInt();
			System.out.println("Enter the Subject3 mark:");
			int mark3=s.nextInt();
			System.out.println("Enter the Subject4 mark:");
			int mark4=s.nextInt();
			System.out.println("Enter the Subject5 mark:");
			int mark5=s.nextInt();
			s.close();
		
			File f1=new File(name+".ser");
			if(f1.exists()==true) {
				System.out.println("File Already Exists...");
			}
			else {
				FileOutputStream f=new FileOutputStream(name+".ser");
				ObjectOutputStream out=new ObjectOutputStream(f);
				Student student=new Student(regno, name, mark1, mark2, mark3, mark4, mark5);
				out.writeObject(student);
				System.out.println("File Saved...");
				out.close();
			}	
		}
		catch(Exception e) {
			System.out.println("File not Saved");
			
		}
	}
}

// Output:
// Enter the Student Name:
// John
// Enter the Student regno:
// 101
// Enter the Subject1 mark:
// 90
// Enter the Subject2 mark:
// 80
// Enter the Subject3 mark:
// 70
// Enter the Subject4 mark:
// 60
// Enter the Subject5 mark:
// 50
// File Saved...


