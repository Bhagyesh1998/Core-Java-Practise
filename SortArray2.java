package Trashs;

import java.util.Scanner;

public class SortArray2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int len = sc.nextInt();
		int[] arr = new int[len];
		for (int i = 0; i <= arr.length-1; i++)
		{
			System.out.println("VAlues at: "+i);
			arr[i] = sc.nextInt();
		}
		System.out.println("Array before sorting");
		for (int i = 0; i <= arr.length-1; i++) 
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int help;
		for (int i = 0; i <= arr.length-2; i++) 
		{
			for (int j = 0; j <= arr.length-2-i; j++) 
			{
				if(arr[j] > arr[j+1]) 
				{
					help = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = help;
				}
			}
		}
		System.out.println("Array after sorting");
		for (int i = 0; i <= arr.length-1; i++) 
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		System.out.println("Enter the key value");
		int key = sc.nextInt();
		int low = 0;
		int high = arr.length-1;
		int mid;
		
		while (low<=high) 
		{
			mid = (low + high)/2;
			
			if(key == arr[mid]) 
			{
				System.out.println("Key found at: "+mid);
				System.exit(0);
				
			}
			else if(key > mid)
			{
				low = mid+1;
			}
			else 
			{
				high = mid-1;
			}
			
		}
		System.out.println("Key not found");

	}

}
