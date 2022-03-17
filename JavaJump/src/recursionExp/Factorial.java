package recursionExp;

public class Factorial {
public static int fact(int a)
{
	int f=1;
	if(a==0 || a==1)
		return 1;
	f=a*fact(a-1);
	return f;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		System.out.println("Factorial of the number is :"+fact(n));

	}

}
