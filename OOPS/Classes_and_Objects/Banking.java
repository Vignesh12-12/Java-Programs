// Create a class named Banking. It should contain methods for withdraw
// and deposit. Account balance should be defined as public variable and
// used in both methods.
// Program:

public class Banking {
	double balance;
	public void setbalance(double balance) {
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
		Banking b=new Banking();
		b.setbalance(10000);
		b.Withdraw(500);
		b.Deposit(2000);		
	}
}

// Output:
// Withdraw successful
// Available Balance :9500.0
// Amount deposited successfully
// Available Balance :11500.0
