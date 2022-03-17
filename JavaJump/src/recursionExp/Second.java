package recursionExp;

public class Second {
public static int sum(int n)
{
	int s=0;
	if(n==0)
		return n;
	s=n+sum(n-1);
	return s;
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=10;
//System.out.println(sum(n));
System.out.println(sum(n));
	}

}
