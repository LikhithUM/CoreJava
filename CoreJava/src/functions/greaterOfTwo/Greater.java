package functions.greaterOfTwo;

import java.util.Scanner;

public class Greater {
	
	public static int getGreater(int a,int b)
	{
		if(a>b)
		{
			return a;
		}
		else
			return b;
	}
	
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter first number");
	int a=sc.nextInt();
	System.out.println("enter second number");
	int b =sc.nextInt();
	
	System.out.println("greater is: "+getGreater(a,b));
}

}
