package arrays.oneDimenArray;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array");
		int size=sc.nextInt();
		
		int numbers[] = new int[size];
		System.out.println("enter array elements");
		
		for(int i=0;i<size;i++)
		{
			numbers[i]=sc.nextInt();
		}
		
		System.out.println("enter x");
		int x=sc.nextInt();
		
		for(int i=0;i<numbers.length;i++)
		{
			if(numbers[i]==x)
			{
				System.out.println("x found at index: "+i);
			}
			
		}

	}

}
