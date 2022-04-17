package Unit_02;

interface Animal
{
	public void animalSound();
	public void run();
}
interface Human
{
	public void humanSound();
	
	public void run1();
}
public class P12_Task01_InterfaceInJava {

	public static void main(String[] args) {
		C1 obj = new C1();
		obj.funcA();
		obj.funcB();
	}
	public void animalSound()
	{
		// tooo
	}
	public void run()
	{
		//
	}

}
//Multiple interfaces can be implimented at the same time!

class Species implements Animal,Human
{

	@Override
	public void humanSound() {
		System.out.println("We are Inside humansound method");
		
	}

	@Override
	public void run1() {
		System.out.println("We are Inside run method");
		
	}

	@Override
	public void animalSound() {
		System.out.println("We are Inside animalsound method");
		
	}

	@Override
	public void run() {
		System.out.println("We are Inside run method");	
	}
	
}
interface A1
{
	void funcA();
}

interface B1 extends A1
{
	void funcB();
}
class C1 implements B1
{
	public void funcA()
	{
		System.out.println("This is funcA A1");
	}
	public void funcB()
	{
		System.out.println("This is from A2");
	}
}