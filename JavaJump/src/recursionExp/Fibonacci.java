package recursionExp;

public class Fibonacci {

	public static int fibb(int n)
	{
		if(n==0 || n==1)
			return 1;
//		;
		return (fibb(n-1)+fibb(n-2));
	}
	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
System.out.println(fibb(i));
	}

}
