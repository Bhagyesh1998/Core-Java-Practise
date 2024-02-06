package Trashs;

import java.util.Scanner;

public class SortArray4 {

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
		System.out.println("Array Before sorting");
		for (int i = 0; i <= arr.length-1; i++) 
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int help;
		System.out.println("Index no for swapping: 1");
		int i1 =sc.nextInt();
		System.out.println("Index no for swapping: 2");
		int i2 =sc.nextInt();
		
		help = arr[i1];
		arr[i1] = arr[i2];
		arr[i2] = help;
		
		System.out.println("Array After sorting");
		for (int i = 0; i <= arr.length-1; i++) 
		{
			System.out.print(arr[i]+" ");
		}
		
	}

}
