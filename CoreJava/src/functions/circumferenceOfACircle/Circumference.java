package functions.circumferenceOfACircle;

import java.util.Scanner;

public class Circumference {
	
	public static double circum(double r)
	{
		return 2*3.14*r;
	}
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter radius");
	double r=sc.nextDouble();
	
	System.out.println("circumference of the circle is:"+circum(r));
}
}
