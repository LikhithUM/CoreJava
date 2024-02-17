package functions.averageOf3Numbers;
import java.util.Scanner;
public class Calculation {

	public static void average(int a, int b,int c)
	{
		int avg=(a+b+c)/3;
		System.out.println("average is : "+avg);
	}
	
public static void main(String args[])
{
	Scanner sc =new Scanner(System.in);
	System.out.println("enter number");
	int a=sc.nextInt();
	System.out.println("enter number");
	int b=sc.nextInt();
	System.out.println("enter number");
	int c=sc.nextInt();
	
	average(a,b,c);
}
}
