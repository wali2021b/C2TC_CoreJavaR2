package day2;

class A
{
	public void m1()
	{
		System.out.println("This is Class A function M1");
	}
}

class B extends A
{
	public void m1()
	{
		System.out.println("This is Class B function M1");
	}
	public void m2()
	{
		System.out.println("This is Class B function M2");
	}
}
public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1,a2;
		B b1,b2;
		a1=new A();   //instntiating the object..
		b1=new B();
		a1.m1();
		a2=b1;
		a2.m1();
//		a2.m2();              //compiler doesn't allow it.. as ther is no m2 in class A
//		b1=a1;                   //compiler doesn't allow it..   as a1 is instance of super class..    

	}

}
