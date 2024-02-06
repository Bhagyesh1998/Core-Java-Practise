package Trashs;

import java.util.Scanner;

public class SortArray5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int len = sc.nextInt();
		int[] arr = new int[len];
		for (int i = 0; i <= arr.length-1; i++) 
		{
			System.out.println("Value is: "+i);
			arr[i]=sc.nextInt();
		}
		System.out.println("Array sorting");
		for (int i = 0; i <= arr.length-1; i++) 
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		int min = arr[0];
		int pos = 0;
		for (int i = 0; i <= arr.length-1; i++)
		{
			if(arr[i] < arr[0]) 
			{
				min = arr[i];
				pos = i;
			}
		}
		for (int i = 1; i <= arr.length; i++)
		{
			System.out.println("Minimum value is: "+min+" "+"Position: "+pos);
			break;
		}
		
//		int help;
//		for (int i = 0; i <= arr.length-2; i++) 
//		{
//			for (int j = 0; j <= arr.length-2-i; j++)
//			{
//				if(arr[j]> arr[j+1]) 
//				{
//					help = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = help;
//				}
//			}
//		}
//		System.out.println("Array After sorting");
//		for (int i = 0; i <= arr.length-1; i++)
//		{
//			System.out.print(arr[i]+" ");
//		}
//		System.out.println();
//		
//		int min = arr[0];
//		System.out.println(min);
	
	}

}
