package practiceTask;

import java.util.Scanner;

public class Hcf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,hcf,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Two numbers to find their HCF : ");
		a=sc.nextInt();
		b=sc.nextInt();
		for(hcf=a<b?a:b;hcf>=1;hcf--)
		{count++;
			System.out.println(hcf);
			if(a%hcf==0 && b%hcf==0)
			 break;
		}
		
		System.out.print("\nHCF Of the Numbers "+a +" and "+b +" is :"+hcf);
		System.out.println("And count is :"+count);
	}

}
