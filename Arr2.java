package Trashs;

import java.util.Scanner;

// It is Two (2) dimensional arrays

public class Arr2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int arr[][] = new int[4][4];
//		for (int i = 0; i <= arr.length-1; i++) 
//		{
//			for (int j = 0; j <= arr[i].length-1; j++) 
//			{
//				System.out.println("Enter the marks of class"+i+"And Students "+j);
//				arr[i][j]=sc.nextInt();
//			}
//			
//		}
//		System.out.println("Array Contents are");
//		for (int i = 0; i <= arr.length-1; i++) 
//		{
//			for (int j = 0; j <= arr[i].length-1; j++) 
//			{
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		
//                           Assignment
		
//		String arr[][] = new String[5][4];
//		for (int i = 0; i <= arr.length-1; i++) 
//			{
//				for (int j = 0; j <= arr[i].length-1; j++) 
//				{
//					System.out.println("Branch"+i+"Customer"+j);
//					arr[i][j]=sc.next();
//				}
//				
//			}
//			System.out.println("Array Contents are");
//			for (int i = 0; i <= arr.length-1; i++) 
//			{
//				for (int j = 0; j <= arr[i].length-1; j++) 
//				{
//					System.out.print(arr[i][j]+" ");
//				}
//				System.out.println();
//			}
		
		
//		                 Assignment-2
		
		
//				double arr[][] = new double[4][5];
//				for (int i = 0; i <= arr.length-1; i++) 
//				{
//					for (int j = 0; j <= arr[i].length-1; j++) 
//					{
//						System.out.println("No of Games: "+i+"No of Players Hieght: "+j);
//						arr[i][j]=sc.nextDouble();
//					}
//				}
//				
//				System.out.println("Collects Are Arrays");
//				for (int i = 0; i <= arr.length-1; i++) 
//				{
//					for (int j = 0; j < arr[i].length-1; j++) 
//					{
//						System.out.print(arr[i][j]+" ");
//					}
//					System.out.println();
//				}
		
//		                       Assignment - 3 Task - 4
		   
//		        int arr[][] = new int[4][];
//		        // handling of an 2nd dimensional array where a[0] is "I" and new in[J] is the "J"
//		        arr[0] = new int[3];
//		        arr[1] = new int[5];
//		        arr[2] = new int[2];
//		        arr[3] = new int[4];
//		        
//		        for (int i = 0; i <= arr.length-1; i++) 
//		        {
//					for (int j = 0; j <= arr[i].length-1; j++) 
//					{
//						System.out.println("No Of classes: "+i+" "+"No of Student Marks: "+j);
//						arr[i][j]=sc.nextInt();
//					}
//				}
//		       
//		        System.out.println("List Of Arrays Stored");
//		        for (int i = 0; i <= arr.length-1; i++) 
//		        {
//					for (int j = 0; j <= arr[i].length-1; j++) 
//					{
//						System.out.print(arr[i][j]+" ");
//					}
//					System.out.println();
//				}
		
//                              Task - 5
		
//				char arr[][] = new char[3][];
//				arr[0]=new char[3];
//				arr[1]=new char[2];
//				arr[2]=new char[5];
//				for (int i = 0; i <= arr.length-1; i++) 
//				{
//					for (int j = 0; j <= arr[i].length-1; j++) 
//					{
//						System.out.println("Teacher: "+i+" "+"Subjects: "+j);
//						arr[i][j]=sc.next().charAt(0);
//					}
//				}
//				System.out.println("Array Contents are");
//		        for (int i = 0; i <= arr.length-1; i++) 
//		        {
//		        	for (int j = 0; j <= arr[i].length-1; j++) 
//		        	{
//		        		System.out.print(arr[i][j]+" ");
//					}
//		        	System.out.println();
//				}
		
		
//                                Task - 6
		
		
		        String arr[][] = new String[4][];
		        arr[0] = new String[2];
		        arr[1] = new String[3];
		        arr[2] = new String[1];
		        arr[3] = new String[4];
		        
		        for (int i = 0; i <= arr.length-1; i++) 
		        {
					for (int j = 0; j <= arr[i].length-1; j++) 
					{
						System.out.println("Branches are: "+i+" "+"Customer Name: "+j);
						arr[i][j]=sc.next();
					}
				}
		        System.out.println("Array indexes are: ");
		        for (int i = 0; i <= arr.length-1; i++) 
		        {
		        	for (int j = 0; j <= arr[i].length-1; j++) 
		        	{
		        		System.out.print(arr[i][j]+" ");
					}
		        	System.out.println();
				}
		        
		sc.close();        
	}
}
