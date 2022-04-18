package Unit_02;

public class P10_Task01_OverloadingAndOverridingInJava {
public static void main(String[] args) {
		
		OverloadingAndOverridingInJava obj = new OverloadingAndOverridingInJava();
		
		System.out.println("add() with 2 parameters");
		System.out.println(obj.add(4 , 6));
		
		System.out.println("add() with 3 parameters");
		System.out.println(obj.add(4 , 6 , 7));
		
		InheritFirstOne Obj2 = new InheritFirstOne();
		System.out.println(Obj2.add(1 , 2));
	}
}
class OverloadingAndOverridingInJava 
{
	//Within the same class : Method overloading
	int add (int a,int b)
	{
		System.out.print("Inside,OverloadingAndOverridingInJava! :");
		return a+b;
	}
	int add(int a,int b,int c)
	{
		System.out.print("Inside,OverloadingAndOverridingInJava! :");
		return a+b+c;
	}
}
//Overriding In Java:Required Inheritance!
class InheritFirstOne extends OverloadingAndOverridingInJava
{
	int add (int a,int b)
	{
		System.out.print("Inside,InheritFirstOne! :");
		return a+b;
	}
	int add(int a,int b,int c)
	{
		System.out.print("Inside,OverloadingAndOverridingInJava! :");
		return a+b+c;
	}
}
