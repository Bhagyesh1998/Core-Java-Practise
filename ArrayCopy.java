package Trashs;

import java.util.Scanner;

public class ArrayCopy {

//   task == 09
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Array Size: ");
//		int len = sc.nextInt();
//		int[] arr1 = new int[len];
//		System.out.println("Enter array contents");
//		for (int i = 0; i <= arr1.length-1; i++) 
//		{
//			System.out.println("Array Box :"+i);
//			arr1[i]=sc.nextInt();
//		}
//		// Copying array
//		
//		int[] arr2 = new int[arr1.length];
//		
//		// copying array contents;
//		
//		for (int i = 0; i <= arr1.length-1; i++) 
//		{	
//			// here i is the variable we only assigning to the arr1 and arr2
//			arr2[i] = arr1[i];
//		}
//		
//		System.out.println("Array Contents are");
//		for (int i = 0; i <= arr1.length-1; i++) 
//		{
//			System.out.print(arr1[i]+" ");
//		}		
//		System.out.println();
//		for (int i = 0; i <= arr2.length-1; i++) 
//		{
//			System.out.print(arr2[i]+" ");
//		}
		

		
//		Task == 10
		
//		System.out.println("Array Size: ");
//		int len = sc.nextInt();
//		int[] arr1 = new int[len];
//		System.out.println("Enter array contents");
//		for (int i = 0; i <= arr1.length-1; i++) 
//		{
//			System.out.println("Array Box :"+i);
//			arr1[i]=sc.nextInt();
//		}
//		// Copying array
//		
//		int[] arr2 = new int[arr1.length];
//		
//		// copying array contents;
//		// here first we have to declare the j because we have to reverse the array
//		int j = arr2.length-1;
//		for (int i = 0; i <= arr1.length-1; i++) 
//		{	
//			// here i is the variable we only assigning to the arr1 and arr2
//			arr2[j] = arr1[i];
//			j--;
//		}
//		
//		System.out.println("Array Contents are");
//		for (int i = 0; i <= arr1.length-1; i++) 
//		{
//			System.out.print(arr1[i]+" ");
//		}		
//		System.out.println();
//		for (int i = 0; i <= arr2.length-1; i++) 
//		{
//			System.out.print(arr2[i]+" ");
//		}
		
		
		
//		Task == 11
		
		
//		System.out.println("Enter the row contents");
//		int row = sc.nextInt();
//		System.out.println("Enter the column contents");
//		int col = sc.nextInt();
//		int[][] arr = new int[row][col];
//		
//		for (int i = 0; i <= arr.length-1; i++) 
//		{
//			for (int j = 0; j <= arr[i].length-1; j++) 
//			{
//				System.out.println("Row Contents are: "+i+"Column contents are: "+j);
//				arr[i][j]=sc.nextInt();
//			}
//		}
//		int[][] arr1 = new int[row][col];
//		
//		for (int i = 0; i <= arr1.length-1; i++) 
//		{
//			for(int j=0; j<= row-1; j++) 
//			{
//				arr1[i][j] = arr[i][j];
//			}
//			
//		}
//		System.out.println("Array contents are: ");
//		for (int i = 0; i <= arr.length-1; i++) 
//		{
//			for (int j = 0; j <= arr[i].length-1; j++) 
//			{
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//							
//		}
//		System.out.println();
//		System.out.println("Copied contents are");
//		for (int i = 0; i <= arr1.length-1; i++) 
//		{
//			for (int j = 0; j <= arr1[i].length-1; j++)
//			{
//				System.out.print(arr1[i][j]+" ");
//			}
//			System.out.println();
//				
//		}
		
		
//		Task == 11	
		
		System.out.println("Enter the Array 1: ");
		int arr1 = sc.nextInt();
		int temp;
		int[] arr = new int[arr1];
		for (int i = 0; i <= arr.length-1; i++) 
		{
			System.out.println("Value: "+i);
			arr[i]=sc.nextInt();
		}
		int[] arr5 =new int[arr.length];
		for (int i = 0; i <= arr.length-1; i++) 
		{
			arr5[i]=arr[i];
		}
		System.out.println();
		System.out.println("1st Array Contents are: ");
		for (int i = 0; i <= arr.length-1; i++) 
		{
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
		System.out.println("2nd Array Contents are: ");
		for (int i = 0; i <= arr5.length-1; i++) 
		{
			System.out.print(arr5[i]+" ");
		}
		System.out.println();
		System.out.println("Adding of 1st array and 2nd array: ");
		for (int i = 0; i <= arr.length-1; i++) 
		{
			System.out.print(arr5[i]+arr[i]+" ");
		}
		System.out.println();
		int[] arr7 = new int[arr.length];
		int j = arr7.length-1;
		System.out.println("revrese array");
		for (int i = 0; i <= arr.length-1; i++) 
		{
			arr7[j] = arr[i]+arr5[i];
			j--;
		}
		for (int i = 0; i <= arr7.length; i++) 
		{
			System.out.println(arr7[j]);
		}
	}
}
