// Get two integers from the user and perform division operation. Handle
// necessary Exceptions.
// Program:

import java.util.Scanner;
public class DivisionException {
	public static void main(String[] args) {
		try {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the 1st number:");
		int num1=s.nextInt();
		System.out.println("Enter the 2nd number:");
		int num2=s.nextInt();
		int division=num1/num2;
		System.out.println("Division:"+division);
		s.close();
	    }
		catch(ArithmeticException e) {
			System.out.println("Can't divide number by zero");
		}
	}
	}

// Output
// Enter the 1st number:
// 10
// Enter the 2nd number:
// 0
// Can't divide number by zero

