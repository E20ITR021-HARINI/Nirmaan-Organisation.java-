package day9;

import java.util.Scanner;

public class UserInterface {
	public static void main(String []args)
	{
		
		calculator cal=new calculator();
		Scanner box =new Scanner(System.in);
		System.out .println("Enter your first number:");
		int a=box.nextInt();
		System.out .println("Enter your second number:");
		int b=box.nextInt();
		System.out.println("addition=" + cal.add(a, b));
		System.out.println("substraction="+ cal.sub(a, b));
		System.out.println("multiplication="+ cal.mul(a, b));
		System.out.println("Division="+ cal.div(a, b));
		System.out.println("Modulus="+ cal.mod(a, b));
	}

}
