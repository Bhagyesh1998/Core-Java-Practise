package Trashs;

import java.util.Scanner;

public class Arr4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the rows: ");
//		int row =sc.nextInt();
//		System.out.println("Enter the Coloums: ");
//		int col =sc.nextInt();
//		int arr[][] = new int[row][col];
//		for (int i = 0; i <= arr.length-1; i++) 
//		{
//			for (int j = 0; j <= arr[i].length-1; j++) 
//			{
//				System.out.println("Rows are: "+i+" "+"Coloums are: "+j);
//				arr[i][j]=sc.nextInt();
//			}
//		}
//		System.out.println("Arrays indexes are: ");
//		for (int i = 0; i <= arr.length-1; i++) 
//		{
//			for (int j = 0; j <= arr[i].length-1; j++) 
//			{
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
		
//     jagged 2d array take the input from the user 
		
//		System.out.println("Enter Rows: ");
//		int row =sc.nextInt();
//		int arr[][] = new int[row][];
//		for (int i = 0; i <= arr.length-1; i++) 
//		{
//			System.out.println("Enter Coulumn Length of row: "+i);
//			int col = sc.nextInt();
//			arr[i]=new int[col];
//			// arr[i]=new int[sc.nextInt()]; we can write like this also
//		}
//		for (int i = 0; i <= arr.length-1; i++) 
//		{
//			for (int j = 0; j <= arr[i].length-1; j++) 
//			{
//				System.out.println("No Rows is: "+i+" "+"no of columns: "+j);
//				arr[i][j]=sc.nextInt();
//			}
//		}
//		System.out.println("Print Array Contents");
//		for (int i = 0; i <= arr.length-1; i++) 
//		{
//			for (int j = 0; j <= arr[i].length-1; j++) 
//			{
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		System.out.println("Enter the fd length for 3d jagged array");
		int fd = sc.nextInt();
		int[][][] arr = new int[fd][][];
		for (int i = 0; i <= arr.length-1; i++) 
		{
			System.out.println("Enter the 2nd dimension for 1st dimension: "+i);
			int sd = sc.nextInt();
			arr[i]=new int[sd][];
		}
		for (int i = 0; i <= arr.length-1; i++) 
		{
			for (int j = 0; j <= arr[i].length-1; j++) 
			{
				System.out.println("Enter the 3rd dimension: "+i+" "+"for the second Array: "+j);
				int td =sc.nextInt();
				arr[i][j]=new int[td];
			}
		}
		for (int i = 0; i <= arr.length-1; i++) 
			{
				for (int j = 0; j <= arr[i].length-1; j++) 
				{
					for (int k = 0; k <= arr[i][j].length-1; k++) 
					{
						System.out.println("Enter the marks of the students: "+i+"And: "+j+"And: "+k);
						arr[i][j][k]=sc.nextInt();
					}
					
				}
			}
			System.out.println("Print Array Contents");
			for (int i = 0; i <= arr.length-1; i++) 
			{
				for (int j = 0; j <= arr[i].length-1; j++) 
				{
					for (int k = 0; k <= arr[i][j].length-1; k++) 
					{
						System.out.print(arr[i][j][k]+" ");
					}
					System.out.println();
				}
			}
	}
}
