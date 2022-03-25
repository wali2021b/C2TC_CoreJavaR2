package day16;

abstract class M1{           // these classes are used to hide the essential things...
	public int r=10;
	public final float PI=3.14f;
	
	public void n1()
	{
		System.out.println("Hello\t i'm from abstract Class M1 inside n1 Method.");
	}
	public void setR(int value)
	{
		this.r=value;
	}
	public void area()
	{
		System.out.printf("Area of cirecle is :%f \n ",(PI*r*r));
	}
	abstract void n2();
}

class M2 extends M1
{

void n2(){
	System.out.println("M2 method Starts here..\n");
	System.out.println("Abstract Method of M1 named n2()");
}

}

public class AbstractClass {

public static void main(String[] args) {
	
// We can not create objects of any abstract Class.
//	M1 m=new M1();                                       // Error Can't instantiate type M1 Class 
	
	M2 obj=new M2();
	obj.n1();
	obj.n2();
	System.out.println("not setting R value");
	obj.area();
	obj.setR(4);
	System.out.println("\nAfter  setting R value");
	obj.area();
	
}
		

	}


