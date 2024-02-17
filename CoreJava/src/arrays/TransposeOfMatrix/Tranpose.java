package arrays.TransposeOfMatrix;

import java.util.Scanner;

public class Tranpose {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter no of rows");
		int n=sc.nextInt();
		System.out.println("enter no of columns");
		int m=sc.nextInt();
		
		int matrix[][]=new int[n][m];
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				matrix[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("transpose of matrix is: ");
		
		for(int j=0; j<m; j++)
		{
			for(int i=0; i<n;i++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}

	}

}
