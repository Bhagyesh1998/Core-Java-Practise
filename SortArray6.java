package Trashs;
import java.util.*;

public class SortArray6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int len = sc.nextInt();
		int [] arr = new int[len];
		for (int i = 0; i <= arr.length-1; i++)
		{
			System.out.println("Values is: "+i);
			arr[i] = sc.nextInt();
		}
		System.out.println("Array Printed");
		for (int i = 0; i <= arr.length-1; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		int[] arr1 = new int[arr.length];
		for (int i = 0; i <= arr1.length-1; i++)
		{
			arr1[i] = arr[i];
		}
		for (int i = 0; i <= arr1.length-1; i++)
		{
			System.out.print(arr1[i]+" ");
		}
	}

}
