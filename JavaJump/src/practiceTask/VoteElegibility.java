package practiceTask;

import java.util.Scanner;

public class VoteElegibility {
public static boolean age(int a)
{
	if(a>=18)
	
		return true;
	return false;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Your Age ...");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if(age(age))
		System.out.println("You are Elegible to Vote....");
		else
		System.out.println("Minor Can Note Vote ... ");

	}

}
