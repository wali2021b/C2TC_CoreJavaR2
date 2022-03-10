package practiceTask;
import java.util.*;

public class add3 {
	public static int add(int a, int b, int c) {
		return a+b+c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter three Numbers.");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
System.out.println("The Result is : "+ add(a,b,c));
	}

}
