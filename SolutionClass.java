package Trashs;

import java.util.Scanner;

public class SolutionClass {
	static int a,b,c;
	 static int commonDigits(int a ,int b,int c) {
			int aF[] = new int[10];
			 int bF[] = new int[10];
			 int cF[] = new int[10];
			 while(a!=0 && b!=0 && c!=0) {
			  if(a!=0) {
			   aF[a%10]++;
			   a/=10;
			  }
			  if(b!=0) {
			   bF[b%10]++;
			   b/=10;
			  }
			  if(c!=0) {
			   cF[c%10]++;
			   c/=10;
			  }
			 }
			 for(int i=0;i<10;i++) {
			  if(aF[i]>=1 && bF[i]>=1 && cF[i]>=1) 
				  return i;
			 }
			 return -1;
	}
	public static void main(String[] args) throws java.lang.Exception {
		Scanner sc=new Scanner(System.in);
		int result = commonDigits(a, b, c);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
	}
	
 
}

