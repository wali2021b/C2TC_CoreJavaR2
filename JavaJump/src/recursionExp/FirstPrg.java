package recursionExp;

public class FirstPrg {
	
public static void rec(int v)
{
	System.out.println(v);
	if(v==1)
		return;
	
	rec(v-1);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=5;
rec(n);
	}

}
