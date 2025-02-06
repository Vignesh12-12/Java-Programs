// Create a Java program that demonstrates exception handling using
// custom exceptions. The program should:
// 1. Define a custom exception called InsufficientFundsException.
// 2. Implement a class called BankAccount with a method
// withdraw(double amount) that throws
// InsufficientFundsException if the withdrawal amount is greater
// than the current balance.
// 3. Handle the custom exception in the main method and print an
// appropriate message.
// 4. Ensure that a message is printed indicating that the transaction
// attempt is complete, regardless of whether an exception was
// thrown.
// Program:

import java.util.Scanner;
class InsufficientFundsException extends Exception{
	public InsufficientFundsException(String message) {
		super(message);
	}
}
public class BankAccount {
	double Balance;
	public BankAccount(double balance) {
		this.Balance=balance;
	}
	private void withdraw(double amount) throws InsufficientFundsException {
		if(amount>Balance) {
			throw new InsufficientFundsException("Insufficent Balance");
		}
		else {
			Balance=Balance-amount;
			System.out.println("Withdraw Succesful");
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the balance:");
		double balance=s.nextDouble();
		BankAccount b=new BankAccount(balance);
		
		System.out.println("Enter the amount to withdraw:");
		double amount=s.nextDouble();
		
		try {
			b.withdraw(amount);
		}
		catch(InsufficientFundsException e) {
			System.out.println(e.getMessage());
		}
		finally {
			s.close();
		}
	}
}
// Output
// Enter the balance:
// 1000
// Enter the amount to withdraw:
// 500
// Withdraw Succesful
// -----------------------------------------
// Enter the balance:
// 1000
// Enter the amount to withdraw:
// 1500
// Insufficent Balance
// -----------------------------------------


