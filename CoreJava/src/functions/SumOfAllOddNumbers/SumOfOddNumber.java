package functions.SumOfAllOddNumbers;
import java.util.Scanner;
public class SumOfOddNumber {

	public static void printSum(int n)
	{
		int sum=0;
		for(int i=0; i<=n; i++)
		{
			if(i%2!=0)
			{
				sum+=i;
			}
		}
		System.out.println("sum is: "+sum);
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n");
		int n=sc.nextInt();
		printSum(n);
	}
}
