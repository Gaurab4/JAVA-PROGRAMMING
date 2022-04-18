package Unit_02;

public class P11_Task01_AccessProtectionInJava {
	public int a = 10;
	public static void main(String[] args) {
	
		Childclass obj = new Childclass();
		obj.showData();
		obj.accessData();
	}

}
class parentClass
{
	int a = 10;
	public int b = 20;
	protected int c = 30;
	private int d = 40;
	
	void showData()
	{
		System.out.println("Inside ParentClass");
		System.out.println("a ==" + a);
		System.out.println("b ==" + b);
		System.out.println("c ==" + c);
		System.out.println("d ==" + d);
	}
}
class Childclass extends parentClass
{
	void accessData()
	{
		System.out.println("Inside ChildClass");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
	}
}
class AnotherClass 
{
	void Display()
	{
		parentClass obj = new parentClass();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
	}
}
