package bankApplication2;
import java.util.*;
class testAccount{

	private int acc_no;
	private String name;
	private float balance;
	
	public testAccount(int acc_no, String name) {
		this.acc_no = acc_no;
		this.name = name;
		this.balance =0.0f;
	}
	
	public void deposit(float amt)
	{
		balance+=amt;
		System.out.println(amt+" deposited successfully");
		System.out.println();
	}
	
	public void withdraw(float amt)
	{
		if(balance>=amt)
		{
			balance-=amt;
			System.out.println(amt+" withdrawn successfully");
			System.out.println();
		}
		else
		{
			System.out.println("insufficient balance");
		}
	}
	public float checkBalance()
	{
		return balance;
	}
	public void display()
	{
		System.out.println(acc_no+" name: "+name+" balance: "+balance);
	}
	
}
public class BankAccount{		
		public static void main (String args[])
		{
			Scanner sc = new Scanner(System.in);
			
			testAccount a1 = new testAccount(12345,"likhith");
			int input=0;
			while(input<6 && input>=0)
			{
				System.out.println("welcome to bank");
				System.out.println("choose your option");
				System.out.println("1.create account");
				System.out.println("2.check balance");
				System.out.println("3.deposit");
				System.out.println("4.withdraw");
				System.out.println("5.display bank details");
				input=sc.nextInt();
				
				switch(input) 
				{
				case 1:
					a1.display();
				case 2:
					System.out.println("balance is: "+a1.checkBalance()); 
					System.out.println();
					break;
					
				case 3:
					System.out.println("enter the deposit amount: ");
					float damt=sc.nextFloat();
					a1.deposit(damt);
					break;
					
				case 4:
					System.out.println("enter the withdrawl amount");
					float wamt=sc.nextFloat();
					a1.withdraw(wamt);
					//input=sc.nextInt();
					break;
		
				case 5:
					a1.display();
					break;
				
				 default:
	                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
	                    input=sc.nextInt();
			}
		}
			
			
		}
	
}
	
	
