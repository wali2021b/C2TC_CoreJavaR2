package practiceTask;

import java.util.Scanner;
//shift+alt+t   to rename a variable.. 

public class QuitOrTyoeDo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//    Quit or type using Do-While loop..
		String input="";
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Enter your Input : ");
			input=sc.next().toLowerCase();
			if(input.equals("quit"))
			{
				System.out.println("thank You It's end of loop..");
                    break;
			}
			
			System.out.println("Your Input is : "+input);
		}while(true);
	}

}

