package Unit_02;



abstract class Bike
{
	int a;
	Bike()
	{
		System.out.println("Inside Bike Constructor :" + a + "\n");
	}
	abstract void run();
	
	void display()
	{
		System.out.println("This is display method!");
	}
}
class Honda4 extends Bike
{

	@Override
	void run() {
		// TODO Auto-generated method stub
		
	}
	
}

public class P09_Task01_AbstractAndFinalClasssInJava {
	public static void main(String[] args) {
		Bike obj = new Honda4();
		//obj.run();
		obj.display();
		
		//can not be instantiated
		//Bike obj2 = new Bike();
		}

	}
	/*
	public class Sub extends Super
	{
		void display2()
		{
			display();
		}
	}
	*/
