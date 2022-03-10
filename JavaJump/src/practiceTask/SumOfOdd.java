package practiceTask;
import java.util.*;
public class SumOfOdd {
	public static int sumOfOdd(int n) {
		
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(i%2==1)
			sum=sum+i;
//			System.out.println(i+"  :"+ sum);
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number..");
	int a=sc.nextInt();
	System.out.println("Sum Of 1 To N odd Numbers is.."+sumOfOdd(a));
	}

}
