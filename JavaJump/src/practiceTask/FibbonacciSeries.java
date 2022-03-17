package practiceTask;

import java.util.Scanner;

public class FibbonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a limit to print Fibboncci Series ...");
		Scanner sc = new Scanner(System.in);
		int limit = sc.nextInt();
		
		int a=0,b=1,c=1;
		for(int i=1;i<=limit;i++)
		{
			System.out.print(a+" ");
			
			a=b;    
			b=c;
			c=a+b;
		}

	}

}

//a=1,b=1,c=