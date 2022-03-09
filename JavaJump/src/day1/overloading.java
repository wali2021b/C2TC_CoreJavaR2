package day1;
class A{
	String name;
	int age;
	public void info()
	{
		System.out.println(this.name);
		System.out.println(this.age);
	}
	public void info(String name)
	{
		System.out.println("hi "+name);
	}
	public void info(String name,int age)
	{
		System.out.println("hi "+name +" You are "+age+" years Old..");
	}
}
public class overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a1=new A();
		a1.name="sayyed";
		a1.age=24;
		a1.info();
		a1.info(a1.name);
		a1.info("Waliullah", 23);
		
	}

}
