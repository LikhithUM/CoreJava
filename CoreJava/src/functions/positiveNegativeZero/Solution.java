package functions.positiveNegativeZero;

import java.util.Scanner;

public class Solution {

	public static void calc()
	{
		int positive=0,negative=0,zeros=0;
		
		System.out.println("press 1 to add number, 2 to exit");
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		while(input==1)
		{
			System.out.println("enter number");
			int num=sc.nextInt();
			
			if(num>0)
			{
				positive++;
			}
			else if(num<0)
			{
				negative++;
			}
			else
				zeros++;
			System.out.println("press 1 to add number, 2 to exit");
			input=sc.nextInt();
		}
		System.out.println("positive: "+positive);
		System.out.println("negative: "+negative);
		System.out.println("zeros: "+zeros);
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calc();
				
	}

}
