package Day11;

import java.util.Scanner;


public class VoteEligible {

	boolean validate(int a)
	{
		if (a>=18 && a<=100)
		{
			return true;
		}
		return false;
	}
	

	
	
 public static void main(String args[])
 { 
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter your age:");
	
	 int a=sc.nextInt();
	
	 
	 VoteEligible ve=new VoteEligible();
	 
	if(ve.validate(a)) {
		System.out.println("eligible to vote");
	}else {
		System.out.println("Not eligible");
	}
	 
 }
 
}
