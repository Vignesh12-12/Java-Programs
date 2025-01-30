// Create a base class called Employee that has common attributes such as
// name, employeeId, and salary, and methods to display these details. Then,
// create two derived classes called Manager and Engineer. The Manager class
// should have an additional attribute department, and the Engineer class should
// have an additional attribute specialization. Each derived class should have its
// own method to display the additional attribute along with the common details
// from the Employee class. Demonstrate how to create instances of Manager
// and Engineer, and display their information.
// Solution Outline
// 1. Parent Class (Employee): Define the common attributes and methods.
// 2. Child Class (Manager): Inherit from Employee and add the department
// attribute.
// program:

class Employeee{
	String name;
	int employeeid,salary;
	
	void Empinfo(String name,int employeeid,int salary) {
		this.name=name;
		this.employeeid=employeeid;
		this.salary=salary;
	}
}
public class Manager extends Employeee {
	String dept;
	void maninfo(String dept) {
		this.dept=dept;
	}
	void printinfo() {
		System.out.println("Name :"+name);
		System.out.println("Employee id :"+employeeid);
		System.out.println("salary :"+salary);
		System.out.println("Department :"+dept);
	}
	public static void main(String[] args) {
		Manager man=new Manager();
		man.Empinfo("Jack", 112,30000);
		man.maninfo("HR");
		man.printinfo();
	}
}

//output:
//Name :Jack
//Employee id :112
//salary :30000
//Department :HR

