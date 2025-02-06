// 2. Read age from user and check if age eligible to vote or not. Create and
// throw custom exceptions, if age is given as negative.
// Program:
import java.util.Scanner;
public class NegativeNumber extends Exception {
	NegativeNumber(String m){
		super(m);
	}
	public static void main(String[] args) throws NegativeNumber {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Age");
		try {
		int age=s.nextInt();
		if(age<0)
			throw new NegativeNumber("Invalid Age:Age should not be negative");		
		else if(age>=18)
			System.out.println("Eligible for Voting");
		else
			System.out.println("Not Eligible for Voting");	
		}
		catch(NegativeNumber e) {
			System.out.println(e.getMessage());
		}
		finally {
			s.close();
		}
	}
}

// Output
// Enter the Age
// 25
// Eligible for Voting
// -----------------------------------------
// Enter the Age
// -25
// Invalid Age:Age should not be negative
// -----------------------------------------
// Enter the Age
// 15
// Not Eligible for Voting
