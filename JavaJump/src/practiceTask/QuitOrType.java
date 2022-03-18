package practiceTask;

import java.util.Scanner;
// shift+alt+t   to rename a variable.. 

public class QuitOrType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Type and Quit using While loop.
		String myInput="";
Scanner sc=new Scanner(System.in);
System.out.println("Quit or Type..");
while(!(myInput.equals("quit")))
{
	System.out.println("Input please : ");
	
	myInput=sc.next().toLowerCase();
	System.out.println("Your Input is : "+myInput);
}
	}

}
