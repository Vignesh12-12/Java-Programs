// Create a class named Banking. It should contain methods for withdrawal
// and deposit. Account balance should be initialized in a constructor.
// Program:

public class Banking {
	double balance;
	Banking(double balance) {
		this.balance=balance;
	}
	
	public void Withdraw(int amount) {
		if(amount<balance){
			System.out.println("Withdraw successful");
			balance=balance-amount;
			System.out.println("Available Balance :"+balance);
		}	
		else
			System.out.println("Insufficent balance.");
	}
	
	public void Deposit(int amount) {
		if(amount>=100) {
		System.out.println("Amount deposited successfully");
		balance=balance+amount;
		System.out.println("Available Balance :"+balance);
		}
		else {
			System.out.println("Minimum Amount to deposit:100");
		}
	}

	public static void main(String[] args) {
		Banking b=new Banking(10000);
		b.Withdraw(500);
		b.Deposit(2000);		
	}
}
