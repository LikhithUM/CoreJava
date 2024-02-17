package functions.elegibleToVote;

import java.util.Scanner;

public class Adult {

	public static void isElegible(int age)
	{
		if(age>=18)
		{
			System.out.println("elegible");
		}
		else
			System.out.println("not Elegible");
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter age");
		int age=sc.nextInt();
		
		isElegible(age);
	}

}
