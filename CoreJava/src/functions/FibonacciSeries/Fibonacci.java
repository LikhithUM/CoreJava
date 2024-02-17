package functions.FibonacciSeries;

import java.util.Scanner;

public class Fibonacci {
	
	public static void calc(int n)
	{
		int a=0, b=1;
		System.out.print(a+", "+b);
		
		for(int i=2; i<n; i++)
		{
			int temp=a+b;
			System.out.print(", "+temp);
			a=b;
			b=temp;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n number");
		int n=sc.nextInt();
		
		calc(n);

	}

}
