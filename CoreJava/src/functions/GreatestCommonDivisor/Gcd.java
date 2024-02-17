package functions.GreatestCommonDivisor;

import java.util.Scanner;

public class Gcd {
	
	public static void calc(int n1,int n2 )
	{
		while(n1!=n2)
		{
			if(n1>n2)
			{
				n1=n1-n2;
			}
			else {
				n2=n2-n1;
			}
		}
		System.out.println("GCD is: "+n2);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int n1=sc.nextInt();
		System.out.println("enter second number");
		int n2=sc.nextInt();
		
		calc(n1,n2);
	}

}
