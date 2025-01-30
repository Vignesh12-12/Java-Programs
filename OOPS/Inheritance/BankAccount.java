// 1. Create a base class called BankAccount that includes common attributes like accountNumber, accountHolderName, 
// and balance, as well as a method to display account details. Then, create two derived classes called SavingsAccount 
// and FixedDepositAccount. The SavingsAccount class should have additional methods for depositing and withdrawing money, 
// and an attribute interestRate. The FixedDepositAccount class should have an additional attribute maturityPeriod, and 
// should not allow regular deposit and withdrawal operations. Each derived class should have its own method to display 
// the additional attribute along with the common details from the BankAccount class. Demonstrate how to create instances
// of SavingsAccount and FixedDepositAccount, and display their information.
// Solution Outline
//     1. Parent Class (BankAccount): Define the common attributes and methods.
//     2. Child Class (SavingsAccount): Inherit from BankAccount, add the
//     interestRate attribute, and implement deposit and withdraw methods.
//     3. Child Class (FixedDepositAccount): Inherit from BankAccount and add the
//     maturityPeriod attribute.
//     4. Instances: Create instances of SavingsAccount and FixedDepositAccount, and
//     use methods to display their information.
// program:

class BankAccount{
	int accountnumber;
	String Name;
	double balance;
	
	public BankAccount(int accountnumber,String Name,double balance) {
		this.accountnumber=accountnumber;
		this.Name=Name;
		this.balance=balance;
	}
	
	public void Accountdetails() {
		System.out.println("AccountNumber:"+accountnumber);
		System.out.println("Account Holder name:"+Name);
		System.out.println("Account Balance:"+balance);
	}
}

class SavingsAccount extends BankAccount{
	double interestrate;
	
	public SavingsAccount(int accountnumber,String Name,double balance,double interestrate){
		super(accountnumber,Name,balance);
		this.interestrate=interestrate;
	}
	
	public void Deposit(double amount){
		if (amount>=100) {
			balance+=amount;
			System.out.println(amount+" Deposited \nAvailable Balance:"+balance);
		}
		else
			System.out.println("Minimum Required Amount to Deposit 100");
	}
	
	public void Withdraw(double amount) {
		if(amount<balance && amount>=100) {
			balance-=amount;
			System.out.println(amount+" Withdrawn.\nAvailable Balance"+balance);
			
		}
		else  {
			System.out.println("Invalid amount or Insufficient Balance");
		}
	}
	
	public void displaySavingsAccount() {
		System.out.println("AccountNumber:"+accountnumber);
		System.out.println("Account Holder name:"+Name);
		System.out.println("Account Balance:"+balance);
		System.out.println("Interest rate:"+interestrate+"%");
	}
	
}
public class FixedDepositAccount extends BankAccount {
	int maturityperiod;
	
	public FixedDepositAccount(int accountnumber,String Name,double balance,int maturityperiod) {
		super(accountnumber,Name,balance);
		this.maturityperiod=maturityperiod;
	}
	
	public void displayFixedDepositAccount() {
		System.out.println("AccountNumber:"+accountnumber);
		System.out.println("Account Holder name:"+Name);
		System.out.println("Account Balance:"+balance);
		System.out.println("Maturity Period:"+maturityperiod+" years");
	}
	public static void main(String[] args) {
		SavingsAccount sa=new SavingsAccount(10001,"Jack",50000,5);
		System.out.println("-------Savings Account Details------");
		sa.Deposit(1000);
		sa.Withdraw(10000);
		sa.displaySavingsAccount();
		
		FixedDepositAccount fd=new FixedDepositAccount(10002,"rose",500000,10);
		System.out.println("-------Fixed Deposit Account------");
		fd.displayFixedDepositAccount();
	}

}

//output:
//-------Savings Account Details------
//1000 Deposited
//Available Balance:51000.0
//10000 Withdrawn.
//Available Balance41000.0
//AccountNumber:10001
//Account Holder name:Jack
//Account Balance:41000.0
//Interest rate:5.0%
//-------Fixed Deposit Account------
//AccountNumber:10002
//Account Holder name:rose
//Account Balance:500000.0
//Maturity Period:10 years
