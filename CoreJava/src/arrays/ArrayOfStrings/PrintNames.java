package arrays.ArrayOfStrings;

import java.util.Scanner;

public class PrintNames {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter size of array");
		int size=sc.nextInt();
		
		String names[]=new String[size];
		System.out.println("enter elements");
		
		for(int i=0; i<names.length;i++)
		{
			names[i]=sc.next();
		}
		
		for(int i=0;i<names.length;i++)
		{
			System.out.println("name "+(i+1)+" is : "+names[i]);
		}
		

	}

}
