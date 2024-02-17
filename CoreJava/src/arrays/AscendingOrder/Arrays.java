package arrays.AscendingOrder;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int size = sc.nextInt();
		
		int numbers[] = new int[size]; 
		
		System.out.println("enter elements");
		
		for(int i=0; i<size; i++)
		{
			numbers[i]=sc.nextInt();
		}
		
		boolean a=true;

		for(int i=0; i<numbers.length-1; i++)
		{
			if(numbers[i]>numbers[i+1])
			{
				a=false;
			}
		}
		if(a)
		{
			System.out.println("sorted");
		}
		else {
			System.out.println("not sorted");
		}
	}

}
