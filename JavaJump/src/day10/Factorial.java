package day10;

import java.util.Scanner;

public class Factorial {
	public static int fact(int a)
	{
//		int sum=1;
		if(a==1 || a==0)
			return 1;
		else {
			return (a*fact(a-1));
			
		}
//		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);
System.out.println("Enter a number to find factorial. :");
int num=sc.nextInt();
System.out.println("Factorial of the number "+num +" is : "+fact(num));
	}

}
