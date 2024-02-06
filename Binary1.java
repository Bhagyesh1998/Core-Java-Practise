package Trashs;

import java.util.Scanner;

public class Binary1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int len = sc.nextInt();
		int[] arr = new int[len];
		for (int i = 0; i <= arr.length-1; i++) 
		{
			System.out.println("Value is: "+i);
			arr[i] = sc.nextInt();
		}
		System.out.println("Printing the array");
		for (int i = 0; i <= arr.length-1; i++) 
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		
		System.out.println("Enter the Key");
		int key = sc.nextInt();
		
		int low = 0;
		int high = arr.length-1;
		int mid;
		
		while(low <= high) 
		{
			mid = (low+high)/2;
			if(key == arr[mid]) 
			{
				System.out.println("Value is at Array postion: "+mid);
				System.exit(0);
				
			}
			else if(key > mid) 
			{
				low  = mid+1;
				high = high;
			}
			else 
			{
				high = mid-1;
				low = low;
			}
		}
		System.out.println("Key Not Found");
	}

}
