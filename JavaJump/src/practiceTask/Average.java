package practiceTask;
import java.util.*;
public class Average {
public static float Avg(int a, int b, int c)
{
	float avg=a+b+c;
	return avg/3;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter three numbers..");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	System.out.println("Average of the given Numbers is : "+Avg(a,b,c));
	
	
	}

}
