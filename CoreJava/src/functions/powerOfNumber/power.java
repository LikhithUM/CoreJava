package functions.powerOfNumber;

import java.util.Scanner;

public class power {

	public static void calc(int x,int n)
	{
		int p=1;
		for(int i=0; i<n; i++)
		{
			p*=x;
		}
		System.out.println("answer: "+p);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int x=sc.nextInt();
		System.out.println("enter power");
		int n=sc.nextInt();
		
		calc(x,n);
	}

}
