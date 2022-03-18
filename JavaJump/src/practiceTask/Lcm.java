package practiceTask;

import java.util.Scanner;

public class Lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				int a,b,L,count=0;
				Scanner sc=new Scanner(System.in);
				System.out.print("Enter Two numbers to find their HCF : ");
				a=sc.nextInt();
				b=sc.nextInt();
				
				for(L=1;L<=a*b;L++)
				{
					count ++;
					if(L%a==0 && L%b==0)
						break;
				}
				
				
				
				System.out.println("LCM is : "+L+ "\nCount is :"+count);
	}

}
