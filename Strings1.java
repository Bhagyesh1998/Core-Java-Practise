package Trashs;


// IMMUTABLE STRINGS EXAMPLES 

public class Strings1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
			//Immutable String
			String s1 = "Bhagyesh";
			System.out.println(s1);
			s1.concat("Ravi");  // concat means add both the strings but here it is not possible
			// Here it will not change Bhagyesh because it is an immutable String
			System.out.println(s1);
			String s2 = s1.concat("Ravi");
			System.out.println(s2);
			
		//	Example 1:
			
			String s3 = "Rama";
			System.out.println(s3);
			String s4 = "Sita";
			System.out.println(s4);
			//here when ever we are combining RAW STRINGS means new string that can be created in constant pool  or else if you combining the 2 strings with 2 reference variables like s1 + s2 it will be created in non constant pool
			String s5 = "Rama"+"Sita";
			System.out.println(s5);
			// Here the s6 string could not be created because in constant pool duplicates are not allowed sot it autometically refers s5 and asign to s6 if the contents are the same
			String s6 = "Rama"+"Sita";
			System.out.println(s6);
			
			if (s5==s6)
			{
				System.out.println("References are equal");
			}
			else 
			{
				System.out.println("References are not equal");
			}
			if (s5.equals(s6)) 
			{
				System.out.println("Strings are equal");
			} 
			else
			{
				System.out.println("Strings are un equal");
			}
			
			
		// Example 2
			
			
			String s7 = "Rama";
			System.out.println(s7);
			String s8 = "Sita";
			System.out.println(s8);
			//here when ever we are combining RAW STRINGS means new string that can be created in constant pool  or else if you combining the 2 strings with 2 reference variables like s1 + s2 it will be created in non constant pool
			String s9 = s7+s8;
			System.out.println(s9);
			// Here the s6 string could not be created because in constant pool duplicates are not allowed sot it autometically refers s5 and asign to s6 if the contents are the same
			String s10 = s7+s8;
			System.out.println(s10);
			
			if (s9==s10)
			{
				System.out.println("Rferences are equal");
			}
			else 
			{
				System.out.println("References are not equal");
			}
			if (s9.equals(s10)) 
			{
				System.out.println("Strings are equal");
			} 
			else
			{
				System.out.println("Strings are un equal");
			}
			
			
			
		// Example - 3
			
			
			String s11 = "Rama";
			System.out.println(s7);
			// here just the s11 reference is assigned to s12 and print it will be created in constant pool only
			String s12 = s11;
			
			if (s12==s11)
			{
				System.out.println("Rferences are equal");
			}
			else 
			{
				System.out.println("References are not equal");
			}
			if (s12.equals(s11)) 
			{
				System.out.println("Strings are equal");
			} 
			else
			{
				System.out.println("Strings are un equal");
			}
	}

}
