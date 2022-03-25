package day15;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputBufferReader {
	public static int fact(int a)
	{
//		int f=1;
		if(a==1 || a==0)
			return 1;
		return a*fact(a-1);
	}

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		InputStreamReader is=new InputStreamReader(System.in);
		System.out.println("Enter Number to find Factorial : ");
	BufferedReader br=new BufferedReader(is);
	int a=Integer.parseInt(br.readLine());
	System.out.println("factorail of  :" + a + " is : "+fact(a));
	

	}
}
