package practiceTask;

import java.util.Scanner;

public class CountOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a limit where to where ...");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b= sc.nextInt();
		int odd=0,even=0,c=0;
		for(int i=a;i<=b;i++)
		{
			System.out.print(i+ " ");
			if(i%2==0)
				even=even+i;
			else
				odd=odd+i;
			if(i%10==0)
				c++;
				
		}
		System.out.println("\nSum Of Even Numbers is "+even);
		System.out.println("Sum Of Odd Numbers is "+odd);
		System.out.println("And There are only "+ c+" Zeros.");
	}

}
