package practiceTask;

import java.util.Scanner;

public class Lcm2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,L,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Two numbers to find their LCM : ");
		a=sc.nextInt();
		b=sc.nextInt();
//		L=a*b;
		L=a>b?a:b;              // L ko voh numm do jo do no me bada hai... kun k lcm bada hi hoga.
		for(;L<=a*b;L+=(a>b?a:b))      //L+=badi value k sath increament kun k multple me hoga num.
		{
			count++;
			if(L%a==0 && L%b==0)
				break;
		}
		
		System.out.println("LCM is : "+L+ "\nCount is :"+count);
	}

}
