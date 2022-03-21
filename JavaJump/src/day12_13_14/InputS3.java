package day12_13_14;
import java.io.*;
public class InputS3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		InputStreamReader is=new InputStreamReader(System.in);
			System.out.println("Enter A  Number");
		BufferedReader br=new BufferedReader(is);
		int a=Integer.parseInt(br.readLine());
		System.out.println("Your Number is :"+a);
	}

}
