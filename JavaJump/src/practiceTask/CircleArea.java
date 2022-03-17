package practiceTask;

import java.util.Scanner;

public class CircleArea {
	public static float area(int r)
	{
		float pp=3.14f;
		float area=pp*r*r;
		return area;
//	return area;
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Radius of circle...");
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		
		System.out.println("Area of Circle is.."+area(r));
	}

}
