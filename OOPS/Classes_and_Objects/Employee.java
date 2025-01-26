// 4. Create a class named Employee with public variables ID, name,
// department and salary. Write separate methods to assign the values and to
// print the values.
// Program:

public class Employee {
	
	int id,salary;
	String name,dept;
	public void Empinfo(int id,int salary,String name,String dept) {
		this.id=id;
		this.salary=salary;
		this.name=name;
		this.dept=dept;
	}
	
	public void printinfo() {
		System.out.println("Employee ID:"+id);
		System.out.println("Employee name:"+name);
		System.out.println("Employee dept:"+dept);
		System.out.println("Employee salary:"+salary);
	}
	
	public static void main(String[] args) {
		Employee e=new Employee();
		e.Empinfo(101, 30000,"Jack", "IT");
		e.printinfo();
		
	}
}

// Output:
// Employee ID:101
// Employee name:Jack
// Employee dept:IT
// Employee salary:30000
