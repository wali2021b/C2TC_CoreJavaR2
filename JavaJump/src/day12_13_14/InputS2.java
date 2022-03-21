package day12_13_14;

import java.util.*;

public class InputS2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 short a,b;
		 byte age;
//		 char sureName;
		 String name;
		Scanner sc=new Scanner(System.in);
		System.out.println("What's Your Name: ");
		name=sc.nextLine();
		System.out.println("Hello! \t"+name+" how old are you..");
		age=sc.nextByte();
	
		if(age>18)
		{
			System.out.println("Congratulation  "+ name +" You Can Participate...");
		}
		else {
			System.out.println("OOps  "+ name +" You Can not Participate...");
			
		}
		
		
		
	}

}
