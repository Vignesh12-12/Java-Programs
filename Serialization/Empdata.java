// 1. Create an employee class with ID, name, designation and salary. It should be serializable.
// 2. Read values from the user and create an employee object.
// 3. Serialize the object and store it in a file named as emp.ser.
// program:

import java.io.*;
import java.util.Scanner;
public class Empdata implements Serializable {
	int Id;
	String Name,Designation;
	double Salary;
	
	public Empdata(int Id,String Name,String Designation,double Salary) {
		this.Id=Id;
		this.Name=Name;
		this.Designation=Designation;
		this.Salary=Salary;
	}
	
	public static void main(String[] args) {
		try {
		FileOutputStream f=new FileOutputStream("Empdata.ser");
		ObjectOutputStream out=new ObjectOutputStream(f);
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Employee Id:");
		int Id=s.nextInt();
		s.nextLine();
		System.out.println("Enter the Employee Name:");
		String Name=s.nextLine();
		System.out.println("Enter the Employee Designation:");
		String Designation=s.nextLine();
		System.out.println("Enter the Employee Salary:");
		double Salary=s.nextDouble();
		
		Empdata emp=new Empdata(Id, Name, Designation, Salary);
		out.writeObject(emp);
		System.out.println("File Saved");
		f.close();
		s.close();
		}
		catch(Exception e) {
			System.out.println("File not saved...");
		}
	}
}

// Output:
// Enter the Employee Id:
// 101
// Enter the Employee Name:
// John
// Enter the Employee Designation:
// Manager
// Enter the Employee Salary:
// 50000
// File Saved

