package arrays.MaxMinValue;

import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int size =sc.nextInt();
		
		int numbers[]=new int[size];
		System.out.println("enter elements");
		
		for(int i=0; i<size; i++)
		{
			numbers[i]=sc.nextInt();
		}
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int i=0; i<numbers.length; i++)
		{
			if(numbers[i]>max)
			{
				max = numbers[i];
			}
			if(numbers[i]<min)
			{
				min = numbers[i];
			}
		}
		
		System.out.println("largest number: "+max);
		System.out.println("smallest number: "+min);
	}
}
