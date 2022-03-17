package day10;

import java.util.Scanner;

public class TakingInputs {

	public static void main(String[] args) {
		int a,b,sum=0;
		System.out.println("Enter two numbers..");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		sum=a+b;
		System.out.println("sum of the numbers is "+sum);
		
		
//		Taking float values...
		System.out.println("Enter two numbers..");
		float f1=sc.nextFloat();
		float f2=sc.nextFloat();
		float avg=(f1+f2)/2;
		System.out.println("Average of the numbers is "+avg);
		

	}

}
