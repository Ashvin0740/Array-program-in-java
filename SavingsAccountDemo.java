import java.util.Scanner;
class SavingsAccount
{
	private double balance; // instance variable
	static private double interest=3.5;

// constructor overloading
	public SavingsAccount()		// default constructor
	{	
		balance = 1000;	
	}

	public SavingsAccount(double initialBalance) // parameterized constructor
	{	
		balance = initialBalance;	
	}

	public void deposit(double amount)	// method
	{	
		balance = balance + amount;	
	}

	public void withdraw(double amount)
	{	
		balance = balance - amount;	
	}
	public void addInterest(short y)
	{	
		balance = balance + ((balance*interest*y) / 100);  
	}

	public double getBalance()
	{	
		return balance;	
	}
}

class SavingsAccountDemo
{
	public static void main(String[] args) 
// static because we don't need to create an object of main method
// public because JVM is in a different package
	{
		Scanner scan = new Scanner(System.in); 

		SavingsAccount Ashvin = new SavingsAccount();
		
// [ The new keyword is used to allocate memory at runtime ]
		System.out.print("How much Ashvin wants to deposit? ");
		double da = scan.nextDouble();
		
		Ashvin.deposit(da);
		System.out.println("Now balance in Ashvin's account "+Ashvin.getBalance());
		
		System.out.print("How much Ashvin wants to withdraw? ");
		double wa = scan.nextDouble();
		Ashvin.withdraw(wa);
		System.out.println("Now balance in Ashvin's account "+Ashvin.getBalance());
		
		System.out.print("How many years since Ashvin has opened account? ");
		short year=scan.nextShort();
		Ashvin.addInterest(year);

		System.out.println("Now balance in Ashvin's account "+Ashvin.getBalance());
	}
}