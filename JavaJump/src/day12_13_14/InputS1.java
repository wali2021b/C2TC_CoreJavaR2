package day12_13_14;
import java.util.*;
public class InputS1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a,b;
		 float x,y,z,avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers to add:");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Sum of the numbers is : "+ (a+b) );
		System.out.println("Enter three numbers to get averrage");
		x=sc.nextFloat();
		y=sc.nextFloat();
		z=sc.nextFloat();
		avg=(x+y+z)/3;
		System.out.println("Average of the numbers is : "+avg );
	}

}
