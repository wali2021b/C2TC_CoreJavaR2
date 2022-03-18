package practiceTask;
import java.util.*;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// divisible by 5 Fizz divisible by 3 to Buzz both then FizzBuzz else number ..
		int inputNum;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number please..");
		inputNum=sc.nextInt();
	if(inputNum%5==0 && inputNum%3==0)
		System.out.println("FizzBuzz");
	else if(inputNum%5==0)
		System.out.println("Fizz");
	else if(inputNum%3==0)
		System.out.println("Buzz");
	else 
		System.out.println(inputNum);
}
}
