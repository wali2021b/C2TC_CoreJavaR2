package practiceTask;
public class Hcf {
	import java.util.*;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,b,count=0;
Scanner sc=new Scanner(System.in);
System.out.print("Enter Two numbers to find their HCF : ");
a=sc.nextInt();
b=sc.nextInt();
//System.out.print("\nHCF Of the Numbers "+a +" and "+b +" is :");
while(!(a==b))
{
	count++;
	System.out.println("a and B values are.. " +a+","+b);
	if(a>b)
		a=a-b;
	else if(b>a)
	b=b-a;
}
System.out.print(a);
System.out.println("And count is : "+count);

	}

}
