// 1. Create a class called LoginManager with two overloaded methods for
// handling user login:
//     1. login(String email, String password) - Authenticates a user with their
//     email and password.
//     2. login(Long mobileNumber, String password) - Authenticates a user
//     with their mobile number and password.
// Each method should handle the login process according to the provided parameters and 
// print appropriate messages based on the login success or failure.Implement mock authentication logic 
// for demonstration purposes. Demonstrate how to create an instance of LoginManager and use these methods to 
// simulate different login scenarios.
// Solution Outline
//     1. Class (LoginManager): Define the overloaded methods login.
//     2. Method Implementations:
//     ○ login(String email, String password): Authentication with email
//     and password.
//     ○ login(String mobileNumber, String password): Authentication
//     with mobile number and password.
//     3. Instances: Create an instance of LoginManager and call the overloaded
//     methods with appropriate arguments to demonstrate different login
//     scenarios.
// program:

import java.util.Scanner;
public class LoginManager {
void Login(String email,String password) {
if(email.equalsIgnoreCase("hi@gmail.com") && password.equals("Hello@123") )
			System.out.println("Login Success");
		else
			System.out.println("Invalid Email or Password");
	}
void Login(long mobile_number,String password) {
	if(mobile_number==1234567890 && password.equals("Hello@123"))
		System.out.println("Login Success");
	else
		System.out.println("Invalid Mobile Number or Password");
	}
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
LoginManager lm=new LoginManager();
System.out.println("------Login------");
System.out.println("Enter the login method\n1.Using Email\n2.Using mobile number");
int choice=s.nextInt();
s.nextLine();
if(choice==1) {
	System.out.println("Enter the Email:");
	String email=s.next();
	System.out.println("Enter the Password:");
	String password=s.next();
	lm.Login(email, password);				
}
else if(choice==2) {
	System.out.println("Enter the mobile number:");
	long mn=s.nextInt();
	System.out.println("Enter the Password:");
	String password=s.next();
	lm.Login(mn, password);
}
	else {
		System.out.println("Invalid choice");
	}
	s.close();
	}
}

// Output
// ------Login------
// Enter the login method
// 1.Using Email
// 2.Using mobile number
// 1
// Enter the Email:
//hi@gmail.com
// Enter the Password:
//Hello@123
// Login Success
// ------Login------
// Enter the login method
// 1.Using Email
// 2.Using mobile number
// 2
// Enter the mobile number:
// 1234567890
// Enter the Password:
// Hello@123
// Login Success
