package arrays.SpiralMatrix;

import java.util.Scanner;

public class SpiralOrder {

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
		
		System.out.println("spiral order of matrix is: ");
		
		int top=0;
		int bottom=n-1;
		int left=0;
		int right=m-1;
		
		while(top<=bottom && left<=right)
		{
			for(int i=left; i<=right;i++)
			{
				System.out.print(matrix[top][i]+" ");
			}
			top++;
			
			for(int i=top; i<=bottom;i++)
			{
				System.out.print(matrix[i][right]+" ");
			}
			right--;
			
			for(int i=right; i>=left; i--)
			{
				System.out.print(matrix[bottom][i]+" ");
			}
			bottom--;
			
			for(int i=bottom;i>=top; i--)
			{
				System.out.print(matrix[i][left]+" ");
			}
			left++;
			
		}
	}

}
