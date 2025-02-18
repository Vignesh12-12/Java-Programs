// 1. Download and install thin driver class.
// 2. Create a Java program to establish connection with MySQL database.
// 3. Create a table Studentdata with id,name, department and Yop.
// 4. Create a Java program to read Student information as input and insert into
// MySQL table.
// Program:
package jdbc;
import java.util.Scanner;
import java.sql.*;
public class Student {
	int id,Yop;
	String Name,Dept;
	Scanner sc= new Scanner(System.in);
	void Add()
	{
	try
	{
	System.out.println("Enter the Student ID : ");
	id = sc.nextInt();
	System.out.println("Enter the Student Yop : ");
	Yop = sc.nextInt();
	System.out.println("Enter the Student Name : ");
	Name = sc.next();
	System.out.println("Enter the Student Dept : ");
	Dept = sc.next();
	Connection con = DriverManager.getConnection
	("jdbc:mysql://localhost/StudentCRUD","root","********");
	PreparedStatement ps = con.prepareStatement
	("insert into Studentdata values(?,?,?,?)");
	ps.setInt(1, id);
	ps.setString(2, Name);
	ps.setString(3, Dept);
	ps.setInt(4, Yop);
	int result = ps.executeUpdate();
	System.out.println((result != 0) ? "Data Saved....":"Data Not Saved....");
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
public static void main(String[] args) {
		Student s= new Student();
		s.Add();
	}
}
// Output:
// Enter the Student ID :
// 1
// Enter the Student Yop :
// 2020
// Enter the Student Name :
// Raja
// Enter the Student Dept :
// CSE
// Data Saved....

//mysql database
//mysql> create database StudentCRUD;
//Query OK, 1 row affected (0.00 sec)
//
//mysql> use StudentCRUD;
//Database changed
//mysql> create table Studentdata(id int,Name varchar(20),Dept varchar(20),Yop int);
//Query OK, 0 rows affected (0.02 sec)

//select * from Studentdata;
//+------+-------+------+------
//| id   | Name  | Dept | Yop  |
//+------+-------+------+------
//|    1 | Raja  | CSE  | 2020 |
//+------+-------+------+------
//1 row in set (0.00 sec)

