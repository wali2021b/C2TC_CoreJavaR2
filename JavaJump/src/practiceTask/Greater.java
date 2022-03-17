package practiceTask;

import java.util.Scanner;

public class Greater {
	public static boolean Grt(int a, int b) {
		if (a > b)
			return true;
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Two Numbers..");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (Grt(a,b))
			System.out.println(a+ " : a is greater..");
		else
		System.out.println(b+": b is greater..");

	}

}
